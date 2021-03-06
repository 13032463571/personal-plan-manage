package com.ppm.service.interfaces;

import com.ppm.pojo.Items;

import java.util.List;

public interface IItemsService {
    public List<Items> selectAllItems();
    public void insertItems(List<Items> itemsList) throws Exception;
}
