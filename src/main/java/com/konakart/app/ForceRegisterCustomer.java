package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - ForceRegisterCustomer - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class ForceRegisterCustomer
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public ForceRegisterCustomer(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public int forceRegisterCustomer(CustomerRegistrationIf custReg) throws KKException
     {
         return kkEng.forceRegisterCustomer(custReg);
     }
}