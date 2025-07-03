package com.study.copsboot.orm.jpa;

public interface UniqueIdGenerator<T> {
    T getNextUniqueId();
}