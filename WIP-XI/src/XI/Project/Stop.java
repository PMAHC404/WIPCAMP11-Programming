/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class Stop {
    public static void main(String[] args) {
        int item = 5;
        int limit = 10;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter menu : ");

        int menu = sc.nextInt();
        if(menu == 1){
            if(item<limit){
                System.out.print("Enter amount : ");
                int amount = sc.nextInt();
                if (item+amount>limit) {
                    System.out.println("item : Unable to add item");
                    
                
                }else{
                    System.out.println("item : " + (item+amount));
                    System.out.println("limit :" + limit);
                }
            }
            
        }else if(menu ==2 ){
            if(item<=0){
                System.out.println("Unable to remove item");

            }else{
                System.out.print("Enter amount : ");
                int amount = sc.nextInt();
                if(item>=amount){
                    System.out.println("item : "+ (item-amount));
                
                    
                }else{
                    System.out.println("Unable to remove item");
                }
                
            }
        }else if(menu == 3){
            System.out.println("item : " + item);
            System.out.println("limit : " + limit);
        }else{
            System.out.println("Choose menu again");
        }
        
       
        
    }
    
}
