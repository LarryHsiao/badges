package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;
import com.larryhsiao.clotho.Action;

public class RemoveBadgeFromUser {
    private final UserBadgeRepository repo;

    public RemoveBadgeFromUser(UserBadgeRepository repo) {
        this.repo = repo;
    }

    public void execute(long badgeId, long userId) {
        repo.removeUserBadge(userId, badgeId);
    }
}
