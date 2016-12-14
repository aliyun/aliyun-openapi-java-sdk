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
package com.aliyuncs.hpc.model.v20161213;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RevokeSecurityGroupRequest extends RpcAcsRequest<RevokeSecurityGroupResponse> {
	
	public RevokeSecurityGroupRequest() {
		super("HPC", "2016-12-13", "RevokeSecurityGroup", "hpc");
		setMethod(MethodType.POST);
	}

	private String tOKEN;

	private String sourceIp;

	private String policy;

	private String priority;

	private String nicType;

	public String getTOKEN() {
		return this.tOKEN;
	}

	public void setTOKEN(String tOKEN) {
		this.tOKEN = tOKEN;
		putQueryParameter("TOKEN", tOKEN);
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		putQueryParameter("SourceIp", sourceIp);
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		putQueryParameter("Policy", policy);
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		putQueryParameter("Priority", priority);
	}

	public String getNicType() {
		return this.nicType;
	}

	public void setNicType(String nicType) {
		this.nicType = nicType;
		putQueryParameter("NicType", nicType);
	}

	@Override
	public Class<RevokeSecurityGroupResponse> getResponseClass() {
		return RevokeSecurityGroupResponse.class;
	}

}
