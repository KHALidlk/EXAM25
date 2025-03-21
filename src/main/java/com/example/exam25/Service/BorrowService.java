package com.example.exam25.Service;

import com.example.exam25.Dao.BorrowDao;
import com.example.exam25.Entity.Borrow;

import java.util.ArrayList;
import java.util.List;

public class BorrowService {
    private BorrowDao borrowDao=new BorrowDao();
    private List<Borrow> listborow=new ArrayList<>();
    public List<Borrow> getallborrow()
    {
      return  listborow=borrowDao.getAllBorrow();
    }
    public void borrowDocument(Borrow borrow) {
        borrowDao.saveBorrow(borrow);
    }
}
