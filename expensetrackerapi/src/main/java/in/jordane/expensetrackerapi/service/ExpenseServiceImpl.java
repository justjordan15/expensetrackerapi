package in.jordane.expensetrackerapi.service;


import in.jordane.expensetrackerapi.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.jordane.expensetrackerapi.entity.Expense;


import java.util.List;
import java.util.Optional;


@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepo;

    @Override
    public List<Expense> getAlLExpenses(){
        return  expenseRepo.findAll();
    }

    @Override
    public Expense getExpenseById(Long id) {
        Optional<Expense> expense = expenseRepo.findById(id);
        if(expense.isPresent()){
            return expense.get();
        }
        throw new RuntimeException("Expense is not found for the id " + id);
    }

    @Override
    public void deleteExpenseById(Long id) {
        expenseRepo.deleteById(id);
    }

    @Override
    public Expense saveExpenseDetails(Expense expense) {
        return expenseRepo.save(expense);
    }

    @Override
    public Expense updateExpenseDetails(Long id, Expense expense) {
       Expense existingExpense = getExpenseById(id);
       existingExpense.setName(expense.getName() != null ? expense.getName() : existingExpense.getName());
       existingExpense.setDescription(expense.getDescription() != null ? expense.getDescription() : existingExpense.getDescription());
       existingExpense.setCategory(expense.getCategory() != null ? expense.getCategory() : existingExpense.getCategory());
       existingExpense.setDate(expense.getDate() != null ? expense.getDate() : existingExpense.getDate());
       existingExpense.setAmount(expense.getAmount() != null ? expense.getAmount() : existingExpense.getAmount());
       return expenseRepo.save(existingExpense);
    }


}
