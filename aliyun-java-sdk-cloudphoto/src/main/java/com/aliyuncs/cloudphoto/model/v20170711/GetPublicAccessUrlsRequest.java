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
package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class GetPublicAccessUrlsRequest extends RpcAcsRequest<GetPublicAccessUrlsResponse> {
	
	public GetPublicAccessUrlsRequest() {
		super("CloudPhoto", "2017-07-11", "GetPublicAccessUrls", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private String domainType;

	private String libraryId;

	private List<Long> photoIds;

	private String storeName;

	private String zoomType;

	public String getDomainType() {
		return this.domainType;
	}

	public void setDomainType(String domainType) {
		this.domainType = domainType;
		if(domainType != null){
			putQueryParameter("DomainType", domainType);
		}
	}

	public String getLibraryId() {
		return this.libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
		if(libraryId != null){
			putQueryParameter("LibraryId", libraryId);
		}
	}

	public List<Long> getPhotoIds() {
		return this.photoIds;
	}

	public void setPhotoIds(List<Long> photoIds) {
		this.photoIds = photoIds;	
		if (photoIds != null) {
			for (int i = 0; i < photoIds.size(); i++) {
				putQueryParameter("PhotoId." + (i + 1) , photoIds.get(i));
			}
		}	
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putQueryParameter("StoreName", storeName);
		}
	}

	public String getZoomType() {
		return this.zoomType;
	}

	public void setZoomType(String zoomType) {
		this.zoomType = zoomType;
		if(zoomType != null){
			putQueryParameter("ZoomType", zoomType);
		}
	}

	@Override
	public Class<GetPublicAccessUrlsResponse> getResponseClass() {
		return GetPublicAccessUrlsResponse.class;
	}

}
