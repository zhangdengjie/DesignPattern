package com.zdj.template.temp2;

public class Client {
	public static void main(String[] args) {
		TemplateClass t = new TemplateClass() ;
		t.functionA(new ConcretCallBackA());
		t.functionA(new ConcretCallBackB());
	}
}
