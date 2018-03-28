package com.juserbruyns.orderReporto.services;

import com.juserbruyns.ordero.domain.orders.OrderReport;
import com.juserbruyns.ordero.domain.orders.OrderReportRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class OrderReportService {
    private OrderReportRepository orderReportRepository;

    @Inject
    public OrderReportService(OrderReportRepository orderReportRepository) {
        this.orderReportRepository = orderReportRepository;
    }

    public OrderReport addOrderReport(OrderReport orderReport) {
        return orderReportRepository.storeOrderReport(orderReport);
    }



}