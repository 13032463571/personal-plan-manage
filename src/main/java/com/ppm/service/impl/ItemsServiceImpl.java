package com.ppm.service.impl;

import com.ppm.mapper.ItemsMapper;
import com.ppm.pojo.Items;
import com.ppm.service.interfaces.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements IItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> selectAllItems() {
        return itemsMapper.selectAllItems();
    }
}
