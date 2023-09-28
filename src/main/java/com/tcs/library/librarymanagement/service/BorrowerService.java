package com.tcs.library.librarymanagement.service;

import com.tcs.library.librarymanagement.entity.Borrower;
import com.tcs.library.librarymanagement.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BorrowerService implements IBorrowerService{

    @Autowired
    BorrowerRepository borrowerRepository;
    @Override
    public List<Borrower> getBorrowers() {
        return borrowerRepository.findAll();
    }

    @Override
    public Borrower getBorrower(Long id) {
        return borrowerRepository.findById(id).orElse(null);
    }

    @Override
    public Borrower createBorrower(Borrower borrower) {
        return borrowerRepository.save(borrower);
    }

    @Override
    public Borrower updateBorrower(Borrower borrower) {
        Optional<Borrower> optionalBorrower = borrowerRepository.findById(borrower.getId());
        if(optionalBorrower.isPresent()){
            borrower.setId(optionalBorrower.get().getId());
            borrowerRepository.save(borrower);
        }
        return borrower;
    }

    @Override
    public void deleteBorrower(Long id) {
         borrowerRepository.deleteById(id);
    }
}
