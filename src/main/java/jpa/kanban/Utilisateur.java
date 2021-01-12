package jpa.kanban;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Utilisateur {

    private long id;
    private String nom;
    private List<Fiche> fiche;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @OneToMany(mappedBy = "utilisateur")
    public List<Fiche> getFiche() {
        return fiche;
    }

    public void setFiche(List<Fiche> fiche) {
        this.fiche = fiche;
    }
}
