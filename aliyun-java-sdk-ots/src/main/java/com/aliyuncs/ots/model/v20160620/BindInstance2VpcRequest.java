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

package com.aliyuncs.ots.model.v20160620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BindInstance2VpcRequest extends RpcAcsRequest<BindInstance2VpcResponse> {
	
	public BindInstance2VpcRequest() {
		super("Ots", "2016-06-20", "BindInstance2Vpc", "ots");
		setMethod(MethodType.POST);
	}

	private String access_key_id;

	private String instanceVpcName;

	private Long resourceOwnerId;

	private String instanceName;

	private String vpcId;

	private String virtualSwitchId;

	private String regionNo;

	private String network;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public String getInstanceVpcName() {
		return this.instanceVpcName;
	}

	public void setInstanceVpcName(String instanceVpcName) {
		this.instanceVpcName = instanceVpcName;
		if(instanceVpcName != null){
			putQueryParameter("InstanceVpcName", instanceVpcName);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getVirtualSwitchId() {
		return this.virtualSwitchId;
	}

	public void setVirtualSwitchId(String virtualSwitchId) {
		this.virtualSwitchId = virtualSwitchId;
		if(virtualSwitchId != null){
			putQueryParameter("VirtualSwitchId", virtualSwitchId);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public String getNetwork() {
		return this.network;
	}

	public void setNetwork(String network) {
		this.network = network;
		if(network != null){
			putQueryParameter("Network", network);
		}
	}

	@Override
	public Class<BindInstance2VpcResponse> getResponseClass() {
		return BindInstance2VpcResponse.class;
	}

}
