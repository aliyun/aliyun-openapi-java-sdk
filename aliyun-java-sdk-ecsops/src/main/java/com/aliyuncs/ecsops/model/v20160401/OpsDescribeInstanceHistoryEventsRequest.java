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

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeInstanceHistoryEventsRequest extends RpcAcsRequest<OpsDescribeInstanceHistoryEventsResponse> {
	   

	private List<String> eventIds;

	private String eventCycleStatus;

	private String sourceOwnerBid;

	private Integer pageNumber;

	private String eventInitiatedBy;

	private Integer pageSize;

	private List<String> instanceEventCycleStatuss;

	private String eventPublishTimeEnd;

	private List<String> instanceEventTypes;

	private String notBeforeStart;

	private String eventPublishTimeStart;

	private String instanceId;

	private String notBeforeEnd;

	private String eventType;

	private Long sourceOwnerAliUid;

	private String auditParamStr;
	public OpsDescribeInstanceHistoryEventsRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeInstanceHistoryEvents", "ecsops");
		setMethod(MethodType.POST);
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

	public Long getSourceOwnerAliUid() {
		return this.sourceOwnerAliUid;
	}

	public void setSourceOwnerAliUid(Long sourceOwnerAliUid) {
		this.sourceOwnerAliUid = sourceOwnerAliUid;
		if(sourceOwnerAliUid != null){
			putQueryParameter("SourceOwnerAliUid", sourceOwnerAliUid.toString());
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
	public Class<OpsDescribeInstanceHistoryEventsResponse> getResponseClass() {
		return OpsDescribeInstanceHistoryEventsResponse.class;
	}

}
