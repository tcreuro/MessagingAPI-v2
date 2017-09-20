/**
 * TelstraMessagingAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io )
 */

'use strict';

const MessageSentResponse = require('../lib/Models/MessageSentResponse');
const OutboundPollResponse = require('../lib/Models/OutboundPollResponse');
const Message = require('../lib/Models/Message');
const SendSMSRequest = require('../lib/Models/SendSMSRequest');
const SendMMSRequest = require('../lib/Models/SendMMSRequest');
const MMSContent = require('../lib/Models/MMSContent');
const InboundPollResponse = require('../lib/Models/InboundPollResponse');
const OAuthToken = require('../lib/Models/OAuthToken');
const ErrorErrorErrorException = require('../lib/Exceptions/ErrorErrorErrorException');
const OAuthProviderException = require('../lib/Exceptions/OAuthProviderException');

const classMap = {
    MessageSentResponse,
    OutboundPollResponse,
    Message,
    SendSMSRequest,
    SendMMSRequest,
    MMSContent,
    InboundPollResponse,
    OAuthToken,
    ErrorErrorErrorException,
    OAuthProviderException,
};

/**
 * Factory class to create instances of models and exception classes
 */
class ModelFactory {
    /**
     * Creates instance of a model class
     * @param  modelName  {string}  Name of class to instantiate
     * @returns  {object} Instance of the model class
     */
    static getInstance(modelName) {
        return new classMap[modelName]();
    }
}

module.exports = ModelFactory;
