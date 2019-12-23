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

package com.aliyuncs.alikafka.model.v20190916;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateConsumerGroupRequest extends RpcAcsRequest<CreateConsumerGroupResponse> {
	   

	private String consumerId;

	private String remark;

	private String instanceId;
	public CreateConsumerGroupRequest() {
		super("alikafka", "2019-09-16", "CreateConsumerGroup", "alikafka");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConsumerId() {
		return this.consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
		if(consumerId != null){
			putQueryParameter("ConsumerId", consumerId);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
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
	public Class<CreateConsumerGroupResponse> getResponseClass() {
		return CreateConsumerGroupResponse.class;
	}

}
