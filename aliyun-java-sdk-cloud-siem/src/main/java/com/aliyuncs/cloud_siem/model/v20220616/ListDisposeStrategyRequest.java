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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListDisposeStrategyRequest extends RpcAcsRequest<ListDisposeStrategyResponse> {
	   

	private String entityIdentity;

	private String playbookName;

	private String playbookTypes;

	private Long roleFor;

	private Long startTime;

	private Integer pageSize;

	private Integer roleType;

	private String orderField;

	private String order;

	private String sophonTaskId;

	private Integer effectiveStatus;

	private Long endTime;

	private Integer currentPage;

	private String playbookUuid;

	private String entityType;

	private String incidentUuid;

	private Integer status;
	public ListDisposeStrategyRequest() {
		super("cloud-siem", "2022-06-16", "ListDisposeStrategy", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public String getEntityIdentity() {
		return this.entityIdentity;
	}

	public void setEntityIdentity(String entityIdentity) {
		this.entityIdentity = entityIdentity;
		if(entityIdentity != null){
			putBodyParameter("EntityIdentity", entityIdentity);
		}
	}

	public String getPlaybookName() {
		return this.playbookName;
	}

	public void setPlaybookName(String playbookName) {
		this.playbookName = playbookName;
		if(playbookName != null){
			putBodyParameter("PlaybookName", playbookName);
		}
	}

	public String getPlaybookTypes() {
		return this.playbookTypes;
	}

	public void setPlaybookTypes(String playbookTypes) {
		this.playbookTypes = playbookTypes;
		if(playbookTypes != null){
			putBodyParameter("PlaybookTypes", playbookTypes);
		}
	}

	public Long getRoleFor() {
		return this.roleFor;
	}

	public void setRoleFor(Long roleFor) {
		this.roleFor = roleFor;
		if(roleFor != null){
			putBodyParameter("RoleFor", roleFor.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getRoleType() {
		return this.roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putBodyParameter("RoleType", roleType.toString());
		}
	}

	public String getOrderField() {
		return this.orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
		if(orderField != null){
			putBodyParameter("OrderField", orderField);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putBodyParameter("Order", order);
		}
	}

	public String getSophonTaskId() {
		return this.sophonTaskId;
	}

	public void setSophonTaskId(String sophonTaskId) {
		this.sophonTaskId = sophonTaskId;
		if(sophonTaskId != null){
			putBodyParameter("SophonTaskId", sophonTaskId);
		}
	}

	public Integer getEffectiveStatus() {
		return this.effectiveStatus;
	}

	public void setEffectiveStatus(Integer effectiveStatus) {
		this.effectiveStatus = effectiveStatus;
		if(effectiveStatus != null){
			putBodyParameter("EffectiveStatus", effectiveStatus.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getPlaybookUuid() {
		return this.playbookUuid;
	}

	public void setPlaybookUuid(String playbookUuid) {
		this.playbookUuid = playbookUuid;
		if(playbookUuid != null){
			putBodyParameter("PlaybookUuid", playbookUuid);
		}
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
		if(entityType != null){
			putBodyParameter("EntityType", entityType);
		}
	}

	public String getIncidentUuid() {
		return this.incidentUuid;
	}

	public void setIncidentUuid(String incidentUuid) {
		this.incidentUuid = incidentUuid;
		if(incidentUuid != null){
			putBodyParameter("IncidentUuid", incidentUuid);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<ListDisposeStrategyResponse> getResponseClass() {
		return ListDisposeStrategyResponse.class;
	}

}
