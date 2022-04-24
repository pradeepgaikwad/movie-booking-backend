package com.movie.repo;

import org.springframework.data.repository.CrudRepository;

import com.movie.entity.User;

public interface UserRepository extends CrudRepository<User,Long>{
	


} 