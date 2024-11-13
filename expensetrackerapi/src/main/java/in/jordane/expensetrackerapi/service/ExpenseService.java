package in.jordane.expensetrackerapi.service;

import in.jordane.expensetrackerapi.entity.Expense;
import in.jordane.expensetrackerapi.repository.ExpenseRepository;

import java.util.List;

public interface ExpenseService {

    List<Expense> getAlLExpenses();
}
