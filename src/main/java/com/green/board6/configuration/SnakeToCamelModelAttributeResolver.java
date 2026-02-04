package com.green.board6.configuration;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor;

import com.google.common.base.CaseFormat;

public class SnakeToCamelModelAttributeResolver extends ServletModelAttributeMethodProcessor {
    public SnakeToCamelModelAttributeResolver(boolean annotationNotRequired) {
        super(annotationNotRequired);
    }

    @Override
    protected void bindRequestParameters(WebDataBinder binder, NativeWebRequest request) {
        HttpServletRequest servletRequest = request.getNativeRequest(HttpServletRequest.class);
        MutablePropertyValues mpvs = new MutablePropertyValues();

        // 모든 파라미터를 돌면서 snake_case -> camelCase 변환
        servletRequest.getParameterNames().asIterator().forEachRemaining(paramName -> {
            String camelName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, paramName);
            mpvs.add(camelName, servletRequest.getParameter(paramName));
        });

        binder.bind(mpvs);
    }
}
