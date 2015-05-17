package com.shinowit.test;

import javax.swing.JOptionPane;

public class numtest {

	private int[][] numArray;  
    int x=0;  
    int y=0;  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
    	numtest loopACW = new numtest();  
        loopACW.createArray();  
        loopACW.printToConsole();  
    }  
    private void createArray() {  
        int i=0,j=0;//数组下标  
        int c=0;//层数，从0开始，每一层都是一个正方形（或长方形），总共有四条边，每一个边的角上，就是拐点  
        int d=0;//0，表示第一条边，1，表示第二条边，2，表示第三条，3，表示第四条  
        String s = JOptionPane.showInputDialog("请输入行列数，逗号隔开");  
        String[] a = s.split(",");  
        x = Integer.parseInt(a[0]);  
        y = Integer.parseInt(a[1]);  
        numArray = new int[x][y];  
        int maxValue = x*y;  
          
        for(int k=1;k<=maxValue;k++){  
            if(d==0){  
                if(i==x-c-1){//第一个拐点  
                    d=1;  
                }else{  
                    numArray[i][j]=k;  
                    i++;  
                    continue;  
                }  
            }  
            if(d==1){  
                if(j==y-c-1){//第二个拐点  
                    d=2;  
                }else{  
                    numArray[i][j]=k;  
                    j++;  
                    continue;  
                }  
            }  
            if(d==2){  
                if(i==c){//第三个拐点  
                    d=3;  
                }else{  
                    numArray[i][j]=k;  
                    i--;  
                    continue;  
                }  
            }  
            if(d==3){  
                if(j==c+1){//第四个拐点的处理比较特殊  
                    numArray[i][j]=k;  
                    d=0;  
                    c++;  
                    i++;  
                    continue;  
                }else{  
                    numArray[i][j]=k;  
                    j--;  
                    continue;  
                }  
            }     
        }  
          
    }  
      
    private void printToConsole() {  
        String space = "";  
        for(int i=0;i<x;i++){  
            for(int j=0;j<y;j++){  
                if(numArray[i][j]<10){  
                    space="  ";  
                }else{  
                    space=" ";  
                }  
                System.out.print(numArray[i][j]+space);  
            }  
            System.out.println();//换行  
        }  
          
    }  
  
}
