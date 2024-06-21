
class Aluno extends Pessoa {
    private int matricula; 
    private String curso; 


// método da classe aluno (ações)    


public void atualizarCurso(String novoCurso) {
     this.curso = novoCurso; 
}

public void apagaMatricula() {
    this.matricula = 0; 
}



//--------------- GET AND SETTERS ---------------------  //

// get Matricula

    public int getMatricula() {
        return matricula;
    }

// set matricula

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

// get curso

    public String getCurso() {
        return curso;
    }


    // sobrescrita - poliformismo 
    @Override
    public String exibeDados() {
        return "Nome: " + getNome() + "\nIdade " + getIdade() +  
        "\nEmail:  " + getEmail() + "\nSexo : "  + getSexo() +
        "\nMatricula:  " + getMatricula() + "\nCurso:  " + curso  ;
    
    }

// simplificação do metodo aluno 

    public String exibeDadosSimplificado() {
        return "Nome do Aluno" + getNome() + "\nMatricula : " + matricula; 
    }

    // sobrecarga
    
    public void exibeDados(String msg) {
        System.out.println(msg);
        System.out.println("Nome: " + getNome() + "\nIdade " + getIdade() +  
        "\nEmail:  " + getEmail() + "\nSexo : "  + getSexo() +
        "\nMatricula:  " + getMatricula() + "\nCurso:  " + curso);
        System.out.println(" ");
    }

    




} // fim da classe Pessoa