package agents.multitool;


import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;

public class OllamaLangchain4J {

    public static ChatModel buildChatModel(){
        String ollamaModelName = System.getenv("OLLAMA_MODEL_NAME");
        String ollamaBaseUrl = System.getenv("OLLAMA_URL");
       
        //check env variables
        if (ollamaModelName == null || ollamaModelName.isEmpty())
            throw new IllegalArgumentException("OLLAMA_MODEL_NAME environment variable is not set.");
        
        if (ollamaBaseUrl == null || ollamaBaseUrl.isEmpty())
            throw new IllegalArgumentException("OLLAMA_URL environment variable is not set.");

        return  OllamaChatModel.builder()
              .baseUrl(ollamaBaseUrl)
              .modelName(ollamaModelName)
              .build();
    }
}
