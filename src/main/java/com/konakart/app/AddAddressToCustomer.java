package com.konakart.app;

import com.konakart.appif.*;

// edit for VERITA-196
/**
 *  The KonaKart Custom Engine - AddAddressToCustomer - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class AddAddressToCustomer
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public AddAddressToCustomer(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public int addAddressToCustomer(String sessionId, AddressIf addr) throws KKException
     {
         return kkEng.addAddressToCustomer(sessionId, addr);
     }
}
