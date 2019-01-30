package org.osama.security.service;

import java.util.List;

import org.osama.security.entity.Article;
import org.springframework.security.access.annotation.Secured;



public interface IUserInfoService {
	 @Secured ({"ROLE_ADMIN"})
     List<Article> getAllUserArticles();
}
