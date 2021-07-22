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

package com.aliyuncs.dataworks_public.model.v20180601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRealTimeProcessRequest extends RpcAcsRequest<CreateRealTimeProcessResponse> {
	   

	private String actionType;

	private String jobConfig;

	private Boolean createResGroup;

	private String dataworksVersion;

	private String resourceSpec;

	private String tableRule;

	private String tables;

	private String dataSource;

	private Long projectId;

	private Long fileId;
	public CreateRealTimeProcessRequest() {
		super("dataworks-public", "2018-06-01", "CreateRealTimeProcess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putQueryParameter("ActionType", actionType);
		}
	}

	public String getJobConfig() {
		return this.jobConfig;
	}

	public void setJobConfig(String jobConfig) {
		this.jobConfig = jobConfig;
		if(jobConfig != null){
			putQueryParameter("JobConfig", jobConfig);
		}
	}

	public Boolean getCreateResGroup() {
		return this.createResGroup;
	}

	public void setCreateResGroup(Boolean createResGroup) {
		this.createResGroup = createResGroup;
		if(createResGroup != null){
			putQueryParameter("CreateResGroup", createResGroup.toString());
		}
	}

	public String getDataworksVersion() {
		return this.dataworksVersion;
	}

	public void setDataworksVersion(String dataworksVersion) {
		this.dataworksVersion = dataworksVersion;
		if(dataworksVersion != null){
			putQueryParameter("DataworksVersion", dataworksVersion);
		}
	}

	public String getResourceSpec() {
		return this.resourceSpec;
	}

	public void setResourceSpec(String resourceSpec) {
		this.resourceSpec = resourceSpec;
		if(resourceSpec != null){
			putQueryParameter("ResourceSpec", resourceSpec);
		}
	}

	public String getTableRule() {
		return this.tableRule;
	}

	public void setTableRule(String tableRule) {
		this.tableRule = tableRule;
		if(tableRule != null){
			putQueryParameter("TableRule", tableRule);
		}
	}

	public String getTables() {
		return this.tables;
	}

	public void setTables(String tables) {
		this.tables = tables;
		if(tables != null){
			putQueryParameter("Tables", tables);
		}
	}

	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
		if(dataSource != null){
			putQueryParameter("DataSource", dataSource);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	public Long getFileId() {
		return this.fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
		if(fileId != null){
			putQueryParameter("FileId", fileId.toString());
		}
	}

	@Override
	public Class<CreateRealTimeProcessResponse> getResponseClass() {
		return CreateRealTimeProcessResponse.class;
	}

}
