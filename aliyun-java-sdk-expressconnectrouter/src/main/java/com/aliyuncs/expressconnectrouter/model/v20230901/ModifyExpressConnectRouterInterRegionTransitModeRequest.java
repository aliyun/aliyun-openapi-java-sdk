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

package com.aliyuncs.expressconnectrouter.model.v20230901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.expressconnectrouter.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyExpressConnectRouterInterRegionTransitModeRequest extends RpcAcsRequest<ModifyExpressConnectRouterInterRegionTransitModeResponse> {
	   

	private String clientToken;

	private String ecrId;

	private Boolean dryRun;

	private List<TransitModeList> transitModeLists;
	public ModifyExpressConnectRouterInterRegionTransitModeRequest() {
		super("ExpressConnectRouter", "2023-09-01", "ModifyExpressConnectRouterInterRegionTransitMode", "ecr");
		setProtocol(ProtocolType.HTTPS);
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

	public String getEcrId() {
		return this.ecrId;
	}

	public void setEcrId(String ecrId) {
		this.ecrId = ecrId;
		if(ecrId != null){
			putBodyParameter("EcrId", ecrId);
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

	public List<TransitModeList> getTransitModeLists() {
		return this.transitModeLists;
	}

	public void setTransitModeLists(List<TransitModeList> transitModeLists) {
		this.transitModeLists = transitModeLists;	
		if (transitModeLists != null) {
			for (int depth1 = 0; depth1 < transitModeLists.size(); depth1++) {
				putBodyParameter("TransitModeList." + (depth1 + 1) + ".RegionId" , transitModeLists.get(depth1).getRegionId());
				putBodyParameter("TransitModeList." + (depth1 + 1) + ".Mode" , transitModeLists.get(depth1).getMode());
			}
		}	
	}

	public static class TransitModeList {

		private String regionId;

		private String mode;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}
	}

	@Override
	public Class<ModifyExpressConnectRouterInterRegionTransitModeResponse> getResponseClass() {
		return ModifyExpressConnectRouterInterRegionTransitModeResponse.class;
	}

}
