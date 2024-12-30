package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ThongBaoHuyDatBanhKem implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Huỷ Đơn Đặt Hàng Thành Công!!!");
        System.out.println(" ");
    }
}

