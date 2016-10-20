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
package com.aliyuncs.green.model.v20161018;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PluginAntispamResultsRequest extends RpcAcsRequest<PluginAntispamResultsResponse> {
	
	public PluginAntispamResultsRequest() {
		super("Green", "2016-10-18", "PluginAntispamResults", "green");
		setMethod(MethodType.POST);
	}

	private String bizScene;

	private String clientVersion;

	private String postContentType;

	private String pageIndex;

	private String pageSize;

	public String getBizScene() {
		return this.bizScene;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
		putQueryParameter("BizScene", bizScene);
	}

	public String getClientVersion() {
		return this.clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		putQueryParameter("ClientVersion", clientVersion);
	}

	public String getPostContentType() {
		return this.postContentType;
	}

	public void setPostContentType(String postContentType) {
		this.postContentType = postContentType;
		putQueryParameter("PostContentType", postContentType);
	}

	public String getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
		putQueryParameter("PageIndex", pageIndex);
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	@Override
	public Class<PluginAntispamResultsResponse> getResponseClass() {
		return PluginAntispamResultsResponse.class;
	}

}
