package com.Rishabh.service;

import com.Rishabh.model.CoinDTO;
import com.Rishabh.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
