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
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeScheduledTasksRequest extends RpcAcsRequest<DescribeScheduledTasksResponse> {
	   

	private Long resourceOwnerId;

	private List<String> scheduledActions;

	private String scalingGroupId;

	private Integer pageNumber;

	private Integer pageSize;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> scheduledTaskNames;

	private List<String> scheduledTaskIds;
	public DescribeScheduledTasksRequest() {
		super("Ess", "2014-08-28", "DescribeScheduledTasks", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<String> getScheduledActions() {
		return this.scheduledActions;
	}

	public void setScheduledActions(List<String> scheduledActions) {
		this.scheduledActions = scheduledActions;	
		if (scheduledActions != null) {
			for (int i = 0; i < scheduledActions.size(); i++) {
				putQueryParameter("ScheduledAction." + (i + 1) , scheduledActions.get(i));
			}
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public List<String> getScheduledTaskNames() {
		return this.scheduledTaskNames;
	}

	public void setScheduledTaskNames(List<String> scheduledTaskNames) {
		this.scheduledTaskNames = scheduledTaskNames;	
		if (scheduledTaskNames != null) {
			for (int i = 0; i < scheduledTaskNames.size(); i++) {
				putQueryParameter("ScheduledTaskName." + (i + 1) , scheduledTaskNames.get(i));
			}
		}	
	}

	public List<String> getScheduledTaskIds() {
		return this.scheduledTaskIds;
	}

	public void setScheduledTaskIds(List<String> scheduledTaskIds) {
		this.scheduledTaskIds = scheduledTaskIds;	
		if (scheduledTaskIds != null) {
			for (int i = 0; i < scheduledTaskIds.size(); i++) {
				putQueryParameter("ScheduledTaskId." + (i + 1) , scheduledTaskIds.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeScheduledTasksResponse> getResponseClass() {
		return DescribeScheduledTasksResponse.class;
	}

}
