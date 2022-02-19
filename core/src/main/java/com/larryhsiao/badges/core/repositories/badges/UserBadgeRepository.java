package com.larryhsiao.badges.core.repositories.badges;

import com.larryhsiao.badges.core.repositories.badges.dto.UserBadgeDTO;

import java.util.List;

public interface UserBadgeRepository {
    void createUserBadge(long userId, long badgeId);

    void removeUserBadge(long userId, long badgeId);

    void removeBadge(long badgeId);

    void removeUser(long userId);

    List<UserBadgeDTO> getUserBadges(long userId);
}
