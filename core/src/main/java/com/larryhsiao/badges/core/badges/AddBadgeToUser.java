package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;

/**
 * Action to add a badge to a user.
 */
public class AddBadgeToUser {
    private final UserBadgeRepository repo;

    /**
     * Ctor.
     *
     * @param repo Repository of user-badge relations.
     */
    public AddBadgeToUser(final UserBadgeRepository repo) {
        this.repo = repo;
    }

    /**
     * Execute the action. Relations are made by ids. So, The parameters are ID only.
     *
     * @param badgeId ID of badge.
     * @param userId  ID of user.
     */
    public void execute(final long badgeId, final long userId) {
        repo.createUserBadge(userId, badgeId);
    }
}
