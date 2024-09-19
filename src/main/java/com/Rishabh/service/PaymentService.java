package com.Rishabh.service;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.Rishabh.domain.PaymentMethod;
import com.Rishabh.model.PaymentOrder;
import com.Rishabh.model.User;
import com.Rishabh.response.PaymentResponse;

public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    Boolean ProccedPaymentOrder (PaymentOrder paymentOrder,
                                 String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLink(User user,
                                              Long Amount,
                                              Long orderId) throws RazorpayException;

    PaymentResponse createStripePaymentLink(User user, Long Amount,
                                            Long orderId) throws StripeException;
}
