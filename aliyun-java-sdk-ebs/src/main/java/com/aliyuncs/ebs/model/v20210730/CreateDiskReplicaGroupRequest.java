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
public class CreateDiskReplicaGroupRequest extends RpcAcsRequest<CreateDiskReplicaGroupResponse> {
	   

	private String clientToken;

	private String destinationRegionId;

	private String description;

	private String sourceZoneId;

	private String destinationZoneId;

	private Long bandwidth;

	private String groupName;

	private Long rPO;
	public CreateDiskReplicaGroupRequest() {
		super("ebs", "2021-07-30", "CreateDiskReplicaGroup", "ebs");
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

	public String getDestinationRegionId() {
		return this.destinationRegionId;
	}

	public void setDestinationRegionId(String destinationRegionId) {
		this.destinationRegionId = destinationRegionId;
		if(destinationRegionId != null){
			putQueryParameter("DestinationRegionId", destinationRegionId);
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

	public String getSourceZoneId() {
		return this.sourceZoneId;
	}

	public void setSourceZoneId(String sourceZoneId) {
		this.sourceZoneId = sourceZoneId;
		if(sourceZoneId != null){
			putQueryParameter("SourceZoneId", sourceZoneId);
		}
	}

	public String getDestinationZoneId() {
		return this.destinationZoneId;
	}

	public void setDestinationZoneId(String destinationZoneId) {
		this.destinationZoneId = destinationZoneId;
		if(destinationZoneId != null){
			putQueryParameter("DestinationZoneId", destinationZoneId);
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
	public Class<CreateDiskReplicaGroupResponse> getResponseClass() {
		return CreateDiskReplicaGroupResponse.class;
	}

}
