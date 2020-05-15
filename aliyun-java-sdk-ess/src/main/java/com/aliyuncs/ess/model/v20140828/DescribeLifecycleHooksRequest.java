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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeLifecycleHooksRequest extends RpcAcsRequest<DescribeLifecycleHooksResponse> {
	   

	private String scalingGroupId;

	private Integer pageNumber;

	private String lifecycleHookName;

	private Integer pageSize;

	private String resourceOwnerAccount;

	private List<String> lifecycleHookIds;

	private String ownerAccount;

	private Long ownerId;
	public DescribeLifecycleHooksRequest() {
		super("Ess", "2014-08-28", "DescribeLifecycleHooks", "ess");
		setMethod(MethodType.POST);
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
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

	public String getLifecycleHookName() {
		return this.lifecycleHookName;
	}

	public void setLifecycleHookName(String lifecycleHookName) {
		this.lifecycleHookName = lifecycleHookName;
		if(lifecycleHookName != null){
			putQueryParameter("LifecycleHookName", lifecycleHookName);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public List<String> getLifecycleHookIds() {
		return this.lifecycleHookIds;
	}

	public void setLifecycleHookIds(List<String> lifecycleHookIds) {
		this.lifecycleHookIds = lifecycleHookIds;	
		if (lifecycleHookIds != null) {
			for (int i = 0; i < lifecycleHookIds.size(); i++) {
				putQueryParameter("LifecycleHookId." + (i + 1) , lifecycleHookIds.get(i));
			}
		}	
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<DescribeLifecycleHooksResponse> getResponseClass() {
		return DescribeLifecycleHooksResponse.class;
	}

}
