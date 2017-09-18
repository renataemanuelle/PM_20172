package ex3;

/**
 *
 * @author Renata
 */
public class AvaliaAlunos {
    
    public enum Resultado {
        APROVADO,
        PROVAFINAL,
        REPROVADO;
    }
    
    /**
     * CALCULA MÉDIA DE QUATRO NOTAS DE UM ALUNO
     * @param nota1 PRIMEIRA NOTA DO ALUNO
     * @param nota2 SEGUNDA NOTA DO ALUNO
     * @param nota3 TERCEIRA NOTA DO ALUNO
     * @param nota4 QUARTA NOTA DO ALUNO
     * @return MEDIA DAS NOTAS
     */
    public double calculaMedia(double nota1, double nota2, double nota3, double nota4){
        return ((nota1 + nota2 + nota3 + nota4) / 4);
    }

    /**
     * VERIFICA A SITUAÇÃO DO ALUNO COM BASE EM SUAS 4 NOTAS UTILIZANDO
     * MEDIA PARA APROVACAO: 7.0 E MEDIA MINIMA PARA PROVA FINAL: 4.0
     * @param nota1 PRIMEIRA NOTA DO ALUNO
     * @param nota2 SEGUNDA NOTA DO ALUNO
     * @param nota3 TERCEIRA NOTA DO ALUNO
     * @param nota4 QUARTA NOTA DO ALUNO
     * @return 
     */
    public Resultado verificaResultado(double nota1, double nota2, double nota3, double nota4){
        if (calculaMedia(nota1, nota2, nota3, nota4) >= 7.0) return Resultado.APROVADO;
        else if (calculaMedia(nota1, nota2, nota3, nota4) >= 4.0) return Resultado.PROVAFINAL;
        else return Resultado.REPROVADO;
    }
    /**
     * VERIFICA A SITUAÇÃO DO ALUNO COM BASE EM SUAS 4 NOTAS E A MEDIA INFORMADA
     * @param nota1 PRIMEIRA NOTA DO ALUNO
     * @param nota2 SEGUNDA NOTA DO ALUNO
     * @param nota3 TERCEIRA NOTA DO ALUNO
     * @param nota4 QUARTA NOTA DO ALUNO
     * @param mediaAprovacao MEDIA MINIMA PARA SER APROVADO
     * @param minimoProvaFinal MEDIA MINIMA PARA PODER FAZER PROVA FINAL
     * @return RESULTADO  SE ALUNO APROVADO, REPROVADO OU EM PROVA FINAL
     */
    public Resultado verificaResultado(double nota1, double nota2, double nota3, double nota4, double mediaAprovacao, double minimoProvaFinal){
        if (calculaMedia(nota1, nota2, nota3, nota4) >= mediaAprovacao) return Resultado.APROVADO;
        else if (calculaMedia(nota1, nota2, nota3, nota4) >= minimoProvaFinal) return Resultado.PROVAFINAL;
        else return Resultado.REPROVADO;
    }
    
}
