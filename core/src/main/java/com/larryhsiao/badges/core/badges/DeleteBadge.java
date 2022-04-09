package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;

public class DeleteBadge {
    private final BadgeRepository repo;

    public DeleteBadge(BadgeRepository repo) {
        this.repo = repo;
    }

    public void execute(long id) {
        repo.delete(id);
    }
}
