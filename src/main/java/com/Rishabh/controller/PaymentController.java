package com.Rishabh.controller;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.Rishabh.domain.PaymentMethod;
import com.Rishabh.exception.UserException;
import com.Rishabh.model.PaymentOrder;
import com.Rishabh.model.User;
import com.Rishabh.response.PaymentResponse;
import com.Rishabh.service.PaymentService;
import com.Rishabh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private UserService userService;

    @Autowired
    private PaymentService paymentService;



    @PostMapping("/api/payment/{paymentMethod}/amount/{amount}")
    public ResponseEntity<PaymentResponse> paymentHandler(
            @PathVariable PaymentMethod paymentMethod,
            @PathVariable Long amount,
            @RequestHeader("Authorization") String jwt) throws UserException, RazorpayException, StripeException {

        User user = userService.findUserProfileByJwt(jwt);

        PaymentResponse paymentResponse;

        PaymentOrder order= paymentService.createOrder(user, amount,paymentMethod);

        if(paymentMethod.equals(PaymentMethod.RAZORPAY)){
            paymentResponse=paymentService.createRazorpayPaymentLink(user,amount,
                    order.getId());
        }
        else{
            paymentResponse=paymentService.createStripePaymentLink(user,amount, order.getId());
        }

        return new ResponseEntity<>(paymentResponse, HttpStatus.CREATED);
    }


}
