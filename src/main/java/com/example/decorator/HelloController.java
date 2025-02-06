package com.example.decorator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import model.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
   @FXML
   public Pane paneLigth;
   public Pane panePresents;
   public Pane paneTree;
   public Pane paneStar;
   public Pane drawPaneTree;
    public Pane drawPaneLights;
    public Pane drawPaneGarland;
    public Pane drawPanePrezent;
    public Pane drawPaneStar;
   public CheckBox starCheckBox;


   public Button garland;
   public CheckBox garlandCheckBox;
   public CheckBox TreeCheckBox;
    public CheckBox presentCheckBox;

   @FXML
   public ChristmasTree tree;
   @FXML
   public ChristmasTreeImpl Itree;
   @FXML
   public TreeDecorator dtree;
    @FXML
    public TreeDecorator dtreeGir;
    @FXML
    public TreeDecorator dtreeStar;
   /*@FXML
   public void initialize(){
       paneTree.toFront();
       ChristmasTree tree = new ChristmasTreeImpl();
       tree.draw(paneTree);
   }*/
   @FXML
   public void StarOnAction(){
       // Добавляем обработчик для изменения состояния чекбокса
       starCheckBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
           if (newValue) { // Если чекбокс отмечен
               if (dtree == null) {
                   dtree = new Star(tree);
               }
               dtree.draw(drawPaneStar); // Отображаем гирлянду на панели для гирлянд
           } else { // Если чекбокс снят
               drawPaneStar.getChildren().clear(); // Удаляем только гирлянду из панели
               dtree = null; // Сбрасываем ссылку на гирлянду
           }
       });
   }
   public void allDeleteButtonOnAction(){
       drawPanePrezent.getChildren().clear();
       dtree = null;
       drawPaneStar.getChildren().clear();
       dtreeStar = null;
       drawPaneGarland.getChildren().clear();
       dtreeGir = null;
   }
    public void allDoneButtonOnAction() {
        if (dtree == null) {
            dtree = new Presents(tree);
        }
        dtree.draw(drawPanePrezent); // Отображаем гирлянду на панели для гирлянд
        if (dtreeGir == null) {
            dtreeGir = new Girland(tree);
        }
        dtreeGir.draw(drawPaneGarland); // Отображаем гирлянду на панели для гирлянд
        if (dtreeStar == null) {
            dtreeStar = new Star(tree);
        }
        dtreeStar.draw(drawPaneStar); // Отображаем гирлянду на панели для гирлянд
    }

    public void presentCheckBoxOnAction(){
        // Добавляем обработчик для изменения состояния чекбокса
        presentCheckBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) { // Если чекбокс отмечен
                if (dtree == null) {
                    dtree = new Presents(tree);
                }
                dtree.draw(drawPanePrezent); // Отображаем гирлянду на панели для гирлянд
            } else { // Если чекбокс снят
                drawPanePrezent.getChildren().clear(); // Удаляем только гирлянду из панели
                dtree = null; // Сбрасываем ссылку на гирлянду
            }
        });


    }

   @FXML
   public void addLights() {
       // Добавляем обработчик для изменения состояния чекбокса
       garlandCheckBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
           if (newValue) { // Если чекбокс отмечен
               if (dtree == null) {
                   dtree = new Girland(tree);
               }
               dtree.draw(drawPaneGarland); // Отображаем гирлянду на панели для гирлянд
           } else { // Если чекбокс снят
               drawPaneGarland.getChildren().clear(); // Удаляем только гирлянду из панели
               dtree = null; // Сбрасываем ссылку на гирлянду
           }
       });
   }
    @FXML
    public void TreeOnAction() {
        // Добавляем обработчик для изменения состояния чекбокса
        TreeCheckBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) { // Если чекбокс отмечен
                tree.draw(drawPaneTree); // Отображаем пустую ёлку без гирлянды
            } else { // Если чекбокс снят
                drawPaneTree.getChildren().clear(); // Удаляем узлы гирлянды из панели
                dtree = null; // Сбрасываем ссылку на гирлянду
            }
        });

   }
   @FXML
   public void initialize(URL location, ResourceBundle resources) {
       // Рисуем ёлку сразу при запуске приложения
       //tree.draw(drawPane);
       tree=new  ChristmasTreeImpl();
       dtree=null;
       tree.draw(drawPaneTree);
   }
}