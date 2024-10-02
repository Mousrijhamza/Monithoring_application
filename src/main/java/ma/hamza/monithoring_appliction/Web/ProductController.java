package ma.hamza.monithoring_appliction.Web;

import ma.hamza.monithoring_appliction.Repository.ProductRepoo;
import ma.hamza.monithoring_appliction.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductRepoo productRepoo;

    public ProductController(ProductRepoo productRepoo) {
        this.productRepoo = productRepoo;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productRepoo.findAll();
    }

}
