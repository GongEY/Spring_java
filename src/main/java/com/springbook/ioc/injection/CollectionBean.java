package com.springbook.ioc.injection;

import java.util.*;

public class CollectionBean {
	//private List<String> addressList;
	//private Set<String> addressList;
	// 중복값 허용 시에는 list 허용 x 에는 set
	//private Map<String,String> addressList;
	//key+value는 map
	private Properties addressList;
	
	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}
	
	public Properties getAddressList(){
		return addressList;
	}
}
