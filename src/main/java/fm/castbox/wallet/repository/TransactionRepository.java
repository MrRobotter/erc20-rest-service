package fm.castbox.wallet.repository;

import fm.castbox.wallet.domain.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, String> {
    @Query("SELECT t FROM Transaction t WHERE t.fromAddress = ?1 or t.toAddress = ?1")
    List<Transaction> findByAddress(String address);
}