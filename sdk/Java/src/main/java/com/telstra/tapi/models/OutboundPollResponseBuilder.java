/*
 * TelstraMessagingAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.telstra.tapi.models;

import java.util.*;

public class OutboundPollResponseBuilder {
    //the instance to build
    private OutboundPollResponse outboundPollResponse;

    /**
     * Default constructor to initialize the instance
     */
    public OutboundPollResponseBuilder() {
        outboundPollResponse = new OutboundPollResponse();
    }

    /**
     * The phone number (recipient) the message was sent to (in E.164
     * format).
     */
    public OutboundPollResponseBuilder to(String to) {
        outboundPollResponse.setTo(to);
        return this;
    }

    /**
     * The date and time when the message was recieved by recipient.
     */
    public OutboundPollResponseBuilder receivedTimestamp(String receivedTimestamp) {
        outboundPollResponse.setReceivedTimestamp(receivedTimestamp);
        return this;
    }

    /**
     * The date and time when the message was sent.
     */
    public OutboundPollResponseBuilder sentTimestamp(String sentTimestamp) {
        outboundPollResponse.setSentTimestamp(sentTimestamp);
        return this;
    }

    public OutboundPollResponseBuilder deliveryStatus(StatusEnum deliveryStatus) {
        outboundPollResponse.setDeliveryStatus(deliveryStatus);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OutboundPollResponse build() {
        return outboundPollResponse;
    }
}