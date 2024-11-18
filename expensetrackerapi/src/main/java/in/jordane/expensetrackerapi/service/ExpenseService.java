package in.jordane.expensetrackerapi.service;

import in.jordane.expensetrackerapi.entity.Expense;
import in.jordane.expensetrackerapi.repository.ExpenseRepository;

import java.util.List;

public interface ExpenseService {

    List<Expense> getAlLExpenses();

    Expense getExpenseById(Long id);

    void deleteExpenseById(Long id);

    Expense saveExpenseDetails(Expense expense);

    Expense updateExpenseDetails(Long id, Expense expense);
}
