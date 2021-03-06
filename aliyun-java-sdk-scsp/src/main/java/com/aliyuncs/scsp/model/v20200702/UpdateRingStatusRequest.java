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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRingStatusRequest extends RpcAcsRequest<UpdateRingStatusResponse> {
	   

	private String instanceId;

	private String extra;

	private String callOutStatus;

	private String uniqueBizId;
	public UpdateRingStatusRequest() {
		super("scsp", "2020-07-02", "UpdateRingStatus", "scsp");
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
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
		if(extra != null){
			putBodyParameter("Extra", extra);
		}
	}

	public String getCallOutStatus() {
		return this.callOutStatus;
	}

	public void setCallOutStatus(String callOutStatus) {
		this.callOutStatus = callOutStatus;
		if(callOutStatus != null){
			putBodyParameter("CallOutStatus", callOutStatus);
		}
	}

	public String getUniqueBizId() {
		return this.uniqueBizId;
	}

	public void setUniqueBizId(String uniqueBizId) {
		this.uniqueBizId = uniqueBizId;
		if(uniqueBizId != null){
			putBodyParameter("UniqueBizId", uniqueBizId);
		}
	}

	@Override
	public Class<UpdateRingStatusResponse> getResponseClass() {
		return UpdateRingStatusResponse.class;
	}

}
