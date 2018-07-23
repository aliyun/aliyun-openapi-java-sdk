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

package com.aliyuncs.zhuque.model.v20160701;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AddProjectRequest extends RpcAcsRequest<AddProjectResponse> {
	
	public AddProjectRequest() {
		super("Zhuque", "2016-07-01", "AddProject");
	}

	private String creator;

	private String projectName;

	private String cloudInstance;

	private String manager;

	private String description;

	private String deliveryDay;

	private String plan_pattern;

	private String businessProjectId;

	private String projectOrigin;

	private String projectType;

	private String region;

	private String azone;

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putQueryParameter("Creator", creator);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getCloudInstance() {
		return this.cloudInstance;
	}

	public void setCloudInstance(String cloudInstance) {
		this.cloudInstance = cloudInstance;
		if(cloudInstance != null){
			putQueryParameter("CloudInstance", cloudInstance);
		}
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
		if(manager != null){
			putQueryParameter("Manager", manager);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getDeliveryDay() {
		return this.deliveryDay;
	}

	public void setDeliveryDay(String deliveryDay) {
		this.deliveryDay = deliveryDay;
		if(deliveryDay != null){
			putQueryParameter("DeliveryDay", deliveryDay);
		}
	}

	public String getPlan_pattern() {
		return this.plan_pattern;
	}

	public void setPlan_pattern(String plan_pattern) {
		this.plan_pattern = plan_pattern;
		if(plan_pattern != null){
			putQueryParameter("Plan_pattern", plan_pattern);
		}
	}

	public String getBusinessProjectId() {
		return this.businessProjectId;
	}

	public void setBusinessProjectId(String businessProjectId) {
		this.businessProjectId = businessProjectId;
		if(businessProjectId != null){
			putQueryParameter("BusinessProjectId", businessProjectId);
		}
	}

	public String getProjectOrigin() {
		return this.projectOrigin;
	}

	public void setProjectOrigin(String projectOrigin) {
		this.projectOrigin = projectOrigin;
		if(projectOrigin != null){
			putQueryParameter("ProjectOrigin", projectOrigin);
		}
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
		if(projectType != null){
			putQueryParameter("ProjectType", projectType);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getAzone() {
		return this.azone;
	}

	public void setAzone(String azone) {
		this.azone = azone;
		if(azone != null){
			putQueryParameter("Azone", azone);
		}
	}

	@Override
	public Class<AddProjectResponse> getResponseClass() {
		return AddProjectResponse.class;
	}

}
