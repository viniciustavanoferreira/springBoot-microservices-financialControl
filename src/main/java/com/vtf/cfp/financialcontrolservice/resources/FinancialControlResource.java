package com.vtf.cfp.financialcontrolservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtf.cfp.financialcontrolservice.modules.Expense;

@RestController
@RequestMapping("/resources")
public class FinancialControlResource {

	List<Expense> expenses = Arrays.asList(
			new Expense("1", "Gym"),
			new Expense("2", "Doctor")
	);
	
	@RequestMapping("/expenses")
	public List<Expense> getExpenses(){
	
		return expenses;
		
	}
	
	@RequestMapping("/expenses/{id}")
	public Expense getExpenseById(@PathVariable("id") String id){
		
		Expense ex = expenses.stream()
						.filter(expense -> id.equals(expense.getId()))
						.findAny()
						.orElse(null);
		return ex;
		
	}
	
}
