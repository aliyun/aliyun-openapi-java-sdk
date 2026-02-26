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
public class CreateNetworkZoneRequest extends RpcAcsRequest<CreateNetworkZoneResponse> {
	   

	private String networkZoneType;

	private String clientToken;

	private List<String> ipv6Cidrs;

	private String description;

	private String networkZoneName;

	private List<String> ipv4Cidrs;

	private String instanceId;

	private String vpcId;
	public CreateNetworkZoneRequest() {
		super("Eiam", "2021-12-01", "CreateNetworkZone", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getNetworkZoneType() {
		return this.networkZoneType;
	}

	public void setNetworkZoneType(String networkZoneType) {
		this.networkZoneType = networkZoneType;
		if(networkZoneType != null){
			putQueryParameter("NetworkZoneType", networkZoneType);
		}
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

	public List<String> getIpv6Cidrs() {
		return this.ipv6Cidrs;
	}

	public void setIpv6Cidrs(List<String> ipv6Cidrs) {
		this.ipv6Cidrs = ipv6Cidrs;	
		if (ipv6Cidrs != null) {
			for (int depth1 = 0; depth1 < ipv6Cidrs.size(); depth1++) {
				putQueryParameter("Ipv6Cidrs." + (depth1 + 1) , ipv6Cidrs.get(depth1));
			}
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

	public String getNetworkZoneName() {
		return this.networkZoneName;
	}

	public void setNetworkZoneName(String networkZoneName) {
		this.networkZoneName = networkZoneName;
		if(networkZoneName != null){
			putQueryParameter("NetworkZoneName", networkZoneName);
		}
	}

	public List<String> getIpv4Cidrs() {
		return this.ipv4Cidrs;
	}

	public void setIpv4Cidrs(List<String> ipv4Cidrs) {
		this.ipv4Cidrs = ipv4Cidrs;	
		if (ipv4Cidrs != null) {
			for (int depth1 = 0; depth1 < ipv4Cidrs.size(); depth1++) {
				putQueryParameter("Ipv4Cidrs." + (depth1 + 1) , ipv4Cidrs.get(depth1));
			}
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
	public Class<CreateNetworkZoneResponse> getResponseClass() {
		return CreateNetworkZoneResponse.class;
	}

}
