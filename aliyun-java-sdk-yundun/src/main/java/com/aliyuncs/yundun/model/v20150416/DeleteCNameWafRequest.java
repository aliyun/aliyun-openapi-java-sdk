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
package com.aliyuncs.yundun.model.v20150416;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteCNameWafRequest extends RpcAcsRequest<DeleteCNameWafResponse> {
	
	public DeleteCNameWafRequest() {
		super("Yundun", "2015-04-16", "DeleteCNameWaf");
	}

	private String instanceId;

	private String domain;

	private Integer cnameId;

	private String instanceType;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		putQueryParameter("InstanceId", instanceId);
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		putQueryParameter("Domain", domain);
	}

	public Integer getCnameId() {
		return this.cnameId;
	}

	public void setCnameId(Integer cnameId) {
		this.cnameId = cnameId;
		putQueryParameter("CnameId", String.valueOf(cnameId));
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		putQueryParameter("InstanceType", instanceType);
	}

	@Override
	public Class<DeleteCNameWafResponse> getResponseClass() {
		return DeleteCNameWafResponse.class;
	}

}
