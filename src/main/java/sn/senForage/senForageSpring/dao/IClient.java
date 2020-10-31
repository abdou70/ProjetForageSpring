package sn.senForage.senForageSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.senForage.senForageSpring.entities.Client;

@Repository
public interface IClient extends JpaRepository<Client, Integer>{
	

}
