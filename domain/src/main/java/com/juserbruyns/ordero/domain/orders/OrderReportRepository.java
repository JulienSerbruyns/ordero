package com.juserbruyns.ordero.domain.orders;

import java.util.List;

public class OrderReportRepository {
    private int id;
    private List<OrderReport> orderReports;

    public OrderReportRepository(List<OrderReport> orderReports) {
        this.orderReports = orderReports;
    }


}
