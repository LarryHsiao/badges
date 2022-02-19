package com.larryhsiao.badges.core.badges.entities;

public interface UserBadge {
    long userId();

    long createdTime();

    Badge badge();
}
