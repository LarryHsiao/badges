package com.larryhsiao.badges.core.repositories.users.dto;

public class ConstUserDTO implements UserDTO {
    private final long id;
    private final String email;
    private final String displayName;

    public ConstUserDTO(long id, String email, String displayName) {
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
