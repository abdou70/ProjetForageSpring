package sn.senForage.senForageSpring.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Village implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=500)
	private String nom;
	@OneToMany(mappedBy="village",fetch =FetchType.LAZY, targetEntity=Client.class)
    private List<Client> clients = new ArrayList<Client>();
	public Village() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Village(int id, String nom, List<Client> clients) {
		super();
		this.id = id;
		this.nom = nom;
		this.clients = clients;
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
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	
	
}
