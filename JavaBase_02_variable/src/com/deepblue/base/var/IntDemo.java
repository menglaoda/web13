package com.deepblue.base.var;

public class IntDemo {

	public static void main(String[] args) {
		
		//整型系列类型
		byte  b = 3    ; // 定义一个变量b，类型为byte，范围： -128--127 
		System.out.println(b);
		b = 127 ;
		System.out.println(b);
		//b = 128 ;
		
		short s = 128 ; //短整型 范围-32000---32000
		System.out.println(s) ;
		s = 32000 ;
		System.out.println(s) ;
		//s = 33000 ; //超过short类型表示的范围
		
		int i = 33000 ; //整型  范围-2000000000--2000000000
		System.out.println(i) ;
		i = 2000000000 ;
		System.out.println(i) ;
		//i = 3000000000 ; //超过整型范围
		
		long l = 3000000000L ; //长整型
		System.out.println(l) ;
		 //l =  10000000000000000000L ; //超过长整型范围
		
	}
	
}
