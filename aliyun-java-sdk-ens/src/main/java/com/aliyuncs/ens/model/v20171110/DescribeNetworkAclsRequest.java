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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkAclsRequest extends RpcAcsRequest<DescribeNetworkAclsResponse> {
	   

	private String pageNumber;

	private String pageSize;

	private String networkAclId;

	private String resourceId;

	private String networkAclName;
	public DescribeNetworkAclsRequest() {
		super("Ens", "2017-11-10", "DescribeNetworkAcls", "ens");
		setMethod(MethodType.GET);
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getNetworkAclId() {
		return this.networkAclId;
	}

	public void setNetworkAclId(String networkAclId) {
		this.networkAclId = networkAclId;
		if(networkAclId != null){
			putQueryParameter("NetworkAclId", networkAclId);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getNetworkAclName() {
		return this.networkAclName;
	}

	public void setNetworkAclName(String networkAclName) {
		this.networkAclName = networkAclName;
		if(networkAclName != null){
			putQueryParameter("NetworkAclName", networkAclName);
		}
	}

	@Override
	public Class<DescribeNetworkAclsResponse> getResponseClass() {
		return DescribeNetworkAclsResponse.class;
	}

}
