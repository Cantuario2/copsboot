package com.study.copsboot.orm.jpa;

public interface Entity<T extends EntityId> {
    T getId();
}
