/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_miguelblanco;

import javax.swing.JProgressBar;

/**
 *
 * @author migue
 */
public class administrarBarra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private Cliente temp;

    public administrarBarra(JProgressBar barra) {
        this.barra = barra;
        this.avanzar = true;
        this.vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public Cliente getTemp() {
        return temp;
    }

    public void setTemp(Cliente temp) {
        this.temp = temp;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.getValue();
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == barra.getMaximum()) {
                    barra.setValue(0);
                    barra.setMaximum(0);
                    barra.setString("");
                    while (vive) {
                        barra.setMaximum(temp.getPlatillos().get(1).getTiempo());
                        barra.setForeground(temp.getPlatillos().get(1).getColor());
                        if (avanzar) {
                            barra.getValue();
                            barra.setValue(barra.getValue() + 1);
                            if (barra.getValue() == barra.getMaximum()) {
                                barra.setValue(0);
                                barra.setMaximum(0);
                                barra.setString("");
                                while (vive) {
                                    barra.setMaximum(temp.getPlatillos().get(2).getTiempo());
                                    barra.setForeground(temp.getPlatillos().get(2).getColor());
                                    if (avanzar) {
                                        barra.getValue();
                                        barra.setValue(barra.getValue() + 1);
                                        if (barra.getValue() == barra.getMaximum()) {
                                            barra.setValue(0);
                                            barra.setMaximum(0);
                                            barra.setString("");
                                            while (vive) {
                                                barra.setMaximum(temp.getPlatillos().get(3).getTiempo());
                                                barra.setForeground(temp.getPlatillos().get(3).getColor());
                                                if (avanzar) {
                                                    barra.getValue();
                                                    barra.setValue(barra.getValue() + 1);
                                                    if (barra.getValue() == barra.getMaximum()) {
                                                        vive = false;
                                                        barra.setValue(0);
                                                        barra.setMaximum(0);
                                                        barra.setString("");
                                                    }
                                                }
                                                try {
                                                    Thread.sleep(1000);
                                                } catch (Exception e) {
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        Thread.sleep(1000);
                                    } catch (Exception e) {
                                    }
                                }
                            }
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
