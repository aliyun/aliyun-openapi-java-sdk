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
public class ListCustomizeRuleTestResultRequest extends RpcAcsRequest<ListCustomizeRuleTestResultResponse> {
	   

	private Long roleFor;

	private Long startTime;

	private String verifyType;

	private Integer pageSize;

	private Integer roleType;

	private Long id;

	private Long endTime;

	private Integer currentPage;

	private String detectionRuleId;
	public ListCustomizeRuleTestResultRequest() {
		super("cloud-siem", "2022-06-16", "ListCustomizeRuleTestResult", "cloud-siem");
		setMethod(MethodType.POST);
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

	public String getVerifyType() {
		return this.verifyType;
	}

	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
		if(verifyType != null){
			putBodyParameter("VerifyType", verifyType);
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
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

	public String getDetectionRuleId() {
		return this.detectionRuleId;
	}

	public void setDetectionRuleId(String detectionRuleId) {
		this.detectionRuleId = detectionRuleId;
		if(detectionRuleId != null){
			putBodyParameter("DetectionRuleId", detectionRuleId);
		}
	}

	@Override
	public Class<ListCustomizeRuleTestResultResponse> getResponseClass() {
		return ListCustomizeRuleTestResultResponse.class;
	}

}
