/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main;
import com.conn.DBConnect;
import com.dao.ContactDao;
import com.entity.Contact;
import java.util.*;

/**
 *
 * @author hp
 */
public class DataMain 
{
    public static void main(String args[])
    {
        boolean f=true;
        while(f)
        {
            System.out.println("....................................");
            System.out.println("1.Create Contact");
            System.out.println("2.Update Contact");
            System.out.println("3.Delete Contact");
            System.out.println("4.Retrive Contact");
            System.out.println("5.Exit");
            System.out.println("....................................");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter what you want to do?");
            int ch=sc.nextInt();
      switch(ch)
       {
                case 1:
                  
    
        System.out.println("Enter Name:");
        String name=sc.next();
        System.out.println("Enter Phone No:");
        String phoneno=sc.next();
        Contact c=new Contact();
        c.setName(name);
        c.setPhone(phoneno);
        ContactDao dao=new ContactDao(DBConnect.getConn());
        boolean m=dao.insertContact(c);
        if(m)
        {
            System.out.println("Data inserted successfully");
        }
        else
        {
            System.out.println("Error");
        }
        break;
                case 2:
                   
   
       Contact c2=new Contact();
        System.out.println("Enter Phone No:");
        String phoneno1=sc.next();
         System.out.println("Enter Name:");
         String name1=sc.next();
        c2.setName(name1);
        c2.setPhone(phoneno1);
       ContactDao dao1=new ContactDao(DBConnect.getConn());
       boolean n=dao1.updateContact(c2);
        if(n)
        {
            System.out.println("Data updated successfully");
        }
        else
        {
            System.out.println("Error");
        }
        break;
        case 3:
         Contact c3=new Contact();
       
       
     
         System.out.println("Enter Name:");
        String name2=sc.next();
        c3.setName(name2);
      
        ContactDao dao2=new ContactDao(DBConnect.getConn());
        boolean f1=dao2.deleteContact(name2);
        if(f)
        {
            System.out.println("Data deleted successfully");
        }
        else
        {
            System.out.println("Error");
        }
        break;
        case 4:
         ContactDao dao3=new ContactDao(DBConnect.getConn());

        List<Contact> list=dao3.getAllContact();
        for(Contact c1:list)
        {
            System.out.println("ID:"+c1.getId());
            System.out.println("Name:"+c1.getName());
            System.out.println("Salary:"+c1.getPhone());
        }  
             
              break;
        case 5:
            f=false;
        default:
            System.out.println("Wrong operation");
    } 
      
    }
       }



}
 

