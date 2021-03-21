package codeJava;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(RendezVous.class)
				.buildSessionFactory();
		// create session
		// ORM
		Session session = factory.getCurrentSession();
		try {
			// RendezVous rv=new RendezVous("hrv 99", 9999);
			// start a transaction

			session.beginTransaction();
			RendezVous rv = new RendezVous(1, "khalifa ", "khaliphag9@gmail.com", "0623870747", "13/04/2020",
					"cardiologie", "Dr Samb", "je veux un Rv");
			RendezVous R = new RendezVous();
			session.save(rv);
			// RendezVous rv3 = session.get(RendezVous.class, 8);
			// rv3.setLibelle("sony vaio v12");
			// System.out.println("le patient recupere est " + rv3.getNom(),);
			// rv3.setLibelle("DELL SAT S7");
			// session.save(rv3);
			// int rv1=(int) session.save(rv);
			// System.err.rvrintln("rv1 = "+rv1);
			// RendezVous rv2 = session.get(RendezVous.class, 6);
			// session.delete(rv2);
			// System.out.rvrintln("RendezVous rv2" + rv2);
			// List<RendezVous> list = session.createQuery("from RendezVous rv where
			// rv.libelle like '%hrv%'")
			// .getResultList();
			// session.createQuery("delete from RendezVous rv where
			// rv.id=5").executeUrvdate();
			// System.out.rvrintln(list);
			// rv.setId(1);
			// session.delete(rv);
			// commit transaction;
			session.getTransaction().commit();

			System.out.println("OK!");
		} finally {
			// session.clear();

			factory.close();

		}

	}

}
