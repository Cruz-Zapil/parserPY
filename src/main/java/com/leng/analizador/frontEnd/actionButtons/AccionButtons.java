package com.leng.analizador.frontEnd.actionButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.leng.analizador.frontEnd.VentanaPrincipal;
import com.leng.analizador.frontEnd.paneles.bottons.ConstructorBottons;
import com.leng.analizador.frontEnd.paneles.panelesIzquierdo.PanelCodigo;

public class AccionButtons implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {

        Object fuente = event.getSource();

        if (fuente instanceof ConstructorBottons) {

            ConstructorBottons botones = (ConstructorBottons) event.getSource();

            if (botones.getText().equals("Archivo")) {


                VentanaPrincipal.addPanelIzquierdo(new PanelCodigo());


            } else {

            }

        }

    }

}
