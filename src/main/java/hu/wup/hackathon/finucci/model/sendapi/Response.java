package hu.wup.hackathon.finucci.model.sendapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    
    @JsonProperty("recipient_id")
    private String recipientId;
    @JsonProperty("message_id")
    private String messageId;

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}
