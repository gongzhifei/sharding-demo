package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.model.Item;
import com.example.demo.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ItemController {

    @Autowired
    private IItemService itemService;

    @GetMapping("/list")
    public List<Item> list() {
        return itemService.list(new LambdaQueryWrapper<Item>()
                        .apply(" id=1 and channel in ('MRP','NAP') and model_id in('12','21','123')"));
    }

    @GetMapping("/add")
    public void add() {
        Item item = new Item();
        item.setChannel("MRP");
        item.setGtin("003004");
        item.setModelId("1001");
        item.setVariantId("10001");
        itemService.save(item);
    }

}
