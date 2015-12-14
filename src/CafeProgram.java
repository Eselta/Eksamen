import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.regex.Pattern;

/**
 * Created by Henrik on 04-11-2015.
 */
public class CafeProgram extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        // Højde og bredde til applikationen

        int xAkse = 1024;
        int yAkse = 512;

        // START layouts og scenes til loginGUI

        // Layout og Scene til loginGUI
        GridPane layout1 = new GridPane();
        Scene scene1 = new Scene(layout1, xAkse, yAkse);

        // Layout og Scene til funktionsoversigtGUI
        GridPane layout2 = new GridPane();
        Scene scene2 = new Scene(layout2, xAkse, yAkse);

        // Layout og Scene til vagtskemaGUI
        //GridPane layout3 = new GridPane();
        //Scene scene3 = new Scene(layout3, xAkse, yAkse);

        // Layout og Scene til vagtoprettelseGUI
        GridPane layout4 = new GridPane();
        Scene scene4 = new Scene(layout4, xAkse, yAkse);

        // Layout og Scene til vagtredigeringGUI
        //GridPane layout5 = new GridPane();
        //Scene scene5 = new Scene(layout5, xAkse, yAkse);

        // Layout og Scene til medarbejderoprettelseGUI
        GridPane layout6 = new GridPane();
        Scene scene6 = new Scene(layout6, xAkse, yAkse);

        // Layout og Scene til medarbejderredigeringGUI
        GridPane layout7 = new GridPane();
        Scene scene7 = new Scene(layout7, xAkse, yAkse);

        // Layout og Scene til løntrinoprettelseGUI
        GridPane layout8 = new GridPane();
        Scene scene8 = new Scene(layout8, xAkse, yAkse);

        // Layout og Scene til løntrinredigeringGUI
        GridPane layout9 = new GridPane();
        Scene scene9 = new Scene(layout9, xAkse, yAkse);

        // SLUT layouts og scenes til loginGUI

        // START loginGUI (scene1)

        HBox scene1Hbox = new HBox(16);
        HBox scene1Hbox2 = new HBox();

        scene1Hbox.setMinSize(xAkse, (xAkse / 2));
        scene1Hbox2.setMinSize(xAkse, (xAkse / 2));

        TextField loginNavnFelt = new TextField();
        loginNavnFelt.setPromptText("Indtast brugernavn");
        PasswordField loginPasswordFelt = new PasswordField();
        loginPasswordFelt.setPromptText("Indtast password");
        Button loginKnap = new Button("Log ind");

        loginKnap.setPrefSize(128, 64);

        scene1Hbox.setMargin(loginNavnFelt, new Insets(0, 0, 16, 0));
        scene1Hbox.setMargin(loginPasswordFelt, new Insets(0, 0, 16, 0));
        scene1Hbox2.setMargin(loginKnap, new Insets(16, 0, 0, 0));

        scene1Hbox.getChildren().addAll(loginNavnFelt, loginPasswordFelt);
        scene1Hbox2.getChildren().add(loginKnap);

        //layout1.setGridLinesVisible(true);
        layout1.setMinSize(xAkse, yAkse);
        layout1.setAlignment(Pos.CENTER);
        scene1Hbox.setAlignment(Pos.BOTTOM_CENTER);
        scene1Hbox2.setAlignment(Pos.TOP_CENTER);
        layout1.add(scene1Hbox, 0, 0);
        layout1.add(scene1Hbox2, 0, 1);

        //loginKnap rykket til bunden.

        // SLUT loginGUI (scene1)

        // START funktionsoversigtGUI (scene2)

        HBox scene2Hbox = new HBox();
        HBox scene2Hbox2 = new HBox();
        HBox scene2Hbox3 = new HBox(16);
        HBox scene2Hbox4 = new HBox(16);

        scene2Hbox.setMinSize(xAkse, 64);
        scene2Hbox2.setMinSize(xAkse, 128);
        scene2Hbox3.setMinSize(xAkse, 128);
        scene2Hbox4.setMinHeight(192);

        Button scene2logUdKnap = new Button("Log Ud");

        scene2logUdKnap.setPrefSize(96, 32);
        scene2Hbox.setMargin(scene2logUdKnap, new Insets(16, 32, 0, 0));

        Button visVagtOversigtKnap = new Button("Vis Vagtoversigt");
        Button opretVagtKnap = new Button("Opret Vagt");
        Button redigerVagtKnap = new Button("Rediger Vagt");
        Button opretMedarbejderKnap = new Button("Opret Medarbejder");
        Button redigerMedarbejderKnap = new Button("Rediger Medarbejder");
        Button opretLoentrinKnap = new Button("Opret L\u00F8ntrin");
        Button redigerLoentrinKnap = new Button("Rediger L\u00F8ntrin");

        visVagtOversigtKnap.setPrefSize(192, 64);
        scene2Hbox2.setMargin(visVagtOversigtKnap, new Insets(64, 0, 0, 0));
        opretVagtKnap.setPrefSize(192, 64);
        scene2Hbox3.setMargin(opretVagtKnap, new Insets(32, 0, 0, 0));
        redigerVagtKnap.setPrefSize(192, 64);
        scene2Hbox3.setMargin(redigerVagtKnap, new Insets(32, 0, 0, 0));
        opretMedarbejderKnap.setPrefSize(192, 64);
        redigerMedarbejderKnap.setPrefSize(192, 64);
        opretLoentrinKnap.setPrefSize(192, 64);
        redigerLoentrinKnap.setPrefSize(192, 64);

        scene2Hbox.getChildren().add(scene2logUdKnap);
        scene2Hbox2.getChildren().add(visVagtOversigtKnap);
        scene2Hbox3.getChildren().addAll(opretVagtKnap, redigerVagtKnap);
        scene2Hbox4.getChildren().addAll(opretMedarbejderKnap, redigerMedarbejderKnap, opretLoentrinKnap, redigerLoentrinKnap);

        //layout2.setGridLinesVisible(true);
        layout2.setMinSize(xAkse, yAkse);
        layout2.setPrefSize(xAkse, yAkse);
        layout2.setAlignment(Pos.CENTER);
        layout2.add(scene2Hbox, 0, 0);
        layout2.add(scene2Hbox2, 0, 1);
        layout2.add(scene2Hbox3, 0, 2);
        layout2.add(scene2Hbox4, 0, 3);
        scene2Hbox.setAlignment(Pos.TOP_RIGHT);
        scene2Hbox2.setAlignment(Pos.TOP_CENTER);
        scene2Hbox3.setAlignment(Pos.TOP_CENTER);
        scene2Hbox4.setAlignment(Pos.TOP_CENTER);


        scene2logUdKnap.setOnAction((event) -> {
            primaryStage.setScene(scene1);
            primaryStage.show();
            loginNavnFelt.clear();
            loginPasswordFelt.clear();
            opretMedarbejderKnap.setDisable(false);
            redigerMedarbejderKnap.setDisable(false);
            opretLoentrinKnap.setDisable(false);
            redigerLoentrinKnap.setDisable(false);
        });

        /*
        visVagtOversigtKnap.setOnAction((event) -> {
            primaryStage.setScene(scene3);
            primaryStage.show();
        });
        */
        opretVagtKnap.setOnAction((event) -> {
            primaryStage.setScene(scene4);
            primaryStage.show();
        });
        /*
        redigerVagtKnap.setOnAction((event) -> {
            primaryStage.setScene(scene5);
            primaryStage.show();
        });
        */
        opretMedarbejderKnap.setOnAction((event) -> {
            primaryStage.setScene(scene6);
            primaryStage.show();
        });

        redigerMedarbejderKnap.setOnAction((event) -> {
            primaryStage.setScene(scene7);
            primaryStage.show();
        });

        opretLoentrinKnap.setOnAction((event) -> {
            primaryStage.setScene(scene8);
            primaryStage.show();
        });

        redigerLoentrinKnap.setOnAction((event) -> {
            primaryStage.setScene(scene9);
            primaryStage.show();
        });

        // SLUT funktionsoversigtGUI (scene2)

        // START vagtskemaGUI (scene3)

                // HER SKAL DER VÆRE TABLEVIEW MED MERE
        //TODO

        // SLUT vagtskemaGUI (scene3)

        // START vagtoprettelseGUI (scene4)

        HBox scene4Hbox = new HBox(768);
        HBox scene4Hbox2 = new HBox(16);

        scene4Hbox.setMinSize(xAkse, 64);
        scene4Hbox2.setMinSize(xAkse, 448);

        Button scene4tilbageKnap = new Button("Tilbage");
        Button scene4logUdKnap = new Button("Log Ud");

        scene4tilbageKnap.setPrefSize(96, 32);
        scene4Hbox.setMargin(scene4tilbageKnap, new Insets(16, 0, 0, 0));
        scene4logUdKnap.setPrefSize(96, 32);
        scene4Hbox.setMargin(scene4logUdKnap, new Insets(16, 0, 0, 0));

        ComboBox medarbejderCB = new ComboBox();
        medarbejderCB.getItems().addAll("Test1", "Test2", "Test 3");
        DatePicker datoDP = new DatePicker();
        ComboBox vagtCB = new ComboBox();
        vagtCB.getItems().addAll("Test1", "Test2", "Test 3");
        Button scene4OpretKnap = new Button("Opret Vagt");

        medarbejderCB.setPrefSize(192, 32);
        datoDP.setPrefSize(192, 32);
        vagtCB.setPrefSize(192, 32);
        scene4OpretKnap.setPrefSize(96, 32);

        scene4Hbox2.setMargin(medarbejderCB, new Insets(64, 0, 0, 0));
        scene4Hbox2.setMargin(datoDP, new Insets(64, 0, 0, 0));
        scene4Hbox2.setMargin(vagtCB, new Insets(64, 0, 0, 0));
        scene4Hbox2.setMargin(scene4OpretKnap, new Insets(64, 0, 0, 0));

        scene4Hbox.getChildren().addAll(scene4tilbageKnap, scene4logUdKnap);
        scene4Hbox2.getChildren().addAll(medarbejderCB, datoDP, vagtCB, scene4OpretKnap);

        //layout4.setGridLinesVisible(true);
        layout4.setMinSize(xAkse, yAkse);
        layout4.setPrefSize(xAkse, yAkse);
        layout4.setAlignment(Pos.CENTER);
        layout4.add(scene4Hbox, 0, 0);
        layout4.add(scene4Hbox2, 0, 1);
        scene4Hbox.setAlignment(Pos.TOP_CENTER);
        scene4Hbox2.setAlignment(Pos.TOP_CENTER);

        scene4tilbageKnap.setOnAction((event) -> {
            primaryStage.setScene(scene2);
            primaryStage.show();

            if(medarbejderCB.getValue() != null) {
                if(datoDP.getValue() != null) {
                    if(vagtCB.getValue() != null) {

                        System.out.println("Tillykke, alle felter er godkendt til oprettelse af vagt!");
                        // Opret vagt - det vil sige foretag et SQL statement der indsætter de forskellige felter direkte ind i databasen

                    } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Vagttype er ikke valgt i drop-down menuen."); }
                } else {  FejlMeddelelse.visFejlMeddelelse("Fejl: Dato er ikke valgt i kalender menuen."); }
            } else {FejlMeddelelse.visFejlMeddelelse("Fejl: Medarbejder er ikke valgt i drop-down menuen."); }
        });

        /*
        scene4logUdKnap.setOnAction((event) -> {
            // Kald en logud funktion her.
        });
        */

        /*
        scene4OpretKnap.setOnAction((event) -> {
            // Valider alle informationer - er medarbejder valgt? Er dato valgt? Er vagttype valgt? Er medarbejderen ledig til at tage en vagt på det pågældende tidspunkt?
            // Hvis ja, opret vagt (det vil sige foretag et SQL statement der opretter vagten direkte i databasen). Ellers vis fejlmeddelelse. ["a-Z"]+

        });
        */

        // SLUT vagtoprettelseGUI (scene4)

        // START vagtredigeringGUI (scene5)

                // HER SKAL DER VÆRE TABLEVIEW MED MERE

        // SLUT vagtredigeringGUI (scene5)

        // START medarbejderoprettelseGUI (scene6)

        HBox scene6Hbox = new HBox(768);
        HBox scene6Hbox2 = new HBox(16);
        HBox scene6Hbox3 = new HBox(16);
        HBox scene6Hbox4 = new HBox(16);
        HBox scene6Hbox5 = new HBox(16);
        HBox scene6Hbox6 = new HBox();

        scene6Hbox.setMinSize(xAkse, 64);
        scene6Hbox2.setMinSize(xAkse, 128);
        scene6Hbox3.setMinSize(xAkse, 64);
        scene6Hbox4.setMinSize(xAkse, 64);
        scene6Hbox5.setMinSize(xAkse, 64);
        scene6Hbox6.setMinSize(xAkse, 128);

        Button scene6tilbageKnap = new Button("Tilbage");
        Button scene6logUdKnap = new Button("Log Ud");

        scene6tilbageKnap.setPrefSize(96, 32);
        scene6Hbox.setMargin(scene6tilbageKnap, new Insets(16, 0, 0, 0));
        scene6logUdKnap.setPrefSize(96, 32);
        scene6Hbox.setMargin(scene6logUdKnap, new Insets(16, 0, 0, 0));

        Label scene6Label = new Label("Indtast f\u00F8lgende informationer:");

        TextField scene6TF1 = new TextField();
        scene6TF1.setPromptText("Indtast fornavn");
        TextField scene6TF2 = new TextField();
        scene6TF2.setPromptText("Indtast efternavn");
        TextField scene6TF3 = new TextField();
        scene6TF3.setPromptText("Indtast adresse");
        TextField scene6TF4 = new TextField();
        scene6TF4.setPromptText("Indtast telefonnummer");
        TextField scene6TF5 = new TextField();
        scene6TF5.setPromptText("Indtast registreringsnummer");
        TextField scene6TF6 = new TextField();
        scene6TF6.setPromptText("Indtast kontonummer");

        scene6TF1.setPrefSize(256, 32);
        scene6Hbox2.setMargin(scene6Label, new Insets(64, 0, 0, 0));
        scene6TF2.setPrefSize(256, 32);
        scene6TF3.setPrefSize(256, 32);
        scene6TF4.setPrefSize(256, 32);
        scene6TF5.setPrefSize(256, 32);
        scene6TF6.setPrefSize(256, 32);

        ComboBox scene6CB1 = new ComboBox(); // Vælg stilling
        scene6CB1.getItems().addAll("Test1", "Test2", "Test 3");
        ComboBox scene6CB2 = new ComboBox(); // Vælg løntrin
        scene6CB2.getItems().addAll("Test1", "Test2", "Test 3");

        scene6CB1.setPrefSize(256, 32);
        scene6CB2.setPrefSize(256, 32);

        Button scene6OpretKnap = new Button("Opret medarbejder");

        scene6OpretKnap.setPrefSize(192, 32);

        scene6Hbox.getChildren().addAll(scene6tilbageKnap, scene6logUdKnap);
        scene6Hbox2.getChildren().add(scene6Label);
        scene6Hbox3.getChildren().addAll(scene6TF1, scene6TF2, scene6TF3);
        scene6Hbox4.getChildren().addAll(scene6TF4, scene6TF5, scene6TF6);
        scene6Hbox5.getChildren().addAll(scene6CB1, scene6CB2);
        scene6Hbox6.getChildren().add(scene6OpretKnap);

        //layout6.setGridLinesVisible(true);
        layout6.setMinSize(xAkse, yAkse);
        layout6.setPrefSize(xAkse, yAkse);
        layout6.setAlignment(Pos.CENTER);
        layout6.add(scene6Hbox, 0, 0);
        layout6.add(scene6Hbox2, 0, 1);
        layout6.add(scene6Hbox3, 0, 2);
        layout6.add(scene6Hbox4, 0, 3);
        layout6.add(scene6Hbox5, 0, 4);
        layout6.add(scene6Hbox6, 0, 5);
        scene6Hbox.setAlignment(Pos.TOP_CENTER);
        scene6Hbox2.setAlignment(Pos.TOP_CENTER);
        scene6Hbox3.setAlignment(Pos.TOP_CENTER);
        scene6Hbox4.setAlignment(Pos.TOP_CENTER);
        scene6Hbox5.setAlignment(Pos.TOP_CENTER);
        scene6Hbox6.setAlignment(Pos.TOP_CENTER);

        scene6tilbageKnap.setOnAction((event) -> {
            primaryStage.setScene(scene2);
            primaryStage.show();


            if(!scene6TF1.getText().isEmpty() && scene6TF1.getText().length() < 21 && Pattern.matches("[\306\330\305\346\370\345\040a-zA-Z-]+", scene6TF1.getText())) {
                if (!scene6TF2.getText().isEmpty() && scene6TF2.getText().length() < 51 && Pattern.matches("[\306\330\305\346\370\345\040a-zA-Z-]+", scene6TF2.getText())) {
                    if (!scene6TF3.getText().isEmpty() && scene6TF3.getText().length() < 81 && Pattern.matches("[\306\330\305\346\370\345\040a-zA-Z0-9,.-]+", scene6TF3.getText())) {
                        if (!scene6TF4.getText().isEmpty() && scene6TF4.getText().length() == 8 && Pattern.matches("[0-9]+", scene6TF4.getText())) {
                            if (!scene6TF5.getText().isEmpty() && scene6TF5.getText().length() == 4 && Pattern.matches("[0-9]+", scene6TF5.getText())) {
                                if (!scene6TF6.getText().isEmpty() && scene6TF6.getText().length() == 10 && Pattern.matches("[0-9]+", scene6TF6.getText())) {
                                    if(scene6CB1.getValue() != null) {
                                        if(scene6CB2.getValue() != null)
                                        {
                                            System.out.println("Tillykke, alle felter er godkendt!");
                                            // Opret medarbejder - det vil sige foretag et SQL statement der indsætter de forskellige felter direkte ind i databasen

                                        } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Løntrin er ikke valgt i drop-down menuen."); }
                                    } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Stilling er ikke valgt i drop-down menuen."); }
                                } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Kontonummeret indtastet forkert. Feltet må kun indeholde 0-9, og skal være 10 cifre."); }
                            } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Registreringsnummer indtastet forkert. Feltet må kun indeholde 0-9, og skal være 4 cifre."); }
                        } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Telefonnumer indtastet forkert. Feltet må kun indeholde 0-9, og skal være 8 cifre."); }
                    } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Adresse indtastet forkert. Feltet må kun indeholde bogstaver, mellemrum og tal, samt tegnene ,.-, og være maksimalt 80 karakterer lang."); }
                } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Efternavn indtastet forkert. Feltet må kun indeholde bogstaver, mellemrum, samt bindestreg, og være maksimalt 50 karakterer lang."); }
            }  else { FejlMeddelelse.visFejlMeddelelse("Fejl: Fornavn indtastet forkert. Feltet må kun indeholde bogstaver, mellemrum, samt bindestreg, og være maksimalt 20 karakterer lang."); }
        });

        /*
        scene6logUdKnap.setOnAction((event) -> {
            // Kald en logud funktion her.
        });
        */

        /*
        scene6OpretKnap.setOnAction((event) -> {
            // Valider alle informationer - er alle 6 felter indtastet, og opfylder de kravene for hvad der må stå i dem? Er stilling og løntrin valgt?
            // Hvis ja, opret medarbejder (det vil sige foretag et SQL statement der opretter medarbejderen direkte i databasen). Ellers vis fejlmeddelelse.

            Validerings pseudo-kode:

            SE TILBAGE KNAPPEN!

        });
        */

        // SLUT medarbejderoprettelseGUI (scene6)

        // START medarbejderredigeringGUI (scene7)

        HBox scene7Hbox = new HBox(768);
        HBox scene7Hbox2 = new HBox(16);
        HBox scene7Hbox3 = new HBox(16);
        HBox scene7Hbox4 = new HBox(16);
        HBox scene7Hbox5 = new HBox(16);
        HBox scene7Hbox6 = new HBox();

        scene7Hbox.setMinSize(xAkse, 64);
        scene7Hbox2.setMinSize(xAkse, 128);
        scene7Hbox3.setMinSize(xAkse, 64);
        scene7Hbox4.setMinSize(xAkse, 64);
        scene7Hbox5.setMinSize(xAkse, 64);
        scene7Hbox6.setMinSize(xAkse, 128);

        Button scene7tilbageKnap = new Button("Tilbage");
        Button scene7logUdKnap = new Button("Log Ud");

        scene7tilbageKnap.setPrefSize(96, 32);
        scene7Hbox.setMargin(scene7tilbageKnap, new Insets(16, 0, 0, 0));
        scene7logUdKnap.setPrefSize(96, 32);
        scene7Hbox.setMargin(scene7logUdKnap, new Insets(16, 0, 0, 0));

        TextField scene7TF1 = new TextField();
        scene7TF1.setPromptText("Nuv\u00E6rende Fornavn");
        TextField scene7TF2 = new TextField();
        scene7TF2.setPromptText("Nuv\u00E6rende Efternavn");
        TextField scene7TF3 = new TextField();
        scene7TF3.setPromptText("Nuv\u00E6rende Adresse");
        TextField scene7TF4 = new TextField();
        scene7TF4.setPromptText("Nuv\u00E6rende Telefonnummer");
        TextField scene7TF5 = new TextField();
        scene7TF5.setPromptText("Nuv\u00E6rende Registreringsnummer");
        TextField scene7TF6 = new TextField();
        scene7TF6.setPromptText("Nuv\u00E6rende Kontonummer");

        scene7TF1.setPrefSize(256, 32);
        scene7TF2.setPrefSize(256, 32);
        scene7TF3.setPrefSize(256, 32);
        scene7TF4.setPrefSize(256, 32);
        scene7TF5.setPrefSize(256, 32);
        scene7TF6.setPrefSize(256, 32);

        ComboBox scene7CB1 = new ComboBox(); // Vælg stilling
        scene7CB1.getItems().addAll("Test1", "Test2", "Test 3");
        ComboBox scene7CB2 = new ComboBox(); // Vælg løntrin
        scene7CB2.getItems().addAll("Test1", "Test2", "Test 3");
        ComboBox scene7CB3 = new ComboBox(); // Vælg medarbejder

        scene7CB1.setPrefSize(256, 32);
        scene7CB2.setPrefSize(256, 32);
        scene7CB3.setPrefSize(256, 32);

        Button scene7RedigerKnap = new Button("Rediger medarbejder");
        Button scene7SletKnap = new Button("Slet medarbejder");
        Button scene7GodkendKnap = new Button("Godkend redigering");

        scene7RedigerKnap.setPrefSize(192, 32);
        scene7SletKnap.setPrefSize(192, 32);
        scene7GodkendKnap.setPrefSize(192, 32);

        scene7Hbox2.setMargin(scene7CB3, new Insets(64, 0, 0, 0));
        scene7Hbox2.setMargin(scene7RedigerKnap, new Insets(64, 0, 0, 0));
        scene7Hbox2.setMargin(scene7SletKnap, new Insets(64, 0, 0, 0));

        scene7Hbox.getChildren().addAll(scene7tilbageKnap, scene7logUdKnap);
        scene7Hbox2.getChildren().addAll(scene7CB3, scene7RedigerKnap, scene7SletKnap);
        scene7Hbox3.getChildren().addAll(scene7TF1, scene7TF2, scene7TF3);
        scene7Hbox4.getChildren().addAll(scene7TF4, scene7TF5, scene7TF6);
        scene7Hbox5.getChildren().addAll(scene7CB1, scene7CB2);
        scene7Hbox6.getChildren().add(scene7GodkendKnap);

        //layout7.setGridLinesVisible(true);
        layout7.setMinSize(xAkse, yAkse);
        layout7.setPrefSize(xAkse, yAkse);
        layout7.setAlignment(Pos.CENTER);
        layout7.add(scene7Hbox, 0, 0);
        layout7.add(scene7Hbox2, 0, 1);
        layout7.add(scene7Hbox3, 0, 2);
        layout7.add(scene7Hbox4, 0, 3);
        layout7.add(scene7Hbox5, 0, 4);
        layout7.add(scene7Hbox6, 0, 5);
        scene7Hbox.setAlignment(Pos.TOP_CENTER);
        scene7Hbox2.setAlignment(Pos.TOP_CENTER);
        scene7Hbox3.setAlignment(Pos.TOP_CENTER);
        scene7Hbox4.setAlignment(Pos.TOP_CENTER);
        scene7Hbox5.setAlignment(Pos.TOP_CENTER);
        scene7Hbox6.setAlignment(Pos.TOP_CENTER);

        scene7tilbageKnap.setOnAction((event) -> {
            primaryStage.setScene(scene2);
            primaryStage.show();

            if(!scene7TF1.getText().isEmpty() && scene7TF1.getText().length() < 21 && Pattern.matches("[\306\330\305\346\370\345\040a-zA-Z-]+", scene7TF1.getText())) {
                if (!scene7TF2.getText().isEmpty() && scene7TF2.getText().length() < 51 && Pattern.matches("[\306\330\305\346\370\345\040a-zA-Z-]+", scene7TF2.getText())) {
                    if (!scene7TF3.getText().isEmpty() && scene7TF3.getText().length() < 81 && Pattern.matches("[\306\330\305\346\370\345\040a-zA-Z0-9,.-]+", scene7TF3.getText())) {
                        if (!scene7TF4.getText().isEmpty() && scene7TF4.getText().length() == 8 && Pattern.matches("[0-9]+", scene7TF4.getText())) {
                            if (!scene7TF5.getText().isEmpty() && scene7TF5.getText().length() == 4 && Pattern.matches("[0-9]+", scene7TF5.getText())) {
                                if (!scene7TF6.getText().isEmpty() && scene7TF6.getText().length() == 10 && Pattern.matches("[0-9]+", scene7TF6.getText())) {
                                    if(scene7CB1.getValue() != null) {
                                        if(scene7CB2.getValue() != null)
                                        {
                                            System.out.println("Tillykke, alle felter er godkendt!");
                                            // Rediger medarbejder - det vil sige foretag et SQL statement der indsætter de forskellige felter direkte ind i databasen

                                        } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Løntrin er ikke valgt i drop-down menuen."); }
                                    } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Stilling er ikke valgt i drop-down menuen."); }
                                } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Kontonummeret indtastet forkert. Feltet må kun indeholde 0-9, og skal være 10 cifre."); }
                            } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Registreringsnummer indtastet forkert. Feltet må kun indeholde 0-9, og skal være 4 cifre."); }
                        } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Telefonnumer indtastet forkert. Feltet må kun indeholde 0-9, og skal være 8 cifre."); }
                    } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Adresse indtastet forkert. Feltet må kun indeholde bogstaver, mellemrum og tal, samt tegnene ,.-, og være maksimalt 80 karakterer lang."); }
                } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Efternavn indtastet forkert. Feltet må kun indeholde bogstaver, mellemrum, samt bindestreg, og være maksimalt 50 karakterer lang."); }
            }  else { FejlMeddelelse.visFejlMeddelelse("Fejl: Fornavn indtastet forkert. Feltet må kun indeholde bogstaver, mellemrum, samt bindestreg, og være maksimalt 20 karakterer lang."); }
        });

        /*
        scene7logUdKnap.setOnAction((event) -> {
            // Kald en logud funktion her.
        });
        */

        /*
        scene7RedigerKnap.setOnAction((event) -> {
            // Er en medarbejder valgt?
            // Hvis ja, indl�s data fra databasen ind i de nedenst�ende felter (Foretag et SQL statement der henter data ind og l�gger dem i de korrekte textfields og comboboxes). Ellers vis fejlmeddelelse.
        });
        */

        /*
        scene7SletKnap.setOnAction((event) -> {
            // Er en medarbejder valgt?
            // Hvis ja, slet medarbejderen (Foretag et SQL statement der sletter medarbejderen i databasen). Vis fejlmeddelelse hvis noget g�r galt.
        });
        */

        // SLUT medarbejderredigeringGUI (scene7)

        // START l�ntrinoprettelseGUI (scene8)

        HBox scene8Hbox = new HBox(768);
        HBox scene8Hbox2 = new HBox(16);

        scene8Hbox.setMinSize(xAkse, 64);
        scene8Hbox2.setMinSize(xAkse, 448);

        Button scene8tilbageKnap = new Button("Tilbage");
        Button scene8logUdKnap = new Button("Log Ud");

        scene8tilbageKnap.setPrefSize(96, 32);
        scene8Hbox.setMargin(scene8tilbageKnap, new Insets(16, 0, 0, 0));
        scene8logUdKnap.setPrefSize(96, 32);
        scene8Hbox.setMargin(scene8logUdKnap, new Insets(16, 0, 0, 0));

        ComboBox scene8LoentrinCB = new ComboBox();
        scene8LoentrinCB.getItems().addAll("Løntrin1", "Test2", "Test 3");

        TextField scene8VaerdiTF = new TextField();
        scene8VaerdiTF.setPromptText("Indtast v\u00E6rdi");
        TextField scene8NavnTF = new TextField();
        scene8NavnTF.setPromptText("Indtast identifikationsnavn");

        Button scene8OpretKnap = new Button("Opret L\u00F8ntrin");

        scene8LoentrinCB.setPrefSize(192, 32);
        scene8VaerdiTF.setPrefSize(192, 32);
        scene8NavnTF.setPrefSize(192, 32);
        scene8OpretKnap.setPrefSize(128, 32);

        scene8Hbox2.setMargin(scene8LoentrinCB, new Insets(64, 0, 0, 0));
        scene8Hbox2.setMargin(scene8VaerdiTF, new Insets(64, 0, 0, 0));
        scene8Hbox2.setMargin(scene8NavnTF, new Insets(64, 0, 0, 0));
        scene8Hbox2.setMargin(scene8OpretKnap, new Insets(64, 0, 0, 0));

        scene8Hbox.getChildren().addAll(scene8tilbageKnap, scene8logUdKnap);
        scene8Hbox2.getChildren().addAll(scene8LoentrinCB, scene8VaerdiTF, scene8NavnTF, scene8OpretKnap);

        //layout8.setGridLinesVisible(true);
        layout8.setMinSize(xAkse, yAkse);
        layout8.setPrefSize(xAkse, yAkse);
        layout8.setAlignment(Pos.CENTER);
        layout8.add(scene8Hbox, 0, 0);
        layout8.add(scene8Hbox2, 0, 1);
        scene8Hbox.setAlignment(Pos.TOP_CENTER);
        scene8Hbox2.setAlignment(Pos.TOP_CENTER);

        scene8tilbageKnap.setOnAction((event) -> {
            primaryStage.setScene(scene2);
            primaryStage.show();

            if(scene8LoentrinCB.getValue() != null) {
                if (!scene8VaerdiTF.getText().isEmpty() && scene8VaerdiTF.getText().length() < 5 && Pattern.matches("[0-9]+", scene8VaerdiTF.getText()))  {
                    if (!scene8NavnTF.getText().isEmpty() && scene8NavnTF.getText().length() < 21 && Pattern.matches("[\306\330\305\346\370\345\040a-zA-Z0-9]+", scene8NavnTF.getText())) {

                        System.out.println("Tillykke, alle felter er godkendt til oprettelse af løntrin!");
                        // Opret løntrin - det vil sige foretag et SQL statement der indsætter de forskellige felter direkte ind i databasen

                    } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Identifikationsnavn til løntrin indtastet forkert. Feltet må kun indeholde bogstaver, tal og mellemrum, og være maksimalt 20 karakterer lang."); }
                } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Værdien til løntrin indtastet forkert. Feltet må kun indeholde tal, og være maksimalt 4 cifre."); }
            } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Løntype er ikke valgt i drop-down menuen."); }
        });

        /*
        scene8logUdKnap.setOnAction((event) -> {
            // Kald en logud funktion her.
        });
        */

        // SLUT l�ntrinoprettelseGUI (scene8)

        // START l�ntrinredigeringGUI (scene9)

        HBox scene9Hbox = new HBox(768);
        HBox scene9Hbox2 = new HBox(16);
        HBox scene9Hbox3 = new HBox(16);

        scene9Hbox.setMinSize(xAkse, 64);
        scene9Hbox2.setMinSize(xAkse, 128);
        scene9Hbox3.setMinSize(xAkse, 320);

        Button scene9tilbageKnap = new Button("Tilbage");
        Button scene9logUdKnap = new Button("Log Ud");

        scene9tilbageKnap.setPrefSize(96, 32);
        scene9Hbox.setMargin(scene9tilbageKnap, new Insets(16, 0, 0, 0));
        scene9logUdKnap.setPrefSize(96, 32);
        scene9Hbox.setMargin(scene9logUdKnap, new Insets(16, 0, 0, 0));

        ComboBox scene9LoentrinCB = new ComboBox();

        TextField scene9VaerdiTF = new TextField();
        scene9VaerdiTF.setPromptText("Indtast v\u00E6rdi");
        TextField scene9NavnTF = new TextField();
        scene9NavnTF.setPromptText("Indtast identifikationsnavn");

        Button scene9RedigerKnap = new Button("Rediger L\u00F8ntrin");
        Button scene9SletKnap = new Button("Slet L\u00F8ntrin");
        Button scene9GodkendKnap = new Button("Godkend Redigering");

        scene9LoentrinCB.setPrefSize(192, 32);
        scene9VaerdiTF.setPrefSize(192, 32);
        scene9NavnTF.setPrefSize(192, 32);
        scene9RedigerKnap.setPrefSize(128, 32);
        scene9SletKnap.setPrefSize(128, 32);
        scene9GodkendKnap.setPrefSize(192, 32);

        scene9Hbox2.setMargin(scene9LoentrinCB, new Insets(64, 0, 0, 0));
        scene9Hbox2.setMargin(scene9RedigerKnap, new Insets(64, 0, 0, 0));
        scene9Hbox2.setMargin(scene9SletKnap, new Insets(64, 0, 0, 0));

        scene9Hbox.getChildren().addAll(scene9tilbageKnap, scene9logUdKnap);
        scene9Hbox2.getChildren().addAll(scene9LoentrinCB, scene9RedigerKnap, scene9SletKnap);
        scene9Hbox3.getChildren().addAll(scene9VaerdiTF, scene9NavnTF, scene9GodkendKnap);


        //layout9.setGridLinesVisible(true);
        layout9.setMinSize(xAkse, yAkse);
        layout9.setPrefSize(xAkse, yAkse);
        layout9.setAlignment(Pos.CENTER);
        layout9.add(scene9Hbox, 0, 0);
        layout9.add(scene9Hbox2, 0, 1);
        layout9.add(scene9Hbox3, 0, 2);
        scene9Hbox.setAlignment(Pos.TOP_CENTER);
        scene9Hbox2.setAlignment(Pos.TOP_CENTER);
        scene9Hbox3.setAlignment(Pos.TOP_CENTER);

        scene9tilbageKnap.setOnAction((event) -> {
            primaryStage.setScene(scene2);
            primaryStage.show();

            if (!scene9VaerdiTF.getText().isEmpty() && scene9VaerdiTF.getText().length() < 5 && Pattern.matches("[0-9]+", scene9VaerdiTF.getText()))  {
                if (!scene9NavnTF.getText().isEmpty() && scene9NavnTF.getText().length() < 21 && Pattern.matches("[\306\330\305\346\370\345\040a-zA-Z0-9]+", scene9NavnTF.getText())) {

                    System.out.println("Tillykke, alle felter er godkendt til redigering af løntrin!");
                    // Opret løntrin - det vil sige foretag et SQL statement der indsætter de forskellige felter direkte ind i databasen

                } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Identifikationsnavn til løntrin indtastet forkert. Feltet må kun indeholde bogstaver, tal og mellemrum, og være maksimalt 20 karakterer lang."); }
            } else { FejlMeddelelse.visFejlMeddelelse("Fejl: Værdien til løntrin indtastet forkert. Feltet må kun indeholde tal, og være maksimalt 4 cifre."); }
        });

        /*
        scene9logUdKnap.setOnAction((event) -> {
            // Kald en logud funktion her.
        });
        */
        
        // SLUT løntrinredigeringGUI (scene9)

        loginKnap.setOnAction((event) -> {
            Login login = new Login();
            if(login.validerLogin(loginNavnFelt.getText(), loginPasswordFelt.getText()) == 1){
                primaryStage.setScene(scene2);
                primaryStage.show();
            }
            else if(login.validerLogin(loginNavnFelt.getText(), loginPasswordFelt.getText()) == 2){
                opretMedarbejderKnap.setDisable(true);
                redigerMedarbejderKnap.setDisable(true);
                opretLoentrinKnap.setDisable(true);
                redigerLoentrinKnap.setDisable(true);
                primaryStage.setScene(scene2);
                primaryStage.show();
            }
        });


            primaryStage.setScene(scene1);
            primaryStage.show();


        }
    /*
    public void logUd()
    {
        primaryStage.setScene(scene1);
        primaryStage.show();
        loginNavnFelt.clear();
        loginPasswordFelt.clear();
        opretMedarbejderKnap.setDisable(false);
        redigerMedarbejderKnap.setDisable(false);
        opretLoentrinKnap.setDisable(false);
        redigerLoentrinKnap.setDisable(false);
    }
    */
    }
