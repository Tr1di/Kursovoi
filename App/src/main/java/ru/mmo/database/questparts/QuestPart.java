package ru.mmo.database.questparts;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuestPart {

    @Id
    @GeneratedValue
    protected long id;

    @Column
    private String description;

    // Object

    @ManyToMany
    protected List<QuestPart> nextParts;

    public QuestPart() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<QuestPart> getNextParts() {
        return nextParts;
    }

    public void setNextParts(List<QuestPart> nextParts) {
        this.nextParts = nextParts;
    }

    public void addNextPart(QuestPart part){
        nextParts.add(part);
    }
}
