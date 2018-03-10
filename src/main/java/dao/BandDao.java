package dao;

import entity.Band;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BandDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Band getBandByName(String name) {
        Session currentSession = sessionFactory.getCurrentSession();
        Criteria criteria = currentSession.createCriteria(Band.class);
        criteria.add(Restrictions.eq("name", name));
        List<Band> bands = criteria.list();
        return bands.get(0);
    }

    public List<Band> getActiveBands () {
        Session currentSession = sessionFactory.getCurrentSession();
        Criteria criteria = currentSession.createCriteria(Band.class);
        criteria.add(Restrictions.eq("isActive", true));
        List<Band> bands = criteria.list();
        return bands;

    }

}