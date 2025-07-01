package agents.multitool;


import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

import static dev.langchain4j.model.openai.OpenAiChatModelName.GPT_4_O_MINI;

public class OpenAILangchain4j {

    public static ChatModel buildChatModel(){
        String openAiKey = System.getenv("OPENAI_KEY");

       return  OpenAiChatModel.builder()
                    .apiKey(openAiKey)
                    .modelName(GPT_4_O_MINI)
                    .build();
    }
}
