package com.larryhsiao.badges.web;

import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;
import com.larryhsiao.badges.core.repositories.users.UserRepository;
import com.larryhsiao.badges.core.repositories.users.dto.ConstUserDTO;
import com.larryhsiao.badges.data.repositories.MemoryBadgeRepository;
import com.larryhsiao.badges.data.repositories.MemoryUserBadgeRepository;
import com.larryhsiao.badges.data.repositories.MemoryUserRepository;

import java.util.List;

/**
 * Factory for constructing memory repositories for testing.
 */
public class RepositoryFactory {
    private final BadgeRepository badges = new MemoryBadgeRepository();
    private final UserRepository users = new MemoryUserRepository(List.of(
        new ConstUserDTO(1, "email1", "displayName1"),
        new ConstUserDTO(2, "email2", "displayName2"),
        new ConstUserDTO(3, "email3", "displayName3"),
        new ConstUserDTO(4, "email4", "displayName4"),
        new ConstUserDTO(5, "email5", "displayName5")
    ));
    private final UserBadgeRepository userBadges = new MemoryUserBadgeRepository();

    /**
     * @return Generate the badge repository.
     */
    public BadgeRepository badges() {
        return badges;
    }

    /**
     * @return Generate the user repository.
     */
    public UserRepository users() {
        return users;
    }

    /**
     * @return User-badge related repository.
     */
    public UserBadgeRepository userBadges() {
        return userBadges;
    }
}
