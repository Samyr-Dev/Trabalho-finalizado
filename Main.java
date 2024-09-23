
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int acertos = 0;
        int erros = 0;
        int totalq = 15;

        //Cabeçalho
        System.out.println("-----------------------------------------");

        //Faculdade
        System.out.println("Unifan - Centro Universitário Alfredo Nasser.");

        //Nome_aluno =
        System.out.println("Aluno: Samyr Silva Tertuliano Deusdará.");

        //Nome_professor
        System.out.println("Professor: Brenno Pimenta.");
        System.out.println("-----------------------------------------");
        //Boas_vindas
        System.out.println("");
        System.out.println("Olá, Seja bem-vindo(a). Você irá responder 15 questões de múltipla escolha acerca da arte. Essas questões abrangem diferentes formas de arte, desde literatura clássica até cinema e escultura. Diverta-se ;)");

//
        Questao q1 = new Questao();
        q1.pergunta = "1- Qual é o nome da famosa pintura de Leonardo da Vinci que retrata uma mulher com um sorriso enigmático?";
        q1.opcaoA = "A) A Noite Estrelada";
        q1.opcaoB = "B) A Última Ceia";
        q1.opcaoC = "C) Mona Lisa";
        q1.opcaoD = "D) O Nascimento de Vênus";
        q1.opcaoE = "E) O Grito";
        q1.correta = "C";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();

        if (q1.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }


        //
        Questao q2 = new Questao();
        q2.pergunta = "2-Quem dirigiu o filme 'O Poderoso Chefão', considerado um clássico do cinema?";
        q2.opcaoA = "A) Martin Scorsese";
        q2.opcaoB = "B) Steven Spielberg";
        q2.opcaoC = "C) Stanley Kubrick";
        q2.opcaoD = "D) Quentin Tarantino";
        q2.opcaoE = "E) Francis Ford Coppola";
        q2.correta = "E";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();

        if (q2.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }


        //
        Questao q3 = new Questao();
        q3.pergunta = "3- Qual o nome do personagem de Robert Pattinson na saga 'Crepúsculo'?";
        q3.opcaoA = "A) Bela Swan";
        q3.opcaoB = "B) Carlisle Cullen";
        q3.opcaoC = "C) Eduard Swan";
        q3.opcaoD = "D) Edward Cullen";
        q3.opcaoE = "E) Jacob Black";
        q3.correta = "D";

        q3.escrevaQuestao();
        resposta = q3.leiaResposta();

        if (q3.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//

        Questao q4 = new Questao();
        q4.pergunta = "4- Na saga 'Harry Potter' houve uma perca de uma gama de personagens na adaptação do livro para o filme. Qual o nome do Elfo Doméstico que não aparece nos filmes, tendo participação nos livros?";
        q4.opcaoA = "A) Monstro";
        q4.opcaoB = "B) Dobby";
        q4.opcaoC = "C) Winky";
        q4.opcaoD = "D) Edwiges";
        q4.opcaoE = "E) Fawkes";
        q4.correta = "C";

        q4.escrevaQuestao();
        resposta = q4.leiaResposta();

        if (q4.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//
        Questao q5 = new Questao();
        q5.pergunta = "5- Qual nome Malorie coloca em sua filha na renomada saga 'Bird Box'?";
        q5.opcaoA = "A) Olympia";
        q5.opcaoB = "B) Garota";
        q5.opcaoC = "C) Malorie";
        q5.opcaoD = "D) Samantha";
        q5.opcaoE = "E) Lydia";
        q5.correta = "A";

        q5.escrevaQuestao();
        resposta = q5.leiaResposta();

        if (q5.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//
        Questao q6 = new Questao();
        q6.pergunta = "6- Qual artista é conhecido por pintar 'A Noite Estrelada'?";
        q6.opcaoA = "A) Claude Monet";
        q6.opcaoB = "B) Pablo Picasso";
        q6.opcaoC = "C) Vincent van Gogh";
        q6.opcaoD = "D) Salvador Dalí";
        q6.opcaoE = "E) Paul Cézanne";
        q6.correta = "C";

        q6.escrevaQuestao();
        resposta = q6.leiaResposta();

        if (q6.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//
        //
        Questao q7 = new Questao();
        q7.pergunta = "7- Quem escreveu o romance 'Dom Quixote', uma das obras mais influentes da literatura mundial?";
        q7.opcaoA = "A) Gabriel García Márquez";
        q7.opcaoB = "B) William Shakespeare";
        q7.opcaoC = "C) Miguel de Cervantes";
        q7.opcaoD = "D)  Charles Dickens";
        q7.opcaoE = "E) Fiódor Dostoiévski";
        q7.correta = "C";

        q7.escrevaQuestao();
        resposta = q7.leiaResposta();

        if (q7.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//

        Questao q8 = new Questao();
        q8.pergunta = "8- Quem escreveu o livro '1984'?";
        q8.opcaoA = "A) Aldous Huxley";
        q8.opcaoB = "B) George Orwell";
        q8.opcaoC = "C) Franz Kafka";
        q8.opcaoD = "D) J.R.R. Tolkien";
        q8.opcaoE = "E) Ernest Hemingway";
        q8.correta = "B";

        q8.escrevaQuestao();
        resposta = q8.leiaResposta();

        if (q8.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//
        Questao q9 = new Questao();
        q9.pergunta = "9-  Qual é o nome da famosa escultura de Michelangelo que retrata o herói bíblico com uma funda?";
        q9.opcaoA = "A) Pietà";
        q9.opcaoB = "B) Vênus de Milo";
        q9.opcaoC = "C)  O Pensador";
        q9.opcaoD = "D) David";
        q9.opcaoE = "E) Apolo e Dafne";
        q9.correta = "D";

        q9.escrevaQuestao();
        resposta = q9.leiaResposta();

        if (q9.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//
        Questao q10 = new Questao();
        q10.pergunta = "10- Em que ano foi lançado o filme 'Titanic', dirigido por James Cameron?";
        q10.opcaoA = "A) 1995";
        q10.opcaoB = "B) 1997";
        q10.opcaoC = "C) 1999";
        q10.opcaoD = "D) 2000";
        q10.opcaoE = "E) 1992";
        q10.correta = "B";

        q10.escrevaQuestao();
        resposta = q10.leiaResposta();

        if (q10.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//
        Questao q11 = new Questao();
        q11.pergunta = "11-Quem é o autor da obra 'A Metamorfose', que narra a transformação de Gregor Samsa em um inseto?";
        q11.opcaoA = "A) Albert Camus";
        q11.opcaoB = "B) James Joyce";
        q11.opcaoC = "C) Franz Kafka";
        q11.opcaoD = "D) George Orwell";
        q11.opcaoE = "E) Italo Calvino";
        q11.correta = "C";

        q11.escrevaQuestao();
        resposta = q11.leiaResposta();

        if (q11.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//
        Questao q12 = new Questao();
        q12.pergunta = "12- Quem pintou a obra 'A Última Ceia'?";
        q12.opcaoA = "A) Michelangelo";
        q12.opcaoB = "B) Leonardo da Vinci";
        q12.opcaoC = "C) Rembrandt";
        q12.opcaoD = "D) Pablo Picasso";
        q12.opcaoE = "E) Vincent van Gogh";
        q12.correta = "B";

        q12.escrevaQuestao();
        resposta = q12.leiaResposta();

        if (q12.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

//
        Questao q13 = new Questao();
        q13.pergunta = "13- Qual é o nome da famosa escultura feita por Auguste Rodin, que retrata uma figura humana pensativa?";
        q13.opcaoA = "A) O Beijo";
        q13.opcaoB = "B) O Discóbolo";
        q13.opcaoC = "C) A Vitória de Samotrácia";
        q13.opcaoD = "D) O Pensador";
        q13.opcaoE = "E) A Bailarina";
        q13.correta = "D";

        q13.escrevaQuestao();
        resposta = q13.leiaResposta();

        if (q13.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//
        //
        Questao q14 = new Questao();
        q14.pergunta = "14- Quem escreveu a série de livros 'O Senhor dos Anéis'?";
        q14.opcaoA = "A) J.K. Rowling";
        q14.opcaoB = "B) C.S. Lewis";
        q14.opcaoC = "C) George R.R. Martin";
        q14.opcaoD = "D) J.R.R. Tolkien";
        q14.opcaoE = "E) Philip Pullman";
        q14.correta = "D";

        q14.escrevaQuestao();
        resposta = q14.leiaResposta();

        if (q14.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//
        Questao q15 = new Questao();
        q15.pergunta = "15- Qual diretor de cinema é conhecido pelos filmes 'Pulp Fiction', 'Kill Bill' e 'Bastardos Inglórios'?";
        q15.opcaoA = "A) Christopher Nolan";
        q15.opcaoB = "B) Quentin Tarantino";
        q15.opcaoC = "C) Alfred Hitchcock";
        q15.opcaoD = "D) Wes Anderson";
        q15.opcaoE = "E) Stanley Kubrick";
        q15.correta = "B";

        q15.escrevaQuestao();
        resposta = q15.leiaResposta();

        if (q15.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
//
        double totalp = (double) acertos/(double) totalq * 100.0;
        System.out.println("----------------------------------------------------");
        System.out.println("        Parabéns você respondeu todas as perguntas!       ");
        System.out.println("Total de acertos:" + acertos);
        System.out.println("Total de erros:" + erros);
        System.out.println("Total de acertos em porcentagem:" + totalp);
        System.out.println("------------------------------------------------------");





    }
}