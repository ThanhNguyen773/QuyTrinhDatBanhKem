package com.example.workflow;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ThongBaoDatBanhKemThanhCong implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("===== Chúc mừng quý khách đặt hàng thành công =====");
        System.out.println("============== HOÁ ĐƠN CỦA QUÝ KHÁCH ==============");
        int soluong = (int) delegateExecution.getVariable("soluong");
        long price = (long) delegateExecution.getVariable("price");
        System.out.println("Loại bánh       |     Số lượng    |      Đơn giá");
        System.out.print(delegateExecution.getVariable("loaibanh") + "      ");
        System.out.print("             " + soluong + "       ");
        System.out.println("        " + price + "          ");
        System.out.println("Hình thức nhận hàng: " + delegateExecution.getVariable("hinhthucnhanhang"));
        System.out.println("===================================================");
        long total = soluong * price;
        System.out.println("Tổng thanh toán: " + total + "VND");
        System.out.println("========== Cảm ơn quý khách đã ủng hộ ♥ ===========");
        System.out.println(" ");
    }
}
