package filehandlers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import userinterface.controllers.GameGrid;
import core.CellType;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import userinterface.dialogwindows.ErrorWindow;
import userinterface.dialogwindows.PopUpWindow;

public class OpenFileController implements FileController {

    private Image image;
    private FileChooser fileChooser;
    private PixelReader reader;
    private File openedFile;

    public OpenFileController(GameGrid grid, Stage stage) {
        createFileChooser(stage);
        try {
            reader = image.getPixelReader();
            if (loadToGrid(grid)) {
                PopUpWindow errorWindow = new ErrorWindow("Invalid generation " + openedFile.getName() + ".\nThere are pixels with unsupported colors\nin the picture.");
                errorWindow.display();
            }
        } catch (NullPointerException e) {
            System.out.println("File was not chosen.");
            reader = null;
        }
    }

    @Override
    public void createFileChooser(Stage stage) {
        fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PNG files", "*.png"),
                new FileChooser.ExtensionFilter("BMP files", "*.bmp"));
        fileChooser.setInitialDirectory(new File(System.getProperty("user.dir")));
        fileChooser.setTitle("Load generation");
        fileChooser.setInitialFileName("generation");
        openedFile = fileChooser.showOpenDialog(stage);
        if (openedFile != null) {
            try {
                BufferedImage bImage = ImageIO.read(openedFile);
                image = SwingFXUtils.toFXImage(bImage, null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private boolean loadToGrid(GameGrid grid) {
        boolean wrongColorAppeared = false;
        for (int x = 0; x < grid.getXTiles() && x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight() && y < grid.getYTiles(); y++) {
                Color color = reader.getColor(x, y);
                if (color.equals(Color.BLACK)) {
                    grid.changeState(x, y, CellType.EMPTY);
                } else if (color.equals(Color.YELLOW)) {
                    grid.changeState(x, y, CellType.CONDUCTOR);
                } else if (color.equals(Color.BLUE)) {
                    grid.changeState(x, y, CellType.HEAD);
                } else if (color.equals(Color.RED)) {
                    grid.changeState(x, y, CellType.TAIL);
                } else {
                    grid.changeState(x, y, CellType.EMPTY);
                    wrongColorAppeared = true;
                }
            }
        }
        return wrongColorAppeared;
    }
}
