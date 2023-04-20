package com.mycompany.model.fundraising;

import lombok.*;

import com.mycompany.model.Category;
import com.mycompany.model.user.User;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@Entity
public class Fundraising {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OwnerID")
    private User owner;

    @OneToMany
    @Column(name = "CategoryID")
    private List<Category> category;


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

}
