package com.hohuunhan.SpringCRUD.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hohuunhan.SpringCRUD.entity.User;
import com.hohuunhan.SpringCRUD.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public Boolean createUser(User user) throws Exception {
		Boolean rs = false;
		if (user != null && !user.getUserName().equals("")) {
			user.setUserName(user.getUserName().replaceAll(" ", ""));
			if (!userRepo.existsById(user.getUserName())) {
				// xu ly mat khau
				user.setPassword(user.getPassword().replaceAll(" ", ""));
				if (user.getPassword().length() < 8) {
					System.err.println("Khong the tao tai khoan vi: Mat khau it hon 8 ky tu!");
					return rs;
				}
				// xu ly email
				if (user.getEmail() != null && !userRepo.existsByEmail(user.getEmail())) {
					user.setEmail(user.getEmail().replaceAll(" ", ""));
				} else {
					System.err.println("Khong the tao tai khoan vi: Email bi trung hoac khong tim thay dinh dang email!");
					return rs;
				}
				//
				user.setStatusActive(false);
				user.setCreateDate(new Date());
				try {
					rs = userRepo.save(user) != null;
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			} else {
				System.err.println("Khong the tao tai khoan vi: Tai khoan da ton tai!");
				return rs;
			}
		}
		return rs;
	}
}
