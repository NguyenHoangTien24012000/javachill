package FPT.STEP1;

import java.util.*;

public class Bai7 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        printMenu();
        boolean flag = true;
        while (flag){
            try {

                int choice = scanner.nextInt();
                switch (choice){
                    case 1 -> {
                        if(sinhViens.size() == 0){
                            System.out.println("Chua co sinh vien nao");
                            continue;
                        }
                        for (var sinhVien : sinhViens){
                            System.out.println(sinhVien);
                        }
                    }
                    case 2 -> {
                        themSinhVien(sinhViens);
                    }
                    case 8 ->{
                        Collections.sort(sinhViens, new DiemSinhVien());
                        System.out.println("Sau khi sort");
                        for (var sinhVien : sinhViens){
                            System.out.println(sinhVien);
                        }
                    }
                    case 9 ->{
                        printMenu();
                    }
                    default -> System.out.println("vui long nhap lai");
                }
            }catch (Exception e){
                System.out.println("Vui long nhap lai");
                scanner.nextLine();
            }
        }

    }
    public static void printMenu(){
        System.out.println("""
               -------Quan ly sinh vien--------
               1. Danh sach sinh vien
               2. Them sinh vien
               3. Danh sach sinh vien hoc luc yeu
               4. Danh sach sinh vien trung binh
               5. Danh sach sinh vien kha
               6. Danh sach sinh vien gioi
               7. Danh sach sinh vien xuat sac
               8. Sap xep danh sach sinh vien
               9. Menu
               10.Thoat
               Vui long nhap lua chon: 
                """);
    }
    public static void themSinhVien(ArrayList<SinhVien> sinhViens){
        System.out.println("Nhap ten sinh vien: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        boolean flag =true;
        while (flag){
            System.out.println("""
                Chon nganh hoc:
                1. Cong nghe thong tin
                2. Nganh Marketing
                """);
            int choice = scanner.nextInt();
            switch (choice){
                case 1 ->{
                    while (true){
                        System.out.println("Nhap diem Java: ");
                        double java = scanner.nextDouble();
                        System.out.println("Nhap diem Css: ");
                        double css = scanner.nextDouble();
                        System.out.println("Nhap diem Html: ");
                        double html = scanner.nextDouble();
                        if(java > 10 || java < 0 || css > 10 || css < 0 || html > 10 || html < 0){
                            System.out.println("Du lieu ko hop le vui long nhap lai");
                            continue;
                        }
                        sinhViens.add(new SinhVienIt(name, java, css, html));
                        System.out.println("Them thanh cong");
                        break;
                    }
                    flag = false;
                }
                case 2 ->{
                    while (true){
                        System.out.println("Nhap diem Marketing: ");
                        double makerting = scanner.nextDouble();
                        System.out.println("Nhap diem Sales: ");
                        double sales = scanner.nextDouble();
                        if(makerting > 10 || makerting < 0 || sales > 10 || sales < 0){
                            System.out.println("Du lieu ko hop le vui long nhap lai");
                            continue;
                        }
                        sinhViens.add(new SinhVienBiz(name, makerting, sales));
                        System.out.println("Them thanh cong");
                        break;
                    }
                    flag = false;
                }
                default -> System.out.println("Vui long nhap lai: ");
            }
        }
    }
}

class DiemSinhVien implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        return Double.valueOf(o1.getDiem()).compareTo(Double.valueOf(o2.getDiem()));
    }
}


abstract class SinhVien  {
    protected String hoTen;
    protected String nganh;

    protected double diemTrungBinh;

    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
        this.diemTrungBinh = 0;
    }
    public abstract double getDiem();
    public void getHocLuc(){
        if(getDiem() < 5){
            System.out.println("Hoc luc yeu");
        } else if (getDiem() >=5 && getDiem() < 6.5) {
            System.out.println("Hoc luc trung binh");
        } else if (getDiem() >= 6.5 && getDiem() < 7.5) {
            System.out.println("Hoc luc kha");
        } else if (getDiem() >= 7.5 && getDiem() < 9) {
            System.out.println("Hoc luc gioi");
        }else {
            System.out.println("Hoc luc xuat sac");
        }
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "hoTen='" + hoTen + '\'' +
                ", nganh='" + nganh + '\'' +
                ", diemTrungBinh=" + getDiem() +
                '}';
    }


}

class SinhVienIt extends SinhVien{
    private double diemJava;
    private double diemHtml;
    private double diemCss;
    public SinhVienIt(String hoTen, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, "Nganh CNTT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        this.diemTrungBinh = (diemJava * 2 + diemHtml + diemCss) / 4;
        return diemTrungBinh;
    }
}

class SinhVienBiz extends SinhVien{
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Nganh Marketing");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        diemTrungBinh = (diemMarketing * 2 + diemSales) / 3;
        return diemTrungBinh;
    }


}