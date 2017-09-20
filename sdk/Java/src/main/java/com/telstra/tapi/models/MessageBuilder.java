/*
 * TelstraMessagingAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.telstra.tapi.models;

import java.util.*;

public class MessageBuilder {
    //the instance to build
    private Message message;

    /**
     * Default constructor to initialize the instance
     */
    public MessageBuilder() {
        message = new Message();
    }

    public MessageBuilder to(String to) {
        message.setTo(to);
        return this;
    }

    public MessageBuilder deliveryStatus(String deliveryStatus) {
        message.setDeliveryStatus(deliveryStatus);
        return this;
    }

    public MessageBuilder messageId(String messageId) {
        message.setMessageId(messageId);
        return this;
    }

    public MessageBuilder messageStatusLink(String messageStatusLink) {
        message.setMessageStatusLink(messageStatusLink);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Message build() {
        return message;
    }
}