package com.locator.tabajara.model;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @SequenceGenerator(name = "users_id_seq", sequenceName = "users_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "users_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Integer age;



    public User() {
    }

    public User(Long id, String name, Integer age) {
        this();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof User) {
            return equals((User) obj);
        }

        return false;
    }

    public boolean equals(User user) {
        return this.id.equals(user.id) &&
                this.name.equals(user.name) &&
                this.age.equals(user.age);
    }

    public String toString() {
        return "User(id: " + id + ", name: " + name + ", age: " + age + ")";
    }
}
