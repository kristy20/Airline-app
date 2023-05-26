package org.reg.controllers;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.reg.model.Flight;

import java.io.IOException;

public class AdministratorPageController {

    private static ObservableList<Flight> flights;
    private String username, personalKey;

    private static Stage stage = new Stage();

    @FXML
    private Button logoutButton;
    @FXML
    private Button addButton;
    @FXML
    private Button editButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Button flightListButton;
    @FXML
    public void handleLogout(javafx.event.ActionEvent login) throws IOException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getClassLoader().getResource("login.fxml"));
        Parent viewLogin = Loader.load();
        Scene LoginScene = new Scene(viewLogin, 650, 450);
        Stage window = (Stage) ((Node) login.getSource()).getScene().getWindow();
        window.setScene(LoginScene);
        window.show();
    }
    @FXML
    public void handleAddFlight(javafx.event.ActionEvent addFlight) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("addFlightPage.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) (addButton.getScene().getWindow());
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    public void handleShowFlights(javafx.event.ActionEvent flightsPageAdministrator) throws IOException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getClassLoader().getResource("viewFlightPageAdministrator.fxml"));
        Parent viewFlights = Loader.load();
        Scene LoginScene = new Scene(viewFlights, 700, 600);
        Stage window = (Stage) ((Node) flightsPageAdministrator.getSource()).getScene().getWindow();
        window.setScene(LoginScene);
        window.show();
    }
    @FXML
    public void handleEdit(){
        try {
            Stage stage = (Stage) editButton.getScene().getWindow();
            Parent viewRegisterRoot = FXMLLoader.load(getClass().getClassLoader().getResource("editFlightPage.fxml"));
            Scene scene = new Scene(viewRegisterRoot, 900, 480);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void handleDeleteFlight(javafx.event.ActionEvent deleteFlightsPage) throws IOException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getClassLoader().getResource("deleteFlightPage.fxml"));
        Parent viewFlights = Loader.load();
        Scene LoginScene = new Scene(viewFlights, 700, 600);
        Stage window = (Stage) ((Node) deleteFlightsPage.getSource()).getScene().getWindow();
        window.setScene(LoginScene);
        window.show();
    }




}
