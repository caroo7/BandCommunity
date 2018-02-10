package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Member {

    @Id
    //@GeneratedValue - not generate yet - we provide data by hand
    private long id;

    private String name;

    private String surname;

    private String country;
    @OneToMany
    @JoinTable(name="member_instrument", joinColumns=@JoinColumn(name="member_id"), inverseJoinColumns=@JoinColumn(name="instrument_id"))
    private List<Instrument> instruments;


    // enable this after HATEOAS will be introduced
    /*@ManyToMany
    @JoinTable(name="member_band", joinColumns=@JoinColumn(name="member_id"), inverseJoinColumns=@JoinColumn(name="band_id"))
    private List<Band> bands;*/

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCountry() {
        return country;
    }

    public List<Instrument> getInstruments() { return instruments; }

    /*public List<Band> getBands() {
        return bands;
    }*/
}
