/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author c0689497
 */
@Named//correct one from java application 7 if u want to use java 6 then use facelets.*
@ApplicationScoped
public class HelloWorldBean {
    private String name = "World";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String sayHello(){
        return "Hello" + name + "!";
    }
}
