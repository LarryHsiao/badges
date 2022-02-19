package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;
import com.larryhsiao.clotho.Action;

public class RemoveBadge implements Action {
    private final BadgeRepository badgeRepo;
    private final UserBadgeRepository userBadgeRepo;
    ;
    private final long badgeId;

    public RemoveBadge(
        BadgeRepository badgeRepo,
        UserBadgeRepository userBadgeRepo,
        long badgeId
    ) {
        this.badgeRepo = badgeRepo;
        this.userBadgeRepo = userBadgeRepo;
        this.badgeId = badgeId;
    }

    @Override
    public void execute() {
        badgeRepo.delete(badgeId);
        userBadgeRepo.removeBadge(badgeId);
    }
}
