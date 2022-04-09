package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;

/**
 * Action to delete badge.
 */
public class DeleteBadge {
    private final BadgeRepository repo;

    /**
     * Ctor.
     *
     * @param repo Badge repository for the action.
     */
    public DeleteBadge(final BadgeRepository repo) {
        this.repo = repo;
    }

    /**
     * @param id The ID of badge to delete.
     */
    public void execute(final long id) {
        repo.delete(id);
    }
}
