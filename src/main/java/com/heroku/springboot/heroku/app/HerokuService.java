package com.heroku.springboot.heroku.app;

import com.heroku.springboot.heroku.app.model.Heroku;
import java.util.List;

public interface HerokuService {
    Heroku addTricomms(Heroku entity);
    List<Heroku> getAll();
    Heroku updateTricomms(Heroku entity);
    void deleteAnyUser(Long id);
}
