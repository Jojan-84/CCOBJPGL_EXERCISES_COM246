package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class loginController {

    @FXML
    private void switchToView() throws IOException {
        App.setRoot("myview");
    }
}
