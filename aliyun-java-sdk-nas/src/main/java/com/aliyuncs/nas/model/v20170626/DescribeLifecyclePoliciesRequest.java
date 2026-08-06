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
public class DescribeLifecyclePoliciesRequest extends RpcAcsRequest<DescribeLifecyclePoliciesResponse> {
	   

	private String description;

	private Integer pageNumber;

	private String storageType;

	private String path;

	private String lifecyclePolicyType;

	private String lifecyclePolicyName;

	private Integer pageSize;

	private String fileSystemId;

	private String lifecyclePolicyId;
	public DescribeLifecyclePoliciesRequest() {
		super("NAS", "2017-06-26", "DescribeLifecyclePolicies", "nas");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
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

	public String getLifecyclePolicyType() {
		return this.lifecyclePolicyType;
	}

	public void setLifecyclePolicyType(String lifecyclePolicyType) {
		this.lifecyclePolicyType = lifecyclePolicyType;
		if(lifecyclePolicyType != null){
			putQueryParameter("LifecyclePolicyType", lifecyclePolicyType);
		}
	}

	public String getLifecyclePolicyName() {
		return this.lifecyclePolicyName;
	}

	public void setLifecyclePolicyName(String lifecyclePolicyName) {
		this.lifecyclePolicyName = lifecyclePolicyName;
		if(lifecyclePolicyName != null){
			putQueryParameter("LifecyclePolicyName", lifecyclePolicyName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public String getLifecyclePolicyId() {
		return this.lifecyclePolicyId;
	}

	public void setLifecyclePolicyId(String lifecyclePolicyId) {
		this.lifecyclePolicyId = lifecyclePolicyId;
		if(lifecyclePolicyId != null){
			putQueryParameter("LifecyclePolicyId", lifecyclePolicyId);
		}
	}

	@Override
	public Class<DescribeLifecyclePoliciesResponse> getResponseClass() {
		return DescribeLifecyclePoliciesResponse.class;
	}

}
