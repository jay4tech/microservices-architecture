package com.tcs.library.librarymanagement.controller;

import com.tcs.library.librarymanagement.entity.Borrower;
import com.tcs.library.librarymanagement.service.IBorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/api/borrowers")
public class BorrowerController {

    @Autowired
    IBorrowerService borrowerService;
    @GetMapping
    public List<Borrower> getBorrowers(){
        return borrowerService.getBorrowers();
    }
    @GetMapping("/{id}")
    public Borrower getBorrower(@PathVariable Long id){
        return borrowerService.getBorrower(id);
    }
    @PostMapping
    public Borrower createBorrower(@RequestBody Borrower borrower){
        return borrowerService.createBorrower(borrower);
    }

    @PutMapping
    public Borrower updateBorrower(@RequestBody Borrower borrower){
        return borrowerService.updateBorrower(borrower);
    }
    @DeleteMapping("/{id}")
    public void deleteBorrower(@PathVariable Long id){
         borrowerService.deleteBorrower(id);
    }
}
