package com.larryhsiao.badges.data.repositories;

import com.larryhsiao.badges.core.exceptions.NotFoundException;
import com.larryhsiao.badges.core.repositories.badges.BadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.dto.BadgeDTO;
import com.larryhsiao.badges.core.repositories.badges.dto.ConstBadgeDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Memory implementation of {@link BadgeRepository}.
 */
public class MemoryBadgeRepository implements BadgeRepository {
    private final Map<Long, BadgeDTO> data = new HashMap<>();
    private int id = 1;

    @Override
    public List<BadgeDTO> all() {
        return new ArrayList<>(data.values());
    }

    @Override
    public long insert(String name, String description, String iconUrl) {
        final BadgeDTO createdBadge = new ConstBadgeDTO(
            id++,
            name,
            description,
            iconUrl
        );
        data.put(createdBadge.id(), createdBadge);
        return createdBadge.id();
    }

    @Override
    public BadgeDTO get(long id) throws NotFoundException {
        final BadgeDTO badge = data.get(id);
        if (badge == null) {
            throw new NotFoundException();
        }
        return badge;
    }

    @Override
    public List<BadgeDTO> get(Set<Long> ids) {
        return data.values()
            .stream()
            .filter(badgeDTO -> ids.contains(badgeDTO.id()))
            .collect(Collectors.toList());
    }

    @Override
    public void delete(long id) {
        data.remove(id);
    }
}
