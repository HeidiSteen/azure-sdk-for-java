// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence;

import com.azure.ai.documentintelligence.implementation.DocumentIntelligenceClientImpl;
import com.azure.ai.documentintelligence.models.AnalyzeDocumentRequest;
import com.azure.ai.documentintelligence.models.AnalyzeResultOperation;
import com.azure.ai.documentintelligence.models.ClassifyDocumentRequest;
import com.azure.ai.documentintelligence.models.ContentFormat;
import com.azure.ai.documentintelligence.models.DocumentAnalysisFeature;
import com.azure.ai.documentintelligence.models.SplitMode;
import com.azure.ai.documentintelligence.models.StringIndexType;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Initializes a new instance of the synchronous DocumentIntelligenceClient type.
 */
@ServiceClient(builder = DocumentIntelligenceClientBuilder.class)
public final class DocumentIntelligenceClient {
    @Generated
    private final DocumentIntelligenceClientImpl serviceClient;

    /**
     * Initializes an instance of DocumentIntelligenceClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    DocumentIntelligenceClient(DocumentIntelligenceClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Analyzes document with document model.
     * <p>
     * <strong>Query Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>pages</td>
     * <td>String</td>
     * <td>No</td>
     * <td>List of 1-based page numbers to analyze. Ex. "1-3,5,7-9"</td>
     * </tr>
     * <tr>
     * <td>locale</td>
     * <td>String</td>
     * <td>No</td>
     * <td>Locale hint for text recognition and document analysis. Value may contain only
     * the language code (ex. "en", "fr") or BCP 47 language tag (ex. "en-US").</td>
     * </tr>
     * <tr>
     * <td>stringIndexType</td>
     * <td>String</td>
     * <td>No</td>
     * <td>Method used to compute string offset and length. Allowed values: "textElements", "unicodeCodePoint",
     * "utf16CodeUnit".</td>
     * </tr>
     * <tr>
     * <td>features</td>
     * <td>List&lt;String&gt;</td>
     * <td>No</td>
     * <td>List of optional analysis features. In the form of "," separated string.</td>
     * </tr>
     * <tr>
     * <td>queryFields</td>
     * <td>List&lt;String&gt;</td>
     * <td>No</td>
     * <td>List of additional fields to extract. Ex. "NumberOfGuests,StoreNumber". In the form of "," separated
     * string.</td>
     * </tr>
     * <tr>
     * <td>outputContentFormat</td>
     * <td>String</td>
     * <td>No</td>
     * <td>Format of the analyze result top-level content. Allowed values: "text", "markdown".</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     urlSource: String (Optional)
     *     base64Source: byte[] (Optional)
     * }
     * }</pre>
     * 
     * @param modelId Unique document model name.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginAnalyzeDocument(String modelId, RequestOptions requestOptions) {
        return this.serviceClient.beginAnalyzeDocument(modelId, requestOptions);
    }

    /**
     * Classifies document with document classifier.
     * <p>
     * <strong>Query Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>stringIndexType</td>
     * <td>String</td>
     * <td>No</td>
     * <td>Method used to compute string offset and length. Allowed values: "textElements", "unicodeCodePoint",
     * "utf16CodeUnit".</td>
     * </tr>
     * <tr>
     * <td>split</td>
     * <td>String</td>
     * <td>No</td>
     * <td>Document splitting mode. Allowed values: "auto", "none", "perPage".</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     urlSource: String (Optional)
     *     base64Source: byte[] (Optional)
     * }
     * }</pre>
     * 
     * @param classifierId Unique document classifier name.
     * @param classifyRequest Classify request parameters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginClassifyDocument(String classifierId, BinaryData classifyRequest,
        RequestOptions requestOptions) {
        return this.serviceClient.beginClassifyDocument(classifierId, classifyRequest, requestOptions);
    }

    /**
     * Analyzes document with document model.
     * 
     * @param modelId Unique document model name.
     * @param pages List of 1-based page numbers to analyze. Ex. "1-3,5,7-9".
     * @param locale Locale hint for text recognition and document analysis. Value may contain only
     * the language code (ex. "en", "fr") or BCP 47 language tag (ex. "en-US").
     * @param stringIndexType Method used to compute string offset and length.
     * @param features List of optional analysis features.
     * @param queryFields List of additional fields to extract. Ex. "NumberOfGuests,StoreNumber".
     * @param outputContentFormat Format of the analyze result top-level content.
     * @param analyzeRequest Analyze request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<AnalyzeResultOperation, AnalyzeResultOperation> beginAnalyzeDocument(String modelId, String pages,
        String locale, StringIndexType stringIndexType, List<DocumentAnalysisFeature> features,
        List<String> queryFields, ContentFormat outputContentFormat, AnalyzeDocumentRequest analyzeRequest) {
        // Generated convenience method for beginAnalyzeDocumentWithModel
        RequestOptions requestOptions = new RequestOptions();
        if (pages != null) {
            requestOptions.addQueryParam("pages", pages, false);
        }
        if (locale != null) {
            requestOptions.addQueryParam("locale", locale, false);
        }
        if (stringIndexType != null) {
            requestOptions.addQueryParam("stringIndexType", stringIndexType.toString(), false);
        }
        if (features != null) {
            requestOptions.addQueryParam("features", features.stream()
                .map(paramItemValue -> Objects.toString(paramItemValue, "")).collect(Collectors.joining(",")), false);
        }
        if (queryFields != null) {
            requestOptions.addQueryParam("queryFields", queryFields.stream()
                .map(paramItemValue -> Objects.toString(paramItemValue, "")).collect(Collectors.joining(",")), false);
        }
        if (outputContentFormat != null) {
            requestOptions.addQueryParam("outputContentFormat", outputContentFormat.toString(), false);
        }
        if (analyzeRequest != null) {
            requestOptions.setBody(BinaryData.fromObject(analyzeRequest));
        }
        return serviceClient.beginAnalyzeDocumentWithModel(modelId, requestOptions);
    }

    /**
     * Analyzes document with document model.
     * 
     * @param modelId Unique document model name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<AnalyzeResultOperation, AnalyzeResultOperation> beginAnalyzeDocument(String modelId) {
        // Generated convenience method for beginAnalyzeDocumentWithModel
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.beginAnalyzeDocumentWithModel(modelId, requestOptions);
    }

    /**
     * Classifies document with document classifier.
     * 
     * @param classifierId Unique document classifier name.
     * @param classifyRequest Classify request parameters.
     * @param stringIndexType Method used to compute string offset and length.
     * @param split Document splitting mode.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<AnalyzeResultOperation, AnalyzeResultOperation> beginClassifyDocument(String classifierId,
        ClassifyDocumentRequest classifyRequest, StringIndexType stringIndexType, SplitMode split) {
        // Generated convenience method for beginClassifyDocumentWithModel
        RequestOptions requestOptions = new RequestOptions();
        if (stringIndexType != null) {
            requestOptions.addQueryParam("stringIndexType", stringIndexType.toString(), false);
        }
        if (split != null) {
            requestOptions.addQueryParam("split", split.toString(), false);
        }
        return serviceClient.beginClassifyDocumentWithModel(classifierId, BinaryData.fromObject(classifyRequest),
            requestOptions);
    }

    /**
     * Classifies document with document classifier.
     * 
     * @param classifierId Unique document classifier name.
     * @param classifyRequest Classify request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<AnalyzeResultOperation, AnalyzeResultOperation> beginClassifyDocument(String classifierId,
        ClassifyDocumentRequest classifyRequest) {
        // Generated convenience method for beginClassifyDocumentWithModel
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.beginClassifyDocumentWithModel(classifierId, BinaryData.fromObject(classifyRequest),
            requestOptions);
    }
}
