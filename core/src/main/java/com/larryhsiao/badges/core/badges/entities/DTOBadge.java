package com.larryhsiao.badges.core.badges.entities;

import com.larryhsiao.badges.core.repositories.badges.dto.BadgeDTO;

/**
 * Badge object implements with dto.
 */
public final class DTOBadge implements Badge {
    private final BadgeDTO dto;

    /**
     * Ctor.
     *
     * @param dto Dto of badge.
     */
    public DTOBadge(final BadgeDTO dto) {
        this.dto = dto;
    }

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
