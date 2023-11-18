package com.ybe.ybe_toyproject3.global.common.annotation;

import com.ybe.ybe_toyproject3.global.util.WithMockCustomUserSecurityContextFactory;
import org.springframework.security.test.context.support.WithSecurityContext;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@WithSecurityContext(factory = WithMockCustomUserSecurityContextFactory.class)
public @interface WithMockCustomUser {
    String userName() default "1";

    String role() default "ROLE_USER";

}