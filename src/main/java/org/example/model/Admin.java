package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Admin extends User{
    private String phoneNum;

    public Admin(String surname, String name, String password, String login, int id, String phoneNum) {
        super(surname, name, password, login, id);
        this.phoneNum = phoneNum;
    }

    public Admin(String login, String password, String name, String surname, String phoneNum) {
        super(login, password, name, surname);
        this.phoneNum = phoneNum;
    }
}
