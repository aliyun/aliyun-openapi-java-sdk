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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateFlowForWebRequest extends RpcAcsRequest<CreateFlowForWebResponse> {
	   

	private String cronExpr;

	private String description;

	private String alertUserGroupBizId;

	private String lifecycle;

	private String hostName;

	private Boolean createCluster;

	private Long endSchedule;

	private String alertConf;

	private String projectId;

	private String parentFlowList;

	private String logArchiveLocation;

	private String alertDingDingGroupBizId;

	private Long startSchedule;

	private String clusterId;

	private String graph;

	private String name;

	private String namespace;

	private String parentCategory;
	public CreateFlowForWebRequest() {
		super("Emr", "2016-04-08", "CreateFlowForWeb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCronExpr() {
		return this.cronExpr;
	}

	public void setCronExpr(String cronExpr) {
		this.cronExpr = cronExpr;
		if(cronExpr != null){
			putQueryParameter("CronExpr", cronExpr);
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

	public String getAlertUserGroupBizId() {
		return this.alertUserGroupBizId;
	}

	public void setAlertUserGroupBizId(String alertUserGroupBizId) {
		this.alertUserGroupBizId = alertUserGroupBizId;
		if(alertUserGroupBizId != null){
			putQueryParameter("AlertUserGroupBizId", alertUserGroupBizId);
		}
	}

	public String getLifecycle() {
		return this.lifecycle;
	}

	public void setLifecycle(String lifecycle) {
		this.lifecycle = lifecycle;
		if(lifecycle != null){
			putQueryParameter("Lifecycle", lifecycle);
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

	public Boolean getCreateCluster() {
		return this.createCluster;
	}

	public void setCreateCluster(Boolean createCluster) {
		this.createCluster = createCluster;
		if(createCluster != null){
			putQueryParameter("CreateCluster", createCluster.toString());
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

	public String getParentFlowList() {
		return this.parentFlowList;
	}

	public void setParentFlowList(String parentFlowList) {
		this.parentFlowList = parentFlowList;
		if(parentFlowList != null){
			putQueryParameter("ParentFlowList", parentFlowList);
		}
	}

	public String getLogArchiveLocation() {
		return this.logArchiveLocation;
	}

	public void setLogArchiveLocation(String logArchiveLocation) {
		this.logArchiveLocation = logArchiveLocation;
		if(logArchiveLocation != null){
			putQueryParameter("LogArchiveLocation", logArchiveLocation);
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getGraph() {
		return this.graph;
	}

	public void setGraph(String graph) {
		this.graph = graph;
		if(graph != null){
			putQueryParameter("Graph", graph);
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
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
	public Class<CreateFlowForWebResponse> getResponseClass() {
		return CreateFlowForWebResponse.class;
	}

}
