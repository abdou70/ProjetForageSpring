package sn.senForage.senForageSpring.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Client implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=400)
	private String nom;
	@Column(length=400)
	private String adresse;
	@Column(length=400)
	private String telephone;
	@ManyToOne
	@JoinColumn(name="id_village")
    private Village village = new Village();
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(int id, String nom, String adresse, String telephone, Village village) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.village = village;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Village getVillage() {
		return village;
	}
	public void setVillage(Village village) {
		this.village = village;
	}
	
	
}
