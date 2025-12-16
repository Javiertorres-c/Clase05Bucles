public class arrayforEach {
    public static void main(String[] args) {

        String[] artistas ={"Adele", "Bruno Mars","Faraon love","Artic monkeys"};
        System.out.println("Artistas que empiece con la letra B");

        int indice =0;
        for (String artista: artistas) {

            if (artista.startsWith("B")) {
                System.out.println(artista);
            }

            if (indice == 1) {
                System.out.println("Artista 1: " + artista);
            }
            indice++;
        }
    }
}
