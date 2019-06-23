package com.javaNew.interfaceImpl;

import com.javaNew.interfaceP.Lenovo;
import com.javaNew.interfaceP.Samsung;

public class Mobile implements Lenovo,Samsung{
public static void main(String[] args) {
	Lenovo mobile=new Mobile();
	mobile.desc();
}

@Override
public void desc() {
	// TODO Auto-generated method stub
	Samsung.super.desc();
}


}
