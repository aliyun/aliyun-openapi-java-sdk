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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAlertsRequest extends RpcAcsRequest<ListAlertsResponse> {
	   

	private String severity;

	private String owner;

	private String integrationType;

	private String alertName;

	private Boolean showActivities;

	private String endTime;

	private Long dispatchRuleId;

	private String startTime;

	private Boolean showEvents;

	private Long size;

	private Long state;

	private Long page;
	public ListAlertsRequest() {
		super("ARMS", "2019-08-08", "ListAlerts", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
		if(severity != null){
			putQueryParameter("Severity", severity);
		}
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putQueryParameter("Owner", owner);
		}
	}

	public String getIntegrationType() {
		return this.integrationType;
	}

	public void setIntegrationType(String integrationType) {
		this.integrationType = integrationType;
		if(integrationType != null){
			putQueryParameter("IntegrationType", integrationType);
		}
	}

	public String getAlertName() {
		return this.alertName;
	}

	public void setAlertName(String alertName) {
		this.alertName = alertName;
		if(alertName != null){
			putQueryParameter("AlertName", alertName);
		}
	}

	public Boolean getShowActivities() {
		return this.showActivities;
	}

	public void setShowActivities(Boolean showActivities) {
		this.showActivities = showActivities;
		if(showActivities != null){
			putQueryParameter("ShowActivities", showActivities.toString());
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public Long getDispatchRuleId() {
		return this.dispatchRuleId;
	}

	public void setDispatchRuleId(Long dispatchRuleId) {
		this.dispatchRuleId = dispatchRuleId;
		if(dispatchRuleId != null){
			putQueryParameter("DispatchRuleId", dispatchRuleId.toString());
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Boolean getShowEvents() {
		return this.showEvents;
	}

	public void setShowEvents(Boolean showEvents) {
		this.showEvents = showEvents;
		if(showEvents != null){
			putQueryParameter("ShowEvents", showEvents.toString());
		}
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public Long getState() {
		return this.state;
	}

	public void setState(Long state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state.toString());
		}
	}

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	@Override
	public Class<ListAlertsResponse> getResponseClass() {
		return ListAlertsResponse.class;
	}

}
