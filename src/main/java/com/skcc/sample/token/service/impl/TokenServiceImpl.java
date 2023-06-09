package com.skcc.sample.token.service.impl;

import com.skcc.sample.chainz.service.ChainzService;
import com.skcc.sample.token.dto.CreateTokenDto;
import com.skcc.sample.token.service.TokenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TokenServiceImpl implements TokenService {

    private final ChainzService chainzService;

    @Override
    public String createErc20Token(CreateTokenDto.Request request) {
        return chainzService.createErc20Token( request.getName(), request.getSymbol(), request.getDescription(), request.getAmount() );
    }
}
