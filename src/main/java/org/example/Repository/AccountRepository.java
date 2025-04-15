package org.example.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.example.Model.account;

public interface AccountRepository extends JpaRepository<account, UUID> {

}
