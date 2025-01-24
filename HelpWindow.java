/**************************************************************************************************
 * Help window of the game
 *
 * @authors Jaspinder Singh , Syed Owais Haider Kazmi, Nomaan Imran Saiyed, Dhruv Manishbhai Thumar
 * @version V1
 ************************************************************************************************** */
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class HelpWindow {
    /**************************************************************
     * createScene() - create the scene for help window
     *
     * @param - none
     * @return - Scene
     ************************************************************** */
    public Scene createScene() {
        StackPane layout = new StackPane();
        VBox vbox = new VBox(); // Vertical layout for stacking nodes
        vbox.setAlignment(Pos.CENTER); // Center contents vertically
        vbox.setSpacing(20); // Spacing between nodes
        String helpText = "Quick recap on how to play the game:\n\n" +
                          "• After running the program, the user comes up to the starting page.\n" +
                          "• The user presses the start game button.\n" +
                          "• The user is taken to the first spin wheel.\n" +
                          "• The user presses spin button, the spin wheel spins and assigns user with specific number of drops randomly.\n" +
                          "• The user then presses the next button.\n" +
                          "• The user comes to the next spin wheel window again the user presses the spin button, and the user is assigned with score to play the game with.\n" +
                          "• The user presses the next button.\n" +
                          "• It takes the user to the main tree window.\n" +
                          "• The user plays the game.\n" +
                          "• Now if the user picks the poison apple the game ends with user getting 0 points.\n" +
                          "• If the user manages to bring his score below zero, the user again loses the game.\n" +
                          "• Now, if the user plays the game in accordance with the normal scenario, after the user’s number of drops become zero, an animation will play, game ends and the total score is what the player earned throughout the game.\n" +
                          "• After game ends, irrespective of the scenario, the user is given the option to replay the game.\n" +
                          "• Click on the top of the apple to drop it.";

        Label helpLabel = new Label(helpText);

        // Create a back button
        Button backButton = new Button("Back");
        backButton.setStyle("-fx-background-color: #4CAF50; " +
                    "-fx-text-fill: white; " +
                    "-fx-font-size: 16px; " +
                    "-fx-font-family: 'Arial'; " +
                    "-fx-padding: 10px 20px; " +
                    "-fx-border-radius: 5px; " +
                    "-fx-font-weight: bold;"); 
        backButton.setOnAction(e -> {
            // Navigate back to GameHomepage
            GameHomepage gameHomepage = new GameHomepage();
            Stage stage = (Stage) backButton.getScene().getWindow();
            gameHomepage.start(stage);
        });

        // Add nodes to the layout
        vbox.getChildren().addAll(helpLabel, backButton);
        layout.getChildren().add(vbox);
        layout.setAlignment(vbox, Pos.CENTER); // Center the VBox in the StackPane
        layout.setPadding(new Insets(20)); // Add padding around the layout
        Scene scene = new Scene(layout, 600, 400); // Adjust size as needed
        return scene;
    }
}
