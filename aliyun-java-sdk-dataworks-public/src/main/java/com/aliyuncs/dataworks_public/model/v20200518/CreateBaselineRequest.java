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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBaselineRequest extends RpcAcsRequest<CreateBaselineResponse> {
	   

	private String owner;

	private Integer alertMarginThreshold;

	private List<OvertimeSettings> overtimeSettingss;

	private Integer priority;

	private String baselineType;

	private String baselineName;

	private Long projectId;

	private String nodeIds;
	public CreateBaselineRequest() {
		super("dataworks-public", "2020-05-18", "CreateBaseline");
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
			putBodyParameter("Owner", owner);
		}
	}

	public Integer getAlertMarginThreshold() {
		return this.alertMarginThreshold;
	}

	public void setAlertMarginThreshold(Integer alertMarginThreshold) {
		this.alertMarginThreshold = alertMarginThreshold;
		if(alertMarginThreshold != null){
			putBodyParameter("AlertMarginThreshold", alertMarginThreshold.toString());
		}
	}

	public List<OvertimeSettings> getOvertimeSettingss() {
		return this.overtimeSettingss;
	}

	public void setOvertimeSettingss(List<OvertimeSettings> overtimeSettingss) {
		this.overtimeSettingss = overtimeSettingss;	
		if (overtimeSettingss != null) {
			for (int depth1 = 0; depth1 < overtimeSettingss.size(); depth1++) {
				putBodyParameter("OvertimeSettings." + (depth1 + 1) + ".Time" , overtimeSettingss.get(depth1).getTime());
				putBodyParameter("OvertimeSettings." + (depth1 + 1) + ".Cycle" , overtimeSettingss.get(depth1).getCycle());
			}
		}	
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority.toString());
		}
	}

	public String getBaselineType() {
		return this.baselineType;
	}

	public void setBaselineType(String baselineType) {
		this.baselineType = baselineType;
		if(baselineType != null){
			putBodyParameter("BaselineType", baselineType);
		}
	}

	public String getBaselineName() {
		return this.baselineName;
	}

	public void setBaselineName(String baselineName) {
		this.baselineName = baselineName;
		if(baselineName != null){
			putBodyParameter("BaselineName", baselineName);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public String getNodeIds() {
		return this.nodeIds;
	}

	public void setNodeIds(String nodeIds) {
		this.nodeIds = nodeIds;
		if(nodeIds != null){
			putBodyParameter("NodeIds", nodeIds);
		}
	}

	public static class OvertimeSettings {

		private String time;

		private Integer cycle;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Integer getCycle() {
			return this.cycle;
		}

		public void setCycle(Integer cycle) {
			this.cycle = cycle;
		}
	}

	@Override
	public Class<CreateBaselineResponse> getResponseClass() {
		return CreateBaselineResponse.class;
	}

}
