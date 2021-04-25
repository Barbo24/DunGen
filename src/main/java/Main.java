import element.entity.Player;
import org.lwjgl.system.CallbackI;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();

        Player player = new Player(300, 300, 0);
        Map map = new Map();
        Camera camera = new Camera(player, map);
        Input input = new Input(player);

        while (window.windowUpdate()) {
            System.out.println(1 / Window.frameTime);

            input.move();
            //camera.debugDrawing();
            camera.castRays();

        }
    }
}