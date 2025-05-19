package $01;

public class LaserPrinter extends Printer {
    private int tonerRemaining;

	public int getTonerRemaining() {
		return this.tonerRemaining;
	}

	public void setTonerRemaining(int tonerRemaining) {
		this.tonerRemaining = tonerRemaining;
	} 


    public LaserPrinter(String modelName, String manufacturer, String usb, int parallerPort, int printPage,
            int remainingPrintPaper, int tonerRemaining) {
        super(modelName, manufacturer, usb, parallerPort, printPage, remainingPrintPaper);
        this.tonerRemaining = tonerRemaining;
    }

    public void laserPrint(){
        System.out.printf("토너잔량은 %s입니다.", tonerRemaining);
    }
}
