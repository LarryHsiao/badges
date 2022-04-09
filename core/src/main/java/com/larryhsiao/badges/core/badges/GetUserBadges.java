package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.DTOBadge;
import com.larryhsiao.badges.core.badges.entities.DTOUserBadge;
import com.larryhsiao.badges.core.badges.entities.UserBadge;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.dto.BadgeDTO;
import com.larryhsiao.badges.core.repositories.badges.dto.UserBadgeDTO;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Source to get badges which own by a user.
 */
public final class GetUserBadges {
    private final BadgeRepository badgeRepo;
    private final UserBadgeRepository userBadgeRepo;

    /**
     * Ctor.
     *
     * @param badgeRepo     Badge repository.
     * @param userBadgeRepo User-Badge relation repository.
     */
    public GetUserBadges(
        final BadgeRepository badgeRepo,
        final UserBadgeRepository userBadgeRepo
    ) {
        this.badgeRepo = badgeRepo;
        this.userBadgeRepo = userBadgeRepo;
    }

    /**
     * Execute the action. To get the badge a user have.
     *
     * @param userId ID of the user.
     * @return The users entities we can find with given user ID.
     */
    public List<UserBadge> execute(final long userId) {
        final List<UserBadgeDTO> userBadges = userBadgeRepo.getUserBadges(userId);
        final Map<Long, Badge> badgeMap = badgeRepo.get(
            userBadges.stream()
                .map(UserBadgeDTO::badgeId)
                .collect(Collectors.toSet())
        ).stream().collect(Collectors.toMap(BadgeDTO::id, DTOBadge::new));
        return userBadges.stream().map(it ->
            new DTOUserBadge(it, badgeMap.get(it.badgeId()))
        ).collect(Collectors.toList());
    }
}
