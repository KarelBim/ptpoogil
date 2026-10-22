module com.example.uloha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uloha to javafx.fxml;
    exports com.example.uloha;
}