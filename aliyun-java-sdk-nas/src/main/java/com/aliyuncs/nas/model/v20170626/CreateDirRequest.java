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
public class CreateDirRequest extends RpcAcsRequest<CreateDirResponse> {
	   

	private Boolean recursion;

	private String fileSystemId;

	private Integer ownerGroupId;

	private Integer ownerUserId;

	private String permission;

	private String rootDirectory;
	public CreateDirRequest() {
		super("NAS", "2017-06-26", "CreateDir", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getRecursion() {
		return this.recursion;
	}

	public void setRecursion(Boolean recursion) {
		this.recursion = recursion;
		if(recursion != null){
			putQueryParameter("Recursion", recursion.toString());
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

	public Integer getOwnerGroupId() {
		return this.ownerGroupId;
	}

	public void setOwnerGroupId(Integer ownerGroupId) {
		this.ownerGroupId = ownerGroupId;
		if(ownerGroupId != null){
			putQueryParameter("OwnerGroupId", ownerGroupId.toString());
		}
	}

	public Integer getOwnerUserId() {
		return this.ownerUserId;
	}

	public void setOwnerUserId(Integer ownerUserId) {
		this.ownerUserId = ownerUserId;
		if(ownerUserId != null){
			putQueryParameter("OwnerUserId", ownerUserId.toString());
		}
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
		if(permission != null){
			putQueryParameter("Permission", permission);
		}
	}

	public String getRootDirectory() {
		return this.rootDirectory;
	}

	public void setRootDirectory(String rootDirectory) {
		this.rootDirectory = rootDirectory;
		if(rootDirectory != null){
			putQueryParameter("RootDirectory", rootDirectory);
		}
	}

	@Override
	public Class<CreateDirResponse> getResponseClass() {
		return CreateDirResponse.class;
	}

}
