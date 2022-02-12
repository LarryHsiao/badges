package com.larryhsiao.badges.core.repositories.badges;

import com.larryhsiao.badges.core.exceptions.CreateFailedException;
import com.larryhsiao.badges.core.exceptions.NotFoundException;
import com.larryhsiao.badges.core.repositories.badges.dto.BadgeDTO;

import java.util.List;

public interface BadgeRepository {
    List<BadgeDTO> all();

    long insert(String name, String description, String iconUrl) throws CreateFailedException;

    BadgeDTO get(long id) throws NotFoundException;

    void delete(long id);
}
