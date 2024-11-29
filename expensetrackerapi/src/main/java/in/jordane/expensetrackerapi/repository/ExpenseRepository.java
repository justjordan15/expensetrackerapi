package in.jordane.expensetrackerapi.repository;

import in.jordane.expensetrackerapi.entity.Expense;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.sql.Date;
import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    //SELECT * FROM tbl_expenses WHERE user_id=? AND category=?
    Page<Expense> findByUserIdAndCategory(Long useId, String category, Pageable page);

    //SELECT * FROM tbl_expenses WHERE user_id=? AND name LIKE '%keyword%'
    Page<Expense> findByUserIdAndNameContaining(Long userId, String keyword, Pageable page);

    //SELECT * FROM tbl_expenses WHERE user_id=? AND date BETWEEN 'startDate' AND 'endDate'
    Page<Expense> findByUserIdAndDateBetween(Long userId, Date startDate, Date endDate, Pageable page);

    //SELECT * FROM tbl_expenses WHERE user_id=?
    Page<Expense> findByUserId(Long userID, Pageable page);

    //SELECT * FROM tbl_expenses WHERE user_id=? AND id=?
    Optional<Expense> findByUserIdAndId(Long userId, Long expenseID);









}
