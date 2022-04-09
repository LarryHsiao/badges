package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.DTOBadge;
import com.larryhsiao.badges.core.exceptions.NotFoundException;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;

/**
 * Action of getting a badge.
 */
public class GetBadge {
    private final BadgeRepository repo;

    /**
     * Ctor.
     *
     * @param repo Repository for this action.
     */
    public GetBadge(final BadgeRepository repo) {
        this.repo = repo;
    }

    /**
     * Get a badge by badge id.
     *
     * @param id ID of this badge.
     * @return The badge by the ID.
     * @throws NotFoundException The given badge ID can not be found in system.
     */
    public Badge execute(final long id) throws NotFoundException {
        return new DTOBadge(repo.get(id));
    }
}
