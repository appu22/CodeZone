package com.xworkz.xworkzapp.inbuiltsmethods;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		
		//StringBuffer sb = new StringBuffer();//16 capcity
		StringBuffer sb = new StringBuffer("appu");//16+4=20
		System.out.println("capacity of constructor 16 +appu: "+sb.capacity());
		sb.append(" badiger");//
		sb.append("");
		System.out.println("Adding surname append() : "+sb);
		System.out.println("object of the length() : "+sb.length());
		System.out.println("*********************************");
		StringBuffer s = new StringBuffer();
		s.append("x-workz");
		System.out.println("charAt(index) : "+s.charAt(0));
		System.out.println("delete() "+s.delete(1, 3));
		System.out.println("deleteCharAt() "+s.deleteCharAt(2));
		
		System.out.println("***************replace()**************");
		StringBuffer replace = new StringBuffer();
		replace.append("bengalore");
		System.out.println("repalce bengalore : "+replace.replace(1, 4, "odc"));
		System.out.println("-----------------ensureCapcity()-----------------------");
		//equals will not suported stringbuffer
		StringBuffer s6 = new StringBuffer();
		System.out.println("default capcity of string : "+s6.capacity());
		s6.ensureCapacity(100);
		System.out.println("increase default capcity : "+s6.capacity());
		System.out.println("****setCharAt()*****");
		s6.append("app ");
		s6.setCharAt(3, 'u');
		System.out.println(s6);
		System.out.println("++++++++++++replace()++++++");
		StringBuffer s7 = new StringBuffer();
		s7.append("usppPatait");
		s7.replace(1, 3,"bed");
		System.out.println("replaced spp to bed : "+s7);
		System.out.println("starts with 3rd character : "+s7.substring(3));
		System.out.println("subSequnce() start and ends "+s7.subSequence(2, 4));
		System.out.println("reverse() "+s7.reverse());
//		StringBufferDemo1.m1();
	}
	public static void m1() {
		int a=120;
		int b=a;
		a=b;
		System.out.println(a);
		a=128;
		a++;
		System.out.println(a);
	}
}
