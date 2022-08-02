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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDiagnosticMetricSetRequest extends RpcAcsRequest<ModifyDiagnosticMetricSetResponse> {
	   

	private List<String> metricIdss;

	private String metricSetId;

	private String description;

	private String metricSetName;

	private String resourceType;
	public ModifyDiagnosticMetricSetRequest() {
		super("Ecs", "2014-05-26", "ModifyDiagnosticMetricSet", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getMetricIdss() {
		return this.metricIdss;
	}

	public void setMetricIdss(List<String> metricIdss) {
		this.metricIdss = metricIdss;	
		if (metricIdss != null) {
			for (int i = 0; i < metricIdss.size(); i++) {
				putQueryParameter("MetricIds." + (i + 1) , metricIdss.get(i));
			}
		}	
	}

	public String getMetricSetId() {
		return this.metricSetId;
	}

	public void setMetricSetId(String metricSetId) {
		this.metricSetId = metricSetId;
		if(metricSetId != null){
			putQueryParameter("MetricSetId", metricSetId);
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

	public String getMetricSetName() {
		return this.metricSetName;
	}

	public void setMetricSetName(String metricSetName) {
		this.metricSetName = metricSetName;
		if(metricSetName != null){
			putQueryParameter("MetricSetName", metricSetName);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	@Override
	public Class<ModifyDiagnosticMetricSetResponse> getResponseClass() {
		return ModifyDiagnosticMetricSetResponse.class;
	}

}
