/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject6;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Lenovo
 */
public class HibernateUtil {
    private HibernateUtil() {

	}

	private static SessionFactory sessionFactory;

	public static synchronized SessionFactory getInstnce() {

		if (sessionFactory == null) {
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			sessionFactory = configuration.buildSessionFactory(builder.build());
		}
		return sessionFactory;

	}
}
