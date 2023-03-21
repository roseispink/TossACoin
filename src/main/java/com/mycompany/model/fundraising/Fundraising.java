package com.mycompany.model.fundraising;


//import lombok.*;
import com.mycompany.model.user.User;

import javax.persistence.*;
import java.util.Date;

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
    private Long categoryId;

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
}
