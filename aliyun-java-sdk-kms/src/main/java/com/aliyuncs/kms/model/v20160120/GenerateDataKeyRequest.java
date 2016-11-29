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
package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GenerateDataKeyRequest extends RpcAcsRequest<GenerateDataKeyResponse> {
	
	public GenerateDataKeyRequest() {
		super("Kms", "2016-01-20", "GenerateDataKey", "kms");
	}

	private String keyId;

	private String keySpec;

	private Integer numberOfBytes;

	private String sTSToken;

	private String encryptionContext;

	public String getKeyId() {
		return this.keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
		putQueryParameter("KeyId", keyId);
	}

	public String getKeySpec() {
		return this.keySpec;
	}

	public void setKeySpec(String keySpec) {
		this.keySpec = keySpec;
		putQueryParameter("KeySpec", keySpec);
	}

	public Integer getNumberOfBytes() {
		return this.numberOfBytes;
	}

	public void setNumberOfBytes(Integer numberOfBytes) {
		this.numberOfBytes = numberOfBytes;
		putQueryParameter("NumberOfBytes", numberOfBytes);
	}

	public String getSTSToken() {
		return this.sTSToken;
	}

	public void setSTSToken(String sTSToken) {
		this.sTSToken = sTSToken;
		putQueryParameter("STSToken", sTSToken);
	}

	public String getEncryptionContext() {
		return this.encryptionContext;
	}

	public void setEncryptionContext(String encryptionContext) {
		this.encryptionContext = encryptionContext;
		putQueryParameter("EncryptionContext", encryptionContext);
	}

	@Override
	public Class<GenerateDataKeyResponse> getResponseClass() {
		return GenerateDataKeyResponse.class;
	}

}
