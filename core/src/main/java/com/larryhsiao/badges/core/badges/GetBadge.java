package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.DTOBadge;
import com.larryhsiao.badges.core.exceptions.NotFoundException;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.clotho.Source;

public class GetBadge implements Source<Badge> {
    private final BadgeRepository repo;
    private final long id;

    public GetBadge(BadgeRepository repo, long id) {
        this.repo = repo;
        this.id = id;
    }

    @Override
    public Badge value() throws NotFoundException {
        return new DTOBadge(repo.get(id));
    }
}
