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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateFlowRequest extends RpcAcsRequest<CreateFlowResponse> {
	
	public CreateFlowRequest() {
		super("Emr", "2016-04-08", "CreateFlow", "emr");
	}

	private String cronExpr;

	private String parentFlowList;

	private String alertDingDingGroupBizId;

	private Long startSchedule;

	private String description;

	private String clusterId;

	private String alertUserGroupBizId;

	private String hostName;

	private String application;

	private Boolean createCluster;

	private String name;

	private Long endSchedule;

	private String alertConf;

	private String projectId;

	private String parentCategory;

	public String getCronExpr() {
		return this.cronExpr;
	}

	public void setCronExpr(String cronExpr) {
		this.cronExpr = cronExpr;
		if(cronExpr != null){
			putQueryParameter("CronExpr", cronExpr);
		}
	}

	public String getParentFlowList() {
		return this.parentFlowList;
	}

	public void setParentFlowList(String parentFlowList) {
		this.parentFlowList = parentFlowList;
		if(parentFlowList != null){
			putQueryParameter("ParentFlowList", parentFlowList);
		}
	}

	public String getAlertDingDingGroupBizId() {
		return this.alertDingDingGroupBizId;
	}

	public void setAlertDingDingGroupBizId(String alertDingDingGroupBizId) {
		this.alertDingDingGroupBizId = alertDingDingGroupBizId;
		if(alertDingDingGroupBizId != null){
			putQueryParameter("AlertDingDingGroupBizId", alertDingDingGroupBizId);
		}
	}

	public Long getStartSchedule() {
		return this.startSchedule;
	}

	public void setStartSchedule(Long startSchedule) {
		this.startSchedule = startSchedule;
		if(startSchedule != null){
			putQueryParameter("StartSchedule", startSchedule.toString());
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getAlertUserGroupBizId() {
		return this.alertUserGroupBizId;
	}

	public void setAlertUserGroupBizId(String alertUserGroupBizId) {
		this.alertUserGroupBizId = alertUserGroupBizId;
		if(alertUserGroupBizId != null){
			putQueryParameter("AlertUserGroupBizId", alertUserGroupBizId);
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public String getApplication() {
		return this.application;
	}

	public void setApplication(String application) {
		this.application = application;
		if(application != null){
			putQueryParameter("Application", application);
		}
	}

	public Boolean getCreateCluster() {
		return this.createCluster;
	}

	public void setCreateCluster(Boolean createCluster) {
		this.createCluster = createCluster;
		if(createCluster != null){
			putQueryParameter("CreateCluster", createCluster.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getEndSchedule() {
		return this.endSchedule;
	}

	public void setEndSchedule(Long endSchedule) {
		this.endSchedule = endSchedule;
		if(endSchedule != null){
			putQueryParameter("EndSchedule", endSchedule.toString());
		}
	}

	public String getAlertConf() {
		return this.alertConf;
	}

	public void setAlertConf(String alertConf) {
		this.alertConf = alertConf;
		if(alertConf != null){
			putQueryParameter("AlertConf", alertConf);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getParentCategory() {
		return this.parentCategory;
	}

	public void setParentCategory(String parentCategory) {
		this.parentCategory = parentCategory;
		if(parentCategory != null){
			putQueryParameter("ParentCategory", parentCategory);
		}
	}

	@Override
	public Class<CreateFlowResponse> getResponseClass() {
		return CreateFlowResponse.class;
	}

}
