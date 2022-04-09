package com.larryhsiao.badges.core.repositories.users;

import com.larryhsiao.badges.core.repositories.users.dto.UserDTO;

import java.util.List;

/**
 * User repository.
 */
public interface UserRepository {
    /**
     * @return The user dto of current user.
     */
    UserDTO profile();

    /**
     * All the valid user dto in this system.
     * @return The dto list.
     */
    List<UserDTO> all();
}
