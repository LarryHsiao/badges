package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.repositories.TestingRepoFactory;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link GetBadge}.
 */
class GetBadgeTest {
    /**
     * Check if we can get the badge we just created by id.
     */
    @Test
    void getCreatedBadge() throws Exception {
        final BadgeRepository repo = new TestingRepoFactory().badge();
        new CreatedBadge(
            repo,
            "name",
            "description",
            "iconUrl"
        ).value();
        assertEquals(
            1,
            new GetBadge(repo, 1).value().id()
        );
    }
}