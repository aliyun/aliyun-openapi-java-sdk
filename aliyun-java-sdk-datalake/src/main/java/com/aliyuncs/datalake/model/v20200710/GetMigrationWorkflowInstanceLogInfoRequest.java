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

package com.aliyuncs.datalake.model.v20200710;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.datalake.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetMigrationWorkflowInstanceLogInfoRequest extends RoaAcsRequest<GetMigrationWorkflowInstanceLogInfoResponse> {
	   

	private String flowInstanceId;
	public GetMigrationWorkflowInstanceLogInfoRequest() {
		super("DataLake", "2020-07-10", "GetMigrationWorkflowInstanceLogInfo");
		setUriPattern("/webapi/migration/workflow/log/get");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFlowInstanceId() {
		return this.flowInstanceId;
	}

	public void setFlowInstanceId(String flowInstanceId) {
		this.flowInstanceId = flowInstanceId;
		if(flowInstanceId != null){
			putQueryParameter("FlowInstanceId", flowInstanceId);
		}
	}

	@Override
	public Class<GetMigrationWorkflowInstanceLogInfoResponse> getResponseClass() {
		return GetMigrationWorkflowInstanceLogInfoResponse.class;
	}

}
