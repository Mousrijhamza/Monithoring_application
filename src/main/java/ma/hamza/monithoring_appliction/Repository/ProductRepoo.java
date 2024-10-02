package ma.hamza.monithoring_appliction.Repository;

import ma.hamza.monithoring_appliction.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepoo extends JpaRepository<Product, Integer> {

}
