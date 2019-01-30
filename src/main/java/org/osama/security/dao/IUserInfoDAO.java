package org.osama.security.dao;
import org.osama.security.entity.Article;
import org.osama.security.entity.UserInfo;

import java.util.List;


public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
	List<Article> getAllUserArticles();
}