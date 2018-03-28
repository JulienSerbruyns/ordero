package com.juserbruyns.ordero.domain.orders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderReportRepository {
    private Map<Integer,OrderReport> orderReports;
    private static int orderReportIndex = 0;

    public OrderReportRepository() {
        this.orderReports = new HashMap<>();
    }

    public OrderReport storeOrderReport(OrderReport orderReport) {
        orderReport.setId(++orderReportIndex);
        orderReports.put(orderReport.getId(), orderReport);
        return orderReport;
    }

    public Map<Integer, OrderReport> getOrderReports() {
        return orderReports;
    }

    public OrderReport getOrderReport(int orderReportIndex){
        return orderReports.get(orderReportIndex);
    }
}
