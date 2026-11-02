package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Model;

public class Controller {

    @FXML
    private TextField txtBerat;

    @FXML
    private TextField txtTinggi;

    @FXML
    private Label lblHasil;

    @FXML
    private Label lblKategori;

    private Model model = new Model();

    @FXML
    private void handleHitung() {
        try {
            double berat = Double.parseDouble(txtBerat.getText());
            double tinggi = Double.parseDouble(txtTinggi.getText());

            double bmi = model.hitungBMI(berat, tinggi);
            String kategori = model.getKategori(bmi);

            lblHasil.setText(String.format("HASIL BMI : %.2f", bmi));
            lblKategori.setText("KATEGORI : " + kategori);
        } catch (NumberFormatException e) {
            lblHasil.setText("HASIL BMI : Input tidak valid!");
            lblKategori.setText("KATEGORI : Masukkan angka saja");
        }
    }
}