import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTitulo("Java 1");
        c1.setDescricao("Curso de Java 1");
        c1.setCargaHoraria(8);


        Curso c2 = new Curso();
        c2.setTitulo("POO 1");
        c2.setDescricao("Curso de POO 2");
        c2.setCargaHoraria(9);

        Mentoria m1 = new Mentoria();
        m1.setData(LocalDate.now());
        m1.setTitulo("Carreira");
        m1.setDescricao("Mentoria carreira");

        Mentoria m2 = new Mentoria();
        m2.setData(LocalDate.now());
        m2.setTitulo("Estudos");
        m2.setDescricao("Mentoria estudos");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(m1);
        bootcamp.getConteudos().add(m2);
        bootcamp.setNome("Dev java");
        bootcamp.setDescricao("Descriçao Dev Java");

        Dev d1 = new Dev();
        d1.inscreverBootcamp(bootcamp);
        d1.setNome("Wender");
        System.out.println("Conteudos inscritos" + d1.getConteudosInscritos());
        System.out.println("Conteudos conluidos" + d1.getConteudosConcluidos());
        d1.progredir();
        System.out.println("Conteudos inscritos" + d1.getConteudosInscritos());
        System.out.println("Conteudos conluidos" + d1.getConteudosConcluidos());
        System.out.println("XP " + d1.calcularTotalXp());

        Dev d2 = new Dev();
        d2.inscreverBootcamp(bootcamp);
        d2.setNome("Izabela");
        System.out.println("Conteudos inscritos" + d2.getConteudosInscritos());
        System.out.println("Conteudos conluidos" + d2.getConteudosConcluidos());
        System.out.println("XP " + d2.calcularTotalXp());




    }



}
