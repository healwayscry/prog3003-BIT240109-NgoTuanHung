/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Hungg
 */
public class DeleteUser {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/chapter5";
        String user = "root";
        String password = "Tuanhung6!";

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID can xoa: ");
        int id = sc.nextInt();

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "DELETE FROM users WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Xoa thanh cong!");
            } else {
                System.out.println("Khong tim thay user de xoa");
            }

            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
