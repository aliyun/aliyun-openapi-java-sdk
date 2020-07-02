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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRemindRequest extends RpcAcsRequest<CreateRemindResponse> {
	   

	private String dndEnd;

	private String alertUnit;

	private String remindUnit;

	private Integer alertInterval;

	private String alertMethods;

	private String robotUrls;

	private Integer maxAlertTimes;

	private String bizProcessIds;

	private String remindType;

	private String alertTargets;

	private String baselineIds;

	private String detail;

	private String remindName;

	private Long projectId;

	private String nodeIds;
	public CreateRemindRequest() {
		super("dataworks-public", "2020-05-18", "CreateRemind");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDndEnd() {
		return this.dndEnd;
	}

	public void setDndEnd(String dndEnd) {
		this.dndEnd = dndEnd;
		if(dndEnd != null){
			putBodyParameter("DndEnd", dndEnd);
		}
	}

	public String getAlertUnit() {
		return this.alertUnit;
	}

	public void setAlertUnit(String alertUnit) {
		this.alertUnit = alertUnit;
		if(alertUnit != null){
			putBodyParameter("AlertUnit", alertUnit);
		}
	}

	public String getRemindUnit() {
		return this.remindUnit;
	}

	public void setRemindUnit(String remindUnit) {
		this.remindUnit = remindUnit;
		if(remindUnit != null){
			putBodyParameter("RemindUnit", remindUnit);
		}
	}

	public Integer getAlertInterval() {
		return this.alertInterval;
	}

	public void setAlertInterval(Integer alertInterval) {
		this.alertInterval = alertInterval;
		if(alertInterval != null){
			putBodyParameter("AlertInterval", alertInterval.toString());
		}
	}

	public String getAlertMethods() {
		return this.alertMethods;
	}

	public void setAlertMethods(String alertMethods) {
		this.alertMethods = alertMethods;
		if(alertMethods != null){
			putBodyParameter("AlertMethods", alertMethods);
		}
	}

	public String getRobotUrls() {
		return this.robotUrls;
	}

	public void setRobotUrls(String robotUrls) {
		this.robotUrls = robotUrls;
		if(robotUrls != null){
			putBodyParameter("RobotUrls", robotUrls);
		}
	}

	public Integer getMaxAlertTimes() {
		return this.maxAlertTimes;
	}

	public void setMaxAlertTimes(Integer maxAlertTimes) {
		this.maxAlertTimes = maxAlertTimes;
		if(maxAlertTimes != null){
			putBodyParameter("MaxAlertTimes", maxAlertTimes.toString());
		}
	}

	public String getBizProcessIds() {
		return this.bizProcessIds;
	}

	public void setBizProcessIds(String bizProcessIds) {
		this.bizProcessIds = bizProcessIds;
		if(bizProcessIds != null){
			putBodyParameter("BizProcessIds", bizProcessIds);
		}
	}

	public String getRemindType() {
		return this.remindType;
	}

	public void setRemindType(String remindType) {
		this.remindType = remindType;
		if(remindType != null){
			putBodyParameter("RemindType", remindType);
		}
	}

	public String getAlertTargets() {
		return this.alertTargets;
	}

	public void setAlertTargets(String alertTargets) {
		this.alertTargets = alertTargets;
		if(alertTargets != null){
			putBodyParameter("AlertTargets", alertTargets);
		}
	}

	public String getBaselineIds() {
		return this.baselineIds;
	}

	public void setBaselineIds(String baselineIds) {
		this.baselineIds = baselineIds;
		if(baselineIds != null){
			putBodyParameter("BaselineIds", baselineIds);
		}
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
		if(detail != null){
			putBodyParameter("Detail", detail);
		}
	}

	public String getRemindName() {
		return this.remindName;
	}

	public void setRemindName(String remindName) {
		this.remindName = remindName;
		if(remindName != null){
			putBodyParameter("RemindName", remindName);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public String getNodeIds() {
		return this.nodeIds;
	}

	public void setNodeIds(String nodeIds) {
		this.nodeIds = nodeIds;
		if(nodeIds != null){
			putBodyParameter("NodeIds", nodeIds);
		}
	}

	@Override
	public Class<CreateRemindResponse> getResponseClass() {
		return CreateRemindResponse.class;
	}

}
