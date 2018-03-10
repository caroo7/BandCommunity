package dao;

import entity.Member;
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
public class MemberDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Member> getMemberByName(String name) {
        Session currentSession = sessionFactory.getCurrentSession();
        Criteria criteria = currentSession.createCriteria(Member.class);
        criteria.add(Restrictions.eq("name", name));
        List<Member> members = criteria.list();
        return members;
    }

    public List <Member> getMemberBySurname(String surname) {
        Session currentSession = sessionFactory.getCurrentSession();
        Criteria criteria = currentSession.createCriteria(Member.class);
        criteria.add(Restrictions.eq("surname", surname));
        List<Member> members = criteria.list();
        return members;
    }
}
