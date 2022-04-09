package com.larryhsiao.badges.core.badges;

import com.larryhsiao.badges.core.badges.entities.Badge;
import com.larryhsiao.badges.core.badges.entities.ConstBadge;
import com.larryhsiao.badges.core.exceptions.CreateFailedException;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;

/**
 * Source to build a {@link Badge} which just created in system.
 */
public class CreateBadge {
    private final BadgeRepository badgeRepo;

    /**
     * @param badgeRepo The repository for this action.
     */
    public CreateBadge(final BadgeRepository badgeRepo) {
        this.badgeRepo = badgeRepo;
    }

    /**
     * Execute the badge creating.
     *
     * @param name        Name of the badge.
     * @param description Description of the badge.
     * @param iconUrl     Icon url for display.
     * @return The badge of badge.
     * @throws CreateFailedException Throws when the badge creating failure.
     */
    public Badge execute(
        final String name, final String description, final String iconUrl)
        throws CreateFailedException {
        final long id = badgeRepo.insert(name, description, iconUrl);
        return new ConstBadge(id, name, description, iconUrl);
    }
}
