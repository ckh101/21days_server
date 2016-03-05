package com.zhku.my21days.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.lang.StringUtils;



public class ClassUtil {
	 public ClassUtil()
	    {
	    }

	    public static String getTableName(Object obj)
	    {
	        Object retsult = null;
	        try
	        {
	            Class cls = obj.getClass();
	            Method method = cls.getMethod("getTableName", new Class[0]);
	            retsult = method.invoke(obj, new Object[0]);
	        }
	        catch(SecurityException e)
	        {
	            e.printStackTrace();
	        }
	        catch(NoSuchMethodException e)
	        {
	            e.printStackTrace();
	        }
	        catch(IllegalArgumentException e)
	        {
	            e.printStackTrace();
	        }
	        catch(IllegalAccessException e)
	        {
	            e.printStackTrace();
	        }
	        catch(InvocationTargetException e)
	        {
	            e.printStackTrace();
	        }
	        return retsult != null ? (String)retsult : "";
	    }

	    public static String getTableName(Class obj)
	    {
	        String retsult = null;
	        try
	        {
	            Object instance = obj.newInstance();
	            retsult = getTableName(instance);
	        }
	        catch(SecurityException e)
	        {
	            e.printStackTrace();
	        }
	        catch(InstantiationException e)
	        {
	            e.printStackTrace();
	        }
	        catch(IllegalAccessException e)
	        {
	            e.printStackTrace();
	        }
	        return retsult != null ? retsult : "";
	    }

	    public static Object invokeMethod(Object objInstance, String methodName, Object paramArgs[])
	        throws Exception
	    {
	        if(objInstance == null)
	            throw new IllegalArgumentException("parameter objInstance is null");
	        Class objCls = objInstance.getClass();
	        Class argsClass[] = (Class[])null;
	        if(paramArgs != null)
	        {
	            argsClass = new Class[paramArgs.length];
	            int i = 0;
	            for(int j = paramArgs.length; i < j; i++)
	                argsClass[i] = paramArgs[i].getClass();

	        }
	        Method method = objCls.getMethod(methodName, argsClass);
	        return method.invoke(objInstance, paramArgs);
	    }

	    public Object getPropValue(String javaType, Object val)
	    {
	        if("java.lang.String".equals(javaType))
	            return (String)val;
	        if("java.lang.Integer".equals(javaType))
	            return (Integer)val;
	        if("java.lang.Double".equals(javaType))
	            return (Double)val;
	        if("java.lang.Float".equals(javaType))
	            return (Float)val;
	        else
	            return val;
	    }

	    public static Class getClass(String className)
	        throws Exception
	    {
	        if(StringUtils.isBlank(className))
	        {
	            throw new IllegalArgumentException("className is null!!!");
	        } else
	        {
	            Object obj = Class.forName(className.trim()).newInstance();
	            return obj.getClass();
	        }
	    }

	    public static Object newInstanceByClassName(String clsName)
	        throws ClassNotFoundException, InstantiationException, IllegalAccessException
	    {
	        Class pduClass = Class.forName(clsName);
	        return pduClass.newInstance();
	    }
}
