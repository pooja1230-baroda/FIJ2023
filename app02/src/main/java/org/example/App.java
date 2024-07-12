package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {

            Map<String,String> props=new HashMap<>();
            props.put("hibernate.show_sql","true");
            props.put("hibernate.hbm2ddl.auto","update");

            Employee emp = new Employee();
            emp.setName("BBB");
            emp.setSalary(2000f);
            try {
                EntityManagerFactory factory = new HibernatePersistenceProvider()
                        .createContainerEntityManagerFactory(new CustomPersistentInfo(), props);
                EntityManager manager=factory.createEntityManager();
                manager.getTransaction().begin();
                manager.persist(emp);
                manager.getTransaction().commit();
                factory.close();
                manager.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

}
