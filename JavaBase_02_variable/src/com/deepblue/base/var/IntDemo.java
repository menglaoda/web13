package com.deepblue.base.var;

public class IntDemo {

	public static void main(String[] args) {
		
		//����ϵ������
		byte  b = 3    ; // ����һ������b������Ϊbyte����Χ�� -128--127 
		System.out.println(b);
		b = 127 ;
		System.out.println(b);
		//b = 128 ;
		
		short s = 128 ; //������ ��Χ-32000---32000
		System.out.println(s) ;
		s = 32000 ;
		System.out.println(s) ;
		//s = 33000 ; //����short���ͱ�ʾ�ķ�Χ
		
		int i = 33000 ; //����  ��Χ-2000000000--2000000000
		System.out.println(i) ;
		i = 2000000000 ;
		System.out.println(i) ;
		//i = 3000000000 ; //�������ͷ�Χ
		
		long l = 3000000000L ; //������
		System.out.println(l) ;
		 //l =  10000000000000000000L ; //���������ͷ�Χ
		
	}
	
}
