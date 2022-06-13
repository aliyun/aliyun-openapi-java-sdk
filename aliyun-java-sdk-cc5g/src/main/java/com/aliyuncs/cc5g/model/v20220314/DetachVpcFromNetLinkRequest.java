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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DetachVpcFromNetLinkRequest extends RpcAcsRequest<DetachVpcFromNetLinkResponse> {
	   

	private Boolean dryRun;

	private String netLinkId;

	private String clientToken;

	private String wirelessCloudConnectorId;
	public DetachVpcFromNetLinkRequest() {
		super("CC5G", "2022-03-14", "DetachVpcFromNetLink", "fivegcc");
		setMethod(MethodType.POST);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	@Override
	public Class<DetachVpcFromNetLinkResponse> getResponseClass() {
		return DetachVpcFromNetLinkResponse.class;
	}

}
