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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterHostGroupRequest extends RpcAcsRequest<CreateClusterHostGroupResponse> {
	
	public CreateClusterHostGroupRequest() {
		super("Emr", "2016-04-08", "CreateClusterHostGroup", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String comment;

	private String clusterId;

	private String hostGroupName;

	private String hostGroupType;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getHostGroupName() {
		return this.hostGroupName;
	}

	public void setHostGroupName(String hostGroupName) {
		this.hostGroupName = hostGroupName;
		if(hostGroupName != null){
			putQueryParameter("HostGroupName", hostGroupName);
		}
	}

	public String getHostGroupType() {
		return this.hostGroupType;
	}

	public void setHostGroupType(String hostGroupType) {
		this.hostGroupType = hostGroupType;
		if(hostGroupType != null){
			putQueryParameter("HostGroupType", hostGroupType);
		}
	}

	@Override
	public Class<CreateClusterHostGroupResponse> getResponseClass() {
		return CreateClusterHostGroupResponse.class;
	}

}
