package com.ppm.service.impl;

import com.ppm.mapper.ItemsMapper;
import com.ppm.pojo.Items;
import com.ppm.service.interfaces.IItemsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements IItemsService {
    private static final Logger logger = LoggerFactory.getLogger(ItemsServiceImpl.class);

    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> selectAllItems() {
        return itemsMapper.selectAllItems();
    }

    public void insertItems(List<Items> itemsList) throws RuntimeException{
        try {
            itemsMapper.insertItems(itemsList.get(0));
            itemsMapper.insertItems(itemsList.get(1));
        } catch (Exception e) {
            if (logger.isErrorEnabled()) {
                logger.error(e.getMessage(), e);
            }
            throw new RuntimeException();
        }
    }
}
