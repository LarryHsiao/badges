package com.larryhsiao.badges.core.repositories.badges.dto;

/**
 * {@link UserBadgeDTO} implements with constants.
 */
public final class ConstUserBadgeDTO implements UserBadgeDTO {
    private final long userId;
    private final long badgeId;
    private final long createdTime;

    /**
     * @param userId      User ID.
     * @param badgeId     Badge ID.
     * @param createdTime The createTime.
     */
    public ConstUserBadgeDTO(
        final long userId,
        final long badgeId,
        final long createdTime
    ) {
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
