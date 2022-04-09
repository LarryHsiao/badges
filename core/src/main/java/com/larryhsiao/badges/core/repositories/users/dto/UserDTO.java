package com.larryhsiao.badges.core.repositories.users.dto;

/**
 * User DTO object.
 */
public interface UserDTO {
    /**
     * @return ID of this user.
     */
    long id();

    /**
     * @return User email.
     */
    String email();

    /**
     * @return Name for display.
     */
    String displayName();
}
