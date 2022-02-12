package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.repositories.TestingRepoFactory;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link GetBadges}.
 */
class GetBadgesTest {
    /**
     * Check if no exception there.
     */
    @Test
    void noException() {
        final BadgeRepository repo = new TestingRepoFactory().badge();
        assertEquals(0, new GetBadges(repo).value().size());
    }

    /**
     * Check size change if create badge success.
     */
    @Test
    void insertBadge() throws Exception {
        final BadgeRepository repo = new TestingRepoFactory().badge();
        new CreatedBadge(repo, "name", "description", "iconUrl").value();
        final List<Badge> badges = new GetBadges(repo).value();
        final Badge created = badges.get(0);
        assertEquals(1, badges.size());
        assertEquals("name", created.name());
        assertEquals("description", created.description());
        assertEquals("iconUrl", created.iconUrl());
    }
}