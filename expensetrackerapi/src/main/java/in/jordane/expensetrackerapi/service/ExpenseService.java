package in.jordane.expensetrackerapi.service;

import in.jordane.expensetrackerapi.entity.Expense;
import in.jordane.expensetrackerapi.repository.ExpenseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Date;
import java.util.List;

public interface ExpenseService {

    Page<Expense> getAlLExpenses(Pageable page);

    Expense getExpenseById(Long id);

    void deleteExpenseById(Long id);

    Expense saveExpenseDetails(Expense expense);

    Expense updateExpenseDetails(Long id, Expense expense);

    List<Expense> readByCategory(String category, Pageable page);

   List<Expense> readByName(String keyword, Pageable page);

   List<Expense> readByDate(Date startDate, Date endDate, Pageable page);

}
