package sn.senForage.senForageSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import sn.senForage.senForageSpring.dao.IUser;
import sn.senForage.senForageSpring.entities.User;

@SpringBootApplication
public class SenForageSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=  SpringApplication.run(SenForageSpringApplication.class, args);
		
		/*IUser iUser = ctx.getBean(IUser.class) ;
		
		User user = new User();
		user.setId(1);
		user.setNom("niang");
		user.setPrenom("Abdou");
		user.setEmail("abdou12@gmail.com");
		user.setPassword("passer1234");
		
		try {
			iUser.save(user);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
	}

}
