package $01;

public class PrinterMain {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("HPP2025", "HP", "USB", 250, 300, 5000, 80);
        inkjet.print();
        inkjet.inkjetPrint();
        
        System.out.println();

        LaserPrinter laser = new LaserPrinter("Laser25", "HP", "USB", 270, 370, 3000, 90);
        laser.print();
        laser.laserPrint();
    }
}

// 편의상 print()메서드를 한 번 호출할 때마다 인쇄용지 1매를 사용하는 것으로 한다 구현 필요
// FIX
