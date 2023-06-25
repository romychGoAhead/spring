package com.example.spring.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class BasketService {
    private final List<Long> ids = new ArrayList<>();

    public void add(List<Long> ids) {
        this.ids.addAll(ids);     // добавляем в корзину
    }

    public List<Long> getAll() {
        return Collections.unmodifiableList(ids);                      // возвращает обернутый список чтобы его нельзя было изменить извне
    }

}
