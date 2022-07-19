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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryRMSUnifiedAlarmEventRequest extends RpcAcsRequest<QueryRMSUnifiedAlarmEventResponse> {
	   

	private String alarmStackInfoJsonStr;

	private String workspaceName;

	private Long startTime;

	private Long pageSize;

	private String keyword;

	private Long alarmRuleId;

	private Long endTime;

	private Long currentPage;

	private String alarmTargetKeyword;

	private String alarmRuleUuid;

	private String alarmTargetType;

	private List<Long> alarmStatusRepeatLists;

	private Long alarmLevel;

	private Long status;
	public QueryRMSUnifiedAlarmEventRequest() {
		super("SOFA", "2019-08-15", "QueryRMSUnifiedAlarmEvent");
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

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public Long getAlarmRuleId() {
		return this.alarmRuleId;
	}

	public void setAlarmRuleId(Long alarmRuleId) {
		this.alarmRuleId = alarmRuleId;
		if(alarmRuleId != null){
			putBodyParameter("AlarmRuleId", alarmRuleId.toString());
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

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getAlarmTargetKeyword() {
		return this.alarmTargetKeyword;
	}

	public void setAlarmTargetKeyword(String alarmTargetKeyword) {
		this.alarmTargetKeyword = alarmTargetKeyword;
		if(alarmTargetKeyword != null){
			putBodyParameter("AlarmTargetKeyword", alarmTargetKeyword);
		}
	}

	public String getAlarmRuleUuid() {
		return this.alarmRuleUuid;
	}

	public void setAlarmRuleUuid(String alarmRuleUuid) {
		this.alarmRuleUuid = alarmRuleUuid;
		if(alarmRuleUuid != null){
			putBodyParameter("AlarmRuleUuid", alarmRuleUuid);
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

	public List<Long> getAlarmStatusRepeatLists() {
		return this.alarmStatusRepeatLists;
	}

	public void setAlarmStatusRepeatLists(List<Long> alarmStatusRepeatLists) {
		this.alarmStatusRepeatLists = alarmStatusRepeatLists;	
		if (alarmStatusRepeatLists != null) {
			for (int i = 0; i < alarmStatusRepeatLists.size(); i++) {
				putBodyParameter("AlarmStatusRepeatList." + (i + 1) , alarmStatusRepeatLists.get(i));
			}
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
	public Class<QueryRMSUnifiedAlarmEventResponse> getResponseClass() {
		return QueryRMSUnifiedAlarmEventResponse.class;
	}

}
