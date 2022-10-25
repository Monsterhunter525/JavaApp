package abstractFigures;

public class Main {
    //String - возвращаемое значение функции, print - название функции(входящих параметров нету(пустые скобки))
    Integer print(){
        int s = 5;
        return s;  //если нету void то надо возвращать обЪект типа обьявленной функции

    }

    //"static" статитечкий(не нужно создавать экземпляр Example3.Main)
    //"void" ничего не возвращает
    //"drawNew" название метода
    // (Example3.Figure - класс ссылки, figure - сама ссылка) и всё это входящие параметры
     static void drawNew(Figure figure){
        figure.draw();

    }

    public static void main(String[] args) {

        Circle circle = new Circle();
        Square square = new Square();
        drawNew(circle);
        drawNew(square);
        Circle.roll();
        Square.show();
        Main main = new Main();
        System.out.println(main.print());





    }
}


//абстрактный клас фигура. у него есть абстрактный метод draw
//клас квадрат наследуется от фигуры и у него есть метод show
//клас круг наследуется от фигуры и у него есть метод roll