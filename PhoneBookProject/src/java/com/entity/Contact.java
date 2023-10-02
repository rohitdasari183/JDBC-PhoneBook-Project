/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

/**
 *
 * @author hp
 */
public class Contact 
{
    private int id;
    private String name;
    private String phoneno;
    public Contact()
    {
        super();
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
     public void setName(String name)
    {
        this.name=name;
    }
    public String getPhone()
    {
        return phoneno;
    }
    public void setPhone(String phoneno)
    {
        this.phoneno=phoneno;
    }
    
}
