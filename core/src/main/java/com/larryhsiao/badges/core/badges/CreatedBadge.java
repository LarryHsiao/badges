package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.ConstBadge;
import com.larryhsiao.badges.core.exceptions.CreateFailedException;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.clotho.Source;

/**
 * Source to build a {@link Badge} which just created in system.
 */
public class CreatedBadge implements Source<Badge> {
    private final BadgeRepository badgeRepo;
    private final String name;
    private final String description;
    private final String iconUrl;

    public CreatedBadge(
        BadgeRepository badgeRepo,
        String name,
        String description,
        String iconUrl
    ) {
        this.badgeRepo = badgeRepo;
        this.name = name;
        this.description = description;
        this.iconUrl = iconUrl;
    }

    @Override
    public Badge value() throws CreateFailedException {
        final long id = badgeRepo.insert(name, description, iconUrl);
        return new ConstBadge(
            id,
            name,
            description,
            iconUrl
        );
    }
}
