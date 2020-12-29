package belajar.maven;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class BelajarJavaMysql {
    // Menyiapkan paramter JDBC untuk koneksi ke datbase
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpustakaan?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
    static final String USER = "admin";
    static final String PASS = "12345";

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {

        // Melakukan koneksi ke database
        // harus dibungkus dalam blok try/catch
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);

            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // buat objek statement
            stmt = conn.createStatement();

            // buat query ke database
            String sql = "SELECT * FROM buku";

            // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stmt.executeQuery(sql);

            // tampilkan hasil query
            while(rs.next()){
                System.out.println("ID Buku: " + rs.getInt("id_buku"));
                System.out.println("Judul: " + rs.getString("judul"));
                System.out.println("Pengarang: " + rs.getString("pengarang"));
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
