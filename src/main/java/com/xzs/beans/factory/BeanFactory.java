package com.xzs.beans.factory;

import com.xzs.beans.definition.BeanDefinition;

public interface BeanFactory {
    BeanDefinition getBeanDefinition(String petStore);

    Object getBean(String petStore);
}
