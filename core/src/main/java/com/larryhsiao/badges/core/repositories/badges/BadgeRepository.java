package com.larryhsiao.badges.core.repositories.badges;

import com.larryhsiao.badges.core.exceptions.CreateFailedException;
import com.larryhsiao.badges.core.exceptions.NotFoundException;
import com.larryhsiao.badges.core.repositories.badges.dto.BadgeDTO;

import java.util.List;
import java.util.Set;

/**
 * Repository of badge domain.
 */
public interface BadgeRepository {
    /**
     * @return All badge objects we cand found.
     */
    List<BadgeDTO> all();

    /**
     * Create a badge to the system.
     *
     * @param name        The name of the badge.
     * @param description The description fo the badge.e
     * @param iconUrl     Url for displaying a icon.
     * @return The ID of badge we just created.
     * @throws CreateFailedException When the creating flow failed.
     */
    long insert(
        String name,
        String description,
        String iconUrl
    ) throws CreateFailedException;

    /**
     * Get badge object that the id represents.
     *
     * @param id The badge ID.
     * @return The object found.
     * @throws NotFoundException The badge related to the parameter not found.
     */
    BadgeDTO get(long id) throws NotFoundException;

    /**
     * Get given badge id's objects.
     *
     * @param ids The ids of badges.
     * @return The badge object found.
     */
    List<BadgeDTO> get(Set<Long> ids);

    /**
     * Delete a badge.
     *
     * @param id The id of the badge.
     */
    void delete(long id);
}
