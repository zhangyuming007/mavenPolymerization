package org.openSource.pojo;

import java.io.Serializable;

public class UserBean implements Serializable {

    private String name;

    private Integer id;

    public UserBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}
