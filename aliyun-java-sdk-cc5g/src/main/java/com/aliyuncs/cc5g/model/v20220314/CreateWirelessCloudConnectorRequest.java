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
public class CreateWirelessCloudConnectorRequest extends RpcAcsRequest<CreateWirelessCloudConnectorResponse> {
	   

	private String useCase;

	private String clientToken;

	private String iSP;

	private String description;

	private List<NetLinks> netLinks;

	private Boolean dryRun;

	private String name;
	public CreateWirelessCloudConnectorRequest() {
		super("CC5G", "2022-03-14", "CreateWirelessCloudConnector", "fivegcc");
		setMethod(MethodType.POST);
	}

	public String getUseCase() {
		return this.useCase;
	}

	public void setUseCase(String useCase) {
		this.useCase = useCase;
		if(useCase != null){
			putQueryParameter("UseCase", useCase);
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

	public String getISP() {
		return this.iSP;
	}

	public void setISP(String iSP) {
		this.iSP = iSP;
		if(iSP != null){
			putQueryParameter("ISP", iSP);
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

	public List<NetLinks> getNetLinks() {
		return this.netLinks;
	}

	public void setNetLinks(List<NetLinks> netLinks) {
		this.netLinks = netLinks;	
		if (netLinks != null) {
			for (int depth1 = 0; depth1 < netLinks.size(); depth1++) {
				if (netLinks.get(depth1) != null) {
					
						putQueryParameter("NetLinks." + (depth1 + 1) + ".RegionId" , netLinks.get(depth1).getRegionId());
						putQueryParameter("NetLinks." + (depth1 + 1) + ".VpcId" , netLinks.get(depth1).getVpcId());
						if (netLinks.get(depth1).getVSwitchs() != null) {
							for (int depth2 = 0; depth2 < netLinks.get(depth1).getVSwitchs().size(); depth2++) {
								putQueryParameter("NetLinks." + (depth1 + 1) + ".VSwitchs." + (depth2 + 1) , netLinks.get(depth1).getVSwitchs().get(depth2));
							}
						}
						putQueryParameter("NetLinks." + (depth1 + 1) + ".APN" , netLinks.get(depth1).getAPN());
				}
			}
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public static class NetLinks {

		private String regionId;

		private String vpcId;

		private List<String> vSwitchs;

		private String aPN;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public List<String> getVSwitchs() {
			return this.vSwitchs;
		}

		public void setVSwitchs(List<String> vSwitchs) {
			this.vSwitchs = vSwitchs;
		}

		public String getAPN() {
			return this.aPN;
		}

		public void setAPN(String aPN) {
			this.aPN = aPN;
		}
	}

	@Override
	public Class<CreateWirelessCloudConnectorResponse> getResponseClass() {
		return CreateWirelessCloudConnectorResponse.class;
	}

}
