package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.exceptions.NotFoundException;
import com.larryhsiao.badges.core.repositories.TestingRepoFactory;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Test for {@link GetBadge}.
 */
class GetBadgeTest {
    /**
     * Check if we can get the badge we just created by id.
     */
    @Test
    void getCreatedBadge() throws Exception {
        final BadgeRepository repo = new TestingRepoFactory().badges();
        new CreateBadge(repo).execute("name", "description", "iconUrl");
        assertEquals(1, new GetBadge(repo).execute(1).id());
    }

    /**
     * Check if there is {@link NotFoundException} thrown when id not exist.
     */
    @Test()
    void notFoundException() {
        try {
            final BadgeRepository repo = new TestingRepoFactory().badges();
            new GetBadge(repo).execute(1);
            fail();
        } catch (NotFoundException e) {
            assertTrue(true);
        }
    }

    /**
     * Check if there is {@link NotFoundException} thrown when badge is deleted.
     */
    @Test()
    void notFoundExceptionDeleted() throws Exception {
        try {
            final BadgeRepository repo = new TestingRepoFactory().badges();
            new CreateBadge(repo).execute("name", "", "");
            new DeleteBadge(repo).execute(1);
            new GetBadge(repo).execute(1);
            fail();
        } catch (NotFoundException e) {
            assertTrue(true);
        }
    }
}
