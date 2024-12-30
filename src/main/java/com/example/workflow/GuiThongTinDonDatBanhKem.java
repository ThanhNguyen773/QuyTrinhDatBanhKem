package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class GuiThongTinDonDatBanhKem implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Bánh kem của bạn đang được chuẩn bị !!");
        System.out.println(" ");
    }
}
