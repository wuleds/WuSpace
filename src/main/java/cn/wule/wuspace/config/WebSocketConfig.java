package cn.wule.wuspace.config;
//汉江师范学院 数计学院 吴乐创建于2023/2/2 18:15:01

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * 获取ServerEndpoint对象
 * @author 吴乐
 */
@Configuration
public class WebSocketConfig
{
    /**注入ServerEndpointExporter的bean对象，自动注册使用@ServerEndpoint注解的bean*/
    @Bean
    public ServerEndpointExporter serverEndpointExporter()
    {
        return new ServerEndpointExporter();
    }
}