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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDIJobRequest extends RpcAcsRequest<CreateDIJobResponse> {
	   

	private String sourceDataSourceType;

	private String description;

	private String transformationRules;

	private String destinationDataSourceType;

	private String destinationDataSourceSettings;

	private String sourceDataSourceSettings;

	private String resourceSettings;

	private String migrationType;

	private String systemDebug;

	private Long projectId;

	private String jobName;

	private String tableMappings;

	private String jobSettings;
	public CreateDIJobRequest() {
		super("dataworks-public", "2020-05-18", "CreateDIJob");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceDataSourceType() {
		return this.sourceDataSourceType;
	}

	public void setSourceDataSourceType(String sourceDataSourceType) {
		this.sourceDataSourceType = sourceDataSourceType;
		if(sourceDataSourceType != null){
			putBodyParameter("SourceDataSourceType", sourceDataSourceType);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getTransformationRules() {
		return this.transformationRules;
	}

	public void setTransformationRules(String transformationRules) {
		this.transformationRules = transformationRules;
		if(transformationRules != null){
			putBodyParameter("TransformationRules", transformationRules);
		}
	}

	public String getDestinationDataSourceType() {
		return this.destinationDataSourceType;
	}

	public void setDestinationDataSourceType(String destinationDataSourceType) {
		this.destinationDataSourceType = destinationDataSourceType;
		if(destinationDataSourceType != null){
			putBodyParameter("DestinationDataSourceType", destinationDataSourceType);
		}
	}

	public String getDestinationDataSourceSettings() {
		return this.destinationDataSourceSettings;
	}

	public void setDestinationDataSourceSettings(String destinationDataSourceSettings) {
		this.destinationDataSourceSettings = destinationDataSourceSettings;
		if(destinationDataSourceSettings != null){
			putBodyParameter("DestinationDataSourceSettings", destinationDataSourceSettings);
		}
	}

	public String getSourceDataSourceSettings() {
		return this.sourceDataSourceSettings;
	}

	public void setSourceDataSourceSettings(String sourceDataSourceSettings) {
		this.sourceDataSourceSettings = sourceDataSourceSettings;
		if(sourceDataSourceSettings != null){
			putBodyParameter("SourceDataSourceSettings", sourceDataSourceSettings);
		}
	}

	public String getResourceSettings() {
		return this.resourceSettings;
	}

	public void setResourceSettings(String resourceSettings) {
		this.resourceSettings = resourceSettings;
		if(resourceSettings != null){
			putBodyParameter("ResourceSettings", resourceSettings);
		}
	}

	public String getMigrationType() {
		return this.migrationType;
	}

	public void setMigrationType(String migrationType) {
		this.migrationType = migrationType;
		if(migrationType != null){
			putBodyParameter("MigrationType", migrationType);
		}
	}

	public String getSystemDebug() {
		return this.systemDebug;
	}

	public void setSystemDebug(String systemDebug) {
		this.systemDebug = systemDebug;
		if(systemDebug != null){
			putQueryParameter("SystemDebug", systemDebug);
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

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putBodyParameter("JobName", jobName);
		}
	}

	public String getTableMappings() {
		return this.tableMappings;
	}

	public void setTableMappings(String tableMappings) {
		this.tableMappings = tableMappings;
		if(tableMappings != null){
			putBodyParameter("TableMappings", tableMappings);
		}
	}

	public String getJobSettings() {
		return this.jobSettings;
	}

	public void setJobSettings(String jobSettings) {
		this.jobSettings = jobSettings;
		if(jobSettings != null){
			putBodyParameter("JobSettings", jobSettings);
		}
	}

	@Override
	public Class<CreateDIJobResponse> getResponseClass() {
		return CreateDIJobResponse.class;
	}

}
