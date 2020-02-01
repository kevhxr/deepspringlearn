package com.hxr.deepspringlearn.anno;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({PhoneAnoImportSelector.class})

public @interface Trading {
    String value();
}
