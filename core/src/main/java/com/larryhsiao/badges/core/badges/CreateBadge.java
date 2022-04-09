package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.ConstBadge;
import com.larryhsiao.badges.core.exceptions.CreateFailedException;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.clotho.Source;

/**
 * Source to build a {@link Badge} which just created in system.
 */
public class CreateBadge {
    private final BadgeRepository badgeRepo;

    public CreateBadge(
        BadgeRepository badgeRepo

    ) {
        this.badgeRepo = badgeRepo;
    }

    public Badge execute(
        String name,
        String description,
        String iconUrl
    ) throws CreateFailedException {
        final long id = badgeRepo.insert(name, description, iconUrl);
        return new ConstBadge(
            id,
            name,
            description,
            iconUrl
        );
    }
}
