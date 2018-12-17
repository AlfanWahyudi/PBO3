/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alfanwahyudi.latihanmvc.controller;

import edu.alfanwahyudi.latihanmvc.model.PelangganModel;
import edu.alfanwahyudi.latihanmvc.view.pelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author XIDER
 * NIM : 10117118
 * NAMA: Alfan Wahyudi
 * KELAS : IF-3
 */
public class PelangganController {

    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }

    public void resetForm(pelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();

        if (nama.equals("") && email.equals("") && noTelp.equals("")) {

        } else {
            model.resetForm();
        }
    }

    public void simpanForm(pelangganView view) {

        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
            
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");

        } else if (noTelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telp Masih Kosong");

        } else {
            model.simpanForm();

        }
    }

}
