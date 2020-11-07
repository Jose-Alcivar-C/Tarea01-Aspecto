import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Index extends Application 
{
	@Override
	public void start(Stage stage) throws Exception 
	{
		VBox ventana = new VBox();

		Scene scene = new Scene(ventana, 640, 480);
		
		Button btUno = new Button("Azul");

		Button btDos = new Button("Amarillo");

		Button btTres = new Button("Negro");

		ventana.setAlignment(Pos.CENTER);

		ventana.setSpacing(50);

		ventana.getChildren().addAll(btUno,btDos,btTres);

		stage.setScene(scene);

		stage.show();
		
		btUno.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                ventana.setStyle("-fx-background-color:blue");
            }
        }
        );
		
		btDos.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                ventana.setStyle("-fx-background-color:yellow");
            }
        }
        );
		
		btTres.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                ventana.setStyle("-fx-background-color:black");
            }
        }
        );
		
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}
