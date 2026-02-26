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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RevokeUserSessionRequest extends RpcAcsRequest<RevokeUserSessionResponse> {
	   

	private String idpId;

	private String externalIds;
	public RevokeUserSessionRequest() {
		super("csas", "2023-01-20", "RevokeUserSession");
		setMethod(MethodType.POST);
	}

	public String getIdpId() {
		return this.idpId;
	}

	public void setIdpId(String idpId) {
		this.idpId = idpId;
		if(idpId != null){
			putQueryParameter("IdpId", idpId);
		}
	}

	public String getExternalIds() {
		return this.externalIds;
	}

	public void setExternalIds(String externalIds) {
		this.externalIds = externalIds;
		if(externalIds != null){
			putQueryParameter("ExternalIds", externalIds);
		}
	}

	@Override
	public Class<RevokeUserSessionResponse> getResponseClass() {
		return RevokeUserSessionResponse.class;
	}

}
