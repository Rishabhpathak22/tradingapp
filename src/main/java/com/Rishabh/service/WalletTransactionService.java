package com.Rishabh.service;

import com.Rishabh.domain.WalletTransactionType;
import com.Rishabh.model.Wallet;
import com.Rishabh.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
