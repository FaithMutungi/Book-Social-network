package com.PreciousCode.BookNetwork.history;

import com.PreciousCode.BookNetwork.book.Book;
import com.PreciousCode.BookNetwork.common.BaseEntity;
import com.PreciousCode.BookNetwork.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BookTransactionHistory extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;


    private  boolean returned;
    private  boolean returnApproved;


    //USER RELATIONSHIP
    //BOOK RELATIONSHIP
}
