package jslogin.springboot.js.regitrationform.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import jslogin.springboot.js.regitrationform.model.products;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class productcontrol {


    @Autowired
    jslogin.springboot.js.regitrationform.repo.productrepo productrepo;

    @PostMapping()
    public products saved(@RequestBody products products){

        return productrepo.save(products) ;
    }
    
}
