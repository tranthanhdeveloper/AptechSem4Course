package com.demo.entities;

public class Role {
    private String id;
    private String name;

    public Role(String code, String name) {
        this.id = code;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
