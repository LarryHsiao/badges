package com.larryhsiao.badges.core.badges.entities;

import com.larryhsiao.badges.core.repositories.badges.dto.UserBadgeDTO;

public class DTOUserBadge implements UserBadge {
    private final UserBadgeDTO dto;
    private final Badge badge;

    public DTOUserBadge(UserBadgeDTO dto, Badge badge) {
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
