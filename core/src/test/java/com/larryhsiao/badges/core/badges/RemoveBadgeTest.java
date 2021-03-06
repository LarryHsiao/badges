package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.UserBadge;
import com.larryhsiao.badges.core.repositories.TestingRepoFactory;
import com.larryhsiao.badges.core.repositories.users.dto.EmptyUserDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Test for {@link  RemoveBadge}.
 */
class RemoveBadgeTest {
    /**
     * Check if remove badge actually remove the badge.
     *
     * @throws Exception Manipulation may failed.
     */
    @Test
    void normalCase() throws Exception {
        final TestingRepoFactory factory = new TestingRepoFactory();
        final Badge badge = new CreateBadge(factory.badges()).execute("badge", "desc", "");
        final long userId = factory.users()
            .all()
            .stream()
            .findFirst()
            .orElse(new EmptyUserDTO())
            .id();

        new AddBadgeToUser(factory.userBadges()).execute(badge.id(), userId);
        new RemoveBadge(factory.badges(), factory.userBadges()).execute(badge.id());
        final List<UserBadge> userBadges = new GetUserBadges(
            factory.badges(),
            factory.userBadges()
        ).execute(userId);
        Assertions.assertEquals(0, userBadges.size());
    }
}
