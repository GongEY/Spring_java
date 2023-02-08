package com.springbook.ioc.injection;

import com.springbook.ioc.injection.CollectionBean;
import java.util.*;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		Properties addressList = bean.getAddressList();
		//for(String address: addressList) {
			//System.out.println(address.toString());
		//}
		 //Iterator<String> iter = addressList.keySet().iterator();
	        
	        //while(iter.hasNext()) {
	           // String key = iter.next();
	           // String value = (String) addressList.get(key);
	           //System.out.println(key + " : " + value);
	        //}
		
		Enumeration enumeration = addressList.propertyNames();

        while (enumeration.hasMoreElements()) {
            String element = (String) enumeration.nextElement();
            System.out.println(element + "=" + addressList.getProperty(element));
        }
		factory.close();
	}
}
