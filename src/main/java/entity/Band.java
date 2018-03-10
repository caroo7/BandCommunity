package entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Band {

    @Id
    //@GeneratedValue - not generate yet - we provide data
    private long id;

    @Column(unique = true)
    private String name;

    private String type;

    private String country;

    private String city;

    @Column(name = "isactive")
    private boolean isActive;

    @ManyToMany
    @JoinTable(name="member_band", joinColumns=@JoinColumn(name="band_id"), inverseJoinColumns=@JoinColumn(name="member_id"))
    private List<Member> members;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public List<Member> getMembers() {
        return members;
    }

    public boolean isActive() { return isActive; }
}