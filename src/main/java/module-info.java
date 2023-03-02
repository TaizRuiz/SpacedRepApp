module com.mycompany.flashcardsapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.flashcardsapp to javafx.fxml;
    exports com.mycompany.flashcardsapp;
}
