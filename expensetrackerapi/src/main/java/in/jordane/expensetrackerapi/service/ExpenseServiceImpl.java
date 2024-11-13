package in.jordane.expensetrackerapi.service;


import in.jordane.expensetrackerapi.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.jordane.expensetrackerapi.entity.Expense;


import java.util.List;


@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepo;

    @Override
    public List<Expense> getAlLExpenses(){
        return  expenseRepo.findAll();
    }

}
