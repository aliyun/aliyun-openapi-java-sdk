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

package com.aliyuncs.paistudio.model.v20201123;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.paistudio.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateJobRequest extends RoaAcsRequest<CreateJobResponse> {
	   

	private String executeType;

	private String anchorNodeId;

	private String experimentId;
	public CreateJobRequest() {
		super("PaiStudio", "2020-11-23", "CreateJob");
		setUriPattern("/api/core/v1.0/jobs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExecuteType() {
		return this.executeType;
	}

	public void setExecuteType(String executeType) {
		this.executeType = executeType;
		if(executeType != null){
			putQueryParameter("ExecuteType", executeType);
		}
	}

	public String getAnchorNodeId() {
		return this.anchorNodeId;
	}

	public void setAnchorNodeId(String anchorNodeId) {
		this.anchorNodeId = anchorNodeId;
		if(anchorNodeId != null){
			putQueryParameter("AnchorNodeId", anchorNodeId);
		}
	}

	public String getExperimentId() {
		return this.experimentId;
	}

	public void setExperimentId(String experimentId) {
		this.experimentId = experimentId;
		if(experimentId != null){
			putQueryParameter("ExperimentId", experimentId);
		}
	}

	@Override
	public Class<CreateJobResponse> getResponseClass() {
		return CreateJobResponse.class;
	}

}
