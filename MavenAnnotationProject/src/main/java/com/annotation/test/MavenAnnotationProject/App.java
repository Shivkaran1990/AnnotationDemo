package com.annotation.test.MavenAnnotationProject;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import com.annotation.SimpleAnnotationTest;
import com.annotation.serviceclasss.TestClass1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
    	System.out.println("Testing");
		ClassPathScanningCandidateComponentProvider scanner =new ClassPathScanningCandidateComponentProvider(true);

		scanner.addIncludeFilter(new AnnotationTypeFilter(SimpleAnnotationTest.class));

		for (BeanDefinition bd : scanner.findCandidateComponents("com.annotation.serviceclasss"))
		{
		    System.out.println(bd.getBeanClassName());
		}

		SimpleAnnotationTest data=TestClass1.class.getAnnotation(SimpleAnnotationTest.class);
			System.out.println(data.value());

    	
    	System.out.println( "Hello World!" );
    }
    
    
}
