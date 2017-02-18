/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cps616.lab3;

import java.util.Scanner;
    
/**
 *
 * @author minim_000
 */
public class Miner {
    public static char map[][];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int w,h,sx,sy;
        int blocks = 0;
        int dx,dy;
        
        w = sc.nextInt();
        h = sc.nextInt();
        sx = sc.nextInt();
        sy = sc.nextInt();
        sc.nextLine();
        map = new char[h][w];
        for (int x = 0; x < h; x++){
            map[x] = sc.nextLine().toCharArray();
        }
        for (int x = 0; x < h; x++){
            for (int y = 0; y < w; y++){
                System.out.print(map[x][y]);
            }
            System.out.println();
        }
        dfs();
    }
    
    public static void dfs(){
        
    }
    
    public static boolean canMine(){
        return true;
    }
    
    public static boolean isDiamond(){
        return false;
    }
    
    public static void north(){
        
    }
    public static void east(){
        
    }
    public static void south(){
        
    }
    public static void west(){
        
    }
}
