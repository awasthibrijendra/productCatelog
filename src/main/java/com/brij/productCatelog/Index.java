package com.brij.productCatelog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @GetMapping("/index")
    public String index() {
        return "productCatelog Hello IO am up";
    }


}
