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
public class SetSignatureApisRequest extends RpcAcsRequest<SetSignatureApisResponse> {
	
	public SetSignatureApisRequest() {
		super("CloudAPI", "2016-07-14", "SetSignatureApis", "apigateway");
	}

	private String signatureId;

	private String groupId;

	private String apiIds;

	private String stageName;

	public String getSignatureId() {
		return this.signatureId;
	}

	public void setSignatureId(String signatureId) {
		this.signatureId = signatureId;
		putQueryParameter("SignatureId", signatureId);
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		putQueryParameter("GroupId", groupId);
	}

	public String getApiIds() {
		return this.apiIds;
	}

	public void setApiIds(String apiIds) {
		this.apiIds = apiIds;
		putQueryParameter("ApiIds", apiIds);
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
		putQueryParameter("StageName", stageName);
	}

	@Override
	public Class<SetSignatureApisResponse> getResponseClass() {
		return SetSignatureApisResponse.class;
	}

}
