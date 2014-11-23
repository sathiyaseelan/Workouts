package org.saftware.spoj.toandfro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int colsCount = 0;
		while((colsCount=Integer.parseInt(br.readLine()))!=0){
			String encText = br.readLine();
			
			int rowsCount = encText.length()/ colsCount;
			char[][] decText = new char[rowsCount][colsCount];
			for(int i=0;i<rowsCount;i++){
				if(i%2==0){
					//PrintForward direction
					//printForward(encText, i*colsCount, colsCount);
					for(int j=i*colsCount,count=0;count<colsCount;j++,count++){
						decText[i][count]=encText.charAt(j);
					}
				}else{
					//PrintBackward direction
					//printBackward(encText, i*colsCount, colsCount);
					for(int j=((i+1)*colsCount)-1,count=0;count<colsCount;j--,count++){
						decText[i][count]=encText.charAt(j);
					}
				}
			}
			for(int i=0;i<colsCount;i++){
				for(int j=0;j<rowsCount;j++){
					System.out.print(decText[j][i]);
				}
			}
			System.out.println();
		}
	}
	
	}
