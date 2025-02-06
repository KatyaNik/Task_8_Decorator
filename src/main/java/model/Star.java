package model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Star extends TreeDecorator{
    public Star(ChristmasTree tree){
        super(tree);
    }
    public void draw(Pane paneStar){

        drawStar(paneStar);
    }
    private void drawStar(Pane paneStar){
        Path star=new Path();
        star.getElements().addAll(new MoveTo(219, 49),
        new LineTo(197,102),
        new LineTo(219,91),
        new LineTo(242,102),
        new ClosePath(),
        new MoveTo(187,68),
        new LineTo(250,68),
        new LineTo(219,91),
        new ClosePath());
        star.setFill(Color.YELLOW);
        star.setFillRule(FillRule.EVEN_ODD);
        paneStar.getChildren().addAll(star);

    }
}
