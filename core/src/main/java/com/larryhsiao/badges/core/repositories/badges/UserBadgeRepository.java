package com.larryhsiao.badges.core.repositories.badges;

import com.larryhsiao.badges.core.repositories.badges.dto.UserBadgeDTO;

import java.util.List;

/**
 * User-Badge repository for the relations from User and Badge.
 */
public interface UserBadgeRepository {
    /**
     * Create a relation for user and badge.
     *
     * @param userId  The ID of user.
     * @param badgeId The ID of badge.
     */
    void createUserBadge(long userId, long badgeId);

    /**
     * Remote a user badge.
     *
     * @param userId  The ID of user.
     * @param badgeId The ID of Badge.
     */
    void removeUserBadge(long userId, long badgeId);

    /**
     * Remove all relations with given badge ID.
     *
     * @param badgeId The badge ID.
     */
    void removeBadge(long badgeId);

    /**
     * Remove all relations with given user ID.
     *
     * @param userId The user ID.
     */
    void removeUser(long userId);

    /**
     * Get all user-badge relations with given user ID.
     *
     * @param userId The user ID.
     * @return All dto which the user have.
     */
    List<UserBadgeDTO> getUserBadges(long userId);
}
