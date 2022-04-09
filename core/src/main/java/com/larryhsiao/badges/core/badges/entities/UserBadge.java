package com.larryhsiao.badges.core.badges.entities;

/**
 * A badge that a user have.
 */
public interface UserBadge {
    /**
     * ID of the user which own the badge.
     *
     * @return ID of user.
     */
    long userId();

    /**
     * The time that this user-badge relation created.
     *
     * @return Created time in milliseconds.
     */
    long createdTime();

    /**
     * Represents a badge which have related to a user.
     *
     * @return The badge object itself.
     */
    Badge badge();
}
