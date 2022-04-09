package com.larryhsiao.badges.core.users.entities;

import com.larryhsiao.badges.core.repositories.users.dto.UserDTO;

/**
 * User object implemented with {@link UserDTO}.
 */
public final class DTOUser implements User {
    /**
     * Dto reference.
     */
    private final UserDTO dto;

    /**
     * Ctor.
     *
     * @param userDTO dto of user.
     */
    public DTOUser(final UserDTO userDTO) {
        this.dto = userDTO;
    }

    @Override
    public long id() {
        return dto.id();
    }

    @Override
    public String email() {
        return dto.email();
    }

    @Override
    public String displayName() {
        return dto.displayName();
    }
}
