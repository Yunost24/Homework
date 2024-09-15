package praktika1;

public class Circle {
        private double radius = 1;

        public double getRadius() {
            return radius;
        }

        Circle (){

        }

        public Circle(double radius) {

            this.radius = radius;
        }
        double getArea (){
            return radius*radius*Math.PI;
        }
        double getPerimeter () {

            return (2*radius*Math.PI);
        }
        void setRadius(double newRadius){

            radius = newRadius;
        }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
