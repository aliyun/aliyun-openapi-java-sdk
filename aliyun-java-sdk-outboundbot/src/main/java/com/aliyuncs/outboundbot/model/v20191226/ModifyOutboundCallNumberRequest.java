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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyOutboundCallNumberRequest extends RpcAcsRequest<ModifyOutboundCallNumberResponse> {
	   

	private String outboundCallNumberId;

	private Integer rateLimitCount;

	private String number;

	private String instanceId;

	private Integer rateLimitPeriod;
	public ModifyOutboundCallNumberRequest() {
		super("OutboundBot", "2019-12-26", "ModifyOutboundCallNumber", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOutboundCallNumberId() {
		return this.outboundCallNumberId;
	}

	public void setOutboundCallNumberId(String outboundCallNumberId) {
		this.outboundCallNumberId = outboundCallNumberId;
		if(outboundCallNumberId != null){
			putQueryParameter("OutboundCallNumberId", outboundCallNumberId);
		}
	}

	public Integer getRateLimitCount() {
		return this.rateLimitCount;
	}

	public void setRateLimitCount(Integer rateLimitCount) {
		this.rateLimitCount = rateLimitCount;
		if(rateLimitCount != null){
			putQueryParameter("RateLimitCount", rateLimitCount.toString());
		}
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putQueryParameter("Number", number);
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

	public Integer getRateLimitPeriod() {
		return this.rateLimitPeriod;
	}

	public void setRateLimitPeriod(Integer rateLimitPeriod) {
		this.rateLimitPeriod = rateLimitPeriod;
		if(rateLimitPeriod != null){
			putQueryParameter("RateLimitPeriod", rateLimitPeriod.toString());
		}
	}

	@Override
	public Class<ModifyOutboundCallNumberResponse> getResponseClass() {
		return ModifyOutboundCallNumberResponse.class;
	}

}
