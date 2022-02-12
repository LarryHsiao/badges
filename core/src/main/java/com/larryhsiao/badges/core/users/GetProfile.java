package com.larryhsiao.badges.core.users;

import com.larryhsiao.badges.core.repositories.users.UserRepository;
import com.larryhsiao.badges.core.users.entities.DTOUser;
import com.larryhsiao.badges.core.users.entities.User;
import com.larryhsiao.clotho.Source;

/**
 * Source to get profile of current user.
 */
public class GetProfile implements Source<User> {
    private final UserRepository repo;

    public GetProfile(UserRepository repo) {this.repo = repo;}

    @Override
    public User value() {
        return new DTOUser(repo.profile());
    }
}
