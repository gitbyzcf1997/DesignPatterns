package com.zcf.dp.cor.servlet.v2;


import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-20:28
 * @Description: com.zcf.dp.cor.servlet.v1
 * @version: 1.0
 */
public class Servlet_Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.str="大家好:),<script>,欢迎访问 zcf.com，大家都是996";
        Response response = new Response();
        response.str="response";
        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter()).add(new SensitiveFilter());
        chain.doFilter(request,response);
        System.out.println(request.str);
        System.out.println(response.str);
    }
}

interface Filter{
    boolean doFilter(Request request, Response response);
}

class Request{
    String str;
}

class  Response{
    String str;
}

class HTMLFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response) {
        request.str=request.str.replaceAll("<","[").replace(">","]");
        response.str+="--HTMLFilter()";
        return true;
    }
}

class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response) {
        request.str=request.str.replaceAll("996","995");
        response.str+="--SensiiveFilter()";
        return true;
    }
}

class FilterChain implements Filter {
    List<Filter> list=new ArrayList<>();

    public FilterChain add(Filter filter) {
        list.add(filter);
        return this;
    }

    public boolean doFilter(Request request, Response response) {
        for(int i=0;i<list.size();i++){
            list.get(i).doFilter(request,response);
        }
        return true;
    }
}

