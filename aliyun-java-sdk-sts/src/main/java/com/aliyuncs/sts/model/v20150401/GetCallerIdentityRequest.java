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
package com.aliyuncs.sts.model.v20150401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class GetCallerIdentityRequest extends RpcAcsRequest<GetCallerIdentityResponse> {

	public GetCallerIdentityRequest() {
		super("Sts", "2015-04-01", "GetCallerIdentity");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String externalId;

	private String serialNumber;

	private String tokenCode;

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
		putQueryParameter("ExternalId", externalId);
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		putQueryParameter("SerialNumber", serialNumber);
	}

	public String getTokenCode() {
		return this.tokenCode;
	}

	public void setTokenCode(String tokenCode) {
		this.tokenCode = tokenCode;
		putQueryParameter("TokenCode", tokenCode);
	}

	@Override
	public Class<GetCallerIdentityResponse> getResponseClass() {
		return GetCallerIdentityResponse.class;
	}

}
