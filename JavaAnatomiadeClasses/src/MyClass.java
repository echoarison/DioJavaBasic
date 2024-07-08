public class MyClass {
    
    public static void main(String[] args){
        
        System.out.println("Anatomia De Class");

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
