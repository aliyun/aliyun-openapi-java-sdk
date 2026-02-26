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

package com.aliyuncs.fnf.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.fnf.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteScheduleRequest extends RpcAcsRequest<DeleteScheduleResponse> {
	   

	private String scheduleName;

	private String flowName;
	public DeleteScheduleRequest() {
		super("fnf", "2019-03-15", "DeleteSchedule", "fnf");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScheduleName() {
		return this.scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
		if(scheduleName != null){
			putBodyParameter("ScheduleName", scheduleName);
		}
	}

	public String getFlowName() {
		return this.flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
		if(flowName != null){
			putBodyParameter("FlowName", flowName);
		}
	}

	@Override
	public Class<DeleteScheduleResponse> getResponseClass() {
		return DeleteScheduleResponse.class;
	}

}
