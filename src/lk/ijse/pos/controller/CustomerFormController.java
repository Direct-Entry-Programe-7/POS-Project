package lk.ijse.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import lk.ijse.pos.db.DataBase;
import lk.ijse.pos.model.Customer;

public class CustomerFormController {
    public AnchorPane contextOfCustomerForm;
    public TextField txtCId;
    public TextField txtCName;
    public TextField txtCAddress;
    public TextField txtCSalary;

    public void backToHome(ActionEvent actionEvent) throws Exception{
        Stage stage = (Stage) contextOfCustomerForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../views/DashBoardForm.fxml"))));
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        Customer customer1 = new Customer(txtCId.getId(),txtCName.getText(),txtCAddress.getText(),Double.parseDouble(txtCSalary.getText()));

        if (DataBase.customerList.add(customer1)){
            new Alert(Alert.AlertType.CONFIRMATION,"Done.", ButtonType.OK).show();
        }
        else {
            new Alert(Alert.AlertType.WARNING,"Try Again!", ButtonType.CLOSE).show();

       }
}}
