import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Validacion de contraseña(Máximo 3 intentos)
        String clavenigresada="";
        String clavecorrecta="java123";
        int cont=3;

        Scanner sc= new Scanner(System.in);
        //ingresas la clave -> validar clave -> correcta-> imprime acceso concedido
        //No es correcta-> Incrrecto, intententos restantes: valor de intentos:
        //se acabaron los intentos: imprime cuenta bloqueada.

        do {
            System.out.println("Ingrese la clave");
            clavenigresada=sc.nextLine();

            if (clavenigresada.equals(clavecorrecta)) {
                System.out.println("ACCESO CONCEDIDO");
                break;
            } else {
                cont-=1;
                System.out.println("Incorrecto, intentos restantes: "+ cont );
                if (cont<=0){
                    System.out.println("CUENTA BLOQUEADA");
                }
            }
        } while (cont>0 );
    }
}
