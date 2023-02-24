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

package com.aliyuncs.vpcpeer.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpcpeer.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVpcPeerConnectionRequest extends RpcAcsRequest<CreateVpcPeerConnectionResponse> {
	   

	private String clientToken;

	private String description;

	private Long acceptingAliUid;

	private String acceptingRegionId;

	private Boolean dryRun;

	private String acceptingVpcId;

	private String vpcId;

	private String name;
	public CreateVpcPeerConnectionRequest() {
		super("VpcPeer", "2022-01-01", "CreateVpcPeerConnection", "vpcpeer");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Long getAcceptingAliUid() {
		return this.acceptingAliUid;
	}

	public void setAcceptingAliUid(Long acceptingAliUid) {
		this.acceptingAliUid = acceptingAliUid;
		if(acceptingAliUid != null){
			putBodyParameter("AcceptingAliUid", acceptingAliUid.toString());
		}
	}

	public String getAcceptingRegionId() {
		return this.acceptingRegionId;
	}

	public void setAcceptingRegionId(String acceptingRegionId) {
		this.acceptingRegionId = acceptingRegionId;
		if(acceptingRegionId != null){
			putBodyParameter("AcceptingRegionId", acceptingRegionId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public String getAcceptingVpcId() {
		return this.acceptingVpcId;
	}

	public void setAcceptingVpcId(String acceptingVpcId) {
		this.acceptingVpcId = acceptingVpcId;
		if(acceptingVpcId != null){
			putBodyParameter("AcceptingVpcId", acceptingVpcId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	@Override
	public Class<CreateVpcPeerConnectionResponse> getResponseClass() {
		return CreateVpcPeerConnectionResponse.class;
	}

}
