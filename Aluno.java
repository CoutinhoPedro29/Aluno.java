import java.util.Scanner;
public class Aluno{
  public Aluno(){
      System.out.printf("Criado");
    }
    private String matricula;
    private String nome;
    private String curso;
    Scanner input=new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Nome do Aluno:");
        this.nome=input.next();

        System.out.println("Matricula");
        this.matricula=input.next();
        if(this.curso==("SI") || this.curso==("si")){
            this.curso="Sistemas de informacao";

        }

    
    public void listar(){
      
    }
}}