package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.DTOBadge;
import com.larryhsiao.badges.core.badges.entities.DTOUserBadge;
import com.larryhsiao.badges.core.badges.entities.UserBadge;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.dto.BadgeDTO;
import com.larryhsiao.badges.core.repositories.badges.dto.UserBadgeDTO;
import com.larryhsiao.clotho.Source;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Source to get badges which own by a user.
 */
public class GetUserBadges {
    private final BadgeRepository badgeRepo;
    private final UserBadgeRepository userBadgeRepo;

    public GetUserBadges(
        BadgeRepository badgeRepo,
        UserBadgeRepository userBadgeRepo
    ) {
        this.badgeRepo = badgeRepo;
        this.userBadgeRepo = userBadgeRepo;
    }

    public List<UserBadge> execute(long userId) {
        final List<UserBadgeDTO> userBadges = userBadgeRepo.getUserBadges(userId);
        final Map<Long, Badge> badges = badgeRepo.get(
            userBadges.stream()
                .map(UserBadgeDTO::badgeId)
                .collect(Collectors.toSet())
        ).stream().collect(Collectors.toMap(BadgeDTO::id, DTOBadge::new));
        return userBadges.stream().map(it ->
            new DTOUserBadge(it, badges.get(it.badgeId()))
        ).collect(Collectors.toList());
    }
}
