package com.nadhem.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nadhem.users.service.UserService;


@SpringBootApplication
public class UsersMicroserviceApplication {
	
	@Autowired
	UserService userService;


	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}
	
	// @PostConstruct
	// void init_users() {
	// 	//ajouter les rôles
	// 	userService.addRole(new Role(null,"ADMIN"));
	// 	userService.addRole(new Role(null,"USER"));
		
	// 	//ajouter les users
	// 	userService.saveUser(new User("admin","123",true,null));
	// 	userService.saveUser(new User("nadhem","123",true,null));
	// 	userService.saveUser(new User("yassine","123",true,null));
		
	// 	//ajouter les rôles aux users
	// 	userService.addRoleToUser("admin", "ADMIN");
	// 	userService.addRoleToUser("admin", "USER");
		
	// 	userService.addRoleToUser("nadhem", "USER");
	// 	userService.addRoleToUser("yassine", "USER");		
	// } 
	
	
	



}
