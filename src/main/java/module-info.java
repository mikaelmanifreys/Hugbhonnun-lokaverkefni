module com.example.audioplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.audioplayer to javafx.fxml, org.junit.platform.commons;
    exports com.example.audioplayer;
}
