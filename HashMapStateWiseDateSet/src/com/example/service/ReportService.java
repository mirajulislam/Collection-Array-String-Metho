package com.example.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.example.model.Report;

public class ReportService {

	public Report setReportParameters(String str) throws ParseException {
		String[] arrOfStr = str.split("@", 100);
		Map<String,Date> map = new HashMap<String,Date>();
		Report r = new Report();
		String[] tempStrOfArr;
		String key1 = "";
		Date curDate = null;
		for(String strRep:arrOfStr) {
			tempStrOfArr = strRep.split(",");
			key1=tempStrOfArr[0].trim();
			curDate = convertStringToDate(tempStrOfArr[1].trim());
			if(map.containsKey(key1)) {
				map.put(key1, getLargerDate(map.get(key1), curDate));
				for (String s : map.keySet()) {
					if (s.equals("SENT_TO_CAD")||s.equals("SL_GENERATED")) {
						r.setSelGenerateDate(map.get(s));
					}
					else if (s.equals("CA_RECEIVED") || s.equals("MIS_RECEIVED")) {
						r.setReceivedDate(map.get(s));
					}												
					else if (s.equals("SO_RECOMMENDED")) {
						r.setRecommendedDate(map.get(s));
					}
					else if (s.equals("RM_APPROVED") || s.equals("RM_C_APPROVED") || s.equals("RM_C_APPROVED") || s.equals("UH_C_APPROVED")
					        || s.equals("HOCRM_APPROVED") || s.equals("HOCRM_C_APPROVED") || s.equals("CEO_APPROVED") || s.equals("UH_APPROVED")
					        || s.equals("CEO_C_APPROVED") || s.equals("MD_APPROVED") || s.equals("MD_C_APPROVED") || s.equals("APPROVED")) {
						r.setApprovedDate(map.get(s));
					}else if(s.equals("CAD_DISBURSED")) {
						r.setDisbursedDate(map.get(s));
					}else if(s.equals("FO_CREATED")) {
						r.setCreationDate(map.get(key1));
					}
				}
			}else {
				map.put(key1, curDate);
				for(String s : map.keySet()) {
					if (s.equals("SENT_TO_CAD")||s.equals("SL_GENERATED")) {
						r.setSelGenerateDate(map.get(s));
					}
					else if (s.equals("CA_RECEIVED") || s.equals("MIS_RECEIVED")) {
						r.setReceivedDate(map.get(s));
					}												
					else if (s.equals("SO_RECOMMENDED")) {
						r.setRecommendedDate(map.get(s));
					}
					else if (s.equals("RM_APPROVED") || s.equals("RM_C_APPROVED") || s.equals("RM_C_APPROVED") || s.equals("UH_C_APPROVED")
					        || s.equals("HOCRM_APPROVED") || s.equals("HOCRM_C_APPROVED") || s.equals("CEO_APPROVED") || s.equals("UH_APPROVED")
					        || s.equals("CEO_C_APPROVED") || s.equals("MD_APPROVED") || s.equals("MD_C_APPROVED") || s.equals("APPROVED")) {
						r.setApprovedDate(map.get(s));
					}else if(s.equals("CAD_DISBURSED")) {
						r.setDisbursedDate(map.get(s));
					}else if(s.equals("FO_CREATED")) {
						r.setCreationDate(map.get(s));
					}
				}				
			
			}
		}
		return r;
	}
	public static Date convertStringToDate(String dateStr) throws ParseException {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		DateFormat formatter = new SimpleDateFormat(pattern);

		if (dateStr == null) {
			return null;
		}
		else {
			Date ret = formatter.parse(dateStr);
			return ret;
		}
	}
	private static Date getLargerDate(Date oldDate, Date newDate) {
		int result = newDate.compareTo(oldDate);

		if (result > 0) {
			return newDate;
		}
		return oldDate;
	}
}
