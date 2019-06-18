import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.util.List;

public class MenuController {


    public MenuBar menuBar;
    public Button addFileButton;
    public Button removeFileButton;
    public Button zipButton;
    public GridPane windowContent;
    public Menu fileMenu;
    public ListView<String> listView;
    private StageStyle root;


    public void handleKeyInput(MouseEvent mouseEvent) {

    }

    public void openFileChooser(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Add files to zip");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("All Files", "*.*"),
                new ExtensionFilter("Text files", "*.txt"),
                new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif", "*.bmp"),
                new ExtensionFilter("Audio Files", "*.mp3", "*.flac", "*.wav", "aac"));

        List<File> selectedFile = fileChooser.showOpenMultipleDialog(new Stage());

    }


    public void zipSelectedFile(ActionEvent actionEvent) {
    }

    public void actionOnMenuBarFile(ActionEvent event) {

    }

}

