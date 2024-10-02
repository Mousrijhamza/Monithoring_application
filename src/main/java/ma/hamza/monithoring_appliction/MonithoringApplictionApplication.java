package ma.hamza.monithoring_appliction;

import ma.hamza.monithoring_appliction.Repository.ProductRepoo;
import ma.hamza.monithoring_appliction.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonithoringApplictionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonithoringApplictionApplication.class, args);
    }

    CommandLineRunner commandLineRunner(ProductRepoo productRepoo) {
        return args -> {
            productRepoo.save(Product.builder().name("Computer").price(23000D).build());
            productRepoo.save(Product.builder().name("keyboard").price(10D).build());
            productRepoo.save(Product.builder().name("Mouse").price(10D).build());
            productRepoo.save(Product.builder().name("Display").price(200D).build());
            productRepoo.findAll().forEach(System.out::println);


        };
    };

}
