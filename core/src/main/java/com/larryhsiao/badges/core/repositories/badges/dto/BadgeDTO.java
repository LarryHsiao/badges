package com.larryhsiao.badges.core.repositories.badges.dto;

/**
 * DTO of a badge.
 */
public interface BadgeDTO {
    /**
     * @return ID of this badge.
     */
    long id();

    /**
     * @return Name of this badge.
     */
    String name();

    /**
     * @return Description of this badge.
     */
    String description();

    /**
     * Url of this badge.
     *
     * @return Icon url for display.
     */
    String iconUrl();
}
