/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
import java.util.Scanner; 

	public class VendingMachine{
	
		static Scanner kbd = new Scanner(System.in);
		static int balance = 0, product, coins, bills, total=0, 
			change=0, options;
                
		
                public static void payment(){
			
		       //payment method
                    System.out.println("Please select the payment method.(Enter 0 if done)");
			
			do{
				//type of payments
			System.out.println("1. Insert Coins");
			System.out.println("2. Insert Bill");
			System.out.println("0. Money Entry Done");
				
			
			options = kbd.nextInt ( );
                                
			if(options==0){
			     break;
				         }
		
			else if(options==1){
			
                            System.out.println("Insert coins ( press 0 if money entry is done");
				
			do{
								
			    System.out.println("Insert coins( press 0 if done) : 0,1,5,10,25");
                            coins = kbd.nextInt();
			switch(coins){
			
                        case 0:
			    break;
			case 1: 
			    total +=1;
			    break;
			case 5: 
			    total +=5;
			    break;
			case 10: 
			    total +=10;
			    break;
			case 25: 
			    total +=25;
			    break;
			default: 
			
                            System.out.println("Invalid Coins");
			    
                            break;
                        }
                       
                    } 
                        while(coins!=0);
		        }
                        else if (options==2)
                        {
						//1 dollar bills, and 5 dollar bills
						
			do{
			    System.out.println (" Insert bills( press 0 if done) : 0,1,5");
                            bills = kbd.nextInt();
			//Enter bills
			    switch(bills){
			case 0:
		               
                                break;
			case 1: // 1 dollar
			    
                                total+=100;
			        break;
		        case 5:// 5 dollar
			       
                                total +=500;
			        break;
			default:
			  
                            System.out.println("Invalid bills, please Insert new bills");
			}
		} 
                        while(bills!=0);
					}
                        else{
			
                            System.out.println("Invalid Options");
					}
			} while (options!=0);
                     System.out.println (" Your balance is: " + total);   
		}
              
		
		public static void purchase(){
			//5 products to purchase and to select more than 1 product in one time
			do {
                        System.out.println("Please select.");
                        System.out.println( "0, nothing");
                        System.out.println( "1, Orange juice = 175");
                        System.out.println( "2, Coke = 100");
                        System.out.println( "3, Monster = 275");
                        System.out.println ("4, Redbull = 325");
                        System.out.println( "5, Marlboro = 699");
			//now the user can select the product use num between 1 to 5
			product= kbd.nextInt();
			switch(product){
			case 0:
				balance +=0;
				break;
			case 1:
				balance +=175;
				break;
			case 2:
				balance +=100;
				break;
			case 3:
				balance +=275;
				break;
			case 4:
				balance +=325;
				break;
			case 5:
				balance +=699;
				break;
			default:
				System.out.println("Invalid Products");
			}
                }while ( product !=0);
		}
                //to calculate the change
		public static String calCoins (){
			int change = total - balance;
                        
                        if (change < 0) {
                            System.out.println ( " money is not enough. ");
                        }
			
                        else{
                            
                            int quarters = change / 25;
                            change %= 25;
                            int dime = change / 10;
                            change %= 10;
                            int nickel = change / 5;
                            change %= 5;
                            int penny = change;
                           
                            
                            System.out.println ( " your change is " + (total - balance) + " : ");
                           
                            System.out.println ( quarters + "quarters."); 
                            System.out.println ( dime + " dimes");
                            System.out.println ( nickel + " nickels");
                            System.out.println ( penny + " pennies");
                        }
                        return null;
                }
        }


		
		
		
	