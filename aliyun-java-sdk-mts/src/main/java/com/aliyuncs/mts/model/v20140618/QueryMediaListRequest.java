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
public class QueryMediaListRequest extends RpcAcsRequest<QueryMediaListResponse> {
	
	public QueryMediaListRequest() {
		super("Mts", "2014-06-18", "QueryMediaList");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String mediaIds;

	private Boolean includePlayList;

	private Boolean includeSnapshotList;

	private Boolean includeMediaInfo;

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

	public String getMediaIds() {
		return this.mediaIds;
	}

	public void setMediaIds(String mediaIds) {
		this.mediaIds = mediaIds;
		putQueryParameter("MediaIds", mediaIds);
	}

	public Boolean getIncludePlayList() {
		return this.includePlayList;
	}

	public void setIncludePlayList(Boolean includePlayList) {
		this.includePlayList = includePlayList;
		putQueryParameter("IncludePlayList", includePlayList);
	}

	public Boolean getIncludeSnapshotList() {
		return this.includeSnapshotList;
	}

	public void setIncludeSnapshotList(Boolean includeSnapshotList) {
		this.includeSnapshotList = includeSnapshotList;
		putQueryParameter("IncludeSnapshotList", includeSnapshotList);
	}

	public Boolean getIncludeMediaInfo() {
		return this.includeMediaInfo;
	}

	public void setIncludeMediaInfo(Boolean includeMediaInfo) {
		this.includeMediaInfo = includeMediaInfo;
		putQueryParameter("IncludeMediaInfo", includeMediaInfo);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<QueryMediaListResponse> getResponseClass() {
		return QueryMediaListResponse.class;
	}

}
