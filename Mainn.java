public class Mainn {
    public static void main(String[] args) {
        Juego objeto1 = new Juego("Fornite", 2017, 4, 100);
        Juego objeto2 = new Juego("FREE FIRE", 2017, 12, 100);
        objeto1.Iniciar();
        objeto2.ConteoJugadores();
        int matriz[][], nFilas, Ncolumnas;

        nFilas = objeto1.NumJugadores;
        Ncolumnas = objeto2.NumJugadores;
        matriz = new int[nFilas][Ncolumnas];

        try {
            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < Ncolumnas; j++) {
                    System.out.print("Matriz [" + i + "][" + j + "]:");
                }
                System.out.println("");
            }

            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < Ncolumnas; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }
}

