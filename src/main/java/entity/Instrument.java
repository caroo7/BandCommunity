package entity;

import javax.persistence.*;

@Entity
public class Instrument {
    @Id
    //@GeneratedValue
    private long id;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    private String kind;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
