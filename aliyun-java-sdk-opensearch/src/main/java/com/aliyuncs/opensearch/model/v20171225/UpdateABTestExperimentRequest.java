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

package com.aliyuncs.opensearch.model.v20171225;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.opensearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateABTestExperimentRequest extends RoaAcsRequest<UpdateABTestExperimentResponse> {
	   

	private Integer groupId;

	private Integer sceneId;

	private Integer experimentId;

	private String appGroupIdentity;
	public UpdateABTestExperimentRequest() {
		super("OpenSearch", "2017-12-25", "UpdateABTestExperiment", "opensearch");
		setUriPattern("/v4/openapi/app-groups/[appGroupIdentity]/scenes/[sceneId]/groups/[groupId]/experiments/[experimentId]");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putPathParameter("groupId", groupId.toString());
		}
	}

	public Integer getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putPathParameter("sceneId", sceneId.toString());
		}
	}

	public Integer getExperimentId() {
		return this.experimentId;
	}

	public void setExperimentId(Integer experimentId) {
		this.experimentId = experimentId;
		if(experimentId != null){
			putPathParameter("experimentId", experimentId.toString());
		}
	}

	public String getAppGroupIdentity() {
		return this.appGroupIdentity;
	}

	public void setAppGroupIdentity(String appGroupIdentity) {
		this.appGroupIdentity = appGroupIdentity;
		if(appGroupIdentity != null){
			putPathParameter("appGroupIdentity", appGroupIdentity);
		}
	}

	@Override
	public Class<UpdateABTestExperimentResponse> getResponseClass() {
		return UpdateABTestExperimentResponse.class;
	}

}
