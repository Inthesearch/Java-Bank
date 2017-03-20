/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author RV
 */
public class Register {
    
    
    int id;
    
    String fname;
    String lname;
    //String position;
    String username;
    String password;

    public Register(String fname, String lname, String user, String pass) {
        this.fname = fname;
        this.lname = lname;
        this.username = user;
        password = pass;
    }
    
    public  Register(){
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
   
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Register{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", username=" + username + ", password=" + password + '}';
    }
    
    
    
    
    
}
