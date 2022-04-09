package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.DTOBadge;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.dto.BadgeDTO;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Get all badges available in system.
 */
public class GetBadges {
    private final BadgeRepository repo;

    /**
     * Ctor.
     *
     * @param repo The badge repository for this action.
     */
    public GetBadges(final BadgeRepository repo) {
        this.repo = repo;
    }

    /**
     * @return The badges we can find in system.
     */
    public List<Badge> execute() {
        return repo.all().stream().map((Function<BadgeDTO, Badge>) DTOBadge::new)
            .collect(Collectors.toList());
    }
}
