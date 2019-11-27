package com.gys.service;

import com.gys.dao.ProductDao;
import com.gys.po.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Resource
    private  ProductDao pd;

    public List<Product> selectAll() {
        return pd.selectAll();
    }

    public Product selectOne(int id) {
        return pd.selectOne(id);
    }

    public int insert(Product product) {
        return pd.insert(product);
    }

    public int delete(int id) {
        return pd.delete(id);
    }

    public int update(Product product) {
        return pd.update(product);
    }
}
