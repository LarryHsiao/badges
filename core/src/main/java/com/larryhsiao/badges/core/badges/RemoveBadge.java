package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;

/**
 * Action to remove a badge from system.
 */
public final class RemoveBadge {
    private final BadgeRepository badgeRepo;
    private final UserBadgeRepository userBadgeRepo;

    /**
     * Ctor.
     *
     * @param badgeRepo     Badge Repository.
     * @param userBadgeRepo User-Badge relation repository.
     */
    public RemoveBadge(
        final BadgeRepository badgeRepo,
        final UserBadgeRepository userBadgeRepo
    ) {
        this.badgeRepo = badgeRepo;
        this.userBadgeRepo = userBadgeRepo;
    }

    /**
     * Execute the remove badge action.
     * Also, this action will remove the user-badge relation too.
     *
     * @param badgeId ID of the badge.
     */
    public void execute(final long badgeId) {
        badgeRepo.delete(badgeId);
        userBadgeRepo.removeBadge(badgeId);
    }
}
