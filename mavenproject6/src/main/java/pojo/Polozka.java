/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "polozka")
public class Polozka{

    
     public Polozka(){}
@Id
@Column(name = "id")
 //@GeneratedValue(strategy=GenerationType.AUTO)
int id;

    public Polozka( String tovar, int pocetkusov, String menopreb, String krajina) {
//this.id=id;
        this.tovar = tovar;
        this.pocetkusov = pocetkusov;
        this.menopreb = menopreb;
        this.krajina= krajina;
    }

  @Column(name = "tovar")
  String tovar;

@Column(name = "kusy")
int pocetkusov;

@Column(name = "namepreb")
String menopreb;

@Column(name = "krajina")
String krajina; 



public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTovar() {
        return tovar;
    }

    public void setTovar(String tovar) {
        this.tovar = tovar;
    }

    public int getPocetkusov() {
        return pocetkusov;
    }

    public void setPocetkusov(int pocetkusov) {
        this.pocetkusov = pocetkusov;
    }

    public String getMenopreb() {
        return menopreb;
    }

    public void setMenopreb(String menopreb) {
        this.menopreb = menopreb;
    }

    public String getKrajina() {
        return krajina;
    }

    public void setKrajina(String krajina) {
        this.krajina = krajina;
    }




}

