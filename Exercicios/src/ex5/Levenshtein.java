package ex5;

/**
 *
 * @author Renata
 */
public class Levenshtein {

    /*ALGORITMO RETIRADO DA WIKIPEDIA:
    https://pt.wikipedia.org/wiki/Dist%C3%A2ncia_Levenshtein
    
    Função LevenshteinDistance(Caracter : str1[1..lenStr1], Caracter : str2[1..lenStr2]) : INTEIRO
        Início
        // tab é uma tabela com lenStr1+1 linhas e lenStr2+1 colunas
        Inteiro:  tab[0..lenStr1, 0..lenStr2]
        // X e Y são usados para iterar str1 e str2
        Inteiro:  X, Y, cost
 
        Para X de 0 até lenStr1
            tab[X, 0] ← X
        Para Y de 0 até lenStr2
            tab[0, Y] ← Y
 
        Para X de 1 até lenStr1
            Para Y de 1 até lenStr2
                Se str1[X] = str2[Y] Então cost ← 0
                Se-Não cost ← 2 // Custo da substituição deve ser 2, deleção e inserção
                tab[X, Y] := menor(
                                tab[X-1, Y  ] + 1,     // Deletar
                                tab[X  , Y-1] + 1,     // Inserir
                                tab[X-1, Y-1] + cost   // Substituir
                            )
        LevenshteinDistance ← tab[lenStr1, lenStr2]
    Fim
     */
}
