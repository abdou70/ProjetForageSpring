package sn.senForage.senForageSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.senForage.senForageSpring.entities.Village;

@Repository
public interface IVillage extends JpaRepository<Village, Integer>{

}
