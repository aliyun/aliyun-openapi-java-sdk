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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeantcodeAntcodeTenantmembersRequest extends RpcAcsRequest<AddLinkeantcodeAntcodeTenantmembersResponse> {
	   

	private String externUid;

	private String accessLevel;

	private String userId;

	private String requestGitOperate;
	public AddLinkeantcodeAntcodeTenantmembersRequest() {
		super("SOFA", "2019-08-15", "AddLinkeantcodeAntcodeTenantmembers", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExternUid() {
		return this.externUid;
	}

	public void setExternUid(String externUid) {
		this.externUid = externUid;
		if(externUid != null){
			putBodyParameter("ExternUid", externUid);
		}
	}

	public String getAccessLevel() {
		return this.accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
		if(accessLevel != null){
			putBodyParameter("AccessLevel", accessLevel);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	@Override
	public Class<AddLinkeantcodeAntcodeTenantmembersResponse> getResponseClass() {
		return AddLinkeantcodeAntcodeTenantmembersResponse.class;
	}

}
