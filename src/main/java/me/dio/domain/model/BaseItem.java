package me.dio.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseItem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String icon;
    private String description;


}
