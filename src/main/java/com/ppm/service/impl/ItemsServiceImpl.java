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

    public void insertItems(List<Items> itemsList) {

        itemsMapper.insertItems(itemsList.get(0));
        int i = 2/0;
        itemsMapper.insertItems(itemsList.get(1));
    }
}
