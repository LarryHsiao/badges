package com.larryhsiao.badges.core.repositories.users.dto;

public class EmptyUserDTO implements UserDTO {
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