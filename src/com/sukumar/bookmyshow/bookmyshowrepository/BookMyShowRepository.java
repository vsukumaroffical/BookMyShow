package com.sukumar.bookmyshow.bookmyshowrepository;

import com.sukumar.bookmyshow.dto.Account;
import com.sukumar.bookmyshow.dto.Theater;
import com.sukumar.bookmyshow.dto.User;

import java.util.HashMap;
import java.util.Map;

public class BookMyShowRepository {
    private static BookMyShowRepository repository;
    private Theater theater;
    private Map<String , User> users = new HashMap<>();
    private BookMyShowRepository(){

    }
    public static BookMyShowRepository getInstance(){
        return repository == null ? (repository = new BookMyShowRepository()): repository;
    }
    public Theater getTheater(){
        return theater;
    }
    public void setTheater(Theater theater){
        this.theater =theater;
    }

    public User getUser(String userName){
        if(!users.containsKey(userName))
            return null;
        return users.get(userName);
    }
    public void setUsers(User user){
        users.put(user.getUserName(),user);
    }

    public void setAccount(Account account, String name){
        users.get(name).setAccount(account);
    }


    public String getAdminName() {
        return  "admin";
    }
    public String getAdminPassword(){
        return "admin123";
    }
}
