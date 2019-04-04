package com.tranthanh.sem4.demosession1.models;
import com.tranthanh.sem4.demosession1.entities.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleModel {
    public List<Role> findAll(){
        List<Role> roleList = new ArrayList<Role>();
        roleList.add(new Role("lang1", "Role 1"));
        roleList.add(new Role("lang2", "Role 2"));

        return roleList;
    }
}
