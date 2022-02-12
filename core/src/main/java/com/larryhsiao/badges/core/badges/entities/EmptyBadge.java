package com.larryhsiao.badges.core.badges.entities;

/**
 * {@link Badge} with nothing.
 */
public class EmptyBadge implements Badge {
    @Override
    public long id() {
        return -1L;
    }

    @Override
    public String name() {
        return "";
    }

    @Override
    public String description() {
        return "";
    }

    @Override
    public String iconUrl() {
        return "";
    }
}
