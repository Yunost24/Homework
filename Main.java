package praktika1;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------");

        System.out.println("\t\t Практика №1\n" +
                "------------------------------------"+
                "\nЗадание №0.Работа в аудитории:" +
                "\n------------------------------------");

        Circle cDef = new Circle();
        System.out.println("По умолчанию: " + cDef);
        Circle cl0 = new Circle(1);
        System.out.println("Площадь круга с радиусом: " + cl0.getRadius() + " равен " + cl0.getArea());

        Circle cl1 = new Circle(25);
        System.out.println("Площадь круга с радиусом: " + cl1.getRadius() + " равен " + cl1.getArea());

        Circle cl2 = new Circle(125);
        System.out.println("Площадь круга с радиусом: " + cl2.getRadius() + " равен " + cl2.getArea());

        System.out.println("------------------------------------");

        System.out.println("Задание №1. Домашняя работа:" +
                "\n------------------------------------");
            Rectangle re = new Rectangle();
            System.out.println("Прямоугольник (по умолчанию): " + re);

            System.out.println("------------------------------------");

            Rectangle re1 = new Rectangle(4,40);
            System.out.println("Прямоугольник №1" +
                    "\nДлина: " + re1.getWidth() +
                    "\nВысота: " + re1.getHeight());
            System.out.println("Периметр прямоугльника №1: " + re1.getPerimeter());
            System.out.println("Площадь прямоугольника №1: " + re1.getArea());

            System.out.println("------------------------------------");

            Rectangle re2 = new Rectangle(3.5,35.9);
            System.out.println("Прямоугольник №2" +
                    "\nДлина: " + re2.getWidth() +
                    "\nВысота: " + re2.getHeight());
            System.out.println("Периметр прямоугльника: " + re2.getPerimeter());
            System.out.println("Площадь прямоугольника: " + re2.getArea());

            System.out.println("------------------------------------");

        System.out.println("Задание №2. Домашняя работа:" +
                "\n------------------------------------");
        Stock stDef = new Stock();
        System.out.println("Значение по умолчанию: \n" + stDef);
        System.out.println("------------------------------------");

        Stock stMain = new Stock("SBER", "ПАО СБЕРБАНК",
                281.50, 282.87);
        System.out.println("Торговый день:  \n" + "Тикер: " + stMain.getSymbol() +
                "\nНазвание: " + stMain.getName() + "\nЦена закрытия: " + stMain.getPreviousClosingPrice() +
                "\nТекущая цена: " + stMain.getCurrentPrice());

        System.out.println("\nИзменение цены: " + String.format("%.2f", stMain.getChangePercent()) + " %" );

        System.out.println("------------------------------------");









    }
}
