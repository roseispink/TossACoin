package com.mycompany.model.fundraising;

import com.mycompany.model.category.Category;
import lombok.*;

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

    @ManyToMany
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
        return "{"+
                "fundraising_start:"+ this.fundraisingStart+
                " fundraising_end:"+ this.fundraisingEnd+
                " title:"+ this.title+
                " collected_money:"+ this.collectedMoney+
                " goal:"+ this.goal+
                " image:"+ Arrays.toString(this.image) +
                " owner_name"+ this.owner.getName()+
                " owner_surname"+ this.owner.getSurname()+
                "}";
    }

}
