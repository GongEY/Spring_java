package com.springbook.ioc.injection;

import java.util.*;

public class CollectionBean {
	//private List<String> addressList;
	//private Set<String> addressList;
	// �ߺ��� ��� �ÿ��� list ��� x ���� set
	//private Map<String,String> addressList;
	//key+value�� map
	private Properties addressList;
	
	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}
	
	public Properties getAddressList(){
		return addressList;
	}
}
