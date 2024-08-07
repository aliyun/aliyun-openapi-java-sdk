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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlertsRequest extends RpcAcsRequest<DescribeAlertsResponse> {
	   

	private Long roleFor;

	private String source;

	private String isDefend;

	private Long startTime;

	private String subUserId;

	private Integer pageSize;

	private Integer roleType;

	private List<String> levels;

	private Long endTime;

	private String alertTitle;

	private Integer currentPage;

	private String alertUuid;
	public DescribeAlertsRequest() {
		super("cloud-siem", "2022-06-16", "DescribeAlerts", "cloud-siem");
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

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putBodyParameter("Source", source);
		}
	}

	public String getIsDefend() {
		return this.isDefend;
	}

	public void setIsDefend(String isDefend) {
		this.isDefend = isDefend;
		if(isDefend != null){
			putBodyParameter("IsDefend", isDefend);
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

	public String getSubUserId() {
		return this.subUserId;
	}

	public void setSubUserId(String subUserId) {
		this.subUserId = subUserId;
		if(subUserId != null){
			putBodyParameter("SubUserId", subUserId);
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

	public List<String> getLevels() {
		return this.levels;
	}

	public void setLevels(List<String> levels) {
		this.levels = levels;	
		if (levels != null) {
			for (int i = 0; i < levels.size(); i++) {
				putBodyParameter("Level." + (i + 1) , levels.get(i));
			}
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

	public String getAlertTitle() {
		return this.alertTitle;
	}

	public void setAlertTitle(String alertTitle) {
		this.alertTitle = alertTitle;
		if(alertTitle != null){
			putBodyParameter("AlertTitle", alertTitle);
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

	public String getAlertUuid() {
		return this.alertUuid;
	}

	public void setAlertUuid(String alertUuid) {
		this.alertUuid = alertUuid;
		if(alertUuid != null){
			putBodyParameter("AlertUuid", alertUuid);
		}
	}

	@Override
	public Class<DescribeAlertsResponse> getResponseClass() {
		return DescribeAlertsResponse.class;
	}

}
