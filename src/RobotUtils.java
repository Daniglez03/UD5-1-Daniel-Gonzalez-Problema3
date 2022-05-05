public class RobotUtils {
    private static final String []NOMBRES_ROBOT = {
            "R2D2",
            "Johnny 5",
            "Mazinger Z",
            "C3PO",
            "Wall-E",
            "T1000",
            "Terminator",
            "Hal 9000",
            "K 9",
            "Data",
            "Bender"
    };

    public static final String []NOMBRES_PRODUCTOS = {
            "PS5",
            "Steam Deck",
            "Nintendo Switch",
            "Macbook PRO",
            "Apple Watch",
            "Ipad",
            "Slimbook",
            "Vuforia smartglasses",
            "Google glass",
            "HTC Vibe",
            "Holo Lens"
    };

    public static String generarNombreRobot() {
        return NOMBRES_ROBOT[(int) (Math.random() * NOMBRES_ROBOT.length)];
    }

    public static String generarNombreProducto() {
        return NOMBRES_PRODUCTOS[(int) (Math.random() * NOMBRES_PRODUCTOS.length)];
    }

    public static double generarNumeroAleatorio(int valorMaximo) {
        return Math.random() * valorMaximo;
    }
}
