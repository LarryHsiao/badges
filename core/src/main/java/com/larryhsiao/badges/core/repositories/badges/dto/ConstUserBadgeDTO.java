package com.larryhsiao.badges.core.repositories.badges.dto;

public class ConstUserBadgeDTO implements UserBadgeDTO{
    private final long userId;
    private final long badgeId;
    private final long createdTime;

    public ConstUserBadgeDTO(long userId, long badgeId, long createdTime) {
        this.userId = userId;
        this.badgeId = badgeId;
        this.createdTime = createdTime;
    }

    @Override
    public long userId() {
        return userId;
    }

    @Override
    public long badgeId() {
        return badgeId;
    }

    @Override
    public long createdTime() {
        return createdTime;
    }
}
