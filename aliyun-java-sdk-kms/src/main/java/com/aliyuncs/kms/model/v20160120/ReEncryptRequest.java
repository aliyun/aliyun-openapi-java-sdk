/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.kms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReEncryptRequest extends RpcAcsRequest<ReEncryptResponse> {
	   

	private String destinationEncryptionContext;

	private String sourceEncryptionAlgorithm;

	private String sourceKeyVersionId;

	private String destinationKeyId;

	private String sourceKeyId;

	private String sourceEncryptionContext;

	private String ciphertextBlob;
	public ReEncryptRequest() {
		super("Kms", "2016-01-20", "ReEncrypt", "kms-service");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDestinationEncryptionContext() {
		return this.destinationEncryptionContext;
	}

	public void setDestinationEncryptionContext(String destinationEncryptionContext) {
		this.destinationEncryptionContext = destinationEncryptionContext;
		if(destinationEncryptionContext != null){
			putQueryParameter("DestinationEncryptionContext", destinationEncryptionContext);
		}
	}

	public String getSourceEncryptionAlgorithm() {
		return this.sourceEncryptionAlgorithm;
	}

	public void setSourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
		this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
		if(sourceEncryptionAlgorithm != null){
			putQueryParameter("SourceEncryptionAlgorithm", sourceEncryptionAlgorithm);
		}
	}

	public String getSourceKeyVersionId() {
		return this.sourceKeyVersionId;
	}

	public void setSourceKeyVersionId(String sourceKeyVersionId) {
		this.sourceKeyVersionId = sourceKeyVersionId;
		if(sourceKeyVersionId != null){
			putQueryParameter("SourceKeyVersionId", sourceKeyVersionId);
		}
	}

	public String getDestinationKeyId() {
		return this.destinationKeyId;
	}

	public void setDestinationKeyId(String destinationKeyId) {
		this.destinationKeyId = destinationKeyId;
		if(destinationKeyId != null){
			putQueryParameter("DestinationKeyId", destinationKeyId);
		}
	}

	public String getSourceKeyId() {
		return this.sourceKeyId;
	}

	public void setSourceKeyId(String sourceKeyId) {
		this.sourceKeyId = sourceKeyId;
		if(sourceKeyId != null){
			putQueryParameter("SourceKeyId", sourceKeyId);
		}
	}

	public String getSourceEncryptionContext() {
		return this.sourceEncryptionContext;
	}

	public void setSourceEncryptionContext(String sourceEncryptionContext) {
		this.sourceEncryptionContext = sourceEncryptionContext;
		if(sourceEncryptionContext != null){
			putQueryParameter("SourceEncryptionContext", sourceEncryptionContext);
		}
	}

	public String getCiphertextBlob() {
		return this.ciphertextBlob;
	}

	public void setCiphertextBlob(String ciphertextBlob) {
		this.ciphertextBlob = ciphertextBlob;
		if(ciphertextBlob != null){
			putQueryParameter("CiphertextBlob", ciphertextBlob);
		}
	}

	@Override
	public Class<ReEncryptResponse> getResponseClass() {
		return ReEncryptResponse.class;
	}

}
