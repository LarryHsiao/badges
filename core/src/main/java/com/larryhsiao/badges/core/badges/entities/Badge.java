package com.larryhsiao.badges.core.badges.entities;

/**
 * A Badge.
 */
public interface Badge {
    /**
     * @return ID this badge have in the system.
     */
    long id();

    /**
     * @return Name of this badge.
     */
    String name();

    /**
     * @return Description for this badge.
     */
    String description();

    /**
     * @return Url for displaying a badge's icon.
     */
    String iconUrl();
}
