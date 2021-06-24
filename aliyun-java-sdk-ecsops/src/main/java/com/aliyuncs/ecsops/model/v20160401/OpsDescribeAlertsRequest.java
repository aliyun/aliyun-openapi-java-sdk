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

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeAlertsRequest extends RpcAcsRequest<OpsDescribeAlertsResponse> {
	   

	private String alertStatus;

	private String alertTime;

	private String alertLevel;

	private String startTime;

	private Integer pageSize;

	private Boolean needDetail;

	private String belongTeam;

	private String owner;

	private String endTime;

	private String alertItem;

	private Integer pageNo;

	private Long alertId;

	private String alertSource;

	private String auditParamStr;
	public OpsDescribeAlertsRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeAlerts", "ecsops");
		setMethod(MethodType.POST);
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public Boolean getNeedDetail() {
		return this.needDetail;
	}

	public void setNeedDetail(Boolean needDetail) {
		this.needDetail = needDetail;
		if(needDetail != null){
			putQueryParameter("NeedDetail", needDetail.toString());
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

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putQueryParameter("Owner", owner);
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

	public String getAlertItem() {
		return this.alertItem;
	}

	public void setAlertItem(String alertItem) {
		this.alertItem = alertItem;
		if(alertItem != null){
			putQueryParameter("AlertItem", alertItem);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public Long getAlertId() {
		return this.alertId;
	}

	public void setAlertId(Long alertId) {
		this.alertId = alertId;
		if(alertId != null){
			putQueryParameter("AlertId", alertId.toString());
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
	public Class<OpsDescribeAlertsResponse> getResponseClass() {
		return OpsDescribeAlertsResponse.class;
	}

}
