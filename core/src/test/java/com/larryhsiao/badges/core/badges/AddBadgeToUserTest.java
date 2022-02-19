package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.UserBadge;
import com.larryhsiao.badges.core.repositories.TestingRepoFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AddBadgeToUserTest {
    @Test
    void normalCase() throws Exception {
        final TestingRepoFactory factory = new TestingRepoFactory();
        final Badge badge = new CreatedBadge(factory.badges(), "badge", "desc", "").value();
        final long userId = factory.users().all().stream().findFirst().get().id();

        new AddBadgeToUser(factory.userBadges(), badge.id(), userId).execute();
        final List<UserBadge> userBadges = new GetUserBadges(factory.badges(), factory.userBadges(), userId).value();
        Assertions.assertEquals(1, userBadges.size());
    }
}
