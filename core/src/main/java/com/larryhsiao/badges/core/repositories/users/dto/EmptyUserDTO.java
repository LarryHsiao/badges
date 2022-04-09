package com.larryhsiao.badges.core.repositories.users.dto;

/**
 * Empty object for represents a user we have no idea who it is.
 * Typically, we use this object as placeholder.
 */
public final class EmptyUserDTO implements UserDTO {
    @Override
    public long id() {
        return -1;
    }

    @Override
    public String email() {
        return "";
    }

    @Override
    public String displayName() {
        return "";
    }
}
