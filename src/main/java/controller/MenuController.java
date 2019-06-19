package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MenuController implements Initializable {


    public MenuBar menuBar;
    public Button addFileButton;
    public Button removeFileButton;
    public Button zipButton;
    public GridPane windowContent;
    public Menu fileMenu;
    public ListView<String> listView;
    private StageStyle root;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }


    public void openFileChooser(ActionEvent event) throws Exception {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Add files to zip");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("All Files", "*.*"),
                new ExtensionFilter("Text files", "*.txt"),
                new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif", "*.bmp"),
                new ExtensionFilter("Audio Files", "*.mp3", "*.flac", "*.wav", "aac"));

        List<File> selectedFile = fileChooser.showOpenMultipleDialog(new Stage());
        if (!selectedFile.isEmpty()) {
            for (int i = 0; i < selectedFile.size(); i++) {
                    listView.getItems().add(i, String.valueOf(selectedFile.get(i)));
            }

            //TODO Need to add repeat files validation
            //TODO Implements folder selection
        }
    }

    public void removeSelectedFiles(ActionEvent event) {
        listView.getItems().removeAll(listView.getSelectionModel().getSelectedItems());
    }


    public void zipSelectedFile(ActionEvent event) throws IOException {

//        FileOutputStream fileOutputStream = new FileOutputStream("my_new_zip_file.zip");
//        GZIPOutputStream gzipOutput = new GZIPOutputStream();


        //TODO Implements zip/unzip method
    }


    public void actionOnMenuBarFile(ActionEvent actionEvent) {
    }
}


