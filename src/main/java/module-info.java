module com.example.audioplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires junit;
    requires org.junit.jupiter.api;


    opens com.example.audioplayer to javafx.fxml;
    exports com.example.audioplayer;
}
