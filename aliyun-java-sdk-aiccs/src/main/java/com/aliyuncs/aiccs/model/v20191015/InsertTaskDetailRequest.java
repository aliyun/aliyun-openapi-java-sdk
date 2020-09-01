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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InsertTaskDetailRequest extends RpcAcsRequest<InsertTaskDetailResponse> {
	   

	private String instanceId;

	private Long outboundTaskId;

	private String callInfos;
	public InsertTaskDetailRequest() {
		super("aiccs", "2019-10-15", "InsertTaskDetail", "aiccs-service");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getOutboundTaskId() {
		return this.outboundTaskId;
	}

	public void setOutboundTaskId(Long outboundTaskId) {
		this.outboundTaskId = outboundTaskId;
		if(outboundTaskId != null){
			putQueryParameter("OutboundTaskId", outboundTaskId.toString());
		}
	}

	public String getCallInfos() {
		return this.callInfos;
	}

	public void setCallInfos(String callInfos) {
		this.callInfos = callInfos;
		if(callInfos != null){
			putQueryParameter("CallInfos", callInfos);
		}
	}

	@Override
	public Class<InsertTaskDetailResponse> getResponseClass() {
		return InsertTaskDetailResponse.class;
	}

}
