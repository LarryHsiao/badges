package com.larryhsiao.badges.core.badges.entities;

/**
 * Badge object implemented with constants.
 */
public final class ConstBadge implements Badge {
    private final long id;
    private final String name;
    private final String description;
    private final String iconUrl;

    /**
     * Ctor.
     *
     * @param id          ID of this badge.
     * @param name        Name of this badge.
     * @param description Description of this badge.
     * @param iconUrl     Icon url of this badge.
     */
    public ConstBadge(
        final long id,
        final String name,
        final String description,
        final String iconUrl
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.iconUrl = iconUrl;
    }

    @Override
    public long id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public String iconUrl() {
        return iconUrl;
    }
}
