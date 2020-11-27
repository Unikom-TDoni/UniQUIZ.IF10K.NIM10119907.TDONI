/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ.IF10K.NIM10119907.TDONI;

import java.util.Scanner;

/**
 *
 * @author aris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var customer = new Customer();
        var scanner = new Scanner(System.in);
        
        System.out.println("===Program Kasir Rock n Roll Haircut====");
        System.out.println("Customer Name = ");
        customer.setName(scanner.nextLine());
        
        System.out.println("Customer Email = ");
        customer.setEmail(scanner.nextLine());
        
        customer.displayService();
        var pilihanUser = scanner.nextInt();
        System.out.println("Are You Member (Yes/No) = ");
        customer.setMember(customer.checkMemberStatus(scanner.next()));
        
        customer.setPriceService(customer.getPrice(pilihanUser));
        
        System.out.println("#***************#");
        System.out.println("#*****Customer Invoice*****#");
        System.out.println("Date Transaction = " + customer.currentTime());
        System.out.printf("Service Price : Rp.%.1f\n", customer.getPriceService());
        System.out.printf("Discount : Rp.%.1f\n", customer.getSale(customer.isMember(), customer.getPriceService()));
        System.out.printf("Total Pay : Rp.%.1f\n", customer.getTotalPay(customer.getPriceService(), customer.getSale(customer.isMember(), customer.getPriceService())));
    }
    
}
