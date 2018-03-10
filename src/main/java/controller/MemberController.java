package controller;


import dao.MemberDao;
import entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberDao memberDao;

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public List <Member> getMemberByName (@PathVariable("name") String name){
        List<Member> member = memberDao.getMemberByName(name);
        if(member != null){
            return member;
        }
        else {
            throw new IllegalArgumentException("Member with this name doesn't exist");
        }
    }
    @RequestMapping(value = "/surname/{surname}", method = RequestMethod.GET)
    public List<Member> getMemberBySurname (@PathVariable("surname") String surname){
        List<Member> member = memberDao.getMemberBySurname(surname);
        if(member != null){
            return member;
        }
        else {
            throw new IllegalArgumentException("Member with this surname doesn't exist");
        }
    }
}
