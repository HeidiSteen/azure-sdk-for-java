// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/** Exception thrown for an invalid response with ResponseWithError information. */
public final class ResponseWithErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the ResponseWithErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public ResponseWithErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ResponseWithErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public ResponseWithErrorException(String message, HttpResponse response, ResponseWithError value) {
        super(message, response, value);
    }

    @Override
    public ResponseWithError getValue() {
        return (ResponseWithError) super.getValue();
    }
}
