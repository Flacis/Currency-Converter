package com.example.currencyconverter;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button convertCurrent;
    @FXML
    private TextField enterQuanity;
    @FXML
    private TextField resultCurrency;

    @FXML
    private ComboBox firstCurrency;

    @FXML
    private ComboBox lastCurrency;

    @FXML
    void currencyValue(ActionEvent event) {

    }

    @FXML
    void initialize() {
        ObservableList<String> firstCurrencyList = FXCollections.observableArrayList("RUB", "USD");
        firstCurrency.setItems(firstCurrencyList);
        ObservableList<String> lastCurrencyList = FXCollections.observableArrayList("RUB", "USD");
        lastCurrency.setItems(lastCurrencyList);
        convertCurrent.setOnAction(actionEvent -> {
            if (firstCurrency.getSelectionModel().getSelectedItem().equals("RUB") && !lastCurrency.getSelectionModel().isEmpty() && !lastCurrency.getSelectionModel().getSelectedItem().equals("RUB")) {
                String rub = enterQuanity.getText();
                double RUBvs = Double.parseDouble(rub);
                resultCurrency.setText(String.valueOf(new RUB().RUB(RUBvs) + " USD"));
            } else if (firstCurrency.getSelectionModel().getSelectedItem().equals("USD") && !lastCurrency.getSelectionModel().isEmpty() && !lastCurrency.getSelectionModel().getSelectedItem().equals("USD")) {
                String usd = enterQuanity.getText();
                double USDvs = Double.parseDouble(usd);
                resultCurrency.setText(String.valueOf(new USD().USD(USDvs) + " RUB"));
            } else {
                resultCurrency.setText("Nope");
            }
        });
    }
}

