package com.delivery.service;

import com.delivery.entity.View;
import com.delivery.repository.ViewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewService {
    private final ViewRepository viewRepository;

    public ViewService(ViewRepository viewRepository) {
        this.viewRepository = viewRepository;
    }

    public List<View> showAllProducts(){
       return viewRepository.getProductWithCategory();
    }
}
