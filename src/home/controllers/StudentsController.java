package home.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import home.model.StudentsModel;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentsController implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public StudentsController()
    {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        studentId.setCellValueFactory(new PropertyValueFactory<>("StudentId"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        tbData.setItems(studentsModels);
    }

    private ObservableList<StudentsModel> studentsModels = FXCollections.observableArrayList(
            new StudentsModel(1,"Asaf", "Solomon"),
            new StudentsModel(2,"Sharon", "Yaffe"),
            new StudentsModel(3,"Ella", "Moneta"),
            new StudentsModel(4,"Oshri", "Mualem")
    );



}
