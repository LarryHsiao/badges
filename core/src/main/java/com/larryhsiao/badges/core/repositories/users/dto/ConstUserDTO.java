package com.larryhsiao.badges.core.repositories.users.dto;

/**
 * Constant of the {@link UserDTO}.
 */
public final class ConstUserDTO implements UserDTO {
    private final long id;
    private final String email;
    private final String displayName;

    /**
     * Ctor.
     *
     * @param id          User ID.
     * @param email       Email.
     * @param displayName Display name.
     */
    public ConstUserDTO(
        final long id,
        final String email,
        final String displayName
    ) {
        this.id = id;
        this.email = email;
        this.displayName = displayName;
    }

    @Override
    public long id() {
        return id;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public String displayName() {
        return displayName;
    }
}
