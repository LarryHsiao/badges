package com.larryhsiao.badges.core.repositories;

import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.badges.core.repositories.users.UserRepository;
import com.larryhsiao.badges.data.repositories.MemoryBadgeRepository;
import com.larryhsiao.badges.data.repositories.MemoryUserRepository;

/**
 * Factory for constructing memory repositories for testing.
 */
public class TestingRepoFactory {
    public BadgeRepository badges() {
        return new MemoryBadgeRepository();
    }

    public UserRepository users() {
        return new MemoryUserRepository();
    }
}
