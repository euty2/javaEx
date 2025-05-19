package $01;

public class Printer {
    private String modelName;
    private String manufacturer;
    private String usb;
    private int parallerPort;
    private int printPage;
    private int remainingPrintPaper;

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getUsb() {
        return this.usb;
    }

    public void setUSB(String usb) {
        this.usb = usb;
    }

    public int getParallerPort() {
        return this.parallerPort;
    }

    public void setParallerPort(int parallerPort) {
        this.parallerPort = parallerPort;
    }

    public int getPrintPage() {
        return this.printPage;
    }

    public void setPrintPage(int printPage) {
        this.printPage = printPage;
    }

    public int getRemainingPrintPaper() {
        return this.remainingPrintPaper;
    }

    public void setRemainingPrintPaper(int remainingPrintPaper) {
        this.remainingPrintPaper = remainingPrintPaper;
    }

    public Printer(String modelName, String manufacturer, String usb, int parallerPort, int printPage, int remainingPrintPaper){
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.usb = usb;
        this.parallerPort = parallerPort;
        this.printPage = printPage;
        this.remainingPrintPaper = remainingPrintPaper;
    }

    public void print(){
        System.out.printf("모델이름은 %s 이고 제조사는 %s 인터페이스는 %s와 %s입니다." + 
                            "인쇄매수는 %s 인쇄종이잔량은 %s입니다.", modelName, manufacturer, usb, parallerPort, printPage, remainingPrintPaper);
    }
}
