package com.larryhsiao.badges.core.users.entities;

/**
 * Represents a user in this system.
 */
public interface User {
    /**
     * @return The id of this user.
     */
    long id();

    /**
     * @return The email of this user.
     */
    String email();

    /**
     * @return The display name of the user.
     */
    String displayName();
}
