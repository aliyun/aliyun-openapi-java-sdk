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

package com.aliyuncs.teambition_aliyun.model.v20200226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteMembersForOrgRequest extends RpcAcsRequest<DeleteMembersForOrgResponse> {
	   

	private String realPk;

	private String userId;

	private String orgId;
	public DeleteMembersForOrgRequest() {
		super("teambition-aliyun", "2020-02-26", "DeleteMembersForOrg");
		setMethod(MethodType.POST);
	}

	public String getRealPk() {
		return this.realPk;
	}

	public void setRealPk(String realPk) {
		this.realPk = realPk;
		if(realPk != null){
			putBodyParameter("RealPk", realPk);
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
	public Class<DeleteMembersForOrgResponse> getResponseClass() {
		return DeleteMembersForOrgResponse.class;
	}

}
