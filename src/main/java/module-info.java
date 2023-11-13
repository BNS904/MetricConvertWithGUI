module com.example.metricconvertwithgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.metricconvertwithgui to javafx.fxml;
    exports com.example.metricconvertwithgui;
}