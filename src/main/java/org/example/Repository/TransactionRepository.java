package org.example.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.example.Model.transaction;

public interface TransactionRepository extends JpaRepository<transaction, UUID> {

}
