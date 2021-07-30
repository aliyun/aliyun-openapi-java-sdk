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

package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvmsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetTransferCalleePoolConfigRequest extends RpcAcsRequest<SetTransferCalleePoolConfigResponse> {
	   

	private Long resourceOwnerId;

	private String phoneNumber;

	private List<Details> detailss;

	private String calledRouteMode;

	private String qualificationId;

	private String resourceOwnerAccount;

	private Long ownerId;
	public SetTransferCalleePoolConfigRequest() {
		super("Dyvmsapi", "2017-05-25", "SetTransferCalleePoolConfig", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public List<Details> getDetailss() {
		return this.detailss;
	}

	public void setDetailss(List<Details> detailss) {
		this.detailss = detailss;	
		if (detailss != null) {
			for (int depth1 = 0; depth1 < detailss.size(); depth1++) {
				putQueryParameter("Details." + (depth1 + 1) + ".Caller" , detailss.get(depth1).getCaller());
				putQueryParameter("Details." + (depth1 + 1) + ".Called" , detailss.get(depth1).getCalled());
			}
		}	
	}

	public String getCalledRouteMode() {
		return this.calledRouteMode;
	}

	public void setCalledRouteMode(String calledRouteMode) {
		this.calledRouteMode = calledRouteMode;
		if(calledRouteMode != null){
			putQueryParameter("CalledRouteMode", calledRouteMode);
		}
	}

	public String getQualificationId() {
		return this.qualificationId;
	}

	public void setQualificationId(String qualificationId) {
		this.qualificationId = qualificationId;
		if(qualificationId != null){
			putQueryParameter("QualificationId", qualificationId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public static class Details {

		private String caller;

		private String called;

		public String getCaller() {
			return this.caller;
		}

		public void setCaller(String caller) {
			this.caller = caller;
		}

		public String getCalled() {
			return this.called;
		}

		public void setCalled(String called) {
			this.called = called;
		}
	}

	@Override
	public Class<SetTransferCalleePoolConfigResponse> getResponseClass() {
		return SetTransferCalleePoolConfigResponse.class;
	}

}
