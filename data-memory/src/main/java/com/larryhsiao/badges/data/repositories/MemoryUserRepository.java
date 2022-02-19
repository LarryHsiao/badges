package com.larryhsiao.badges.data.repositories;

import com.larryhsiao.badges.core.repositories.users.UserRepository;
import com.larryhsiao.badges.core.repositories.users.dto.EmptyUserDTO;
import com.larryhsiao.badges.core.repositories.users.dto.UserDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Memory implementation of {@link UserRepository}.
 */
public class MemoryUserRepository implements UserRepository {
    private final Map<Long, UserDTO> users = new HashMap<>();
    private final UserDTO currentUser = new EmptyUserDTO();

    public MemoryUserRepository() {
        this(Collections.emptyList());
    }

    public MemoryUserRepository(List<UserDTO> defaultUsers) {
        users.putAll(
            defaultUsers.stream().collect(
                Collectors.toMap(UserDTO::id, Function.identity())
            )
        );
    }

    @Override
    public UserDTO profile() {
        return currentUser;
    }

    @Override
    public List<UserDTO> all() {
        return new ArrayList<>(users.values());
    }
}
