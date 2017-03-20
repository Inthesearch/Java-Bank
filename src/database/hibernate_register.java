/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Model.CustomerDetails;
import Model.Register;
import javax.swing.JOptionPane;
import org.hibernate.Query;
//import View.Registeration_frame;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author RV
 */
public class hibernate_register {

   
    
    public  void save(Register r){
    
    try{
    Configuration c = new Configuration();
    c.configure();
    SessionFactory factory = c.buildSessionFactory();
    Session session = factory.openSession();
    Transaction  tx = session.beginTransaction();
    session.save(r);
    tx.commit();
    
        
        
    
    
    
    
    
}catch(Exception e){


e.printStackTrace();

    
}
  
    }
    public boolean login(String user, String pass){
       
        try{
    Configuration c = new Configuration();
    c.configure();
            System.out.println("configuration done");
    SessionFactory factory = c.buildSessionFactory();
    Session session = factory.openSession();
    Transaction  tx = session.beginTransaction();
            System.out.println("database.hibernate_register.login()");
            
    //String sql = "from banking_system ";
    Query q = session.createQuery(" from Register where Username = '"+user+"'");
            System.out.println("database.hibernate_register.login()");
    Register r = (Register ) q.uniqueResult();
            System.out.println(r);
    tx.commit();
    if(r != null && pass.equals(r.getPassword())){
        return true;
    }else{
        return false;
    }
    
    
    
    }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Error occured.");
        return false;
        }
        
        



        
    }

    public  void save(CustomerDetails r){
    
    try{
    Configuration c = new Configuration();
    c.configure();
    SessionFactory factory = c.buildSessionFactory();
    Session session = factory.openSession();
    Transaction  tx = session.beginTransaction();
    session.save(r);
    tx.commit();
    
     
}catch(Exception e){


e.printStackTrace();

    
}


    }
    
   public void add(String acc, int a){
       
   Configuration c = new Configuration();
    c.configure();
    SessionFactory factory = c.buildSessionFactory();
    Session session = factory.openSession();    
   
try{
    Transaction tx = session.beginTransaction();
    Query query = session.createQuery("from CustomerDetails where Account_no ='"+acc+"'");
    CustomerDetails cd = (CustomerDetails) query.uniqueResult();
    int bal = cd.getBalance();
    int nbal = bal+a;
    cd.setBalance(nbal);
    tx.commit();
    
    
    
    
}catch(Exception e){
    e.printStackTrace();
}    
       
   } 
    
public void withdraw(String ac, int amt){
    
     Configuration c = new Configuration();
    c.configure();
    SessionFactory factory = c.buildSessionFactory();
    Session session = factory.openSession();
    
    try {
        
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from CustomerDetails where Account_no = '"+ac+"'");
        CustomerDetails cd = (CustomerDetails) query.uniqueResult();
        int bal = cd.getBalance();
        int nbal = bal - amt;
        cd.setBalance(nbal);
        tx.commit();
        
        
        
    } catch (Exception e) {
    
    e.printStackTrace();
    }
    
    
} 

public CustomerDetails details(String acc, String name){
    
      Configuration c = new Configuration();
    c.configure();
    SessionFactory factory = c.buildSessionFactory();
    Session session = factory.openSession();
    
    try{
        Transaction tx = session.beginTransaction();
        if(name.equals("")){
            Query query = session.createQuery("from CustomerDetails where Account_no = '"+acc+"'");
            CustomerDetails cd = (CustomerDetails) query.uniqueResult();
            
            return cd;
        }
        else{
            Query query = session.createQuery("from CustomerDetails where Name = '"+name+"'");
            CustomerDetails cd = (CustomerDetails) query.uniqueResult();
            
            return cd;
            
        }
            
        
    }catch(Exception e){
        e.printStackTrace();
    return null;
    }
    
    
}


public void update(String acc,String name,String n,String add,String ac){
    
       
      Configuration c = new Configuration();
    c.configure();
    SessionFactory factory = c.buildSessionFactory();
    Session session = factory.openSession();
    CustomerDetails cd;
    System.out.println(acc+name+n+add+ac);
    try{
        Transaction tx = session.beginTransaction();
        if(name.equals("")){
        Query query = session.createQuery("from CustomerDetails where Account_no = '"+acc+"'");
         cd = (CustomerDetails) query.uniqueResult();

        
        }
        else{
            Query query = session.createQuery("from CustomerDetails where Name = '"+name+"'");
              cd = (CustomerDetails) query.uniqueResult();
        }

       if(n.equals("")){
                System.out.println("name is not changed");
            }
       else{
                cd.setName(n);
            }
       if(add.equals("")){
                System.out.println("address is not changed");
            }
       else{
                cd.setAddress(add);
            }
       if(ac.equals("")){
                System.out.println("account no. is not changed. ");
       }else{
                cd.setAccountNo(ac);
            }

        tx.commit();
            
        
    }catch(Exception e){
        e.printStackTrace();
    
    }
 
    
    
    
}
   

public void delete(String name, String acc){
    Configuration cfg = new Configuration();
    cfg.configure();
    SessionFactory factory = cfg.buildSessionFactory();
    Session session =factory.openSession();
    CustomerDetails cd;
    try{
        Transaction tx = session.beginTransaction();
        if(name.equals("")){
        Query query = session.createQuery("from CustomerDetails where Account_no = '"+acc+"'");
        cd = (CustomerDetails) query.uniqueResult();
                }
        else{
            Query query = session.createQuery("from CustomerDetails where Name = '"+name+"'");
            cd = (CustomerDetails) query.uniqueResult();
            
        }
        
        session.delete(cd);
        tx.commit();
    }catch(Exception e){
        e.printStackTrace();
    }
}
   
}



