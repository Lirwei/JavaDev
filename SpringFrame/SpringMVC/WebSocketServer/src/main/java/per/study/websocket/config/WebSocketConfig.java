package per.study.websocket.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;
import per.study.websocket.Interceptor.WebSocketHandshakeInterceptor;
import per.study.websocket.handler.MyHandler;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(getMyHandler(), "/websocket/myHandler.do")
                .addInterceptors(new WebSocketHandshakeInterceptor())
                .setAllowedOrigins("*"); /*设置允许跨域访问*/
    }

    @Bean
    public WebSocketHandler getMyHandler() {
        return new MyHandler();
    }

}
