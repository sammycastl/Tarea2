import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PaintController {

    @FXML
    private Canvas canvas;

    @FXML
    private Button eraseButton;

    private boolean erasing = false;

    @FXML
    private void handleEraseAction(ActionEvent event) {
        erasing = !erasing; // Alternar el modo de borrado

        if (erasing) {
            eraseButton.setText("Pintar");
        } else {
            eraseButton.setText("Borrar");
        }
    }

    @FXML
    private void handleCanvasDrag(MouseEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double x = event.getX();
        double y = event.getY();

        if (erasing) {
            gc.setFill(Color.WHITE); // Asumiendo que el color de fondo es blanco
            gc.fillRect(x, y, 10, 10); // Dibuja un pequeño rectángulo de 10x10
        } else {
            // Aquí iría tu lógica actual para pintar
        }
    }

    // ... Resto de tu código ...

}
