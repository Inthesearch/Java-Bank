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
public class CustomerDetails {
    
    int id;
    String name;
    String address;
    String accountNo;
    int balance;
    
    public CustomerDetails(){
        
    }

    public CustomerDetails(String name, String address, String accountNo, int balance) {
        this.name = name;
        this.address = address;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" + "id=" + id + ", name=" + name + ", address=" + address + ", accountNo=" + accountNo + ", balance=" + balance + '}';
    }
    
    
            
    
    
}
