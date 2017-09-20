/*
 * TelstraMessagingAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.telstra.tapi.models;

import java.util.*;

public class MessageSentResponseBuilder {
    //the instance to build
    private MessageSentResponse messageSentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public MessageSentResponseBuilder() {
        messageSentResponse = new MessageSentResponse();
    }

    public MessageSentResponseBuilder messages(List<Message> messages) {
        messageSentResponse.setMessages(messages);
        return this;
    }

    public MessageSentResponseBuilder messageType(String messageType) {
        messageSentResponse.setMessageType(messageType);
        return this;
    }

    public MessageSentResponseBuilder numberSegments(int numberSegments) {
        messageSentResponse.setNumberSegments(numberSegments);
        return this;
    }

    public MessageSentResponseBuilder numberDestinations(int numberDestinations) {
        messageSentResponse.setNumberDestinations(numberDestinations);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MessageSentResponse build() {
        return messageSentResponse;
    }
}