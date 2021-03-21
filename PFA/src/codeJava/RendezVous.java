package codeJava;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RendezVous {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String email;
	private String tel;
	private String Rv;
	private String departement;
	private String medecin;
	private String message;

	public RendezVous() {
		super();
	}

	public RendezVous(int id, String nom, String email, String tel, String Rv, String departement, String medecin,
			String message) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.tel = tel;
		this.Rv = Rv;
		this.departement = departement;
		this.medecin = medecin;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RendezVous(String nom, String email) {
		super();
		this.nom = nom;
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRv() {
		return Rv;
	}

	public void setRv(String Rv) {
		this.Rv = Rv;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getMedecin() {
		return medecin;
	}

	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "RendezVous [nom=" + nom + ", email=" + email + ", tel=" + tel + ", Rv=" + Rv + ", departement="
				+ departement + ", medecin=" + medecin + ", message=" + message + "]";
	}

}
