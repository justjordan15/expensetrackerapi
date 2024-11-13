package in.jordane.expensetrackerapi.controller;

import in.jordane.expensetrackerapi.entity.Expense;
import in.jordane.expensetrackerapi.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses(){
       return expenseService.getAlLExpenses();
    }
}
