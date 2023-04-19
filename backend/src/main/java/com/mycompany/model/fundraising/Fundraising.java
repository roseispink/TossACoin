package com.mycompany.model.fundraising;


//import lombok.*;
import com.mycompany.model.Category;
import com.mycompany.model.user.User;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

//@Getter
//@Setter
@Entity
public class Fundraising {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OwnerID")
    private User owner;

    @Column(name = "CategoryID")
    private Long category;

    @Column(name = "Goal")
    private int goal;

    @Column(name = "CollectedMoney")
    private int collectedMoney;

    @Column(name = "Title")
    private String title;

    @Column(name = "FundraisingStart")
    @Temporal(TemporalType.DATE)
    private Date fundraisingStart;

    @Column(name = "FundraisingEnd")
    @Temporal(TemporalType.DATE)
    private Date fundraisingEnd;

    @Lob
    @Column(name = "Image")
    private byte[] image;

    @Column(name = "Description")
    private String description;

    @Column(name = "Available")
    private boolean available;

    public String getBasicInfo(){
        return "{\n\t" +
                "\"fundraising_start\": \""+ this.fundraisingStart+"\"\n\t"+
                "\"fundraising_end\": \""+ this.fundraisingEnd+"\"\n\t"+
                "\"title\": \""+ this.title+"\"\n\t"+
                "\"collected_money\": \""+ this.collectedMoney+"\"\n\t"+
                "\"goal\": \""+ this.goal+"\"\n\t"+
                "\"image\": \""+ Arrays.toString(this.image) +"\"\n\t"+
                "\"owner_name\": \""+ this.owner.getName()+"\"\n\t"+
                "\"owner_surname\": \""+ this.owner.getSurname()+"\"\n"+
                "}";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getCollectedMoney() {
        return collectedMoney;
    }

    public void setCollectedMoney(int collectedMoney) {
        this.collectedMoney = collectedMoney;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getFundraisingStart() {
        return fundraisingStart;
    }

    public void setFundraisingStart(Date fundraisingStart) {
        this.fundraisingStart = fundraisingStart;
    }

    public Date getFundraisingEnd() {
        return fundraisingEnd;
    }

    public void setFundraisingEnd(Date fundraisingEnd) {
        this.fundraisingEnd = fundraisingEnd;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
