/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateSignatureRequest extends RpcAcsRequest<CreateSignatureResponse> {
	
	public CreateSignatureRequest() {
		super("CloudAPI", "2016-07-14", "CreateSignature", "apigateway");
	}

	private String signatureName;

	private String signatureKey;

	private String signatureSecret;

	public String getSignatureName() {
		return this.signatureName;
	}

	public void setSignatureName(String signatureName) {
		this.signatureName = signatureName;
		putQueryParameter("SignatureName", signatureName);
	}

	public String getSignatureKey() {
		return this.signatureKey;
	}

	public void setSignatureKey(String signatureKey) {
		this.signatureKey = signatureKey;
		putQueryParameter("SignatureKey", signatureKey);
	}

	public String getSignatureSecret() {
		return this.signatureSecret;
	}

	public void setSignatureSecret(String signatureSecret) {
		this.signatureSecret = signatureSecret;
		putQueryParameter("SignatureSecret", signatureSecret);
	}

	@Override
	public Class<CreateSignatureResponse> getResponseClass() {
		return CreateSignatureResponse.class;
	}

}
