package com.xzs.test.v1;

import com.xzs.beans.definition.BeanDefinition;
import com.xzs.beans.factory.BeanFactory;
import com.xzs.beans.factory.support.DefaultBeanFactory;
import com.xzs.service.v1.PetStoreService;
import org.junit.Test;
import static org.junit.Assert.*;

public class BeanFactoryTest {

    @Test
    public void testGetBean(){
        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
        BeanDefinition bd = factory.getBeanDefinition("petStore");
        assertEquals("com.xzs.service.v1.PetStoreService",bd.getBeanClassName());
        PetStoreService petStore = (PetStoreService)factory.getBean("petStore");

        assertNotNull(petStore);
    }
}
