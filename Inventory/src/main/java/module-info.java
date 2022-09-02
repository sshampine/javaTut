module com.dshampi.inventory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dshampi.inventory to javafx.fxml;
    exports com.dshampi.inventory;
}