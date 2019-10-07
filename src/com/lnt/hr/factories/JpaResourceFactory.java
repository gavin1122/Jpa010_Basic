package com.lnt.hr.factories;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaResourceFactory {
	
		private static EntityManagerFactory factory;
		
		
		static {
			
			factory=Persistence.createEntityManagerFactory("OracleJpaUnit");
			
			System.out.print("Factory Created");
						
		}
		
		public static EntityManagerFactory getFactory() {
			
			return factory;
		
			
		}
		
}
