package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static SessionFactory sf;
	
	static{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
	}
	
	
	public static Session getSession(){
		return sf.openSession();
	}
	
	
}
