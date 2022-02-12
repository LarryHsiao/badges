package com.larryhsiao.badges.data.repositories;

import com.larryhsiao.badges.core.repositories.users.UserRepository;
import com.larryhsiao.badges.core.repositories.users.dto.EmptyUser;
import com.larryhsiao.badges.core.repositories.users.dto.UserDTO;

/**
 * Memory implementation of {@link UserRepository}.
 */
public class MemoryUserRepository implements UserRepository {
    private UserDTO currentUser = new EmptyUser();
    @Override
    public UserDTO profile() {
        return currentUser;
    }
}
