package com.heroku.springboot.heroku.app.repo.Heroku;

import org.springframework.data.jpa.repository.JpaRepository;
import com.heroku.springboot.heroku.app.model.Heroku;

public interface repo extends JpaRepository<Heroku,Long>{
}
