package com.Rishabh.service;

import com.Rishabh.model.Coin;
import com.Rishabh.model.User;
import com.Rishabh.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
