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
public class CreateFlowForWebRequest extends RpcAcsRequest<CreateFlowForWebResponse> {
	
	public CreateFlowForWebRequest() {
		super("Emr", "2016-04-08", "CreateFlowForWeb");
	}

	private String cronExpr;

	private Long startSchedule;

	private String name;

	private String description;

	private Long endSchedule;

	private String clusterId;

	private String projectId;

	private String graph;

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

	public Long getStartSchedule() {
		return this.startSchedule;
	}

	public void setStartSchedule(Long startSchedule) {
		this.startSchedule = startSchedule;
		if(startSchedule != null){
			putQueryParameter("StartSchedule", startSchedule.toString());
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
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

	public String getGraph() {
		return this.graph;
	}

	public void setGraph(String graph) {
		this.graph = graph;
		if(graph != null){
			putQueryParameter("Graph", graph);
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
