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

package com.aliyuncs.ebs.model.v20210730;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyDiskReplicaGroupRequest extends RpcAcsRequest<ModifyDiskReplicaGroupResponse> {
	   

	private String clientToken;

	private String description;

	private Long bandwidth;

	private String replicaGroupId;

	private String groupName;

	private Long rPO;
	public ModifyDiskReplicaGroupRequest() {
		super("ebs", "2021-07-30", "ModifyDiskReplicaGroup", "ebs");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Long bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getReplicaGroupId() {
		return this.replicaGroupId;
	}

	public void setReplicaGroupId(String replicaGroupId) {
		this.replicaGroupId = replicaGroupId;
		if(replicaGroupId != null){
			putQueryParameter("ReplicaGroupId", replicaGroupId);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public Long getRPO() {
		return this.rPO;
	}

	public void setRPO(Long rPO) {
		this.rPO = rPO;
		if(rPO != null){
			putQueryParameter("RPO", rPO.toString());
		}
	}

	@Override
	public Class<ModifyDiskReplicaGroupResponse> getResponseClass() {
		return ModifyDiskReplicaGroupResponse.class;
	}

}
