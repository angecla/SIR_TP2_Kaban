package jpa.kanban;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Tag {

    private long id;
    private List<Fiche> fiche;

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToMany
    public List<Fiche> getFiche() {
        return fiche;
    }

    public void setFiche(List<Fiche> fiche) {
        this.fiche = fiche;
    }
}
