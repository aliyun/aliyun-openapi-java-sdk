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

package com.aliyuncs.mpaas.model.v20200710;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MssOpenApiCreateSingleDataRequest extends RpcAcsRequest<MssOpenApiCreateSingleDataResponse> {
	   

	private String mssSyncOrderJsonStr;

	private String instanceId;
	public MssOpenApiCreateSingleDataRequest() {
		super("mPaaS", "2020-07-10", "MssOpenApiCreateSingleData");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMssSyncOrderJsonStr() {
		return this.mssSyncOrderJsonStr;
	}

	public void setMssSyncOrderJsonStr(String mssSyncOrderJsonStr) {
		this.mssSyncOrderJsonStr = mssSyncOrderJsonStr;
		if(mssSyncOrderJsonStr != null){
			putBodyParameter("MssSyncOrderJsonStr", mssSyncOrderJsonStr);
		}
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

	@Override
	public Class<MssOpenApiCreateSingleDataResponse> getResponseClass() {
		return MssOpenApiCreateSingleDataResponse.class;
	}

}
