package com.example.main;

import java.text.ParseException;

import com.example.model.Report;
import com.example.service.ReportService;

public class ReportMain {
public static void main(String[] args) {
	ReportService reportService = new ReportService();
	Report report = new Report();
	try {
		report = reportService.setReportParameters("FO_CREATED,2021-07-05 14:44:46@FO_SUBMITTED,2021-07-05 14:49:32@SO_UPDATED,2021-07-05 15:11:45@SO_RECOMMENDED,2021-07-05 15:14:58@PEND_RECEIVED,2021-07-05 15:20:31@CA_RECEIVED,2021-07-05 15:21:39@CA_RECOMMENDED,2021-07-05 15:24:51@UH_APPROVED,2021-07-05 15:30:35@UH_APPROVED,2021-07-05 15:30:35@SENT_TO_CAD,2021-07-05 15:34:28@SL_GENERATED,2021-07-05 15:36:38@SL_GENERATED,2021-07-05 15:36:38@CAD_DISBURSED,2021-07-05 15:41:47@CAD_DISBURSED,2021-07-06 12:56:43@CAD_DISBURSED,2021-07-06 12:56:43");
		System.out.println(report.toString());
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
