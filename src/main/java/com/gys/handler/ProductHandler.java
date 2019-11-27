package com.gys.handler;

import com.gys.po.Product;
import com.gys.service.ProductService;
import com.gys.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
@RequestMapping("/product")
@Controller
public class ProductHandler {
    @Autowired
    private ProductService ps;
    @Autowired
    private StatusService ss;

    @RequestMapping("selectAll")
    public String select(Model model){
       model.addAttribute("productList",ps.selectAll());
        return "index";
    }
    @RequestMapping("selectOne")
    public String selectOne(int id,Model model){
        model.addAttribute("pro",ps.selectOne(id));
        model.addAttribute("statusList",ss.findAll());
        return "update";
    }
    @RequestMapping("update")
    public String update (Product product){
        ps.update(product);
        return "redirect/product/findAll";
    }

}
