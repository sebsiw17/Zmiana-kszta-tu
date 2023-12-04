module com.example.przemianatlumaczenie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.przemianatlumaczenie to javafx.fxml;
    exports com.example.przemianatlumaczenie;
}