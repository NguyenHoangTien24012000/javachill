package com.main;

import com.hinhhoc.HinhVuong;

public class main {
    public static void main(String[] args) {
        double dienTich = HinhVuong.dienTich(10.5);
//        System.out.println(dienTich);
        int i = 0;
        System.out.println(i++);
        System.out.println(++i);

        TestTruyCap newTest = new TestTruyCap();
        newTest.ten = "A";
        newTest.tuoi = 1;
        newTest.diaChi = "Dia chi abc";
        newTest.danToc = "Kinh";
        newTest.anUong();
        newTest.troChuyen();
        newTest.diLai();
    }
}
