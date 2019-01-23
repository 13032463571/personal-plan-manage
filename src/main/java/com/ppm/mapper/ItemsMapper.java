package com.ppm.mapper;

import com.ppm.pojo.Items;

import java.util.List;

public interface ItemsMapper {
    public List<Items> selectAllItems();
    public void insertItems(Items items) ;
}