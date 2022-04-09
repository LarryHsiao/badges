package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;
import com.larryhsiao.clotho.Action;

public class RemoveBadge {
    private final BadgeRepository badgeRepo;
    private final UserBadgeRepository userBadgeRepo;

    public RemoveBadge(
        BadgeRepository badgeRepo,
        UserBadgeRepository userBadgeRepo
    ) {
        this.badgeRepo = badgeRepo;
        this.userBadgeRepo = userBadgeRepo;
    }

    public void execute(long badgeId) {
        badgeRepo.delete(badgeId);
        userBadgeRepo.removeBadge(badgeId);
    }
}
