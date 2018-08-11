/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.most.important.skill.in.biology;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class TheMostImportantSkillInBiology {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100];
        int[] b = new int[100];
        int sum1 = 0;
        int sum2 = 0;
        int area = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                sum1 += a[i] * b[i + 1];
            } else {
                sum1 += a[i] * b[0];
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                sum2 += b[i] * a[i + 1];
            } else {
                sum2 += b[i] * a[0];
            }
        }
        area = (sum1 - sum2) / 2;
        System.out.println(area);

        /*for(int i =0;i<n;i++){
        System.out.println(" "+ b[i]);
        }*/
    }

}
