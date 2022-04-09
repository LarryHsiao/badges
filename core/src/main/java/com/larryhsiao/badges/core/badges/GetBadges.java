package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.DTOBadge;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.dto.BadgeDTO;
import com.larryhsiao.clotho.Source;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Get all badges available in system.
 */
public class GetBadges {
    private final BadgeRepository repo;

    public GetBadges(BadgeRepository repo) {
        this.repo = repo;
    }

    public List<Badge> execute() {
        return repo.all()
            .stream()
            .map((Function<BadgeDTO, Badge>) DTOBadge::new)
            .collect(Collectors.toList());
    }
}
