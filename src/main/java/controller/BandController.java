package controller;

import dao.BandDao;
import entity.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/band")
public class BandController {

    @Autowired
    private BandDao bandDao;

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public Band getBandByName(@PathVariable("name") String name) {
        Band band = bandDao.getBandByName(name);
        if (band != null) {
            return band;
        } else {
            throw new IllegalArgumentException("Band with this name doesn't exist");
        }
    }
    @RequestMapping(value = "/isActive{isActive}", method = RequestMethod.GET)
   public List<Band> getActiveBands(){
        List<Band> band = bandDao.getActiveBands();
        return band;



   }

}