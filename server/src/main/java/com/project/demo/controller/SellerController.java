package com.project.demo.controller;

import com.project.demo.entity.Seller;
import com.project.demo.service.SellerService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 卖家：(Seller)表控制层
 *
 */
@RestController
@RequestMapping("/seller")
public class SellerController extends BaseController<Seller, SellerService> {

    /**
     * 卖家对象
     */
    @Autowired
    public SellerController(SellerService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapstore_name = new HashMap<>();
        mapstore_name.put("store_name",String.valueOf(paramMap.get("store_name")));
        List liststore_name = service.select(mapstore_name, new HashMap<>()).getResultList();
        if (liststore_name.size()>0){
            return error(30000, "字段店铺名称内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
