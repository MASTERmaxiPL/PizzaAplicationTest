package com.example.rybakpizzaaplication.data.Entities.SizeEntity;

import com.example.rybakpizzaaplication.data.Entities.PizzaEntity.PizzaEntity;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "Sizes")
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizzaId;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public PizzaEntity getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(PizzaEntity pizzaId) {
        this.pizzaId = pizzaId;
    }
}
