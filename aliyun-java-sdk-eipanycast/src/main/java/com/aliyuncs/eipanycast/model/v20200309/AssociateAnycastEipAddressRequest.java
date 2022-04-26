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

package com.aliyuncs.eipanycast.model.v20200309;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eipanycast.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssociateAnycastEipAddressRequest extends RpcAcsRequest<AssociateAnycastEipAddressResponse> {
	   

	private String clientToken;

	private List<PopLocations> popLocations;

	private Boolean dryRun;

	private String associationMode;

	private String bindInstanceType;

	private String bindInstanceRegionId;

	private String privateIpAddress;

	private String anycastId;

	private String bindInstanceId;
	public AssociateAnycastEipAddressRequest() {
		super("Eipanycast", "2020-03-09", "AssociateAnycastEipAddress");
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
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<PopLocations> getPopLocations() {
		return this.popLocations;
	}

	public void setPopLocations(List<PopLocations> popLocations) {
		this.popLocations = popLocations;	
		if (popLocations != null) {
			for (int depth1 = 0; depth1 < popLocations.size(); depth1++) {
				if (popLocations.get(depth1) != null) {
					
						putQueryParameter("PopLocations." + (depth1 + 1) + ".PopLocation" , popLocations.get(depth1).getPopLocation());
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

	public String getAssociationMode() {
		return this.associationMode;
	}

	public void setAssociationMode(String associationMode) {
		this.associationMode = associationMode;
		if(associationMode != null){
			putQueryParameter("AssociationMode", associationMode);
		}
	}

	public String getBindInstanceType() {
		return this.bindInstanceType;
	}

	public void setBindInstanceType(String bindInstanceType) {
		this.bindInstanceType = bindInstanceType;
		if(bindInstanceType != null){
			putQueryParameter("BindInstanceType", bindInstanceType);
		}
	}

	public String getBindInstanceRegionId() {
		return this.bindInstanceRegionId;
	}

	public void setBindInstanceRegionId(String bindInstanceRegionId) {
		this.bindInstanceRegionId = bindInstanceRegionId;
		if(bindInstanceRegionId != null){
			putQueryParameter("BindInstanceRegionId", bindInstanceRegionId);
		}
	}

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getAnycastId() {
		return this.anycastId;
	}

	public void setAnycastId(String anycastId) {
		this.anycastId = anycastId;
		if(anycastId != null){
			putQueryParameter("AnycastId", anycastId);
		}
	}

	public String getBindInstanceId() {
		return this.bindInstanceId;
	}

	public void setBindInstanceId(String bindInstanceId) {
		this.bindInstanceId = bindInstanceId;
		if(bindInstanceId != null){
			putQueryParameter("BindInstanceId", bindInstanceId);
		}
	}

	public static class PopLocations {

		private String popLocation;

		public String getPopLocation() {
			return this.popLocation;
		}

		public void setPopLocation(String popLocation) {
			this.popLocation = popLocation;
		}
	}

	@Override
	public Class<AssociateAnycastEipAddressResponse> getResponseClass() {
		return AssociateAnycastEipAddressResponse.class;
	}

}
