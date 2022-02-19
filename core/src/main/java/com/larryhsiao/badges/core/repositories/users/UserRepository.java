package com.larryhsiao.badges.core.repositories.users;

import com.larryhsiao.badges.core.repositories.users.dto.UserDTO;

import java.util.List;

public interface UserRepository {
    UserDTO profile();

    List<UserDTO> all();
}
