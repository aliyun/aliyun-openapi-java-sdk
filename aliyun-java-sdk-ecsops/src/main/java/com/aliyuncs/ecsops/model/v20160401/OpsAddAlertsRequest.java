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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsAddAlertsRequest extends RpcAcsRequest<OpsAddAlertsResponse> {
	   

	private String owner;

	private String diagnoseResult;

	private String alertStatus;

	private String alertTitle;

	private String alertTime;

	private String alertLevel;

	private String alertDetail;

	private String alertItem;

	private String diagnosisTemplateId;

	private String extra;

	private String belongTeam;

	private String alertSource;
	public OpsAddAlertsRequest() {
		super("Ecsops", "2016-04-01", "OpsAddAlerts", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDiagnoseResult() {
		return this.diagnoseResult;
	}

	public void setDiagnoseResult(String diagnoseResult) {
		this.diagnoseResult = diagnoseResult;
		if(diagnoseResult != null){
			putQueryParameter("DiagnoseResult", diagnoseResult);
		}
	}

	public String getAlertStatus() {
		return this.alertStatus;
	}

	public void setAlertStatus(String alertStatus) {
		this.alertStatus = alertStatus;
		if(alertStatus != null){
			putQueryParameter("AlertStatus", alertStatus);
		}
	}

	public String getAlertTitle() {
		return this.alertTitle;
	}

	public void setAlertTitle(String alertTitle) {
		this.alertTitle = alertTitle;
		if(alertTitle != null){
			putQueryParameter("AlertTitle", alertTitle);
		}
	}

	public String getAlertTime() {
		return this.alertTime;
	}

	public void setAlertTime(String alertTime) {
		this.alertTime = alertTime;
		if(alertTime != null){
			putQueryParameter("AlertTime", alertTime);
		}
	}

	public String getAlertLevel() {
		return this.alertLevel;
	}

	public void setAlertLevel(String alertLevel) {
		this.alertLevel = alertLevel;
		if(alertLevel != null){
			putQueryParameter("AlertLevel", alertLevel);
		}
	}

	public String getAlertDetail() {
		return this.alertDetail;
	}

	public void setAlertDetail(String alertDetail) {
		this.alertDetail = alertDetail;
		if(alertDetail != null){
			putQueryParameter("AlertDetail", alertDetail);
		}
	}

	public String getAlertItem() {
		return this.alertItem;
	}

	public void setAlertItem(String alertItem) {
		this.alertItem = alertItem;
		if(alertItem != null){
			putQueryParameter("AlertItem", alertItem);
		}
	}

	public String getDiagnosisTemplateId() {
		return this.diagnosisTemplateId;
	}

	public void setDiagnosisTemplateId(String diagnosisTemplateId) {
		this.diagnosisTemplateId = diagnosisTemplateId;
		if(diagnosisTemplateId != null){
			putQueryParameter("DiagnosisTemplateId", diagnosisTemplateId);
		}
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
		if(extra != null){
			putQueryParameter("Extra", extra);
		}
	}

	public String getBelongTeam() {
		return this.belongTeam;
	}

	public void setBelongTeam(String belongTeam) {
		this.belongTeam = belongTeam;
		if(belongTeam != null){
			putQueryParameter("BelongTeam", belongTeam);
		}
	}

	public String getAlertSource() {
		return this.alertSource;
	}

	public void setAlertSource(String alertSource) {
		this.alertSource = alertSource;
		if(alertSource != null){
			putQueryParameter("AlertSource", alertSource);
		}
	}

	@Override
	public Class<OpsAddAlertsResponse> getResponseClass() {
		return OpsAddAlertsResponse.class;
	}

}
