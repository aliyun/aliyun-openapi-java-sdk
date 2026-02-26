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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTaskFlowRequest extends RpcAcsRequest<CreateTaskFlowResponse> {
	   

	private String dagName;

	private String description;

	private Long tid;

	private Long scenarioId;
	public CreateTaskFlowRequest() {
		super("dms-enterprise", "2018-11-01", "CreateTaskFlow", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDagName() {
		return this.dagName;
	}

	public void setDagName(String dagName) {
		this.dagName = dagName;
		if(dagName != null){
			putQueryParameter("DagName", dagName);
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

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Long getScenarioId() {
		return this.scenarioId;
	}

	public void setScenarioId(Long scenarioId) {
		this.scenarioId = scenarioId;
		if(scenarioId != null){
			putQueryParameter("ScenarioId", scenarioId.toString());
		}
	}

	@Override
	public Class<CreateTaskFlowResponse> getResponseClass() {
		return CreateTaskFlowResponse.class;
	}

}
