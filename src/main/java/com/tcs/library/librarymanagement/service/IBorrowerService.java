package com.tcs.library.librarymanagement.service;

import com.tcs.library.librarymanagement.entity.Borrower;

import java.util.List;

public interface IBorrowerService {
    List<Borrower> getBorrowers();

    Borrower getBorrower(Long id);

    Borrower createBorrower(Borrower borrower);

    Borrower updateBorrower(Borrower borrower);

    void deleteBorrower(Long id);
}
