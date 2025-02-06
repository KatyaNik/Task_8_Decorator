package model;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Girland extends TreeDecorator{
    public Circle[]circle=new Circle[9];
    public Circle[]circle1=new Circle[9];
    public Girland(ChristmasTree tree){
        super(tree);
    }
    public void draw (Pane paneLight){

        drawWithGirland(paneLight);
    }
    private void drawWithGirland (Pane paneLight){
        FadeTransition[] ft = new FadeTransition[9];
        circle[0] = new Circle(195,200,10, Color.RED);
        circle[1] = new Circle(255,200,10, Color.BLUE);
        circle[2] = new Circle(225,200,10, Color.YELLOW);
        circle[3] = new Circle(165,200,10, Color.YELLOW);
        circle[4] = new Circle(225,200,10, Color.BLUE);
        circle[5] = new Circle(285,200,10, Color.RED);
        circle[6] = new Circle(130,200,10, Color.BLUE);
        circle[7] = new Circle(225,200,10, Color.RED);
        circle[8] = new Circle(320,200,10, Color.YELLOW);
        for(int i=0;i<ft.length;i++){
            ft[i]=new FadeTransition(Duration.millis(1000), circle[i]);
            ft[i].setFromValue(1.0);
            ft[i].setToValue(0.0);
            ft[i].setCycleCount(Timeline.INDEFINITE);
            ft[i].setAutoReverse(true);
            ft[i].play();
        }
        paneLight.getChildren().addAll(circle[0],circle[1],circle[2],circle[3],circle[4],circle[5],circle[6],circle[7],circle[8]);


        FadeTransition[] ft1 = new FadeTransition[9];
        circle1[0] = new Circle(195,370,10, Color.RED);
        circle1[1] = new Circle(255,370,10, Color.BLUE);
        circle1[2] = new Circle(225,370,10, Color.YELLOW);
        circle1[3] = new Circle(165,370,10, Color.YELLOW);
        circle1[4] = new Circle(225,370,10, Color.BLUE);
        circle1[5] = new Circle(285,370,10, Color.RED);
        circle1[6] = new Circle(130,370,10, Color.BLUE);
        circle1[7] = new Circle(225,370,10, Color.RED);
        circle1[8] = new Circle(320,370,10, Color.YELLOW);
        for(int i=0;i<ft1.length;i++){
            ft1[i]=new FadeTransition(Duration.millis(1000), circle1[i]);
            ft1[i].setFromValue(1.0);
            ft1[i].setToValue(0.0);
            ft1[i].setCycleCount(Timeline.INDEFINITE);
            ft1[i].setAutoReverse(true);
            ft1[i].play();
        }
        paneLight.getChildren().addAll(circle1[0],circle1[1],circle1[2],circle1[3],circle1[4],circle1[5],circle1[6],circle1[7],circle1[8]);
    }
}
