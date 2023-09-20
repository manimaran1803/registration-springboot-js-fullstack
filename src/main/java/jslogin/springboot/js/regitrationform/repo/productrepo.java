package jslogin.springboot.js.regitrationform.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import jslogin.springboot.js.regitrationform.model.products;

public interface productrepo extends JpaRepository<products,Long>{
    
}
