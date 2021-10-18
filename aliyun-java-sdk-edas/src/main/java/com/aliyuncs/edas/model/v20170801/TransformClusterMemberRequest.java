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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TransformClusterMemberRequest extends RoaAcsRequest<TransformClusterMemberResponse> {
	   

	private String password;

	private String instanceIds;

	private String targetClusterId;
	public TransformClusterMemberRequest() {
		super("Edas", "2017-08-01", "TransformClusterMember", "edas");
		setUriPattern("/pop/v5/resource/transform_cluster_member");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public String getTargetClusterId() {
		return this.targetClusterId;
	}

	public void setTargetClusterId(String targetClusterId) {
		this.targetClusterId = targetClusterId;
		if(targetClusterId != null){
			putQueryParameter("TargetClusterId", targetClusterId);
		}
	}

	@Override
	public Class<TransformClusterMemberResponse> getResponseClass() {
		return TransformClusterMemberResponse.class;
	}

}
