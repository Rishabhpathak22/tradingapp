package com.Rishabh.service;

import com.Rishabh.model.PaymentDetails;
import com.Rishabh.model.User;

public interface PaymentDetailsService {
    public PaymentDetails addPaymentDetails( String accountNumber,
                                             String accountHolderName,
                                             String ifsc,
                                             String bankName,
                                             User user
    );

    public PaymentDetails getUsersPaymentDetails(User user);


}
