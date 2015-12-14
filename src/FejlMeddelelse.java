import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
/**
 * Created by Henrik on 07-12-2015.
 */
public class FejlMeddelelse
{
    public static void visFejlMeddelelse(String fejl)
    {
        Stage fejlStage = new Stage();

        //Block events to other windows
        fejlStage.initModality(Modality.APPLICATION_MODAL);
        fejlStage.setTitle("Fejl!");
        fejlStage.setMinWidth(256);

        Label fejlMeddelelse = new Label();
        fejlMeddelelse.setText(fejl);
        Button lukFejlVindue = new Button("Luk vinduet");
        lukFejlVindue.setOnAction(e -> fejlStage.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(fejlMeddelelse, lukFejlVindue);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        fejlStage.setScene(scene);
        fejlStage.showAndWait();
    }

}