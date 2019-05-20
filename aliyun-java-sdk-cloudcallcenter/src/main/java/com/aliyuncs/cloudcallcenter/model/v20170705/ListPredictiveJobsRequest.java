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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListPredictiveJobsRequest extends RpcAcsRequest<ListPredictiveJobsResponse> {
	
	public ListPredictiveJobsRequest() {
		super("CloudCallCenter", "2017-07-05", "ListPredictiveJobs", "CloudCallCenter", "innerAPI");
	}

	private String contactName;

	private String instanceId;

	private String timeAlignment;

	private String skillGroupId;

	private String jobStatus;

	private String jobGroupId;

	private String phoneNumber;

	private Integer pageSize;

	private Long endTime;

	private Long startTime;

	private Integer pageNumber;

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
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

	public String getTimeAlignment() {
		return this.timeAlignment;
	}

	public void setTimeAlignment(String timeAlignment) {
		this.timeAlignment = timeAlignment;
		if(timeAlignment != null){
			putQueryParameter("TimeAlignment", timeAlignment);
		}
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId);
		}
	}

	public String getJobStatus() {
		return this.jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
		if(jobStatus != null){
			putQueryParameter("JobStatus", jobStatus);
		}
	}

	public String getJobGroupId() {
		return this.jobGroupId;
	}

	public void setJobGroupId(String jobGroupId) {
		this.jobGroupId = jobGroupId;
		if(jobGroupId != null){
			putQueryParameter("JobGroupId", jobGroupId);
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
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

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
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

	@Override
	public Class<ListPredictiveJobsResponse> getResponseClass() {
		return ListPredictiveJobsResponse.class;
	}

}
