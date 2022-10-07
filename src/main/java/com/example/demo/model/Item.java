package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("item")
public class Item {

    @TableId
    private Long id;

    @TableField("channel")
    private String channel;

    @TableField("model_id")
    private String modelId;

    @TableField("variant_id")
    private String variantId;

    @TableField("gtin")
    private String gtin;

    @TableField("name")
    private String name;


}
