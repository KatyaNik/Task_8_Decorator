package model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class ChristmasTreeImpl implements ChristmasTree{


    public void draw(Pane pane) {

        // Создаём крону ёлки в виде треугольника
        Polygon crown1 = new Polygon(
                70.0, 250.0,
                220.0, 90.0,
                370.0, 250.0
        );
        Polygon crown2 = new Polygon(
                70.0, 430.0,
                220.0, 150.0,
                370.0, 430.0
        );
        crown1.setFill(Color.GREEN); // Заливаем зелёным цветом
        crown2.setFill(Color.GREEN); // Заливаем зелёным цветом

        // Создаём ствол ёлки в виде прямоугольника
        Rectangle trunk = new Rectangle(205.0, 430.0, 30.0, 60.0);
        trunk.setFill(Color.BROWN); // Заливаем коричневым цветом

        // Добавляем крону и ствол на панель
        pane.getChildren().addAll(crown1, crown2, trunk);
    }
}
