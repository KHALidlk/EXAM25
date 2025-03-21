package com.example.exam25.Service;

import com.example.exam25.Dao.UserDao;
import com.example.exam25.Entity.User;

public class Userservice {

        private UserDao daoS=new UserDao();

        public void ajouterUser(User user) {
            daoS.AjouterStudent(user);

    }

}
