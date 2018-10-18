package Agenda;
import java.util.*;

public class Agenda {
	List<Contato> contatos = new ArrayList<>();
	
	
	public void adicionar(Contato c){
		contatos.add(c);
	}
	
	public void remover(Contato c){
		contatos.remove(c);
	}
	
	public String buscarporEmail(String e){
		for (Contato c : contatos) {
			if (c.getEmail().equals(e)){
				return c.getEmail();
			}
		}
		return null;
	}
	public String buscarporNome(String n){
		for (Contato c : contatos) {
			if (c.getNome().equals(n)){
				return c.getNome();
			}
		}
		return null;
	}
	
	public void listarContatos(){
		for (int i=0;i<contatos.size();i++){
			System.out.println("Nome: "+contatos.get(i).getNome() + " Email: " + contatos.get(i).getEmail());
		}
	}
	
	public static void main(String[] args) {
		Contato c1 = new Contato("Alex","alex@gmail.com");
		Contato c2 = new Contato("ricardo", "rico@gmail.com");
		Agenda a = new Agenda();
		
		a.adicionar(c1);
		a.adicionar(c2);
		System.out.println("Imprimindo Nome do contato");
		System.out.println("------------");
		System.out.println(a.buscarporNome(c1.getNome()));
		System.out.println("------------");
		System.out.println("Imprimindo Email do contato");
		System.out.println("------------");
		System.out.println(a.buscarporEmail(c2.getEmail()));
		System.out.println("------------");
		System.out.println("Listando Contatos");
		a.listarContatos();
		System.out.println("------------");
		System.out.println("Removendo Contato");
		a.remover(c1);
		System.out.println("------------");
		System.out.println("Buscando após exclusão");
		System.out.println("------------");
		System.out.println(a.buscarporNome(c1.getNome()));
		System.out.println(a.buscarporEmail(c2.getEmail()));
		
		
		
	}

}