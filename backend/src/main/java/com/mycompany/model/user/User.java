package com.mycompany.model.user;

//import lombok.*;

import com.mycompany.model.fundraising.Fundraising;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

//@Getter
//@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private Set<Fundraising> fundraisingIds;
    private String name;
    private String surname;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Fundraising> getFundraisingIds() {
        return fundraisingIds;
    }

    public void setFundraisingIds(Set<Fundraising> fundraisingIds) {
        this.fundraisingIds = fundraisingIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
