package com.pblgllgs.loans.repository;
/*
 *
 * @author pblgl
 * Created on 09-01-2024
 *
 */

import com.pblgllgs.loans.entity.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Long> {

    Optional<Loans> findByMobileNumber(String mobileNumber);

    Optional<Loans> findByLoanNumber(String loanNumber);

}