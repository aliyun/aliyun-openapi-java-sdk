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

package com.aliyuncs.agency.model.v20180703;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAssociationStatusRequest extends RpcAcsRequest<GetAssociationStatusResponse> {
	   

	private Long aliyunPk;

	private List<GetAssociationStatusList> getAssociationStatusLists;
	public GetAssociationStatusRequest() {
		super("Agency", "2018-07-03", "GetAssociationStatus", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(Long aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putQueryParameter("AliyunPk", aliyunPk.toString());
		}
	}

	public List<GetAssociationStatusList> getGetAssociationStatusLists() {
		return this.getAssociationStatusLists;
	}

	public void setGetAssociationStatusLists(List<GetAssociationStatusList> getAssociationStatusLists) {
		this.getAssociationStatusLists = getAssociationStatusLists;	
		if (getAssociationStatusLists != null) {
			for (int depth1 = 0; depth1 < getAssociationStatusLists.size(); depth1++) {
				putQueryParameter("GetAssociationStatusList." + (depth1 + 1) + ".InviteId" , getAssociationStatusLists.get(depth1).getInviteId());
			}
		}	
	}

	public static class GetAssociationStatusList {

		private Long inviteId;

		public Long getInviteId() {
			return this.inviteId;
		}

		public void setInviteId(Long inviteId) {
			this.inviteId = inviteId;
		}
	}

	@Override
	public Class<GetAssociationStatusResponse> getResponseClass() {
		return GetAssociationStatusResponse.class;
	}

}
