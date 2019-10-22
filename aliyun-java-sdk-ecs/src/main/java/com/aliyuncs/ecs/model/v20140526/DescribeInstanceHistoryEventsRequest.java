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
	   

	private List<String> eventIds;

	private Long resourceOwnerId;

	private String eventCycleStatus;

	private Integer pageNumber;

	private Integer pageSize;

	private List<String> instanceEventCycleStatuss;

	private String eventPublishTimeEnd;

	private List<String> instanceEventTypes;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String notBeforeStart;

	private Long ownerId;

	private String eventPublishTimeStart;

	private String instanceId;

	private String notBeforeEnd;

	private String eventType;
	public DescribeInstanceHistoryEventsRequest() {
		super("Ecs", "2014-05-26", "DescribeInstanceHistoryEvents", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public String getEventPublishTimeEnd() {
		return this.eventPublishTimeEnd;
	}

	public void setEventPublishTimeEnd(String eventPublishTimeEnd) {
		this.eventPublishTimeEnd = eventPublishTimeEnd;
		if(eventPublishTimeEnd != null){
			putQueryParameter("EventPublishTime.End", eventPublishTimeEnd);
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

	public String getEventPublishTimeStart() {
		return this.eventPublishTimeStart;
	}

	public void setEventPublishTimeStart(String eventPublishTimeStart) {
		this.eventPublishTimeStart = eventPublishTimeStart;
		if(eventPublishTimeStart != null){
			putQueryParameter("EventPublishTime.Start", eventPublishTimeStart);
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

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	@Override
	public Class<DescribeInstanceHistoryEventsResponse> getResponseClass() {
		return DescribeInstanceHistoryEventsResponse.class;
	}

}
