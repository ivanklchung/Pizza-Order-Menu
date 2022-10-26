//**************************************************************************************************
// PizzaOrderMenu.java
//
// Ivan Chung T00696713
// 
//
// PizzaOrderMenu is a JavaFX GUI application that allows the user to pick a set of pizza toppings 
// using a set of check boxes. Each topping will cost 50 cents and a plain pizza will cost $10.
// The cost of the pizza will be displayed. 
// Once a topping is checked or unchecked, the cost of pizza should update automatically.
//**************************************************************************************************
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.collections.ObservableList;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.beans.value.ObservableValue;
import java.awt.event.ActionEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.*;
import java.text.DecimalFormat;

public class PizzaOrderMenu extends Application 
{
    // base pizza price 
    static double flatPizza = 10.00;
    public void start(Stage stage)
    {
      // pizza cost label
      Label pizzaCost = new Label ("Pizza Cost: ");
      pizzaCost.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
        
      // make decimal 2 places
      DecimalFormat df = new DecimalFormat("0.00");
            
      // creating the checkboxes
      CheckBox extraCheese = new CheckBox("Extra Cheese");
      CheckBox pepperoni = new CheckBox("Pepperoni");
      CheckBox sausage= new CheckBox("Sausage");
      CheckBox greenPepper = new CheckBox("Green Pepper");
      CheckBox onion = new CheckBox("Onion");
      CheckBox anchovies = new CheckBox("Anchovies");
                    
      // creating grid setup
      GridPane grid= new GridPane();
      grid.addColumn(0, extraCheese, pepperoni, sausage );
      grid.addColumn(1, greenPepper, onion, anchovies);
      grid.add(pizzaCost, 0,8);
             
      // setting the margin to the nodes
      grid.setMargin(extraCheese, new Insets(10,10,10,10));
      grid.setMargin(pepperoni, new Insets(10,10,10,10));
      grid.setMargin(sausage, new Insets(10,10,10,10));
      grid.setMargin (greenPepper, new Insets(10,10,10,10));
      grid.setMargin(onion, new Insets(10,10,10,10));
      grid.setMargin(anchovies, new Insets(10,10,10,10));
      grid.setMargin(pizzaCost, new Insets(40,40,40,40));
        
      // making gap between columns closer 
      grid.setHgap(-100);
        
      // setting grid alignment
      grid.setAlignment(Pos.TOP_CENTER);
      
      // beige background 
      grid.setStyle("-fx-background-color: BEIGE ");
    
      // topping checkbox action
      
      // Extra Cheese checkbox action
      extraCheese.selectedProperty().addListener(
      (ObservableValue<? extends Boolean> value, Boolean old_val, Boolean new_val) -> 
      {
          pizzaCost.setText(String.valueOf(df.format(flatPizza)));
          if (old_val == false)
          flatPizza = flatPizza + 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
          if (new_val == false)
          flatPizza = flatPizza - 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
      });
      
      // Pepperoni checkbox action
      pepperoni.selectedProperty().addListener(
      (ObservableValue<? extends Boolean> value, Boolean old_val, Boolean new_val) -> 
      {
          pizzaCost.setText(String.valueOf(df.format(flatPizza)));
          if (old_val == false)
          flatPizza = flatPizza + 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
          if (new_val == false)
          flatPizza = flatPizza - 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
      });
      
      // Sausage checkbox action
      sausage.selectedProperty().addListener(
      (ObservableValue<? extends Boolean> value, Boolean old_val, Boolean new_val) -> 
      {
          pizzaCost.setText(String.valueOf(df.format(flatPizza)));
          if (old_val == false)
          flatPizza = flatPizza + 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
          if (new_val == false)
          flatPizza = flatPizza - 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
      });
       
      // Green Pepper checkbox action
      greenPepper.selectedProperty().addListener(
      (ObservableValue<? extends Boolean> value, Boolean old_val, Boolean new_val) -> 
      {
          pizzaCost.setText(String.valueOf(df.format(flatPizza)));
          if (old_val == false)
          flatPizza = flatPizza + 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
          if (new_val == false)
          flatPizza = flatPizza - 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
      });
      
      // Onion checkbox action 
      onion.selectedProperty().addListener(
      (ObservableValue<? extends Boolean> value, Boolean old_val, Boolean new_val) -> 
      {
          pizzaCost.setText(String.valueOf(df.format(flatPizza)));
          if (old_val == false)
          flatPizza = flatPizza + 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
          if (new_val == false)
          flatPizza = flatPizza - 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
      });
      
      // Anchovies checkbox action
      anchovies.selectedProperty().addListener(
      (ObservableValue<? extends Boolean> value, Boolean old_val, Boolean new_val) -> 
      {
          pizzaCost.setText(String.valueOf(df.format(flatPizza)));
          if (old_val == false)
          flatPizza = flatPizza + 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
          if (new_val == false)
          flatPizza = flatPizza - 0.5;
          pizzaCost.setText("Pizza Cost: $" + String.valueOf(df.format(flatPizza)));
      });
       
      
      // final pizza cost 
      pizzaCost.setText("Pizza Cost: $" + df.format(flatPizza));
          
          
      // creating scene object
      Scene scene = new Scene(grid, 500, 200);
            
            
      // Setting title to the Stage
      stage.setTitle("Pizza Cost");
            
      // Adding scene to the stage
      stage.setScene(scene);
            
      // Displaying the contents of the stage
      stage.show();
    }
    // launching program
    public static void main (String[] args)
    {
        launch(args);
    }
}
