package sn.senForage.senForageSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sn.senForage.senForageSpring.entities.User;

@Repository
public interface IUser extends JpaRepository<User, Integer>{

	@Query("SELECT u FROM User u WHERE u.email=:email AND u.password=:password")
	public User getUserByEmailandPassword(@Param("email") String email,@Param("password") String password);
}
