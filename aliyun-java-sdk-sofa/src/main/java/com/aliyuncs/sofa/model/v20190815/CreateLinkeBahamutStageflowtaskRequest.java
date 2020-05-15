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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeBahamutStageflowtaskRequest extends RpcAcsRequest<CreateLinkeBahamutStageflowtaskResponse> {
	   

	private String taskKey;

	private String unitId;

	private String iterationId;
	public CreateLinkeBahamutStageflowtaskRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutStageflowtask", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTaskKey() {
		return this.taskKey;
	}

	public void setTaskKey(String taskKey) {
		this.taskKey = taskKey;
		if(taskKey != null){
			putBodyParameter("TaskKey", taskKey);
		}
	}

	public String getUnitId() {
		return this.unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
		if(unitId != null){
			putBodyParameter("UnitId", unitId);
		}
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putBodyParameter("IterationId", iterationId);
		}
	}

	@Override
	public Class<CreateLinkeBahamutStageflowtaskResponse> getResponseClass() {
		return CreateLinkeBahamutStageflowtaskResponse.class;
	}

}
