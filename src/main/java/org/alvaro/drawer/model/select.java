/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.alvaro.drawer.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvar
 */
public class select {

    private String name;
    private List<cuerpo> listaCuerpo;

    public select(String name, List<cuerpo> listaCuerpo) {
        this.listaCuerpo = new ArrayList<>();
        this.name = name;
        this.listaCuerpo = listaCuerpo;
    }

}
