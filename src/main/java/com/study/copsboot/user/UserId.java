package com.study.copsboot.user;

import com.study.copsboot.orm.jpa.AbstractEntityId;

import java.util.UUID;

public class UserId extends AbstractEntityId<UUID> {
    protected UserId() {
    }

    public UserId(UUID id) {
        super(id);
    }
}
