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
public class UpdateDIJobRequest extends RpcAcsRequest<UpdateDIJobResponse> {
	   

	private String description;

	private String transformationRules;

	private Long dIJobId;

	private String resourceSettings;

	private String tableMappings;

	private String jobSettings;
	public UpdateDIJobRequest() {
		super("dataworks-public", "2020-05-18", "UpdateDIJob");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getDIJobId() {
		return this.dIJobId;
	}

	public void setDIJobId(Long dIJobId) {
		this.dIJobId = dIJobId;
		if(dIJobId != null){
			putBodyParameter("DIJobId", dIJobId.toString());
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
	public Class<UpdateDIJobResponse> getResponseClass() {
		return UpdateDIJobResponse.class;
	}

}
