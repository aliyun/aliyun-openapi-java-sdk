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

package com.aliyuncs.ahas_openapi.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ahas_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetActivityTaskRequest extends RpcAcsRequest<GetActivityTaskResponse> {
	   

	private String nameSpace;

	private String activityTaskId;

	private String experimentTaskId;

	private String ahasRegionId;
	public GetActivityTaskRequest() {
		super("ahas-openapi", "2019-09-01", "GetActivityTask", "ahas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNameSpace() {
		return this.nameSpace;
	}

	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
		if(nameSpace != null){
			putQueryParameter("NameSpace", nameSpace);
		}
	}

	public String getActivityTaskId() {
		return this.activityTaskId;
	}

	public void setActivityTaskId(String activityTaskId) {
		this.activityTaskId = activityTaskId;
		if(activityTaskId != null){
			putQueryParameter("ActivityTaskId", activityTaskId);
		}
	}

	public String getExperimentTaskId() {
		return this.experimentTaskId;
	}

	public void setExperimentTaskId(String experimentTaskId) {
		this.experimentTaskId = experimentTaskId;
		if(experimentTaskId != null){
			putQueryParameter("ExperimentTaskId", experimentTaskId);
		}
	}

	public String getAhasRegionId() {
		return this.ahasRegionId;
	}

	public void setAhasRegionId(String ahasRegionId) {
		this.ahasRegionId = ahasRegionId;
		if(ahasRegionId != null){
			putQueryParameter("AhasRegionId", ahasRegionId);
		}
	}

	@Override
	public Class<GetActivityTaskResponse> getResponseClass() {
		return GetActivityTaskResponse.class;
	}

}
