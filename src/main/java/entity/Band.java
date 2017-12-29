package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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

    @ManyToMany(mappedBy = "bands")
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
}