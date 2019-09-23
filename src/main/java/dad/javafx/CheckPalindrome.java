package dad.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindrome extends Application {

	private Label panlidromeLabel;
	private TextField worldText;
	private Button palindromeButton;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		worldText = new TextField();
		worldText.setPrefColumnCount(5);
		worldText.setPromptText("Introduce una palabra");
		worldText.setMaxWidth(150);
		
		palindromeButton = new Button("Comprueba");
		palindromeButton.setDefaultButton(true);
		palindromeButton.setOnAction(e -> onpalindromeButtonAction(e));
		
		panlidromeLabel=new Label();
		
		VBox root = new VBox(5,worldText,palindromeButton,panlidromeLabel);
		root.setAlignment(Pos.CENTER);

		Scene scene = new Scene(root, 320, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void onpalindromeButtonAction(ActionEvent e) {
		
		String palabraInvertida="";
		String palabra=worldText.getText();
		for (int i =worldText.getLength()-1; i >=0; i--) {
			palabraInvertida=palabraInvertida+worldText.getText().charAt(i);
		}
		System.out.println(palabraInvertida);
		if (palabraInvertida.equals(worldText.getText())) {
		panlidromeLabel.setText("Es palindromo");
		panlidromeLabel.setStyle("-fx-text-fill:green;");
		}else{panlidromeLabel.setText("No es palindromo");
		panlidromeLabel.setStyle("-fx-text-fill:red;");}
	}
}


