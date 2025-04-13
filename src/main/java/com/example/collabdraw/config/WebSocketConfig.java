package com.example.collabdraw.config;

import com.example.collabdraw.controller.DrawingHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new DrawingHandler(), "/draw").setAllowedOrigins("*");
    }
}