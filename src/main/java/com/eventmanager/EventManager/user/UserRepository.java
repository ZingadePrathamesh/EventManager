package com.eventmanager.EventManager.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo, Integer> {

	public UserInfo findByFirstname(String firstname);

}
