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
public class OpsQueryNotificationHistoryRequest extends RpcAcsRequest<OpsQueryNotificationHistoryResponse> {
	   

	private String notifyResult;

	private String startTime;

	private String content;

	private Integer pageNumber;

	private String sortKey;

	private String machineId;

	private String sortValue;

	private String alertConfigName;

	private Integer pageSize;

	private String staffId;

	private String endTime;

	private String token;

	private String alertTag;

	private String alertSource;

	private String auditParamStr;
	public OpsQueryNotificationHistoryRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryNotificationHistory", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getNotifyResult() {
		return this.notifyResult;
	}

	public void setNotifyResult(String notifyResult) {
		this.notifyResult = notifyResult;
		if(notifyResult != null){
			putQueryParameter("NotifyResult", notifyResult);
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
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

	public String getSortKey() {
		return this.sortKey;
	}

	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
		if(sortKey != null){
			putQueryParameter("SortKey", sortKey);
		}
	}

	public String getMachineId() {
		return this.machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
		if(machineId != null){
			putQueryParameter("MachineId", machineId);
		}
	}

	public String getSortValue() {
		return this.sortValue;
	}

	public void setSortValue(String sortValue) {
		this.sortValue = sortValue;
		if(sortValue != null){
			putQueryParameter("SortValue", sortValue);
		}
	}

	public String getAlertConfigName() {
		return this.alertConfigName;
	}

	public void setAlertConfigName(String alertConfigName) {
		this.alertConfigName = alertConfigName;
		if(alertConfigName != null){
			putQueryParameter("AlertConfigName", alertConfigName);
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

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
		if(staffId != null){
			putQueryParameter("StaffId", staffId);
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

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getAlertTag() {
		return this.alertTag;
	}

	public void setAlertTag(String alertTag) {
		this.alertTag = alertTag;
		if(alertTag != null){
			putQueryParameter("AlertTag", alertTag);
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
	public Class<OpsQueryNotificationHistoryResponse> getResponseClass() {
		return OpsQueryNotificationHistoryResponse.class;
	}

}
