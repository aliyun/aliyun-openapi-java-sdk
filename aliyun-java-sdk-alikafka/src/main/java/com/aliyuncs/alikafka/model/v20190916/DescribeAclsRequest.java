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
public class DescribeAclsRequest extends RpcAcsRequest<DescribeAclsResponse> {
	   

	private String aclResourceType;

	private String aclResourceName;

	private String instanceId;

	private String username;
	public DescribeAclsRequest() {
		super("alikafka", "2019-09-16", "DescribeAcls", "alikafka");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAclResourceType() {
		return this.aclResourceType;
	}

	public void setAclResourceType(String aclResourceType) {
		this.aclResourceType = aclResourceType;
		if(aclResourceType != null){
			putQueryParameter("AclResourceType", aclResourceType);
		}
	}

	public String getAclResourceName() {
		return this.aclResourceName;
	}

	public void setAclResourceName(String aclResourceName) {
		this.aclResourceName = aclResourceName;
		if(aclResourceName != null){
			putQueryParameter("AclResourceName", aclResourceName);
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putQueryParameter("Username", username);
		}
	}

	@Override
	public Class<DescribeAclsResponse> getResponseClass() {
		return DescribeAclsResponse.class;
	}

}
