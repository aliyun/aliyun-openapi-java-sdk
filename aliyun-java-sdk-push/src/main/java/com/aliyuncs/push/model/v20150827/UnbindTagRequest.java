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
package com.aliyuncs.push.model.v20150827;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UnbindTagRequest extends RpcAcsRequest<UnbindTagResponse> {
	
	public UnbindTagRequest() {
		super("Push", "2015-08-27", "UnbindTag");
	}

	private Long appKey;

	private String clientKey;

	private Integer keyType;

	private String tagName;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public String getClientKey() {
		return this.clientKey;
	}

	public void setClientKey(String clientKey) {
		this.clientKey = clientKey;
		putQueryParameter("ClientKey", clientKey);
	}

	public Integer getKeyType() {
		return this.keyType;
	}

	public void setKeyType(Integer keyType) {
		this.keyType = keyType;
		putQueryParameter("KeyType", keyType);
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
		putQueryParameter("TagName", tagName);
	}

	@Override
	public Class<UnbindTagResponse> getResponseClass() {
		return UnbindTagResponse.class;
	}

}
