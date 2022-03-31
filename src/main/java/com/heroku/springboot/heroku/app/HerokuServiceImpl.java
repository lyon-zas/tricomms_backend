package com.heroku.springboot.heroku.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroku.springboot.heroku.app.model.Heroku;
import com.heroku.springboot.heroku.app.repo.Heroku.repo;

import java.util.List;

@Service
public class HerokuServiceImpl implements HerokuService{

    @Autowired
    private repo repo;

    @Override
    public Heroku addTricomms(Heroku entity){
        return repo.save(entity);
    }

    @Override
    public List<Heroku> getAll(){
        return repo.findAll();
    }

    @Override
    public Heroku updateTricomms(Heroku entity){
        return repo.save(entity);
    }

    @Override
    public void deleteAnyUser(Long id){
        repo.deleteById(id);
    }


}
