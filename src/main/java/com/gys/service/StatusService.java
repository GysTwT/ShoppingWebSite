package com.gys.service;

import com.gys.po.Product;
import com.gys.po.Status;

import java.util.List;

public interface StatusService {
    /**
     * 查询全部
     * @return
     */
    List<Status> findAll();

    /**
     * 根据id查询
     * @return
     */
    Status selectOne(int id);

    /**
     * 增加
     * @param product
     * @return
     */
    int insert(Product product);

    /**
     * 删除
     * @param id
     * @return
     */
    Product delete(int id);

    /**
     * 修改
     * @param id
     * @return
     */
    int update(int id);
}
