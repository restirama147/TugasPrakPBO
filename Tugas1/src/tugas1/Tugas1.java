/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */

class FrameLogin extends JFrame {
    JLabel header = new JLabel("Selamat Datang!");
    JLabel subheader = new JLabel ("Silahkan Masuk Untuk Melanjutkan");
    JLabel usn = new JLabel ("Username");
    JLabel pass = new JLabel ("Password");
    JLabel gender = new JLabel ("Jenis Kelamin");
    JTextField username = new JTextField(40);
    JTextField password = new JTextField(40);
    JRadioButton laki = new JRadioButton("Laki-Laki");
    JRadioButton perempuan = new JRadioButton("Perempuan");
    JButton login = new JButton("Login");
    
    FrameLogin(){
        setVisible(true);
        setSize(580, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        setLayout(null);
        add(header);
        header.setBounds(10, 10, 250, 40);
        header.setFont(new Font("Arial", Font.BOLD, 24));
        
        add(subheader);
        subheader.setBounds(10, 40, 250, 40);
        subheader.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(usn);
        usn.setBounds(10, 80, 250, 40);
        usn.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(username);
        username.setBounds(10, 110, 540, 25);
        
        add(pass);
        pass.setBounds(10, 140, 250, 40);
        pass.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(password);
        password.setBounds(10, 170, 540, 25);
        
        add(gender);
        gender.setBounds(10, 200, 250, 40);
        gender.setFont(new Font("Arial", Font.BOLD, 14));
        
        ButtonGroup jenisKelamin = new ButtonGroup();
        jenisKelamin.add(laki);
        jenisKelamin.add(perempuan);
        
        add(laki);
        laki.setBounds(10, 230, 100, 40);
        laki.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(perempuan);
        perempuan.setBounds(230, 230, 100, 40);
        perempuan.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(login);
        login.setBounds(10, 290, 540, 30);
        login.setFont(new Font("Arial", Font.BOLD, 14));
        login.setBackground(Color.white);
        
    }
}

class HalamanUtama extends JFrame{
    JLabel judul = new JLabel("Welcome, [Mr./Mrs.] [Username] ");
    JLabel subjudul = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JTextField inPanjang = new JTextField(40);
    JTextField inLebar = new JTextField(40);
    JTextField inTinggi = new JTextField(40);
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    JLabel ketLuas = new JLabel("Luas Persegi");
    JLabel ketKeliling = new JLabel("Keliling Persegi");
    JLabel ketVolume = new JLabel("Volume Balok");
    JLabel luasPrm = new JLabel("Luas Permukaan Balok");
    JLabel hasilLuas = new JLabel("[Hasil berupa angka]");
    JLabel hasilKeliling = new JLabel("[Hasil berupa angka]");
    JLabel hasilVolume = new JLabel("[Hasil berupa angka]");
    JLabel hasilLuasPermukaan = new JLabel("[Hasil berupa angka]");
    JLabel hasil = new JLabel("Hasil");
   
    HalamanUtama(){
        setVisible(true);
        setSize(580, 480);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        setLayout(null);
        add(judul);
        judul.setBounds(10, 10, 400, 40);
        judul.setFont(new Font("Arial", Font.BOLD, 22));
        
        add(subjudul);
        subjudul.setBounds(10, 40, 450, 40);
        subjudul.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(panjang);
        panjang.setBounds(10, 90, 100, 30);
        panjang.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(inPanjang);
        inPanjang.setBounds(140, 95, 400, 25);
        
        add(lebar);
        lebar.setBounds(10, 130, 100, 30);
        lebar.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(inLebar);
        inLebar.setBounds(140, 135, 400, 25);
        
        add(tinggi);
        tinggi.setBounds(10, 170, 100, 30);
        tinggi.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(inTinggi);
        inTinggi.setBounds(140, 175, 400, 25);
        
        add(hitung);
        hitung.setBounds(10, 210, 540, 30);
        hitung.setFont(new Font("Arial", Font.BOLD, 14));
        hitung.setBackground(Color.white);
        
        add(reset);
        reset.setBounds(10, 250, 540, 30);
        reset.setFont(new Font("Arial", Font.BOLD, 14));
        reset.setBackground(Color.white);
        
        add(hasil);
        hasil.setBounds(260, 290, 150, 30);
        hasil.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(ketLuas);
        ketLuas.setBounds(10, 320, 100, 25);
        ketLuas.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(hasilLuas);
        hasilLuas.setBounds(250, 320, 250, 25);
        hasilLuas.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(ketKeliling);
        ketKeliling.setBounds(10, 345, 100, 25);
        ketKeliling.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(hasilKeliling);
        hasilKeliling.setBounds(250, 345, 250, 25);
        hasilKeliling.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(ketVolume);
        ketVolume.setBounds(10, 370, 100, 25);
        ketVolume.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(hasilVolume);
        hasilVolume.setBounds(250, 370, 250, 25);
        hasilVolume.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(luasPrm);
        luasPrm.setBounds(10, 395, 200, 25);
        luasPrm.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(hasilLuasPermukaan);
        hasilLuasPermukaan.setBounds(250, 395, 250, 25);
        hasilLuasPermukaan.setFont(new Font("Arial", Font.PLAIN, 13));
    }

}

public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrameLogin frameLogin = new FrameLogin();
        HalamanUtama halamanUtama = new HalamanUtama();
    }
    
}
