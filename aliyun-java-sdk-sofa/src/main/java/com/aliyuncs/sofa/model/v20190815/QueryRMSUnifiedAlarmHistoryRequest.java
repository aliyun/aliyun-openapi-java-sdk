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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryRMSUnifiedAlarmHistoryRequest extends RpcAcsRequest<QueryRMSUnifiedAlarmHistoryResponse> {
	   

	private String alarmStackInfoJsonStr;

	private String workspaceName;

	private Long pageSize;

	private Long end;

	private Long start;

	private Long currentPage;

	private String alarmTargetType;

	private String alarmTarget;

	private Long alarmLevel;

	private Long status;
	public QueryRMSUnifiedAlarmHistoryRequest() {
		super("SOFA", "2019-08-15", "QueryRMSUnifiedAlarmHistory");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlarmStackInfoJsonStr() {
		return this.alarmStackInfoJsonStr;
	}

	public void setAlarmStackInfoJsonStr(String alarmStackInfoJsonStr) {
		this.alarmStackInfoJsonStr = alarmStackInfoJsonStr;
		if(alarmStackInfoJsonStr != null){
			putBodyParameter("AlarmStackInfoJsonStr", alarmStackInfoJsonStr);
		}
	}

	public String getWorkspaceName() {
		return this.workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
		if(workspaceName != null){
			putBodyParameter("WorkspaceName", workspaceName);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Long getEnd() {
		return this.end;
	}

	public void setEnd(Long end) {
		this.end = end;
		if(end != null){
			putBodyParameter("End", end.toString());
		}
	}

	public Long getStart() {
		return this.start;
	}

	public void setStart(Long start) {
		this.start = start;
		if(start != null){
			putBodyParameter("Start", start.toString());
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getAlarmTargetType() {
		return this.alarmTargetType;
	}

	public void setAlarmTargetType(String alarmTargetType) {
		this.alarmTargetType = alarmTargetType;
		if(alarmTargetType != null){
			putBodyParameter("AlarmTargetType", alarmTargetType);
		}
	}

	public String getAlarmTarget() {
		return this.alarmTarget;
	}

	public void setAlarmTarget(String alarmTarget) {
		this.alarmTarget = alarmTarget;
		if(alarmTarget != null){
			putBodyParameter("AlarmTarget", alarmTarget);
		}
	}

	public Long getAlarmLevel() {
		return this.alarmLevel;
	}

	public void setAlarmLevel(Long alarmLevel) {
		this.alarmLevel = alarmLevel;
		if(alarmLevel != null){
			putBodyParameter("AlarmLevel", alarmLevel.toString());
		}
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<QueryRMSUnifiedAlarmHistoryResponse> getResponseClass() {
		return QueryRMSUnifiedAlarmHistoryResponse.class;
	}

}
