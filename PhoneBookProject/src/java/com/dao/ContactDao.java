/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.entity.Contact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author hp
 */
public class ContactDao 
{
    private Connection conn;
    public ContactDao(Connection conn)
    {
        super();
        this.conn=conn;
    }
    public boolean insertContact(Contact c)
    {
        boolean f=false;
        try
        {
            PreparedStatement pstmt=conn.prepareStatement("insert into phoneno(name,pno) values(?,?)");
            pstmt.setString(1,c.getName());
            pstmt.setString(2,c.getPhone());
            int a=pstmt.executeUpdate();
            if(a==1)
            {
                f=true;
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }
    public boolean updateContact(Contact c)
    {
       boolean f=false;
        try
        {
            PreparedStatement pstmt1=conn.prepareStatement("update phoneno set pno=? where name=?");
            pstmt1.setString(1,c.getPhone());
            pstmt1.setString(2,c.getName());
           
            int m=pstmt1.executeUpdate();
            if(m==1)
            {
                f=true;
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f; 
    }
    public boolean deleteContact(String name)
    {
       boolean f=false;
        try
        {
            PreparedStatement pstmt1=conn.prepareStatement("delete from phoneno where name=?");
        
            pstmt1.setString(1,name);
           
            int i=pstmt1.executeUpdate();
            if(i==1)
            {
                f=true;
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f; 
    }
    public List<Contact> getAllContact()
    {
        
        List<Contact> list=new ArrayList<>();
        Contact obj=null;
        try
        {
        
        PreparedStatement pstmt2=conn.prepareStatement("select * from phoneno");
        ResultSet rs=pstmt2.executeQuery();
        while(rs.next())
        {
            obj=new Contact();
            obj.setId(rs.getInt(1));
            obj.setName(rs.getString(2));
            obj.setPhone(rs.getString(3));
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
    
}
