package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;
import com.larryhsiao.clotho.Action;

public class RemoveBadgeFromUser implements Action {
    private final UserBadgeRepository repo;
    private final long badgeId;
    private final long userId;

    public RemoveBadgeFromUser(UserBadgeRepository repo, long badgeId, long userId) {
        this.repo = repo;
        this.badgeId = badgeId;
        this.userId = userId;
    }

    @Override
    public void execute() {
        repo.removeUserBadge(userId, badgeId);
    }
}
