package com.example.exam25.Controler;

import com.example.exam25.Entity.Borrow;
import com.example.exam25.Service.BorrowService;
import jakarta.inject.Named;

import java.util.List;

@Named("borrowBean")
public class BorrowContr {
    private BorrowService borrowService = new BorrowService();
    private Borrow borrow = new Borrow();

    public List<Borrow> getAllBorrow() {
        return borrowService.getallborrow();
    }

    public void borrowDocument() {
        borrowService.borrowDocument(borrow);
    }

    public Borrow getBorrow() {
        return borrow;
    }

    public void setBorrow(Borrow borrow) {
        this.borrow = borrow;
    }
}