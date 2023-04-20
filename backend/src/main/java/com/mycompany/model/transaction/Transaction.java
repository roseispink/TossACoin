package com.mycompany.model.transaction;

import lombok.*;
import java.util.Date;


import javax.persistence.*;

@Setter
@Getter
@Entity
public class Transaction {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "FundraisingID")
    private Long fundraisingId;

    @Column(name = "PayerID")
    private Long payerId;

    @Column(name = "Amount")
    private int amount;

    @Temporal(TemporalType.DATE)
    @Column(name = "Date")
    private Date date;

    @Enumerated
    @Column(name = "Type")
    private TransactionType transactionType;

}
