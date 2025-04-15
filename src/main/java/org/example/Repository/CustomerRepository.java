package org.example.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.example.Model.customer;

public interface CustomerRepository extends JpaRepository<customer, UUID> {

}
