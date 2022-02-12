package com.larryhsiao.badges.core.badges.entities;

public class ConstBadge implements Badge {
    private final long id;
    private final String name;
    private final String description;
    private final String iconUrl;

    public ConstBadge(long id, String name, String description, String iconUrl) {
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
