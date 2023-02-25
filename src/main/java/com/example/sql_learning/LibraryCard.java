package com.example.sql_learning;

import jakarta.persistence.*;

@Entity
@Table(name = "library_card")
public class LibraryCard{
    @Id
    private int cardNo;
    private int fine;
    private int booksIssued;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    public LibraryCard() {
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LibraryCard(int cardNo, int fine, int booksIssued) {
        this.cardNo = cardNo;
        this.fine = fine;
        this.booksIssued = booksIssued;
    }
    @OneToOne
    @JoinColumn
    User user;

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(int booksIssued) {
        this.booksIssued = booksIssued;
    }
}
