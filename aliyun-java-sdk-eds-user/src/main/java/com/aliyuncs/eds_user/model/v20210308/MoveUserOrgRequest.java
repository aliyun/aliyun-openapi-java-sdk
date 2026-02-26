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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MoveUserOrgRequest extends RpcAcsRequest<MoveUserOrgResponse> {
	   

	private List<String> endUserIdss;

	private String orgId;
	public MoveUserOrgRequest() {
		super("eds-user", "2021-03-08", "MoveUserOrg", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getEndUserIdss() {
		return this.endUserIdss;
	}

	public void setEndUserIdss(List<String> endUserIdss) {
		this.endUserIdss = endUserIdss;	
		if (endUserIdss != null) {
			for (int i = 0; i < endUserIdss.size(); i++) {
				putBodyParameter("EndUserIds." + (i + 1) , endUserIdss.get(i));
			}
		}	
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putBodyParameter("OrgId", orgId);
		}
	}

	@Override
	public Class<MoveUserOrgResponse> getResponseClass() {
		return MoveUserOrgResponse.class;
	}

}
