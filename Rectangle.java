package praktika1;

public class Rectangle {
        private  double width = -1;
        private double height = -1;

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {

            this.width = width;
        }

        public double getHeight() {

            return height;
        }

        public void setHeight(double height) {

            this.height = height;
        }

        Rectangle(){
        }
        Rectangle (double newWidht, double newHeight){
            width = newWidht;
            height = newHeight;
        }
        double getArea()// площадь прямоугольника
        {
            return  width * height;
        }
        double getPerimeter () // периметр прямоугольника
        {
            return (width + height) * 2;
        }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
