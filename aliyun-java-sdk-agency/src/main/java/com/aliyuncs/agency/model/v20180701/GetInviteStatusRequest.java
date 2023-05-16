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

package com.aliyuncs.agency.model.v20180701;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetInviteStatusRequest extends RpcAcsRequest<GetInviteStatusResponse> {
	   

	private List<InviteStatusList> inviteStatusLists;
	public GetInviteStatusRequest() {
		super("Agency", "2018-07-01", "GetInviteStatus", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<InviteStatusList> getInviteStatusLists() {
		return this.inviteStatusLists;
	}

	public void setInviteStatusLists(List<InviteStatusList> inviteStatusLists) {
		this.inviteStatusLists = inviteStatusLists;	
		if (inviteStatusLists != null) {
			for (int depth1 = 0; depth1 < inviteStatusLists.size(); depth1++) {
				putQueryParameter("InviteStatusList." + (depth1 + 1) + ".InviteId" , inviteStatusLists.get(depth1).getInviteId());
			}
		}	
	}

	public static class InviteStatusList {

		private Long inviteId;

		public Long getInviteId() {
			return this.inviteId;
		}

		public void setInviteId(Long inviteId) {
			this.inviteId = inviteId;
		}
	}

	@Override
	public Class<GetInviteStatusResponse> getResponseClass() {
		return GetInviteStatusResponse.class;
	}

}
