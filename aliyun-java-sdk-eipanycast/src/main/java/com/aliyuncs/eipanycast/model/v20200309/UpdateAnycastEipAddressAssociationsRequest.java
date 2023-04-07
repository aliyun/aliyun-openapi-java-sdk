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
public class UpdateAnycastEipAddressAssociationsRequest extends RpcAcsRequest<UpdateAnycastEipAddressAssociationsResponse> {
	   

	private Boolean dryRun;

	private String associationMode;

	private String clientToken;

	private List<PopLocationDeleteList> popLocationDeleteList;

	private String anycastId;

	private List<PopLocationAddList> popLocationAddList;

	private String bindInstanceId;
	public UpdateAnycastEipAddressAssociationsRequest() {
		super("Eipanycast", "2020-03-09", "UpdateAnycastEipAddressAssociations", "eipanycast");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<PopLocationDeleteList> getPopLocationDeleteList() {
		return this.popLocationDeleteList;
	}

	public void setPopLocationDeleteList(List<PopLocationDeleteList> popLocationDeleteList) {
		this.popLocationDeleteList = popLocationDeleteList;	
		if (popLocationDeleteList != null) {
			for (int depth1 = 0; depth1 < popLocationDeleteList.size(); depth1++) {
				if (popLocationDeleteList.get(depth1) != null) {
					
						putQueryParameter("PopLocationDeleteList." + (depth1 + 1) + ".PopLocation" , popLocationDeleteList.get(depth1).getPopLocation());
				}
			}
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

	public List<PopLocationAddList> getPopLocationAddList() {
		return this.popLocationAddList;
	}

	public void setPopLocationAddList(List<PopLocationAddList> popLocationAddList) {
		this.popLocationAddList = popLocationAddList;	
		if (popLocationAddList != null) {
			for (int depth1 = 0; depth1 < popLocationAddList.size(); depth1++) {
				if (popLocationAddList.get(depth1) != null) {
					
						putQueryParameter("PopLocationAddList." + (depth1 + 1) + ".PopLocation" , popLocationAddList.get(depth1).getPopLocation());
				}
			}
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

	public static class PopLocationDeleteList {

		private String popLocation;

		public String getPopLocation() {
			return this.popLocation;
		}

		public void setPopLocation(String popLocation) {
			this.popLocation = popLocation;
		}
	}

	public static class PopLocationAddList {

		private String popLocation;

		public String getPopLocation() {
			return this.popLocation;
		}

		public void setPopLocation(String popLocation) {
			this.popLocation = popLocation;
		}
	}

	@Override
	public Class<UpdateAnycastEipAddressAssociationsResponse> getResponseClass() {
		return UpdateAnycastEipAddressAssociationsResponse.class;
	}

}
