//instancia = objeto
//personagem = objeto
//variaveis de referência para manipular o objeto

public class Personagem {

//variaveis de instancia
    String nome;
    private int energia = 10;
    private int fome = 10;
    private int sono = 0;

    // método tem: tipo de retorno
    //nome
    //lista de parametros
    //corpo:
    void cacar() {
        if (energia >= 2) {
            System.out.println(nome + "Caçando");
            energia -= 2;

        } else {
            System.out.println(nome + "sem energia para caçar");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    void comer() {
        if (fome >= 1) {
            System.out.println(nome + "Comendo");
            energia = Math.min(energia + 1, 10);
        } else {
            System.out.println(nome + " sem fome");
            fome -= 1;
        }
    }

    void dormir() {
        if (sono >= 1) {
            System.out.println(nome + "Dormindo");
            sono--;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
    }
}

// operador de alto referencia This
// This serve para "desenpatar" quando tem o mesmo nome
//This faz referencia ao objeto
