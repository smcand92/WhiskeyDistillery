package com.codeclan.example.WhiskyDistillery.distilleryRepositories;

import com.codeclan.example.WhiskyDistillery.models.Distillery;
import com.codeclan.example.WhiskyDistillery.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    public List<Whisky> findAllWhiskysByDistillery(Distillery distillery){
        List<Whisky>results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Whisky.class);
            cr.add(Restrictions.eq("distillery", distillery));
            results = cr.list();
        } catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }
}
