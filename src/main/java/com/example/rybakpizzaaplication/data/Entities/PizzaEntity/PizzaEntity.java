package com.example.rybakpizzaaplication.data.Entities.PizzaEntity;

import com.example.rybakpizzaaplication.data.Entities.SizeEntity.SizeEntity;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany
    @Column(name = "sizes")
    private List<SizeEntity> sizeEntities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SizeEntity> getSizeEntities() {
        return sizeEntities;
    }

    public void setSizeEntities(List<SizeEntity> sizeEntities) {
        this.sizeEntities = sizeEntities;
    }
}
