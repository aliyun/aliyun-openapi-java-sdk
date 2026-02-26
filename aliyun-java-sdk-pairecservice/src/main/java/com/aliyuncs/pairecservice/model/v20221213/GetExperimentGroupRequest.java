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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetExperimentGroupRequest extends RoaAcsRequest<GetExperimentGroupResponse> {
	   

	private String instanceId;

	private String experimentGroupId;
	public GetExperimentGroupRequest() {
		super("PaiRecService", "2022-12-13", "GetExperimentGroup");
		setUriPattern("/api/v1/experimentgroups/[ExperimentGroupId]");
		setMethod(MethodType.GET);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getExperimentGroupId() {
		return this.experimentGroupId;
	}

	public void setExperimentGroupId(String experimentGroupId) {
		this.experimentGroupId = experimentGroupId;
		if(experimentGroupId != null){
			putPathParameter("ExperimentGroupId", experimentGroupId);
		}
	}

	@Override
	public Class<GetExperimentGroupResponse> getResponseClass() {
		return GetExperimentGroupResponse.class;
	}

}
