package org.osama.security.service;

import java.util.List;

import org.osama.security.dao.IUserInfoDAO;
import org.osama.security.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoService implements IUserInfoService {
	@Autowired
	private IUserInfoDAO userInfoDAO;
	@Override
	public List<Article> getAllUserArticles(){
		return userInfoDAO.getAllUserArticles();
	}
}
