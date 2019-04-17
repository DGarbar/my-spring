package ioc.annotationHandler;

import ioc.Util.ReflectionUtil;
import ioc.annotation.Koko;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Supplier;

public class KokoMethodInterceptor implements AnnotationWrapper {

    private final static Class<Koko> KOKO_CLASS = Koko.class;

    public Supplier<Object> wrap(Method method, Supplier<Object> rootInvoke) {
        return () -> {
            Object result = null;
            if (ReflectionUtil.isMethodContainsAnnotationName(method, KOKO_CLASS)) {
                result = rootInvoke.get();
                System.out.println("LOKOKOKOKKKOKOKO");
            }
            return result;
        };
    }

    public boolean isEqualsAnnotation(Annotation annotationClass){
        return annotationClass.annotationType().equals(KOKO_CLASS);
    }

}
