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

package com.aliyuncs.cc5g.model.v20220314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AttachVpcToNetLinkRequest extends RpcAcsRequest<AttachVpcToNetLinkResponse> {
	   

	private String clientToken;

	private Boolean dryRun;

	private String netLinkId;

	private List<String> vSwitches;

	private String wirelessCloudConnectorId;

	private String vpcId;
	public AttachVpcToNetLinkRequest() {
		super("CC5G", "2022-03-14", "AttachVpcToNetLink", "fivegcc");
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

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getNetLinkId() {
		return this.netLinkId;
	}

	public void setNetLinkId(String netLinkId) {
		this.netLinkId = netLinkId;
		if(netLinkId != null){
			putQueryParameter("NetLinkId", netLinkId);
		}
	}

	public List<String> getVSwitches() {
		return this.vSwitches;
	}

	public void setVSwitches(List<String> vSwitches) {
		this.vSwitches = vSwitches;	
		if (vSwitches != null) {
			for (int depth1 = 0; depth1 < vSwitches.size(); depth1++) {
				putQueryParameter("VSwitches." + (depth1 + 1) , vSwitches.get(depth1));
			}
		}	
	}

	public String getWirelessCloudConnectorId() {
		return this.wirelessCloudConnectorId;
	}

	public void setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
		this.wirelessCloudConnectorId = wirelessCloudConnectorId;
		if(wirelessCloudConnectorId != null){
			putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
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
	public Class<AttachVpcToNetLinkResponse> getResponseClass() {
		return AttachVpcToNetLinkResponse.class;
	}

}
