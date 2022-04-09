package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;
import com.larryhsiao.clotho.Action;

public class AddBadgeToUser {
    private final UserBadgeRepository repo;

    public AddBadgeToUser(UserBadgeRepository repo) {
        this.repo = repo;
    }

    public void execute(long badgeId, long userId) {
        repo.createUserBadge(userId, badgeId);
    }
}
