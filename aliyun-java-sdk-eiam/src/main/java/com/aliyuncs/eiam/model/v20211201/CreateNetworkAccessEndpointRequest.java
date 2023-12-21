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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateNetworkAccessEndpointRequest extends RpcAcsRequest<CreateNetworkAccessEndpointResponse> {
	   

	private String clientToken;

	private List<String> vSwitchIds;

	private String networkAccessEndpointName;

	private String vpcRegionId;

	private String instanceId;

	private String vpcId;
	public CreateNetworkAccessEndpointRequest() {
		super("Eiam", "2021-12-01", "CreateNetworkAccessEndpoint", "eiam");
		setProtocol(ProtocolType.HTTPS);
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

	public List<String> getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(List<String> vSwitchIds) {
		this.vSwitchIds = vSwitchIds;	
		if (vSwitchIds != null) {
			for (int depth1 = 0; depth1 < vSwitchIds.size(); depth1++) {
				putQueryParameter("VSwitchIds." + (depth1 + 1) , vSwitchIds.get(depth1));
			}
		}	
	}

	public String getNetworkAccessEndpointName() {
		return this.networkAccessEndpointName;
	}

	public void setNetworkAccessEndpointName(String networkAccessEndpointName) {
		this.networkAccessEndpointName = networkAccessEndpointName;
		if(networkAccessEndpointName != null){
			putQueryParameter("NetworkAccessEndpointName", networkAccessEndpointName);
		}
	}

	public String getVpcRegionId() {
		return this.vpcRegionId;
	}

	public void setVpcRegionId(String vpcRegionId) {
		this.vpcRegionId = vpcRegionId;
		if(vpcRegionId != null){
			putQueryParameter("VpcRegionId", vpcRegionId);
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	@Override
	public Class<CreateNetworkAccessEndpointResponse> getResponseClass() {
		return CreateNetworkAccessEndpointResponse.class;
	}

}
