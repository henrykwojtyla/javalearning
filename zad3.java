import java.util.Arrays;

public class zad3 {
    private int[][] tabela = new int[9][9];

    public void setTabela(int[][] tabela) {
        this.tabela = tabela;

    }


    public static void main(String[] args) {

        int[][] tabelasudoku = {
                {2, 0, 0, 6, 0, 7, 5, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 9, 6},
                {6, 0, 7, 0, 0, 1, 3, 0, 0},
                {0, 5, 0, 7, 3, 2, 0, 0, 0},
                {0, 7, 0, 0, 0, 0, 0, 2, 0},
                {0, 0, 0, 1, 8, 9, 0, 7, 0},
                {0, 0, 3, 5, 0, 0, 6, 0, 4},
                {8, 4, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 5, 2, 0, 6, 0, 0, 8}
        };
        zad3 kurrent = new zad3();

        kurrent.tabela =tabelasudoku;

        for (int i = 0; i < kurrent.tabela.length ; i++) {
            for (int j = 0; j < kurrent.tabela.length; j++) {
                System.out.print(kurrent.tabela[i][j] + " ")  ;
            }
            System.out.println("");

        }


    }
}


