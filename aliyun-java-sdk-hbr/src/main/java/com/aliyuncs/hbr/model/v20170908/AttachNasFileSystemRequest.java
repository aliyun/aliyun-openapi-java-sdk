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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AttachNasFileSystemRequest extends RpcAcsRequest<AttachNasFileSystemResponse> {
	   

	private String createTime;

	private String crossAccountType;

	private String crossAccountRoleName;

	private Long crossAccountUserId;

	private String fileSystemId;
	public AttachNasFileSystemRequest() {
		super("hbr", "2017-09-08", "AttachNasFileSystem", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
		if(createTime != null){
			putQueryParameter("CreateTime", createTime);
		}
	}

	public String getCrossAccountType() {
		return this.crossAccountType;
	}

	public void setCrossAccountType(String crossAccountType) {
		this.crossAccountType = crossAccountType;
		if(crossAccountType != null){
			putQueryParameter("CrossAccountType", crossAccountType);
		}
	}

	public String getCrossAccountRoleName() {
		return this.crossAccountRoleName;
	}

	public void setCrossAccountRoleName(String crossAccountRoleName) {
		this.crossAccountRoleName = crossAccountRoleName;
		if(crossAccountRoleName != null){
			putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
		}
	}

	public Long getCrossAccountUserId() {
		return this.crossAccountUserId;
	}

	public void setCrossAccountUserId(Long crossAccountUserId) {
		this.crossAccountUserId = crossAccountUserId;
		if(crossAccountUserId != null){
			putQueryParameter("CrossAccountUserId", crossAccountUserId.toString());
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

	@Override
	public Class<AttachNasFileSystemResponse> getResponseClass() {
		return AttachNasFileSystemResponse.class;
	}

}
