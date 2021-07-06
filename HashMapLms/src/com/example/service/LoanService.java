package com.example.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.example.model.LoanGridView;

public class LoanService {

	public List<LoanGridView> removeDuplicateState(List<LoanGridView>loanGrid) {
		HashMap<String,HashMap<String,Date>> map = removeDuplicate(loanGrid);
		List<LoanGridView>finalList= new ArrayList<LoanGridView>();
		for(String trackingId : map.keySet()) {
			HashMap<String, Date> stateNameMap = map.get(trackingId);
			for(String state : stateNameMap.keySet()) {
				for(LoanGridView grid: loanGrid) {
					Date modDate = stateNameMap.get(state);
					if(grid.getLoanTrackingId().equalsIgnoreCase(trackingId)&&
							grid.getStateName().equalsIgnoreCase(state)&&
							grid.getDttMod().equals(modDate)) {
						LoanGridView loanGridViewTemp = new LoanGridView();
						
						loanGridViewTemp.setLoanTrackingId(trackingId);
						loanGridViewTemp.setStateName(state);
						loanGridViewTemp.setDttMod(modDate);
						loanGridViewTemp.setPhone(grid.getPhone());
						loanGridViewTemp.setName(grid.getName());	
						finalList.add(grid);
						}
				}
			}
		}
		return finalList;
		
	}

	private HashMap removeDuplicate(List<LoanGridView> loanGrid) {
		HashMap<String,HashMap<String,Date>> map = new HashMap<String,HashMap<String,Date>>();
			
		for(LoanGridView loan:loanGrid) {
			String trackingId = loan.getLoanTrackingId();
			String stateName = loan.getStateName();
			Date date = loan.getDttMod();
			if(map.containsKey(trackingId)) {
				HashMap<String,Date> checkStateDate = map.get(trackingId);
				if(checkStateDate.containsKey(stateName)) {
					
					Date oldDate = checkStateDate.get(stateName);
					Date largeDate = getLargeDate(oldDate,loan.getDttMod());
					checkStateDate.put(stateName, largeDate);
					
				}else{			
					checkStateDate.put(stateName, date);
				}
				
			}else {
				HashMap<String,Date> stateDate = new HashMap<String,Date>();
				stateDate.put(stateName, date);				
				map.put(trackingId, stateDate);
			}			
		}
		return map;
	}

	private Date getLargeDate(Date oldDate, Date dttMod) {
		int result = dttMod.compareTo(oldDate);
		if(result>0) {
			return dttMod;
		}
		return oldDate;
	}
}
