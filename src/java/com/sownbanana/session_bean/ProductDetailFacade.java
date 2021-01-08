/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sownbanana.session_bean;

import com.sownbanana.entity.ProductDetail;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SownBanana
 */
@Stateless
public class ProductDetailFacade extends AbstractFacade<ProductDetail> {

    @PersistenceContext(unitName = "eMartketPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductDetailFacade() {
        super(ProductDetail.class);
    }
    
}
