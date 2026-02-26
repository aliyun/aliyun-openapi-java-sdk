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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceGroupsRequest extends RpcAcsRequest<DescribeResourceGroupsResponse> {
	   

	private String resourceGroupName;

	private Long needContainResourceGroupWithOfficeSite;

	private Integer pageNumber;

	private String platform;

	private List<String> resourceGroupIds;

	private Integer pageSize;
	public DescribeResourceGroupsRequest() {
		super("eds-user", "2021-03-08", "DescribeResourceGroups", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceGroupName() {
		return this.resourceGroupName;
	}

	public void setResourceGroupName(String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
		if(resourceGroupName != null){
			putQueryParameter("ResourceGroupName", resourceGroupName);
		}
	}

	public Long getNeedContainResourceGroupWithOfficeSite() {
		return this.needContainResourceGroupWithOfficeSite;
	}

	public void setNeedContainResourceGroupWithOfficeSite(Long needContainResourceGroupWithOfficeSite) {
		this.needContainResourceGroupWithOfficeSite = needContainResourceGroupWithOfficeSite;
		if(needContainResourceGroupWithOfficeSite != null){
			putQueryParameter("NeedContainResourceGroupWithOfficeSite", needContainResourceGroupWithOfficeSite.toString());
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

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public List<String> getResourceGroupIds() {
		return this.resourceGroupIds;
	}

	public void setResourceGroupIds(List<String> resourceGroupIds) {
		this.resourceGroupIds = resourceGroupIds;	
		if (resourceGroupIds != null) {
			for (int depth1 = 0; depth1 < resourceGroupIds.size(); depth1++) {
				putQueryParameter("ResourceGroupIds." + (depth1 + 1) , resourceGroupIds.get(depth1));
			}
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

	@Override
	public Class<DescribeResourceGroupsResponse> getResponseClass() {
		return DescribeResourceGroupsResponse.class;
	}

}
