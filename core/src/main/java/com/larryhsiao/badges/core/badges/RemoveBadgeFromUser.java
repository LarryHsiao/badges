package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;

/**
 * Action for removing a Badge from user.
 */
public class RemoveBadgeFromUser {
    private final UserBadgeRepository repo;

    /**
     * Ctor.
     *
     * @param repo User-Badge repository.
     */
    public RemoveBadgeFromUser(final UserBadgeRepository repo) {
        this.repo = repo;
    }

    /**
     * Execute the removing action.
     *
     * @param badgeId Badge ID.
     * @param userId  User ID.
     */
    public void execute(final long badgeId, final long userId) {
        repo.removeUserBadge(userId, badgeId);
    }
}
