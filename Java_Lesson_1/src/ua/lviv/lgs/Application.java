package ua.lviv.lgs;

//import java.util.Iterator;

public class Application {

	public static void main(String[] args) {

		/*
		 * int a = 32; long b = 56;
		 * 
		 * System.out.println("a = "+a); System.out.println("b = "+b);
		 */

//Приклад 1: Додавання та віднімання змінних
		/*
		 * int d = 1; int e = 2; int res1 = d + e; int res2 = d - e; int res3 = d * e;
		 * int res4 = d / e;
		 * 
		 * System.out.println("res1 = " + res1); System.out.println("res2 = " + res2);
		 * System.out.println("res3 = " + res3); System.out.println("res4 = " + res4);
		 */

//Приклад 2: Який результат виведення на екран
		/*
		 * int a = 0; int b = a++; int c = a++; System.out.println("Example 2 = " + a +
		 * " " + b + " " + c);
		 */
//Приклад 3: Операції з присвоєнням
		/*
		 * int f = 1; int g = 2; int h = 3; int b = 0;
		 * 
		 * f += 5; g *= 4; h += f * g; h %= 6; b += 5; System.out.println("f = " + f);
		 * System.out.println("g = " + g); System.out.println("h = " + h);
		 * System.out.println("b = " + b);
		 */

// Приклад 4: Тернарний оператор
		/*
		 * int a = 2; //String s = "Kosiatyn";
		 * 
		 * int r = a < 0 ? 1 : 0; System.out.println(r);
		 * 
		 * String f = a > 0 ? "Ура ура ура": "Ой ой ой"; System.out.println(f);
		 */
//Приклад 5: Логічні оператор
		/*
		 * boolean j = true; boolean k = false; boolean l = j | k; boolean m = j & k;
		 * boolean n = (!j & k) | (j & !k); boolean o = !j;
		 * 
		 * System.out.println("j = " + j); System.out.println("k = " + k);
		 * System.out.println("l = " + l); System.out.println("m = " + m);
		 * System.out.println("n = " + n); System.out.println("o = " + o);
		 */

//Приклад 6: Операції рівності
		/*
		 * int t = 5; int u = 21; String result1 = (t < u) ? "Yes" : "No"; String
		 * result2 = (t == u) ? "Yes" : "No"; String result3 = (t >= u) ? "Yes" : "No";
		 * 
		 * System.out.println("result1 = " + result1); System.out.println("result2 = " +
		 * result2); System.out.println("result3 = " + result3);
		 */

//Приклад 7: Конструкція if else
		/*
		 * int a = 1; int b = 2;
		 * 
		 * if (a > b) { System.out.println("a > b"); } else {
		 * System.out.println("a < b"); }
		 */

//Приклад 8: Конструкція if else if
		/*
		 * int a = 2; int b = 2; if(a == b) { System.out.println("equal"); }else if(a >
		 * b) { System.out.println("a bigger"); }else { System.out.println("b bigger");
		 * }
		 */

//Приклад 9: Конструкція switch

		/*
		 * int k1 = 3;
		 * 
		 * switch(k1) { case 1: case 2: case 4: System.out.println("1 2 4"); break; case
		 * 3: System.out.println("3"); break; default: System.out.println("default"); }
		 */

//Приклад 10:	цикл for

		/*
		 * for(int i = 0; i < 10; i++) { System.out.println("i = " + i); }
		 */

//Приклад 11:	цикл while

		// int i = 0;

		/*
		 * while(i < 10) { System.out.println("j = " + i); i++; }
		 */

		/*
		 * do { System.out.println("do = " + i); i++; }while (i == 10);
		 */

//Приклад 11: Масиви

		/*
		 * int array1 [] = new int [10]; double [] array2 = new double [10]; double
		 * array3 [] = {1.1, 2.2, 3.3, 4.4, 5.5};
		 * 
		 * for (int i = 0; i < array1.length; i++) { array1[i] = i; array2[i] = i*i; }
		 * 
		 * for (int i = 0; i < array1.length; i++) { //System.out.println(array1[i] +
		 * " array 1"); //System.out.print(array2[i] + " array 2"); }
		 * 
		 * for (int i = 0; i < array3.length; i++) { System.out.println(array3[i] +
		 * " array 3"); }
		 */

//Приклад 12: Обгортки примітивів

		/*
		 * Byte a1 = 3; Short a2 = 4; Integer a3 = 2; Long a4 = 2L;
		 * 
		 * int a5 = a1; a3 = a5;
		 * 
		 * Double b = 2.2; Float b1 = 2.3F;
		 */

		System.out.println("Byte = " + Byte.MAX_VALUE);
		System.out.println("Byte = " + Byte.MIN_VALUE);

	}
}
