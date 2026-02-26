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

package com.aliyuncs.ddoscoo.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ddoscoo.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyElasticBizBandWidthRequest extends RpcAcsRequest<ModifyElasticBizBandWidthResponse> {
	   

	private Integer elasticBizBandwidth;

	private String mode;

	private String instanceId;
	public ModifyElasticBizBandWidthRequest() {
		super("ddoscoo", "2020-01-01", "ModifyElasticBizBandWidth", "ddoscoo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getElasticBizBandwidth() {
		return this.elasticBizBandwidth;
	}

	public void setElasticBizBandwidth(Integer elasticBizBandwidth) {
		this.elasticBizBandwidth = elasticBizBandwidth;
		if(elasticBizBandwidth != null){
			putQueryParameter("ElasticBizBandwidth", elasticBizBandwidth.toString());
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
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

	@Override
	public Class<ModifyElasticBizBandWidthResponse> getResponseClass() {
		return ModifyElasticBizBandWidthResponse.class;
	}

}
