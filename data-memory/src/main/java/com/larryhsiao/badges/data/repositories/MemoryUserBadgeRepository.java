package com.larryhsiao.badges.data.repositories;

import com.larryhsiao.badges.core.repositories.badges.UserBadgeRepository;
import com.larryhsiao.badges.core.repositories.badges.dto.ConstUserBadgeDTO;
import com.larryhsiao.badges.core.repositories.badges.dto.UserBadgeDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryUserBadgeRepository implements UserBadgeRepository {
    /**
     * Key: UserId
     * Value: List of {@link UserBadgeDTO} that user had.
     */
    private final Map<Long, List<UserBadgeDTO>> data = new HashMap<>();

    @Override
    public void createUserBadge(long userId, long badgeId) {
        List<UserBadgeDTO> userBadges = data.computeIfAbsent(userId, k -> new ArrayList<>());
        final boolean exist = userBadges.stream()
            .anyMatch(userBadgeDTO -> userBadgeDTO.badgeId() == badgeId);
        if (!exist) {
            userBadges.add(new ConstUserBadgeDTO(
                userId,
                badgeId,
                System.currentTimeMillis()
            ));
        }
    }

    @Override
    public void removeUserBadge(long userId, long badgeId) {
        List<UserBadgeDTO> userBadges = data.get(userId);
        if (userBadges != null) {
            final Optional<UserBadgeDTO> existBadge = userBadges.stream()
                .filter(userBadgeDTO -> userBadgeDTO.badgeId() == badgeId)
                .findFirst();
            existBadge.ifPresent(userBadges::remove);
        }
    }

    @Override
    public void removeBadge(long badgeId) {
        for (List<UserBadgeDTO> value : data.values()) {
            value.removeIf(userBadgeDTO -> userBadgeDTO.badgeId() == badgeId);
        }
    }

    @Override
    public void removeUser(long userId) {
        for (List<UserBadgeDTO> value : data.values()) {
            value.removeIf(userBadgeDTO -> userBadgeDTO.userId() == userId);
        }
    }

    @Override
    public List<UserBadgeDTO> getUserBadges(long userId) {
        return data.computeIfAbsent(userId, it -> new ArrayList<>());
    }
}
