package org.customer.repo;

import java.util.List;
import org.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface CustomerRepository extends JpaRepository<Customer, Long> {

  @Query(
      "SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Customer c WHERE c.email_id ="
          + " :email_id")
  boolean existsByEmail_id(@Param("email_id") String email_id);

  // List<Customer> findByEmail_Id(@Param("email_id") String email_id);

  List<Customer> findByMobile(String mobile);
}
