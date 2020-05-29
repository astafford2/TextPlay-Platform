package edu.bsu.cs222;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainUI extends Application {

    private VBox parent = new VBox();

    private GridPane startGrid = new GridPane();
    private Button lindseyButton = new Button("Champion of the Maze");
    private Button andrewButton = new Button("Night In A Cabin");
    private Button jakeButton = new Button("The Heist");
    private Button codyButton = new Button("Europa");
    private Button startButton = new Button("Start");
    private Boolean inventoryNeeded;

    private GridPane buttonGrid = new GridPane();
    private Button choice1 = new Button("Choose");
    private Button choice2 = new Button("Choose");
    private Button choice3 = new Button("Choose");
    private Button choice4 = new Button("Choose");
    private Button choice5 = new Button("Choose");
    private Button choice6 = new Button("Choose");
    private Button choice7 = new Button("Choose");
    private Button[] buttons = {choice1, choice2, choice3, choice4, choice5, choice6, choice7};

    private Label choice1Lab = new Label("Option 1 choice");
    private Label choice2Lab = new Label("Option 2 choice");
    private Label choice3Lab = new Label("Option 3 choice");
    private Label choice4Lab = new Label("Option 4 choice");
    private Label choice5Lab = new Label("Option 5 choice");
    private Label choice6Lab = new Label("Option 6 choice");
    private Label choice7Lab = new Label("Option 7 choice");
    private Label[] labels = {choice1Lab, choice2Lab, choice3Lab, choice4Lab, choice5Lab, choice6Lab, choice7Lab};

    private Button inventoryButton = new Button("Inventory");

    private final TextArea storyTextArea = new TextArea();

    private Label item1Lab = new Label("Item 1");
    private Label item2Lab = new Label("Item 2");
    private Label item3Lab = new Label("Item 3");
    private Label item4Lab = new Label("Item 4");
    private Label item5Lab = new Label("Item 5");
    private Label item6Lab = new Label("Item 6");
    private Label item7Lab = new Label("Item 7");
    private Label item8Lab = new Label("Item 8");
    private Label item9Lab = new Label("Item 9");
    private Label item10Lab = new Label("Item 10");
    private Label[] itemLabs = {item1Lab, item2Lab, item3Lab, item4Lab, item5Lab,
                                item6Lab, item7Lab, item8Lab, item9Lab, item10Lab};

    private HBox resetBox = new HBox();
    private Button resetButton = new Button("Reset");

    private int currentlySelectedStory = 0;

    private PlayThinking thinking = new PlayThinking();

    public void start(Stage primaryStage) {
        primaryStage.setScene(createScene());
        primaryStage.setTitle("TextPlay");
        primaryStage.setWidth(610);
        primaryStage.setHeight(420);
        primaryStage.show();

        Stage inventoryStage = new Stage();
        inventoryStage.setScene(createInventoryScene());
        inventoryStage.setTitle("Inventory");
        inventoryStage.setWidth(400);
        inventoryStage.setHeight(450);
        inventoryButton.setOnAction(event -> inventoryStage.show());
    }

    private Scene createScene() {
        parent.setSpacing(10);

        HBox storyTextHBox = new HBox();
        storyTextArea.setEditable(false);
        storyTextHBox.getChildren().add(storyTextArea);
        storyTextHBox.setAlignment(Pos.CENTER);
        Text titleText = new Text("TextPlay\n" +
                "Created by: Andrew Stafford, Cody Miner, Lindsey Murphy, Jake Landes\n\n");
        titleText.setId("titleText");

        Text startingText = new Text("Welcome to TextPlay! Each story below is a text-based RPG game for your enjoyment.\n" +
                "Choose whichever you would like to get started!\n\n" +
                "Have fun!!");

        storyTextArea.setText(titleText.getText() + startingText.getText());
        storyTextArea.textProperty().addListener((observableValue, oldValue, newValue) -> storyTextArea.setScrollTop(Double.MAX_VALUE));

        parent.getChildren().add(storyTextArea);

        resetBox.getChildren().add(resetButton);
        resetBox.setAlignment(Pos.CENTER);

        startGrid.setHgap(10);
        startGrid.setVgap(10);
        startGrid.add(lindseyButton,0,0);
        startGrid.add(andrewButton,1,0);
        startGrid.add(jakeButton,2,0);
        startGrid.add(codyButton,3,0);
        startButton.setPrefWidth(100);
        startGrid.add(startButton,1,1);
        startGrid.setAlignment(Pos.CENTER);
        parent.getChildren().add(startGrid);

        lindseyButton.setOnAction(event -> {
            currentlySelectedStory = 1;
            inventoryNeeded = true;
        });
        andrewButton.setOnAction(event -> {
            currentlySelectedStory = 2;
            inventoryNeeded = false;
        });
        jakeButton.setOnAction(event -> {
            currentlySelectedStory = 3;
            inventoryNeeded = false;
        });
        codyButton.setOnAction(event -> {
            currentlySelectedStory = 4;
            inventoryNeeded = true;
        });

        resetButton.setOnAction(event -> {
            parent.getChildren().remove(resetBox);
            storyTextArea.setStyle("-fx-control-inner-background: #da70d6");
            storyTextArea.setText(titleText.getText() + startingText.getText());

            currentlySelectedStory = 0;
            parent.getChildren().add(startGrid);
        });

        for(Button button : buttons){
            button.setMinWidth(100);
        }

        buttonGrid.add(choice1,0,0);
        buttonGrid.add(choice2,0,1);
        buttonGrid.add(choice3,0,2);
        buttonGrid.add(choice4,0,3);
        buttonGrid.add(choice5,0,4);
        buttonGrid.add(choice6,0,5);
        buttonGrid.add(choice7,0,6);
        buttonGrid.add(choice1Lab, 1,0);
        buttonGrid.add(choice2Lab, 1,1);
        buttonGrid.add(choice3Lab, 1,2);
        buttonGrid.add(choice4Lab, 1,3);
        buttonGrid.add(choice5Lab, 1,4);
        buttonGrid.add(choice6Lab, 1,5);
        buttonGrid.add(choice7Lab, 1,6);

        inventoryButton.setPrefHeight(60);
        inventoryButton.setPrefWidth(100);
        buttonGrid.add(inventoryButton,5,0,1,3);

        buttonGrid.setHgap(20);
        buttonGrid.setVgap(10);
        buttonGrid.setAlignment(Pos.CENTER_LEFT);
        buttonGrid.setPadding(new Insets(0,0,0,10));

        startButton.setOnAction(event -> {
            if(currentlySelectedStory != 0) {
                parent.getChildren().remove(startGrid);
                parent.getChildren().add(buttonGrid);
                if(!inventoryNeeded) {inventoryButton.setVisible(false);}

                recursivePlay(thinking.startGame(currentlySelectedStory));
            }
        });

        Scene scene = new Scene(parent);
        scene.getStylesheets().add("TextPlay.css");
        return scene;
    }

    private Scene createInventoryScene(){
        VBox invParent = new VBox();

        Label invHeader = new Label("Inventory:");
        invHeader.setId("invHeader");
        invParent.getChildren().add(invHeader);

        GridPane itemsGrid = new GridPane();
        itemsGrid.add(item1Lab,0,0);
        itemsGrid.add(item2Lab,0,1);
        itemsGrid.add(item3Lab,0,2);
        itemsGrid.add(item4Lab,0,3);
        itemsGrid.add(item5Lab,0,4);
        itemsGrid.add(item6Lab,0,5);
        itemsGrid.add(item7Lab,0,6);
        itemsGrid.add(item8Lab,0,7);
        itemsGrid.add(item9Lab,0,8);
        itemsGrid.add(item10Lab,0,9);

        itemsGrid.setHgap(20);
        itemsGrid.setVgap(10);
        itemsGrid.setAlignment(Pos.CENTER_LEFT);
        itemsGrid.setPadding(new Insets(0,0,0,10));
        for (Label itemLab : itemLabs) {
            itemLab.setVisible(false);
            itemLab.setId("invLabel");
        }

        invParent.getChildren().add(itemsGrid);

        Scene invScene = new Scene(invParent);
        invScene.getStylesheets().add("TextPlay.css");
        return invScene;
    }

    private void displayPlotPoint(PlotPoint currentPlotPoint) {
        storyTextArea.appendText("\n\n"+currentPlotPoint.addLineBreaks(currentPlotPoint.exposition,100));
        storyTextArea.setStyle("-fx-control-inner-background:"+currentPlotPoint.backgroundColor);
        for (int i = 0; i < currentPlotPoint.options.size(); i++) {
            labels[i].setText(currentPlotPoint.options.get(i).optionText);
        }

        for (int i = 0; i < labels.length; i++) {
            boolean visibility = thinking.hasRequiredItem(currentPlotPoint, i);
            labels[i].setVisible(visibility);
            buttons[i].setVisible(visibility);
        }
    }

    private void updateInventory(){
        for(int i = 0; i < thinking.inventory.size(); i++){
            itemLabs[i].setText(thinking.inventory.get(i));
        }
        for(int i = 0; i < itemLabs.length; i++){
            boolean visibility = i < thinking.inventory.size();
            itemLabs[i].setVisible(visibility);
        }
    }

    private void recursivePlay(PlotPoint currentPlotPoint){
        displayPlotPoint(currentPlotPoint);
        if (currentPlotPoint.isDead()) {
            parent.getChildren().remove(buttonGrid);
            parent.getChildren().add(resetBox);
        } else {

            updateInventory();
            choice1.setOnAction(event -> recursivePlay(thinking.getNextPlotPoint(currentPlotPoint, 1)));
            choice2.setOnAction(event -> recursivePlay(thinking.getNextPlotPoint(currentPlotPoint,2)));
            choice3.setOnAction(event -> recursivePlay(thinking.getNextPlotPoint(currentPlotPoint,3)));
            choice4.setOnAction(event -> recursivePlay(thinking.getNextPlotPoint(currentPlotPoint,4)));
            choice5.setOnAction(event -> recursivePlay(thinking.getNextPlotPoint(currentPlotPoint,5)));
            choice6.setOnAction(event -> recursivePlay(thinking.getNextPlotPoint(currentPlotPoint,6)));
            choice7.setOnAction(event -> recursivePlay(thinking.getNextPlotPoint(currentPlotPoint,7)));
        }
    }
}