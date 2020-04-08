/*
 * # ��ȭ�� �¼����� : Ŭ���� + ����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

package day_40;

import java.util.Scanner;

class Ex07
{
	int[] seat = new int[7];
	int money = 0;
}

public class ClassEx07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex07 e = new Ex07();
		
		int count=0;
		while(true) {
			
			System.out.print("seat = ");
			for(int i=0;i<e.seat.length;i++)
			{
				if(e.seat[i]==0)
				{
					System.out.print("[x]");
				}
				else
				{
					System.out.print("[o]");
				}
			}
			System.out.println();
			System.out.println();
			
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]�¼�����");
			System.out.println("[2]�����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("�¼� ����[0~7]");
				int idx = sc.nextInt();
				
				if(e.seat[idx]==0)
				{
					e.seat[idx] = 1;
					count++;
				}
				else
				{
					System.out.println("�����Ͻ� �¼��� �̹� ���Ű� �Ǿ��ִ� �¼��Դϴ�.");
				}
			}
			else if(sel == 2) {
				System.out.println("�� �����:"+count*12000);
				break;
			}
		}

		
	}
}
