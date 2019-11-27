package com.gys.service;

import com.gys.dao.StatusDao;
import com.gys.po.Product;
import com.gys.po.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StatusServiceImpl implements StatusService{

    @Resource
   private StatusDao sd;

    public List<Status> findAll() {
        return sd.findAll();
    }

    public Status selectOne(int id) {
        return sd.selectOne(id);
    }

    public int insert(Product product) {
        return sd.insert(product);
    }

    public Product delete(int id) {
        return sd.delete(id);
    }

    public int update(int id) {
        return sd.update(id);
    }
}
