package $01;

public class InkjetPrinter extends Printer {
    private int inkLevel;

	public int getInkLevel() {
             
		return this.inkLevel;
	}

	public void setInkLevel(int inkLevel) {
		this.inkLevel = inkLevel;
	}


    public InkjetPrinter(String modelName, String manufacturer, String usb, int parallerPort, int printPage, int remainingPrintPaper, int inkLevel){
        super(modelName, manufacturer, usb, parallerPort, printPage, remainingPrintPaper);
        this.inkLevel = inkLevel;
    }

    public void inkjetPrint(){
        System.out.printf("잉크잔량은 %s입니다.", inkLevel);
    }
}
