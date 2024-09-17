module com.example.projetmobile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetmobile to javafx.fxml;
    exports com.example.projetmobile;
}