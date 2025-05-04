public class PerfilBuilder {
private String nome;
private String email;
private int idade;

 PerfilBuilder( Builder build){
    this.nome = build.nome;
    this.idade= build.idade;
    this.nome = build.nome;
}

String getNome(){
    return this.nome;
}

String getEmail(){
    return this.email;
}

int getIdade(){
    return this.idade;
}


public static class Builder {
    private String nome;
    private String email;
    private int idade;

    public Builder(String nome){
    this.nome=nome;
    }

    public Builder setIdade(int value){
        this.idade = value;
        return this;
    }
    public Builder setNome(String value){
        this.nome = value;
        return this;
    }
    public Builder setEmail(String value){
        this.email = value;
        return this;
    }

    public PerfilBuilder build(){
        return new PerfilBuilder(this);
    }

    
}

}
