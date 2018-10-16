package com.xzs.beans.factory.support;

import com.xzs.beans.definition.BeanDefinition;
import com.xzs.beans.factory.BeanFactory;

public class DefaultBeanFactory implements BeanFactory {
    public DefaultBeanFactory() {
    }
    public DefaultBeanFactory(String sconfigFile) {
    }

    @Override
    public BeanDefinition getBeanDefinition(String petStore) {
        return null;
    }

    @Override
    public Object getBean(String petStore) {
        return null;
    }
}
