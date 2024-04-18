package br.cesul.body;

public class Contact {

    private String name;
    private String endereco;
    private String sexo;
    private String tel;
    private String cel;
    private String email;

    public Contact(String name, String endereco, String sexo,
                   String tel, String cel, String email) {
        this.name = name;
        this.endereco = endereco;
        this.sexo = sexo;
        this.tel = tel;
        this.cel = cel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTel() {
        return tel;
    }

    public String getCel() {
        return cel;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
