package subrotina2.pkg7;

/**
 *Sem recursividade.

Um programa com uma subrotina que elimine valores duplicados,
retornando um novo vetor sem repetições.
* 
* 
 */
public class SubRotina27 {

    /**
     * @param args the command line arguments
     */
    static int[] semRepetir(int vetor[]){
        int semRepetido[] = new int[vetor.length];
        boolean jaTem = false, tem0 = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 0) {
                tem0 = true;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    for (int k = 0; k < vetor.length; k++) {
                        if (vetor[j] == semRepetido[k]) {
                            jaTem = true;
                        }
                    }
                    if (!jaTem) {
                        semRepetido[i] = vetor[i];
                    }
                    
                }
                jaTem = false;
            }
        }
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (semRepetido[i]==0) {
                cont++;
            }
        }
        int variavel;
        if (tem0) {
            variavel = vetor.length-cont+1;
        }else{
            variavel = vetor.length-cont; 
        }
        int correto[] = new int[variavel];
        cont=0;
        for (int i = 0; i < vetor.length; i++) {
            if (semRepetido[i]!=0) {
                correto[cont] = semRepetido[i];
                cont++;
            }
        }
        
        
        return correto;
        
    }
    public static void main(String[] args) {
        int vetor[] = {1,2,3,0,2,4,3};
        for (int i = 0; i < semRepetir(vetor).length; i++) {
            System.out.println(semRepetir(vetor)[i]);
        }
    }
    
}
