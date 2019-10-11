package org.tr.swapp.purchase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepo extends JpaRepository<Purchase, Long> {

    @Query("SELECT p from purchase where buyer.login = :login")
    List<Purchase> getAllByLogin(@Param("login") String login);
}
