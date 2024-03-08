package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    //find Introducer By criteria name property
	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name,String city);
	
	public List<User> findByNameStartingWith(String prefix);
	@Query("SELECT u FROM User u")
	public List<User> getAllUsers();
	@Query("select u from User u WHERE u.name =:n")   // JPQl JAVA Persistence Query language
	public List<User> getUserByName(@Param("n") String name);
	@Query(value = "select * from user", nativeQuery = true) //native query
	public List<User> getUsers();
}
