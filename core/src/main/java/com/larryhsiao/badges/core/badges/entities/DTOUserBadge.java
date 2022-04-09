package com.larryhsiao.badges.core.badges.entities;

import com.larryhsiao.badges.core.repositories.badges.dto.UserBadgeDTO;

/**
 * UserBadge implemented with DTO.
 */
public final class DTOUserBadge implements UserBadge {
    private final UserBadgeDTO dto;
    private final Badge badge;

    /**
     * Ctor.
     *
     * @param dto   User dto which have this badge.
     * @param badge The badge object itself.
     */
    public DTOUserBadge(final UserBadgeDTO dto, final Badge badge) {
        this.dto = dto;
        this.badge = badge;
    }

    @Override
    public long userId() {
        return dto.userId();
    }

    @Override
    public long createdTime() {
        return dto.createdTime();
    }

    @Override
    public Badge badge() {
        return badge;
    }
}
