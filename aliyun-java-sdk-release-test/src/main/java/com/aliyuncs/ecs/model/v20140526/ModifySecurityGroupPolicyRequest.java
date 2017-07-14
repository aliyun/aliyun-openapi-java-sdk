/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifySecurityGroupPolicyRequest extends RpcAcsRequest<ModifySecurityGroupPolicyResponse> {
	
	public ModifySecurityGroupPolicyRequest() {
		super("Ecs", "2014-05-26", "ModifySecurityGroupPolicy", "ecs");
	}

	private String clientToken;

	private String securityGroupId;

	private String innerAccessPolicy;

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getInnerAccessPolicy() {
		return this.innerAccessPolicy;
	}

	public void setInnerAccessPolicy(String innerAccessPolicy) {
		this.innerAccessPolicy = innerAccessPolicy;
		if(innerAccessPolicy != null){
			putQueryParameter("InnerAccessPolicy", innerAccessPolicy);
		}
	}

	@Override
	public Class<ModifySecurityGroupPolicyResponse> getResponseClass() {
		return ModifySecurityGroupPolicyResponse.class;
	}

}
