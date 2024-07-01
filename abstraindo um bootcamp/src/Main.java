import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

		 public static void main(String[] args) throws Exception {
		        Curso curso1 = new Curso();
		        curso1.setTitulo("Curso Java");
		        curso1.setDescricao("Descrição curso Java");
		        curso1.setCargaHoraria(8);
		        
		        Curso curso2 = new Curso();
		        curso2.setTitulo("Curso JS");
		        curso2.setDescricao("Descrição curso JS");
		        curso2.setCargaHoraria(4);

		        Mentoria mentoria = new Mentoria();
		        mentoria.setTitulo("Mentoria de Java");
		        mentoria.setDescricao("Descrição mentoria Java");
		        mentoria.setData(LocalDate.now());

		       // System.out.println(curso1);
		       // System.out.println(curso2);
		       // System.out.println(mentoria); 
		        
		        Bootcamp bootcamp = new Bootcamp();
		        bootcamp.setNome("Bootcamp Java Developer");
		        bootcamp.setDescricao("Descrição Java Developer");
		        bootcamp.getConteudos().add(curso1);
		        bootcamp.getConteudos().add(curso2);
		        bootcamp.getConteudos().add(mentoria);
		        
		        Dev devFred = new Dev();
		        devFred.setNome("Fred");
		        devFred.inscreverBootcamp(bootcamp);
		        System.out.println("Conteúdos inscritos Fred:" + devFred.getConteudosInscritos());
		        devFred.progredir();
		        devFred.progredir();
		        devFred.progredir();
		        System.out.println("-");
		        System.out.println("Conteúdos incritos Fred:"  +  devFred.getConteudosInscritos());
		        System.out.println("Conteúdos conluidos Fred:"  +  devFred.getConteudosConcluidos());
		        System.out.println("XP:"  +  devFred.calcularTotalXp());
		        
		        System.out.println("--------");
		        
		        Dev devEve = new Dev();
		        devEve.setNome("Eve");
		        devEve.inscreverBootcamp(bootcamp);
		        System.out.println("Conteúdos inscritos Eve:" + devEve.getConteudosInscritos());
		        devEve.progredir();
		        devEve.progredir();
		        System.out.println("-");
		        System.out.println("Conteúdos incritos Eve:"  +  devEve.getConteudosInscritos());
		        System.out.println("Conteúdos conluidos Eve:"  +  devEve.getConteudosConcluidos());
		        System.out.println("XP:"  +  devEve.calcularTotalXp());
		        
		        System.out.println("--------");
		        
		        Dev devAna = new Dev();
		        devAna.setNome("Ana");
		        devAna.inscreverBootcamp(bootcamp);
		        System.out.println("Conteúdos inscritos Ana:" + devAna.getConteudosInscritos());
		        devAna.progredir();
		        System.out.println("-");
		        System.out.println("Conteúdos incritos Ana:"  +  devAna.getConteudosInscritos());
		        System.out.println("Conteúdos conluidos Ana:"  +  devAna.getConteudosConcluidos());
		        System.out.println("XP:"  +  devAna.calcularTotalXp());
		        

	}

}
