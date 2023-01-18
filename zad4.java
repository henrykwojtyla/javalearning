public class zad4 {
    private char[][] tabela = new char[8][8];

    public void setTabela(char[][] tabela) {
        this.tabela = tabela;
    }

    public static void main(String[] args) {

        char[][] tabelaszachow = {
                {'w', 0, 'k', 0, 0, 0, 0, 'w'},
                {'p', 0, 0, 'k', 'g', 0, 'p', 0},
                {'w', 0, 'k', 0, 0, 0, 0, 'w'},
                {'p', 0, 0, 'k', 'g', 0, 'p', 0},
                {'w', 0, 'k', 0, 0, 0, 0, 'w'},
                {'p', 0, 0, 'k', 'g', 0, 'p', 0},
                {'w', 0, 'k', 0, 0, 0, 0, 'w'},
                {'p', 0, 0, 'k', 'g', 0, 'p', 0}


        };
        zad4 deepblue = new zad4();

        deepblue.tabela =tabelaszachow;

        for (int i = 0; i < deepblue.tabela.length ; i++) {
            for (int j = 0; j < deepblue.tabela.length; j++) {
                System.out.print(deepblue.tabela[i][j] + " ")  ;
            }
            System.out.println("");

        }
    }


}
