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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceHistoryEventsRequest extends RpcAcsRequest<DescribeInstanceHistoryEventsResponse> {
	   

	private Long resourceOwnerId;

	private String impactLevel;

	private String resourceGroupId;

	private List<String> instanceEventCycleStatuss;

	private List<Tag> tags;

	private String notBeforeStart;

	private Long ownerId;

	private String instanceId;

	private String notBeforeEnd;

	private Long maxResults;

	private String eventType;

	private List<String> eventIds;

	private String eventCycleStatus;

	private Integer pageNumber;

	private String nextToken;

	private Integer pageSize;

	private String eventPublishTimeEnd;

	private List<String> resourceIds;

	private List<String> instanceEventTypes;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String resourceType;

	private String eventPublishTimeStart;
	public DescribeInstanceHistoryEventsRequest() {
		super("Ecs", "2014-05-26", "DescribeInstanceHistoryEvents", "ecs");
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

	public String getImpactLevel() {
		return this.impactLevel;
	}

	public void setImpactLevel(String impactLevel) {
		this.impactLevel = impactLevel;
		if(impactLevel != null){
			putQueryParameter("ImpactLevel", impactLevel);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public List<String> getInstanceEventCycleStatuss() {
		return this.instanceEventCycleStatuss;
	}

	public void setInstanceEventCycleStatuss(List<String> instanceEventCycleStatuss) {
		this.instanceEventCycleStatuss = instanceEventCycleStatuss;	
		if (instanceEventCycleStatuss != null) {
			for (int i = 0; i < instanceEventCycleStatuss.size(); i++) {
				putQueryParameter("InstanceEventCycleStatus." + (i + 1) , instanceEventCycleStatuss.get(i));
			}
		}	
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public String getNotBeforeStart() {
		return this.notBeforeStart;
	}

	public void setNotBeforeStart(String notBeforeStart) {
		this.notBeforeStart = notBeforeStart;
		if(notBeforeStart != null){
			putQueryParameter("NotBefore.Start", notBeforeStart);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getNotBeforeEnd() {
		return this.notBeforeEnd;
	}

	public void setNotBeforeEnd(String notBeforeEnd) {
		this.notBeforeEnd = notBeforeEnd;
		if(notBeforeEnd != null){
			putQueryParameter("NotBefore.End", notBeforeEnd);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	public List<String> getEventIds() {
		return this.eventIds;
	}

	public void setEventIds(List<String> eventIds) {
		this.eventIds = eventIds;	
		if (eventIds != null) {
			for (int i = 0; i < eventIds.size(); i++) {
				putQueryParameter("EventId." + (i + 1) , eventIds.get(i));
			}
		}	
	}

	public String getEventCycleStatus() {
		return this.eventCycleStatus;
	}

	public void setEventCycleStatus(String eventCycleStatus) {
		this.eventCycleStatus = eventCycleStatus;
		if(eventCycleStatus != null){
			putQueryParameter("EventCycleStatus", eventCycleStatus);
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
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

	public String getEventPublishTimeEnd() {
		return this.eventPublishTimeEnd;
	}

	public void setEventPublishTimeEnd(String eventPublishTimeEnd) {
		this.eventPublishTimeEnd = eventPublishTimeEnd;
		if(eventPublishTimeEnd != null){
			putQueryParameter("EventPublishTime.End", eventPublishTimeEnd);
		}
	}

	public List<String> getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(List<String> resourceIds) {
		this.resourceIds = resourceIds;	
		if (resourceIds != null) {
			for (int i = 0; i < resourceIds.size(); i++) {
				putQueryParameter("ResourceId." + (i + 1) , resourceIds.get(i));
			}
		}	
	}

	public List<String> getInstanceEventTypes() {
		return this.instanceEventTypes;
	}

	public void setInstanceEventTypes(List<String> instanceEventTypes) {
		this.instanceEventTypes = instanceEventTypes;	
		if (instanceEventTypes != null) {
			for (int i = 0; i < instanceEventTypes.size(); i++) {
				putQueryParameter("InstanceEventType." + (i + 1) , instanceEventTypes.get(i));
			}
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getEventPublishTimeStart() {
		return this.eventPublishTimeStart;
	}

	public void setEventPublishTimeStart(String eventPublishTimeStart) {
		this.eventPublishTimeStart = eventPublishTimeStart;
		if(eventPublishTimeStart != null){
			putQueryParameter("EventPublishTime.Start", eventPublishTimeStart);
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<DescribeInstanceHistoryEventsResponse> getResponseClass() {
		return DescribeInstanceHistoryEventsResponse.class;
	}

}
