package com.mycompany.model.user;

//import lombok.*;

import com.mycompany.model.fundraising.Fundraising;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

//@Getter
//@Setter
@Entity
public class User {
    @Id
    @Column(name = "ID")
    private Long id;

    @OneToMany
    @Column(name = "FundraisingIDs")
    private Set<Fundraising> fundraisingIds;

    @Column(name = "Name")
    private String name;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "Email")
    private String email;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "Password")
    private String password;

    @Column(name = "RegisterDate")
    private Date registerDate;

    @Column(name = "BirthDate")
    private Date birthDate;

    @Column(name = "Pesel")
    private String pesel;

    @Column(name = "BankNumber")
    private String bankNumber;

    @Column(name = "Role")
    private boolean role;

    @Column(name = "Blocked")
    private boolean blocked;
}
