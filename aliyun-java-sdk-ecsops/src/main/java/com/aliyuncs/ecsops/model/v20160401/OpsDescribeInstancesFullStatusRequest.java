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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeInstancesFullStatusRequest extends RpcAcsRequest<OpsDescribeInstancesFullStatusResponse> {
	   

	private List<String> eventIds;

	private String sourceOwnerBid;

	private Integer pageNumber;

	private String eventInitiatedBy;

	private Integer pageSize;

	private String eventPublishTimeEnd;

	private List<String> instanceEventTypes;

	private String notBeforeStart;

	private String eventPublishTimeStart;

	private List<String> instanceIds;

	private String notBeforeEnd;

	private String healthStatus;

	private String eventType;

	private Long sourceOwnerAliUid;

	private String status;

	private String auditParamStr;
	public OpsDescribeInstancesFullStatusRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeInstancesFullStatus", "ecs");
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

	public String getSourceOwnerBid() {
		return this.sourceOwnerBid;
	}

	public void setSourceOwnerBid(String sourceOwnerBid) {
		this.sourceOwnerBid = sourceOwnerBid;
		if(sourceOwnerBid != null){
			putQueryParameter("SourceOwnerBid", sourceOwnerBid);
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

	public String getEventInitiatedBy() {
		return this.eventInitiatedBy;
	}

	public void setEventInitiatedBy(String eventInitiatedBy) {
		this.eventInitiatedBy = eventInitiatedBy;
		if(eventInitiatedBy != null){
			putQueryParameter("EventInitiatedBy", eventInitiatedBy);
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

	public String getNotBeforeStart() {
		return this.notBeforeStart;
	}

	public void setNotBeforeStart(String notBeforeStart) {
		this.notBeforeStart = notBeforeStart;
		if(notBeforeStart != null){
			putQueryParameter("NotBefore.Start", notBeforeStart);
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

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
			}
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

	public String getHealthStatus() {
		return this.healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
		if(healthStatus != null){
			putQueryParameter("HealthStatus", healthStatus);
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

	public Long getSourceOwnerAliUid() {
		return this.sourceOwnerAliUid;
	}

	public void setSourceOwnerAliUid(Long sourceOwnerAliUid) {
		this.sourceOwnerAliUid = sourceOwnerAliUid;
		if(sourceOwnerAliUid != null){
			putQueryParameter("SourceOwnerAliUid", sourceOwnerAliUid.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsDescribeInstancesFullStatusResponse> getResponseClass() {
		return OpsDescribeInstancesFullStatusResponse.class;
	}

}
