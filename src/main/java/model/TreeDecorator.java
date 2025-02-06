package model;

import javafx.scene.layout.Pane;

public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;
    public TreeDecorator (ChristmasTree tree){
        this.tree=tree;
    }//конструктор
    public void draw(Pane pane){
        tree.draw(pane);

    }

}
