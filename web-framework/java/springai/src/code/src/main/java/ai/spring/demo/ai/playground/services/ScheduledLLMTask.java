package ai.spring.demo.ai.playground.services;

import com.alibaba.cloud.ai.dashscope.chat.DashScopeChatOptions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduledLLMTask {
    
    private ChatClient chatClient;

    public ScheduledLLMTask(ChatClient.Builder clientBuilder) {

        // @formatter:off
        this.chatClient = clientBuilder
                .defaultSystem("请为我随机生成一个水果名，不需要添加额外的信息")
                .build();
        // @formatter:on
    }

    @Scheduled(fixedRate = 2000)
    public void queryFruit() {
        String fruitName = chatClient
                .prompt()
                .options(DashScopeChatOptions.builder().withModel("qwen-plus").build())
                .call().content();
        log.info("Result of scheduled task: {}.", fruitName);
    }
}
