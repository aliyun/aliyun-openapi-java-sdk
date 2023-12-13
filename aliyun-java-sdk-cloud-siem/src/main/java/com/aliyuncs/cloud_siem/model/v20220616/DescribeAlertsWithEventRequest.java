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
public class DescribeAlertsWithEventRequest extends RpcAcsRequest<DescribeAlertsWithEventResponse> {
	   

	private String source;

	private String isDefend;

	private Long subUserId;

	private Integer pageSize;

	private List<String> levels;

	private String alertTitle;

	private Integer currentPage;

	private String incidentUuid;
	public DescribeAlertsWithEventRequest() {
		super("cloud-siem", "2022-06-16", "DescribeAlertsWithEvent", "cloud-siem");
		setMethod(MethodType.POST);
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

	public Long getSubUserId() {
		return this.subUserId;
	}

	public void setSubUserId(Long subUserId) {
		this.subUserId = subUserId;
		if(subUserId != null){
			putBodyParameter("SubUserId", subUserId.toString());
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

	public String getIncidentUuid() {
		return this.incidentUuid;
	}

	public void setIncidentUuid(String incidentUuid) {
		this.incidentUuid = incidentUuid;
		if(incidentUuid != null){
			putBodyParameter("IncidentUuid", incidentUuid);
		}
	}

	@Override
	public Class<DescribeAlertsWithEventResponse> getResponseClass() {
		return DescribeAlertsWithEventResponse.class;
	}

}
