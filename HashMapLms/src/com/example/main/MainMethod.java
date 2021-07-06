package com.example.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.model.LoanGridView;
import com.example.service.LoanService;

public class MainMethod {

	public static void main(String[] args) throws ParseException {
		LoanService loanService = new LoanService();
		List<LoanGridView> loan = new ArrayList<LoanGridView>();
		 loan.add(new LoanGridView("152369","FO_CREATED",new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("31/12/1998 13:44:25"),"Miraj","01789632541"));
		 loan.add(new LoanGridView("152368","FO_CREATED",new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("31/12/1998 14:44:25"),"Raj","01699632591"));
		 loan.add(new LoanGridView("152369","FO_UPDATED",new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("31/12/1998 13:44:25"),"Miraj","01789632541"));
		 loan.add(new LoanGridView("152368","FO_UPDATED",new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("31/12/1998 14:44:25"),"Raj","01699632591"));
		 loan.add(new LoanGridView("152368","FO_UPDATED",new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("31/12/1998 14:40:25"),"Raj","01699632591"));
		 loan.add(new LoanGridView("152369","FO_UPDATED",new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("31/12/1998 13:48:25"),"Miraj","01789632541"));
		 loan.add(new LoanGridView("152363","FO_UPDATED",new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("30/12/1998 13:48:25"),"Aminul","01999632588"));
		 loan.add(new LoanGridView("152363","FO_CREATED",new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("28/12/1998 13:48:25"),"Aminul","01999632588"));
		 loan.add(new LoanGridView("152363","FO_UPDATED",new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("31/12/1998 13:48:25"),"Aminul","01999632588"));		 						 
		
		 List<LoanGridView> loan1 = loanService.removeDuplicateState(loan);
		 loan1.stream().forEach(System.out::println);
		
	}

}
