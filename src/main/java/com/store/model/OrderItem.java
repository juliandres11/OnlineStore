package com.store.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.UUID;

public class OrderItem {

    @Id
    private UUID id;
    private int quantity;

    private ArrayList<Item> items;
}
