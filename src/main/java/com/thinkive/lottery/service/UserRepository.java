package com.thinkive.lottery.service;

import com.thinkive.lottery.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by thinkive on 2017/10/8.
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
