package codeJava;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory Sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(RendezVous.class)
				.buildSessionFactory();
		Session session =  Sf.getCurrentSession();
		try {
			// RendezVous rv=new RendezVous("hrv 99", 9999);
			// start a transaction

			session.beginTransaction();
			RendezVous rv = new RendezVous(1, "khalifa ", "khaliphag9@gmail.com", "0623870747", "13/04/2020",
					"cardiologie", "Dr Samb", "je veux un Rv");
			RendezVous R = new RendezVous();
			session.save(rv);
			session.getTransaction().commit();

			System.out.println("OK!");
		} finally {
			// session.clear();

			Sf.close();

		}

	}

}
