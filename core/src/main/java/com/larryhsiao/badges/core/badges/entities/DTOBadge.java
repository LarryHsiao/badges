package com.larryhsiao.badges.core.badges.entities;

import com.larryhsiao.badges.core.repositories.badges.dto.BadgeDTO;

public class DTOBadge implements Badge {
    private final BadgeDTO dto;

    public DTOBadge(BadgeDTO dto) {this.dto = dto;}

    @Override
    public long id() {
        return dto.id();
    }

    @Override
    public String name() {
        return dto.name();
    }

    @Override
    public String description() {
        return dto.description();
    }

    @Override
    public String iconUrl() {
        return dto.iconUrl();
    }
}
