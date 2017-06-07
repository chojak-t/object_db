/*
 * Application uses object database (objectdb.com) and JPA API
 */
package warsztat;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Tomasz Chojak
 */
public class Main {
    
    private static final String DATABASEPATH = "db/warsztat.odb";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //open database connection (creates new if not exist)
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DATABASEPATH);
        EntityManager em = emf.createEntityManager();
        
        //add new points to database
        //adding to previous state of database, so may be duplicates
        em.getTransaction().begin();
        
        
	Telefon phone1 = new Telefon();
	phone1.setNumber("601992554");
	phone1.setType("komórka");
	em.persist(phone1);
		
	Telefon phone2 = new Telefon();
	phone2.setNumber("4367661354");
	phone2.setType("stacjonarny");
	em.persist(phone2);
        
        Telefon phone3 = new Telefon();
	phone3.setNumber("123456789");
	phone3.setType("służbowy");
	em.persist(phone3);
        
        Telefon phone4 = new Telefon();
	phone4.setNumber("987654321");
	phone4.setType("służbowy");
	em.persist(phone4);
        
        //nowy pracownik #1
        Pracownik employee = new Pracownik();
        employee.setName("Tomasz");
	employee.setSurname("Chojak");
        employee.setTitle("Engineer");
	employee.setCreated(new Date());
	employee.addPhone(phone1);
	employee.addPhone(phone2);
		
	em.persist(employee);
        
        //nowy pracownik #2
        Pracownik employee2 = new Pracownik();
        employee2.setName("Maciej");
	employee2.setSurname("Krasucki");
        employee2.setTitle("Engineer 2");
	employee2.setCreated(new Date());
	employee2.addPhone(phone2);
	employee2.addPhone(phone3);
        employee2.addPhone(phone4);
		
	em.persist(employee2);
                        
        /*
        for (int i=0;i<10;i++) {
            Point point = new Point(i, i+1);
            em.persist(point);
        }
        */
        
        em.getTransaction().commit();
        
        //wyszukanie pracowników
        em.getTransaction().begin();
        
        //wyszukanie po id
        long employeeId1 = employee.getId();
        long employeeId2 = employee2.getId();
		
	Pracownik dbPracownik1 = em.find(Pracownik.class, employeeId1);
	System.out.println("db1: " + dbPracownik1);
        
        Pracownik dbPracownik2 = em.find(Pracownik.class, employeeId2);
	System.out.println("db2: " + dbPracownik2);
		
	em.getTransaction().commit();
        
        //dodawanie Towarów
        em.getTransaction().begin();
        
        Towar towar1 = new Towar();
        towar1.setNazwa("olej silnikowy");
        towar1.setJm("L");
        towar1.setCena(19.99);
        em.persist(towar1);
        
        Towar towar2 = new Towar();
        towar2.setNazwa("pasek rozrządu");
        towar2.setJm("szt");
        towar2.setCena(235.0);
        em.persist(towar2);
        
        Towar towar3 = new Towar();
        towar3.setNazwa("lusterko lewe");
        towar3.setJm("szt");
        towar3.setCena(75.0);
        em.persist(towar3);
        
        Towar towar4 = new Towar();
        towar4.setNazwa("wymiana oleju silnikowego");
        towar4.setJm("szt");
        towar4.setCena(50);
        em.persist(towar4);
        
        em.getTransaction().commit();
        
        //dodawanie faktur
        em.getTransaction().begin();
        
        Faktura faktura1 = new Faktura();
        faktura1.setNumer("VAT/2017/06/01/3456");
        faktura1.setDataWystawienia(new Date(System.currentTimeMillis()));
        //TODO przenieść funkcjonalność dodawania faktury do towaru do metody addTowar klasy Faktura
        //Na razie ręcznie
        faktura1.addTowar(towar1);
        //towar1.addFaktura(faktura1); //ręcznie powiązanie w drugą stronę
        faktura1.addTowar(towar2);
        //towar2.addFaktura(faktura1); //ręcznie powiązanie w drugą stronę
        em.persist(faktura1);
        
        Faktura faktura2 = new Faktura();
        faktura2.setNumer("VAT/2020/09/07/1000");
        faktura2.setDataWystawienia(new Date(System.currentTimeMillis()));
        //faktura2.addTowar(towar3);
        faktura2.addTowar(towar4);
        faktura2.addTowar(towar1);
        //towar3.addFaktura(faktura2);//ręcznie
        //towar4.addFaktura(faktura2);//ręcznie
        //towar1.addFaktura(faktura2);//ręcznie
        em.persist(faktura2);
        
        em.getTransaction().commit();
        
        //ręczne dodanie powiązań w drugą stronę towar->faktura
        /*
        em.getTransaction().begin();
        towar1.addFaktura(faktura1); //ręcznie powiązanie w drugą stronę
        towar2.addFaktura(faktura1); //ręcznie powiązanie w drugą stronę
        towar3.addFaktura(faktura2);//ręcznie
        towar4.addFaktura(faktura2);//ręcznie
        towar1.addFaktura(faktura2);//ręcznie
        
        em.getTransaction().commit();
        */
        ///////////////////////////////////
        //wyszukanie towarów
        em.getTransaction().begin();
        
        //wyszukanie po id
        long towar1id = towar1.getId();
        long towar2id = towar2.getId();
        long towar3id = towar3.getId();
        long towar4id = towar4.getId();
		
	Towar dbTowar1 =em.find(Towar.class, towar1id);
	System.out.println("towar1: " + dbTowar1);
        
        Towar dbTowar2 =em.find(Towar.class, towar2id);
	System.out.println("towar2: " + dbTowar2);
        
        Towar dbTowar3 =em.find(Towar.class, towar3id);
	System.out.println("towar3: " + dbTowar3);
        
        Towar dbTowar4 =em.find(Towar.class, towar4id);
	System.out.println("towar4: " + dbTowar4);
		
	em.getTransaction().commit();
        ///////////////////////////////////
        ///////////////////////////////////
        //wyszukanie faktur
        em.getTransaction().begin();
        
        //wyszukanie po id
        String faktura1id = faktura1.getNumer();
        String faktura2id = faktura2.getNumer();
		
	Faktura dbFaktura1 =em.find(Faktura.class, faktura1id);
	System.out.println("faktura1: " + dbFaktura1);
        
        Faktura dbfaktura2 =em.find(Faktura.class, faktura2id);
	System.out.println("faktura2: " + dbfaktura2);
		
	em.getTransaction().commit();
        ///////////////////////////////////
        
        //end adding new points
        
        //query #1 - number of points in database
        //Query query1 = em.createQuery("SELECT COUNT(p) FROM Point p");
        //System.out.println("Liczba punktów:" + query1.getSingleResult());
        
        //query #2 - get all points from database
        //TypedQuery<Point> query2 = em.createQuery("SELECT p FROM Point p", Point.class);
        //List<Point> q2results = query2.getResultList();
        
        //print out all results from query2
        //for (Point p : q2results) {
            //System.out.println(p);
        //}
        
        //close database connection
        em.close();
        emf.close();
        
    }
    
}
