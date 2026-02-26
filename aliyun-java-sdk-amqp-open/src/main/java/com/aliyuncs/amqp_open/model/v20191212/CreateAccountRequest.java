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

package com.aliyuncs.amqp_open.model.v20191212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.amqp_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAccountRequest extends RpcAcsRequest<CreateAccountResponse> {
	   

	private String signature;

	private String secretSign;

	private String accountAccessKey;

	private String instanceId;

	private Long createTimestamp;

	private String userName;
	public CreateAccountRequest() {
		super("amqp-open", "2019-12-12", "CreateAccount", "onsproxy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
		if(signature != null){
			putQueryParameter("signature", signature);
		}
	}

	public String getSecretSign() {
		return this.secretSign;
	}

	public void setSecretSign(String secretSign) {
		this.secretSign = secretSign;
		if(secretSign != null){
			putQueryParameter("secretSign", secretSign);
		}
	}

	public String getAccountAccessKey() {
		return this.accountAccessKey;
	}

	public void setAccountAccessKey(String accountAccessKey) {
		this.accountAccessKey = accountAccessKey;
		if(accountAccessKey != null){
			putQueryParameter("accountAccessKey", accountAccessKey);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("instanceId", instanceId);
		}
	}

	public Long getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Long createTimestamp) {
		this.createTimestamp = createTimestamp;
		if(createTimestamp != null){
			putQueryParameter("createTimestamp", createTimestamp.toString());
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("userName", userName);
		}
	}

	@Override
	public Class<CreateAccountResponse> getResponseClass() {
		return CreateAccountResponse.class;
	}

}
