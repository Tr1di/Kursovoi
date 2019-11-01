package ru.mmo.database.user;

import ru.mmo.database.Country;

import javax.persistence.*;
import java.net.URL;
import java.util.List;

@Entity
@Table(name = "User_entity")
public class User {
    @Id
    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column
    private String name;

    //@Column
    //private String email;

    //@Column
    //private Calendar registrationDate;

    @ManyToMany
    private List<User> friends;

    @Column
    private URL image;

    @Enumerated(EnumType.STRING)
    @Column
    private Country country = Country.NOT_SELECTED;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void addFriends(User friend) {
        friends.add(friend);
    }

    public void addFriends(List<User> friends) {
        this.friends.addAll(friends);
    }
}