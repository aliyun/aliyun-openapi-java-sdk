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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyConsumerChannelRequest extends RpcAcsRequest<ModifyConsumerChannelResponse> {
	   

	private String consumerGroupName;

	private String consumerGroupId;

	private String consumerGroupPassword;

	private String consumerGroupUserName;

	private String dtsJobId;

	private String dtsInstanceId;
	public ModifyConsumerChannelRequest() {
		super("Dts", "2020-01-01", "ModifyConsumerChannel", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConsumerGroupName() {
		return this.consumerGroupName;
	}

	public void setConsumerGroupName(String consumerGroupName) {
		this.consumerGroupName = consumerGroupName;
		if(consumerGroupName != null){
			putQueryParameter("ConsumerGroupName", consumerGroupName);
		}
	}

	public String getConsumerGroupId() {
		return this.consumerGroupId;
	}

	public void setConsumerGroupId(String consumerGroupId) {
		this.consumerGroupId = consumerGroupId;
		if(consumerGroupId != null){
			putQueryParameter("ConsumerGroupId", consumerGroupId);
		}
	}

	public String getConsumerGroupPassword() {
		return this.consumerGroupPassword;
	}

	public void setConsumerGroupPassword(String consumerGroupPassword) {
		this.consumerGroupPassword = consumerGroupPassword;
		if(consumerGroupPassword != null){
			putQueryParameter("ConsumerGroupPassword", consumerGroupPassword);
		}
	}

	public String getConsumerGroupUserName() {
		return this.consumerGroupUserName;
	}

	public void setConsumerGroupUserName(String consumerGroupUserName) {
		this.consumerGroupUserName = consumerGroupUserName;
		if(consumerGroupUserName != null){
			putQueryParameter("ConsumerGroupUserName", consumerGroupUserName);
		}
	}

	public String getDtsJobId() {
		return this.dtsJobId;
	}

	public void setDtsJobId(String dtsJobId) {
		this.dtsJobId = dtsJobId;
		if(dtsJobId != null){
			putQueryParameter("DtsJobId", dtsJobId);
		}
	}

	public String getDtsInstanceId() {
		return this.dtsInstanceId;
	}

	public void setDtsInstanceId(String dtsInstanceId) {
		this.dtsInstanceId = dtsInstanceId;
		if(dtsInstanceId != null){
			putQueryParameter("DtsInstanceId", dtsInstanceId);
		}
	}

	@Override
	public Class<ModifyConsumerChannelResponse> getResponseClass() {
		return ModifyConsumerChannelResponse.class;
	}

}
