package com.anysoft.manager;

import android.util.Log;

import com.anysoft.util.ReflectUtil;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;
import java.util.List;

/**
 * Created by LiTingYao on 2018/8/5.
 */
@Aspect
public class TestAspect {
    
    private static final String TAG = "aspect";
    
    @Pointcut("execution(* com.anysoft.*.on*(..))")
    private void controllerPagePointAspect() {
    }
    
    @After("controllerPagePointAspect()")
    public void onPageAfter(JoinPoint joinPoint) throws Throwable {
        try {
            Object target = joinPoint.getTarget();
            String className = joinPoint.getTarget().getClass().getSimpleName();
            String methodName = joinPoint.getSignature().getName();
            List<Object> args = Arrays.asList(joinPoint.getArgs());
            Log.e(TAG, "className: " + className + ", methodName: " + methodName
                    + ", args: " + args.toArray().toString());
            
            if (methodName.equals("onClick")){
                String et_login_mobile = (String) ReflectUtil.getFieldValueByName(target, "et_login_mobile");
                Log.e(TAG, "onClick: " + et_login_mobile);
            }
        } catch (Exception e) {
            Log.e(TAG, "onPageAfter: " + e.toString());
        }
    }
}
