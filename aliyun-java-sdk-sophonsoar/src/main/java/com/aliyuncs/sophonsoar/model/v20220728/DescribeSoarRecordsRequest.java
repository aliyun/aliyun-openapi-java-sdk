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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeSoarRecordsRequest extends RpcAcsRequest<DescribeSoarRecordsResponse> {
	   

	private String taskflowMd5;

	private Long completedEndTime;

	private String triggerType;

	private Long endMillis;

	private Integer pageNumber;

	private String taskStatus;

	private String requestUuid;

	private Integer pageSize;

	private String lang;

	private String queryValue;

	private Long startMillis;

	private String playbookUuid;

	private String triggerUser;

	private Long completedBeginTime;
	public DescribeSoarRecordsRequest() {
		super("sophonsoar", "2022-07-28", "DescribeSoarRecords");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getTaskflowMd5() {
		return this.taskflowMd5;
	}

	public void setTaskflowMd5(String taskflowMd5) {
		this.taskflowMd5 = taskflowMd5;
		if(taskflowMd5 != null){
			putQueryParameter("TaskflowMd5", taskflowMd5);
		}
	}

	public Long getCompletedEndTime() {
		return this.completedEndTime;
	}

	public void setCompletedEndTime(Long completedEndTime) {
		this.completedEndTime = completedEndTime;
		if(completedEndTime != null){
			putQueryParameter("CompletedEndTime", completedEndTime.toString());
		}
	}

	public String getTriggerType() {
		return this.triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
		if(triggerType != null){
			putQueryParameter("TriggerType", triggerType);
		}
	}

	public Long getEndMillis() {
		return this.endMillis;
	}

	public void setEndMillis(Long endMillis) {
		this.endMillis = endMillis;
		if(endMillis != null){
			putQueryParameter("EndMillis", endMillis.toString());
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

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
		if(taskStatus != null){
			putQueryParameter("TaskStatus", taskStatus);
		}
	}

	public String getRequestUuid() {
		return this.requestUuid;
	}

	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
		if(requestUuid != null){
			putQueryParameter("RequestUuid", requestUuid);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getQueryValue() {
		return this.queryValue;
	}

	public void setQueryValue(String queryValue) {
		this.queryValue = queryValue;
		if(queryValue != null){
			putQueryParameter("QueryValue", queryValue);
		}
	}

	public Long getStartMillis() {
		return this.startMillis;
	}

	public void setStartMillis(Long startMillis) {
		this.startMillis = startMillis;
		if(startMillis != null){
			putQueryParameter("StartMillis", startMillis.toString());
		}
	}

	public String getPlaybookUuid() {
		return this.playbookUuid;
	}

	public void setPlaybookUuid(String playbookUuid) {
		this.playbookUuid = playbookUuid;
		if(playbookUuid != null){
			putQueryParameter("PlaybookUuid", playbookUuid);
		}
	}

	public String getTriggerUser() {
		return this.triggerUser;
	}

	public void setTriggerUser(String triggerUser) {
		this.triggerUser = triggerUser;
		if(triggerUser != null){
			putQueryParameter("TriggerUser", triggerUser);
		}
	}

	public Long getCompletedBeginTime() {
		return this.completedBeginTime;
	}

	public void setCompletedBeginTime(Long completedBeginTime) {
		this.completedBeginTime = completedBeginTime;
		if(completedBeginTime != null){
			putQueryParameter("CompletedBeginTime", completedBeginTime.toString());
		}
	}

	@Override
	public Class<DescribeSoarRecordsResponse> getResponseClass() {
		return DescribeSoarRecordsResponse.class;
	}

}
