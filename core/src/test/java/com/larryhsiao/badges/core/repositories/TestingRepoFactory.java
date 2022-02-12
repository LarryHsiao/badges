package com.larryhsiao.badges.core.repositories;

import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.badges.data.repositories.MemoryBadgeRepository;

/**
 * Factory for constructing memory repositories for testing.
 */
public class TestingRepoFactory {
    public BadgeRepository badge() {
        return new MemoryBadgeRepository();
    }
}
