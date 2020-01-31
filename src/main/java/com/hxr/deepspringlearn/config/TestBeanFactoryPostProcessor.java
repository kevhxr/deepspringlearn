package com.hxr.deepspringlearn.config;


import com.hxr.deepspringlearn.service.BackService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition frontService =
                (GenericBeanDefinition) beanFactory.getBeanDefinition("frontService");
        frontService.setBeanClass(BackService.class);
    }
}
