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

/**
 * @author auto create
 * @version 
 */
public class DescribeLifecycleHooksRequest extends RpcAcsRequest<DescribeLifecycleHooksResponse> {
	
	public DescribeLifecycleHooksRequest() {
		super("Ess", "2014-08-28", "DescribeLifecycleHooks", "ess");
	}

	private String lifecycleHookName;

	private String resourceOwnerAccount;

	private String scalingGroupId;

	private List<String> lifecycleHookIds;

	private String ownerAccount;

	private Integer pageSize;

	private Long ownerId;

	private Integer pageNumber;

	public String getLifecycleHookName() {
		return this.lifecycleHookName;
	}

	public void setLifecycleHookName(String lifecycleHookName) {
		this.lifecycleHookName = lifecycleHookName;
		if(lifecycleHookName != null){
			putQueryParameter("LifecycleHookName", lifecycleHookName);
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

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<DescribeLifecycleHooksResponse> getResponseClass() {
		return DescribeLifecycleHooksResponse.class;
	}

}
