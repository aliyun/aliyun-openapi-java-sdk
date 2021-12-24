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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sgw.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SwitchCSGClientsReverseSyncConfigurationRequest extends RpcAcsRequest<SwitchCSGClientsReverseSyncConfigurationResponse> {
	   

	private Integer reverseSyncInternalSecond;

	private List<String> clientIds;

	private String clientRegionId;

	private Boolean isReverseSync;

	private String securityToken;
	public SwitchCSGClientsReverseSyncConfigurationRequest() {
		super("sgw", "2018-05-11", "SwitchCSGClientsReverseSyncConfiguration", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getReverseSyncInternalSecond() {
		return this.reverseSyncInternalSecond;
	}

	public void setReverseSyncInternalSecond(Integer reverseSyncInternalSecond) {
		this.reverseSyncInternalSecond = reverseSyncInternalSecond;
		if(reverseSyncInternalSecond != null){
			putQueryParameter("ReverseSyncInternalSecond", reverseSyncInternalSecond.toString());
		}
	}

	public List<String> getClientIds() {
		return this.clientIds;
	}

	public void setClientIds(List<String> clientIds) {
		this.clientIds = clientIds;	
		if (clientIds != null) {
			String clientIdsArrVal = "";
			for(int depth1 = 0; depth1 < clientIds.size(); depth1++) {
				clientIdsArrVal += clientIds.get(depth1) + ",";
			}
			if (clientIdsArrVal.length() > 0) {
				clientIdsArrVal = clientIdsArrVal.substring(0, clientIdsArrVal.length() - 1);
			}
			putQueryParameter("ClientIds" , clientIdsArrVal);
		}	
	}

	public String getClientRegionId() {
		return this.clientRegionId;
	}

	public void setClientRegionId(String clientRegionId) {
		this.clientRegionId = clientRegionId;
		if(clientRegionId != null){
			putQueryParameter("ClientRegionId", clientRegionId);
		}
	}

	public Boolean getIsReverseSync() {
		return this.isReverseSync;
	}

	public void setIsReverseSync(Boolean isReverseSync) {
		this.isReverseSync = isReverseSync;
		if(isReverseSync != null){
			putQueryParameter("IsReverseSync", isReverseSync.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	@Override
	public Class<SwitchCSGClientsReverseSyncConfigurationResponse> getResponseClass() {
		return SwitchCSGClientsReverseSyncConfigurationResponse.class;
	}

}
