package com.mycompany.model.user;

import lombok.*;

import com.mycompany.model.fundraising.Fundraising;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private Set<Fundraising> fundraisingIds;
    private String name;
    private String surname;
    @Column(unique = true)
    private String email;
    private String phoneNumber;
    private String password;
    private Date registerDate;
    private Date birthDate;
    private String pesel;
    private String bankNumber;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @ColumnDefault("false")
    private boolean blocked;

    public String getBasicInfo(){
        return "{\n\t" +
                "\"role\": \""+ this.role+"\"\n\t"+
                "\"email\": \""+ this.email+"\"\n\t"+
                "\"name\": \""+ this.name+"\"\n" +
                "}";

    }


}
