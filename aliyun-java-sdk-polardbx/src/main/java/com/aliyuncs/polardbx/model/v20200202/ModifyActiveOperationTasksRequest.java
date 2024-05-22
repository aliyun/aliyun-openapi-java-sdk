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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyActiveOperationTasksRequest extends RpcAcsRequest<ModifyActiveOperationTasksResponse> {
	   

	private String switchTime;

	private String ids;

	private Long immediateStart;
	public ModifyActiveOperationTasksRequest() {
		super("polardbx", "2020-02-02", "ModifyActiveOperationTasks", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSwitchTime() {
		return this.switchTime;
	}

	public void setSwitchTime(String switchTime) {
		this.switchTime = switchTime;
		if(switchTime != null){
			putQueryParameter("SwitchTime", switchTime);
		}
	}

	public String getIds() {
		return this.ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
		if(ids != null){
			putQueryParameter("Ids", ids);
		}
	}

	public Long getImmediateStart() {
		return this.immediateStart;
	}

	public void setImmediateStart(Long immediateStart) {
		this.immediateStart = immediateStart;
		if(immediateStart != null){
			putQueryParameter("ImmediateStart", immediateStart.toString());
		}
	}

	@Override
	public Class<ModifyActiveOperationTasksResponse> getResponseClass() {
		return ModifyActiveOperationTasksResponse.class;
	}

}
