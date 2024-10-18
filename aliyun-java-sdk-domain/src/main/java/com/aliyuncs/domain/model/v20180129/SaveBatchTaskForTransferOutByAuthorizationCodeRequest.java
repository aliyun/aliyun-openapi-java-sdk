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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveBatchTaskForTransferOutByAuthorizationCodeRequest extends RpcAcsRequest<SaveBatchTaskForTransferOutByAuthorizationCodeResponse> {
	   

	private String _long;

	private List<TransferOutParamList> transferOutParamLists;

	private String userClientIp;
	public SaveBatchTaskForTransferOutByAuthorizationCodeRequest() {
		super("Domain", "2018-01-29", "SaveBatchTaskForTransferOutByAuthorizationCode", "domain");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String get_Long() {
		return this._long;
	}

	public void set_Long(String _long) {
		this._long = _long;
		if(_long != null){
			putQueryParameter("Long", _long);
		}
	}

	public List<TransferOutParamList> getTransferOutParamLists() {
		return this.transferOutParamLists;
	}

	public void setTransferOutParamLists(List<TransferOutParamList> transferOutParamLists) {
		this.transferOutParamLists = transferOutParamLists;	
		if (transferOutParamLists != null) {
			for (int depth1 = 0; depth1 < transferOutParamLists.size(); depth1++) {
				putQueryParameter("TransferOutParamList." + (depth1 + 1) + ".AuthorizationCode" , transferOutParamLists.get(depth1).getAuthorizationCode());
				putQueryParameter("TransferOutParamList." + (depth1 + 1) + ".DomainName" , transferOutParamLists.get(depth1).getDomainName());
			}
		}	
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public static class TransferOutParamList {

		private String authorizationCode;

		private String domainName;

		public String getAuthorizationCode() {
			return this.authorizationCode;
		}

		public void setAuthorizationCode(String authorizationCode) {
			this.authorizationCode = authorizationCode;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}
	}

	@Override
	public Class<SaveBatchTaskForTransferOutByAuthorizationCodeResponse> getResponseClass() {
		return SaveBatchTaskForTransferOutByAuthorizationCodeResponse.class;
	}

}
