import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // criação objeto curso1 classe Curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        // criação objeto curso2 classe Curso
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        // criação objeto mentoria1 classe mentoria
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        // criação objeto mentoria2 classe mentoria
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria js");
        mentoria2.setDescricao("descrição mentoria js");
        mentoria2.setData(LocalDate.now());

        //imprime dados objetos curso1 e curso2
        System.out.println();
        System.out.println(curso1);
        System.out.println(curso2);

        //imprime dados objetos mentoria1 e mentoria2
        System.out.println();
        System.out.println(mentoria1);
        System.out.println(mentoria2);



    }
}