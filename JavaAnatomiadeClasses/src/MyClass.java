public class MyClass {
    
    public static void main(String[] args){
        //declarando variavel
        String nomeFirst = "Patric";
        String nomeSecond = "Alisson";


        System.out.println(NomeCompleto(nomeFirst, nomeSecond));

    }

    public static String NomeCompleto(String nome, String segNome){
        //declarando variavel

        /*
         * Poderia ter usado nomr.concat(" ").concat(segNome)
         * concat(" ") method de concatenar
         * 
         */
        String nomeCompleto = nome + " " + segNome;

        return nomeCompleto;

    }

}
