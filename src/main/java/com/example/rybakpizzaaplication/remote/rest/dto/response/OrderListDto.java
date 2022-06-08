package com.example.rybakpizzaaplication.remote.rest.dto.response;

import java.util.List;

public class OrderListDto {
    private List<OrderDto> orderDtos;

    public OrderListDto() {
    }

    public OrderListDto(List<OrderDto> orderDtos) {
        this.orderDtos = orderDtos;
    }

    public List<OrderDto> getOrderDtos() {
        return orderDtos;
    }

    public void setOrderDtos(List<OrderDto> orderDtos) {
        this.orderDtos = orderDtos;
    }
}
