package com.algaworks.algamoneyapi;

public abstract class People {
    private String name;
    private int idade;
    private String address;
    private Long cpfCnpj;
    private Long phone;

    public People(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(Long cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}
