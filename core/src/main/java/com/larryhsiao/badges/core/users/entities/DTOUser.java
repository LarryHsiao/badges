package com.larryhsiao.badges.core.users.entities;

import com.larryhsiao.badges.core.repositories.users.dto.UserDTO;

public class DTOUser implements User{
    private final UserDTO dto;

    public DTOUser(UserDTO dto) {this.dto = dto;}

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
