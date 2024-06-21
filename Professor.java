class Professor extends Pessoa {

private String disciplina; 
private float salario; 


// método da classe professor 
public void cadastroAluno() {

}

// get disciplina

    public String getDisciplina() {
        return disciplina;
    }

// set disciplina

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

// get salario

    public float getSalario() {
        return salario;
    }

// set salario 

    public void setSalario(float salario) {
        this.salario = salario;
    }

// Sobrescrever o método --> utilizando poliformismo

 @Override
public String exibeDados() {
    return "Nome: " + getNome() + "\nIdade " + getIdade()  +  
    "\nEmail:  " + getEmail() + "\nSexo : "  + getSexo() +
    "\nDisciplina:  " + getDisciplina() + "\nSalario:  " + salario;

}
// Sobrecarga de método 
public void exibeDados(String msg) {
    System.out.println(msg);
    System.out.println("Nome: " + getNome() + "\nIdade " + getIdade()  +  
    "\nEmail:  " + getEmail() + "\nSexo : "  + getSexo() +
    "\nDisciplina:  " + getDisciplina() + "\nSalario:  " + salario); 
    System.out.println(" ");
    
}




} // fim da classe Professor