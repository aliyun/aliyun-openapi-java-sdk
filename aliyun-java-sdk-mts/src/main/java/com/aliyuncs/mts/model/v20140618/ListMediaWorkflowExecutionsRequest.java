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
package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListMediaWorkflowExecutionsRequest extends RpcAcsRequest<ListMediaWorkflowExecutionsResponse> {
	
	public ListMediaWorkflowExecutionsRequest() {
		super("Mts", "2014-06-18", "ListMediaWorkflowExecutions");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String mediaWorkflowName;

	private String inputFileURL;

	private String nextPageToken;

	private Long maximumPageSize;

	private String ownerAccount;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getMediaWorkflowName() {
		return this.mediaWorkflowName;
	}

	public void setMediaWorkflowName(String mediaWorkflowName) {
		this.mediaWorkflowName = mediaWorkflowName;
		putQueryParameter("MediaWorkflowName", mediaWorkflowName);
	}

	public String getInputFileURL() {
		return this.inputFileURL;
	}

	public void setInputFileURL(String inputFileURL) {
		this.inputFileURL = inputFileURL;
		putQueryParameter("InputFileURL", inputFileURL);
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
		putQueryParameter("NextPageToken", nextPageToken);
	}

	public Long getMaximumPageSize() {
		return this.maximumPageSize;
	}

	public void setMaximumPageSize(Long maximumPageSize) {
		this.maximumPageSize = maximumPageSize;
		putQueryParameter("MaximumPageSize", maximumPageSize);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<ListMediaWorkflowExecutionsResponse> getResponseClass() {
		return ListMediaWorkflowExecutionsResponse.class;
	}

}
