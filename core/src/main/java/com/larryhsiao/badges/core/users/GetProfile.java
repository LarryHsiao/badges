package com.larryhsiao.badges.core.users;

import com.larryhsiao.badges.core.repositories.users.UserRepository;
import com.larryhsiao.badges.core.users.entities.DTOUser;
import com.larryhsiao.badges.core.users.entities.User;
import com.larryhsiao.clotho.Source;

/**
 * Source to get profile of current user.
 */
public final class GetProfile implements Source<User> {
    private final UserRepository repo;

    /**
     * Ctor.
     * @param userRepository User repository.
     */
    public GetProfile(final UserRepository userRepository) {
        this.repo = userRepository;
    }

    @Override
    public User value() {
        return new DTOUser(repo.profile());
    }
}
