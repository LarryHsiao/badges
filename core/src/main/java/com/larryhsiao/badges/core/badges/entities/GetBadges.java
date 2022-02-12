package com.larryhsiao.badges.core.badges.entities;

import com.larryhsiao.clotho.Source;

import java.util.List;

public class GetBadges implements Source<List<Badge>> {
    @Override
    public List<Badge> value() throws Exception {
        throw new RuntimeException("To do.");
    }
}
