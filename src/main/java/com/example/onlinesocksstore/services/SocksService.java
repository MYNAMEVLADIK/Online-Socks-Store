package com.example.onlinesocksstore.services;

import com.example.onlinesocksstore.model.Color;
import com.example.onlinesocksstore.model.InternationalSockSize;
import com.example.onlinesocksstore.model.Socks;

public interface SocksService {
    void addSocks(Socks socks, Integer numberPairs);

    void releaseSocks(Socks socks, Integer numberPairs);

    void deleteSocks(Socks socks, Integer numberPairs);

    Integer getAllSocks(Color color, InternationalSockSize size, Integer cottonMin, Integer cottonMax);

}

