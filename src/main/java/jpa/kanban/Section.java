package jpa.kanban;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Section {

    private long id;
    private String name;
    private Tableau tab;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    public Tableau getTab() {
        return tab;
    }

    public void setTab(Tableau tab) {
        this.tab = tab;
    }
}
