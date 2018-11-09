/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject6;

 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pojo.Polozka;
import GUI.DELETE;
/**
 *
 * @author Lenovo
 */
public class Main {
		  private static SessionFactory sessionFactory; 
		 
                
	 public static List listItems( ){
     // Session session = sessionFactory.openSession();
     
     
      sessionFactory= new Configuration().configure().buildSessionFactory();
     
     
      List<Polozka> items=new ArrayList();
      SessionFactory sessionFactory = HibernateUtil.getInstnce();
			Session session = sessionFactory.openSession();	
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
        items = session.createQuery("FROM Polozka").list();
                 System.out.println( items);
        
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
     return items;
   }
         
         
         
         
         public void addItem(Polozka p){
             SessionFactory sessionFactory = HibernateUtil.getInstnce();
   Session session = sessionFactory.openSession();	
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
       
                 
                 session.save(p); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
  
   } 
         
         
         
         public void deleteItem(){
          SessionFactory sessionFactory = HibernateUtil.getInstnce();
   Session session = sessionFactory.openSession();	
      Transaction tx = null;
   
      try {
          List<Polozka> pom=new ArrayList<Polozka>();
          pom=listItems( );
      
         tx = session.beginTransaction();
         int p=DELETE.getSelID();System.out.println(p);
        
         if ((pom.size()==1) && (p==1)) p=0;
    
         
         Polozka po =  pom.get(p); 
         session.delete(po); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   } 
         
	}

