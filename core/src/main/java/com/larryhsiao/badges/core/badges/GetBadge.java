package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.DTOBadge;
import com.larryhsiao.badges.core.exceptions.NotFoundException;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.clotho.Source;

public class GetBadge {
    private final BadgeRepository repo;

    public GetBadge(BadgeRepository repo) {
        this.repo = repo;
    }

    public Badge execute(long id) throws NotFoundException {
        return new DTOBadge(repo.get(id));
    }
}
