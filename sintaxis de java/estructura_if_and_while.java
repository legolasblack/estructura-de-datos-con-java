import javax.swing.JOptionPane;

public class estructura_if_and_while {
    /*
     * Para ejemplificar el uso de if y while se procedera a hacer un inicio de
     * sesion simulado
     * el cual tendra un usuario y contraseña que a final nos dara entrada o salida
     * al sistema por medio
     * de un mensaje en consola.
     */
    /*
     * public static void main(String[] args) {
     * String usuario="legolas";
     * String pass= "lothbrok";
     * int bandera_intentos=0;
     * final int intentos=3;
     * String entrada_usuario, entrada_pass;
     * 
     * while(bandera_intentos<intentos){
     * entrada_usuario=JOptionPane.
     * showInputDialog("Introduce tu Usuario, porfavor: ");
     * if(entrada_usuario.equals(usuario)){
     * entrada_pass=JOptionPane.showInputDialog("Introduce tu contraseña, porfavor"
     * );
     * if(entrada_pass.equals(pass)){
     * System.out.println("Felicidades ya hiciste login");
     * bandera_intentos=4;
     * }
     * else{
     * System.out.println("Tu contraseña es incorrecta intentalo de nuevo");
     * bandera_intentos++;
     * }
     * }
     * else{
     * 
     * System.out.println("Tu contraseña es incorrecta intentalo de nuevo");
     * bandera_intentos++;
     * 
     * }
     * if(bandera_intentos==3)
     * System.out.
     * println("lo siento has superado el numero de intentos posible la aplicacion se a bloqueado goodbye"
     * );
     * }
     * }
     */
    public static void main(String[] args) {
        String usuario = "legolas";
        String pass = "lothbrok";
        int bandera_intentos = 0;
        final int INTENTOS = 3;
        String entrada_usuario, entrada_pass;

        while (bandera_intentos < INTENTOS) {
            // aqui hacemos peticiones de prte del usurio
            entrada_usuario = JOptionPane.showInputDialog("Ingresa tu usuario:");
            entrada_pass = JOptionPane.showInputDialog("Ingresa tu contraseña");
            // procedemos a hacer las comparaciones con las credenciales
            if (usuario.equals(entrada_usuario)) {
                if (pass.equals(entrada_pass)) {
                    System.out.println("felicidades has iniciado sesion");
                    bandera_intentos = 4;
                } else {
                    System.out.println("tu password o contraseña son incorrectos");
                    bandera_intentos++;
                }
            } else {
                System.out.println("tu password o contraseña son incorrectos");
                bandera_intentos++;
            }
            if (bandera_intentos == 3) {
                System.out.println("Maximo de intentos permitidos la aplicacion se bloquera, goodbye");
            }
        }

    }
}
