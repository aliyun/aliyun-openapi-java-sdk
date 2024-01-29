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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenerateTemplateByScratchRequest extends RpcAcsRequest<GenerateTemplateByScratchResponse> {
	   

	private String templateScratchId;

	private String templateType;

	private String provisionRegionId;
	public GenerateTemplateByScratchRequest() {
		super("ROS", "2019-09-10", "GenerateTemplateByScratch", "ros");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTemplateScratchId() {
		return this.templateScratchId;
	}

	public void setTemplateScratchId(String templateScratchId) {
		this.templateScratchId = templateScratchId;
		if(templateScratchId != null){
			putQueryParameter("TemplateScratchId", templateScratchId);
		}
	}

	public String getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
		if(templateType != null){
			putQueryParameter("TemplateType", templateType);
		}
	}

	public String getProvisionRegionId() {
		return this.provisionRegionId;
	}

	public void setProvisionRegionId(String provisionRegionId) {
		this.provisionRegionId = provisionRegionId;
		if(provisionRegionId != null){
			putQueryParameter("ProvisionRegionId", provisionRegionId);
		}
	}

	@Override
	public Class<GenerateTemplateByScratchResponse> getResponseClass() {
		return GenerateTemplateByScratchResponse.class;
	}

}
