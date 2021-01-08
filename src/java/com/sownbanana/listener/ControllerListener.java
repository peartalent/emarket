///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.sownbanana.listener;
//
//import com.sownbanana.session_bean.ProductFacade;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//
///**
// * Web application lifecycle listener.
// *
// * @author SownBanana
// */
//public class ControllerListener implements ServletContextListener {
//
//    ProductFacade productSessionBean;
//    ServletContext context;
//
//    @Override
//    public void contextInitialized(ServletContextEvent sce) {
//        context = sce.getServletContext();
//        context.setAttribute("newProducts", productSessionBean.findRange(new int[]{0, 5}));
//    }
//
//    @Override
//    public void contextDestroyed(ServletContextEvent sce) {
//    }
//}
