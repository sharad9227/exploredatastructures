package test;


import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.stream.LongStream;
/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
	int[][] finalMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int[][] inputMatrix = new int[3][3];
	StringBuffer globalMatrix = new StringBuffer("123456789");

	int count = 0;

	public boolean isPrime(int num) {
	return LongStream.range(2,(long) Math.ceil(Math.sqrt(num + 1))).noneMatch(x -> num % x == 0);
	}

	public void findPossibleAdjAndSwap(int i, int j, int[][] inputMatrix) {
		int left = j - 1;
		int up = i - 1;
		int down = i + 1;
		int right = j + 1;

		int curentVal = inputMatrix[i][j];

		if (left > 0 && !isPrime(curentVal + inputMatrix[i][j - 1])) {
			int temp = inputMatrix[i][j];
			inputMatrix[i][j] = inputMatrix[i][j - 1];
			inputMatrix[i][j - 1] = temp;
			count++;
		} else if (right < 2 && !isPrime(curentVal + inputMatrix[i][j + 1])) {
			int temp = inputMatrix[i][j];
			inputMatrix[i][j] = inputMatrix[i][j + 1];
			inputMatrix[i][j + 1] = temp;
			count++;
		} else if (down < 2 && !isPrime(curentVal + inputMatrix[i + 1][j])) {
			int temp = inputMatrix[i][j];
			inputMatrix[i][j] = inputMatrix[i + 1][j];
			inputMatrix[i + 1][j] = temp;
			count++;
		} else if (up > 0 && !isPrime(curentVal + inputMatrix[i - 1][j])) {
			int temp = inputMatrix[i][j];
			inputMatrix[i][j] = inputMatrix[i - 1][j];
			inputMatrix[i - 1][j] = temp;
			count++;
		}
	}

	public void doRoll(int inputMatrix[][], StringBuffer interMed) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (finalMatrix[i][j] != inputMatrix[i][j]) {
					findPossibleAdjAndSwap(i, j, inputMatrix);
				}
				interMed = interMed.append(inputMatrix[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		for (int i = 0; i < length; i++) {
			StringBuffer checkOut = new StringBuffer("");
			Solution matrix = new Solution();
			for (int k = 0; k < 3; k++) {
				for (int l = 0; l < 3; l++) {
					matrix.inputMatrix[k][l] = scan.nextInt();
	
				}
			}
			while (!checkOut.toString().equals(matrix.globalMatrix.toString())) {				
				checkOut = new StringBuffer();
				matrix.doRoll(matrix.inputMatrix, checkOut);
			}
			if(matrix.count >=16)
			{
				break;
			}
			if (!checkOut.equals(matrix)) {
				System.out.print(matrix.count);
			} else {
				System.out.print(-1);
			}
		}
	}
}