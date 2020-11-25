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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunTriggerNodeRequest extends RpcAcsRequest<RunTriggerNodeResponse> {
	   

	private Long bizDate;

	private Long appId;

	private Long cycleTime;

	private Long nodeId;
	public RunTriggerNodeRequest() {
		super("dataworks-public", "2020-05-18", "RunTriggerNode");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBizDate() {
		return this.bizDate;
	}

	public void setBizDate(Long bizDate) {
		this.bizDate = bizDate;
		if(bizDate != null){
			putBodyParameter("BizDate", bizDate.toString());
		}
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId.toString());
		}
	}

	public Long getCycleTime() {
		return this.cycleTime;
	}

	public void setCycleTime(Long cycleTime) {
		this.cycleTime = cycleTime;
		if(cycleTime != null){
			putBodyParameter("CycleTime", cycleTime.toString());
		}
	}

	public Long getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putBodyParameter("NodeId", nodeId.toString());
		}
	}

	@Override
	public Class<RunTriggerNodeResponse> getResponseClass() {
		return RunTriggerNodeResponse.class;
	}

}
