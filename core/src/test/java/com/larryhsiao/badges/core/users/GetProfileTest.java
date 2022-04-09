package com.larryhsiao.badges.core.users;

import com.larryhsiao.badges.core.repositories.TestingRepoFactory;
import com.larryhsiao.badges.core.repositories.users.UserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link GetProfile}.
 */
class GetProfileTest {
    /**
     * No exception when querying profile.
     */
    @Test
    void noException() {
        final UserRepository repo = new TestingRepoFactory().users();
        new GetProfile(repo).value();
        assertTrue(true);
    }
}
