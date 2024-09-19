package com.Rishabh.model;

import com.Rishabh.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {

    private boolean isEnabled = false;
    private VerificationType sendTo;
}
