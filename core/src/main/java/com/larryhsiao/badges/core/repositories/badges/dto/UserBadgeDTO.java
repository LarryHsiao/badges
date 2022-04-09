package com.larryhsiao.badges.core.repositories.badges.dto;

/**
 * DTO for user-badge info.
 */
public interface UserBadgeDTO {
    /**
     * The user ID this object represents.
     *
     * @return ID of the user.
     */
    long userId();

    /**
     * The id of the badge the user have.
     *
     * @return ID of the badge.
     */
    long badgeId();

    /**
     * The created time of this user badge object.
     *
     * @return Millisecond of the created time.
     */
    long createdTime();
}
