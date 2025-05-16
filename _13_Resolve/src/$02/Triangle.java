package $02;

public class Triangle {
    private int width;
    private int height;

    public Triangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculate(int width, int height){
        int area = (1/2) * width * height;
        System.out.printf("삼각형의 넓이는 : %d", area);
        return area;
    }
}
