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
package Exercise;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class Test1 {
    public static void main(String[] args) {
        String name = ("Champ");
        int X=10;
        int Z;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Y : ");

        int Y = sc.nextInt();
        
        if (X>=Y){
            Z=X-Y;
            System.out.println("X-Y="+Z);
            System.out.println("Name =" +name);
        } else {
            Z=X+Y;
            System.out.printf(" X+Y = %d \nName = %s ",Z,name );
       
        }
        
    }
}
