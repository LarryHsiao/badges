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
        final Badge badge = new CreateBadge(factory.badges()).execute("badge", "desc", "");
        final long userId = factory.users().all().stream().findFirst().get().id();

        new AddBadgeToUser(factory.userBadges()).execute(badge.id(), userId);
        final List<UserBadge> userBadges = new GetUserBadges(
            factory.badges(),
            factory.userBadges()
        ).execute(userId);
        Assertions.assertEquals(1, userBadges.size());
    }
}
