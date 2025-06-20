package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 订单物流：(OrderLogistics)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "OrderLogistics")
public class OrderLogistics implements Serializable {

    // OrderLogistics编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_logistics_id")
    private Integer order_logistics_id;

    // 订单号
    @Basic
    private String order_number;
    // 卖家
    @Basic
    private Integer seller;
    // 用户
    @Basic
    private Integer user;
    // 商品名称
    @Basic
    private String trade_name;
    // 收货地址
    @Basic
    private String ship_to_address;
    // 联系电话
    @Basic
    private String contact_number;
    // 收货人姓名
    @Basic
    private String consignee_name;
    // 订单物流
    @Basic
    private String order_logistics;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
