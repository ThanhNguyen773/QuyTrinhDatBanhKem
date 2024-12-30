package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ChaoMungQuyKhach implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Chào Mừng Quý Khách Đến Với Cửa Hàng Bánh Kem DeFéau");
        System.out.println(" ");
    }
}
