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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDirQuotaRequest extends RpcAcsRequest<SetDirQuotaResponse> {
	   

	private String quotaType;

	private String userId;

	private Long fileCountLimit;

	private String path;

	private Long sizeLimit;

	private String fileSystemId;

	private String userType;
	public SetDirQuotaRequest() {
		super("NAS", "2017-06-26", "SetDirQuota", "NAS");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQuotaType() {
		return this.quotaType;
	}

	public void setQuotaType(String quotaType) {
		this.quotaType = quotaType;
		if(quotaType != null){
			putQueryParameter("QuotaType", quotaType);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public Long getFileCountLimit() {
		return this.fileCountLimit;
	}

	public void setFileCountLimit(Long fileCountLimit) {
		this.fileCountLimit = fileCountLimit;
		if(fileCountLimit != null){
			putQueryParameter("FileCountLimit", fileCountLimit.toString());
		}
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putQueryParameter("Path", path);
		}
	}

	public Long getSizeLimit() {
		return this.sizeLimit;
	}

	public void setSizeLimit(Long sizeLimit) {
		this.sizeLimit = sizeLimit;
		if(sizeLimit != null){
			putQueryParameter("SizeLimit", sizeLimit.toString());
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType);
		}
	}

	@Override
	public Class<SetDirQuotaResponse> getResponseClass() {
		return SetDirQuotaResponse.class;
	}

}
