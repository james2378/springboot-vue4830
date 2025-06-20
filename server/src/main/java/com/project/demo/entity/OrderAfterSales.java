package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 订单售后：(OrderAfterSales)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "OrderAfterSales")
public class OrderAfterSales implements Serializable {

    // OrderAfterSales编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_after_sales_id")
    private Integer order_after_sales_id;

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
    // 售后类型
    @Basic
    private String after_sales_type;
    // 售后内容
    @Basic
    private String after_sales_content;
    // 相关凭证
    @Basic
    private String related_vouchers;



    // 审核状态
    @Basic
    private String examine_state;








    // 审核回复
    @Basic
    private String examine_reply;



    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
