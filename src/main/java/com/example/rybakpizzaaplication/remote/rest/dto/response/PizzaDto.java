package com.example.rybakpizzaaplication.remote.rest.dto.response;

import java.util.List;

public class PizzaDto {
    private Integer id;
    private String name;
    private List<SizeDto> sizes;

    public PizzaDto() {
    }

    public PizzaDto(Integer id, String name, List<SizeDto> sizes) {
        this.id = id;
        this.name = name;
        this.sizes = sizes;
    }

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

    public List<SizeDto> getSize() {
        return sizes;
    }

    public void setSize(List<SizeDto> sizes) {
        this.sizes = sizes;
    }
}
