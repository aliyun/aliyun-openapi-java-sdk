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
public class AddWirelessCloudConnectorToGroupRequest extends RpcAcsRequest<AddWirelessCloudConnectorToGroupResponse> {
	   

	private List<String> wirelessCloudConnectorIdss;

	private String wirelessCloudConnectorGroupId;

	private Boolean dryRun;

	private String clientToken;
	public AddWirelessCloudConnectorToGroupRequest() {
		super("CC5G", "2022-03-14", "AddWirelessCloudConnectorToGroup", "fivegcc");
		setMethod(MethodType.POST);
	}

	public List<String> getWirelessCloudConnectorIdss() {
		return this.wirelessCloudConnectorIdss;
	}

	public void setWirelessCloudConnectorIdss(List<String> wirelessCloudConnectorIdss) {
		this.wirelessCloudConnectorIdss = wirelessCloudConnectorIdss;	
		if (wirelessCloudConnectorIdss != null) {
			for (int i = 0; i < wirelessCloudConnectorIdss.size(); i++) {
				putQueryParameter("WirelessCloudConnectorIds." + (i + 1) , wirelessCloudConnectorIdss.get(i));
			}
		}	
	}

	public String getWirelessCloudConnectorGroupId() {
		return this.wirelessCloudConnectorGroupId;
	}

	public void setWirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
		this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
		if(wirelessCloudConnectorGroupId != null){
			putQueryParameter("WirelessCloudConnectorGroupId", wirelessCloudConnectorGroupId);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	@Override
	public Class<AddWirelessCloudConnectorToGroupResponse> getResponseClass() {
		return AddWirelessCloudConnectorToGroupResponse.class;
	}

}
