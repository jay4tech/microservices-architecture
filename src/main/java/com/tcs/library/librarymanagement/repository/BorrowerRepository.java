package com.tcs.library.librarymanagement.repository;

import com.tcs.library.librarymanagement.entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {
}
