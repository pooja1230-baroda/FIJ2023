package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entities.Passport;
import org.example.entities.Person;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<String,String> props=new HashMap<>();
        props.put("hibernate.show_sql","true");
        props.put("hibernate.hbm2ddl.auto","create");

            Person p1=new Person();
            p1.setName("AAA");

            Passport ps1=new Passport();
            ps1.setPassportNumber("ABC123");

            p1.setPassport(ps1);


        try {
            EntityManagerFactory factory = new HibernatePersistenceProvider()
                    .createContainerEntityManagerFactory(new CustomPersistentInfo(), props);
            EntityManager manager=factory.createEntityManager();
            manager.getTransaction().begin();
            manager.persist(p1);
            manager.persist(ps1);

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
