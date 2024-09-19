package com.Rishabh.service;

import com.Rishabh.domain.VerificationType;
import com.Rishabh.model.User;
import com.Rishabh.model.VerificationCode;

public interface VerificationService {
    VerificationCode sendVerificationOTP(User user, VerificationType verificationType);

    VerificationCode findVerificationById(Long id) throws Exception;

    VerificationCode findUsersVerification(User user) throws Exception;

    Boolean VerifyOtp(String opt, VerificationCode verificationCode);

    void deleteVerification(VerificationCode verificationCode);
}
