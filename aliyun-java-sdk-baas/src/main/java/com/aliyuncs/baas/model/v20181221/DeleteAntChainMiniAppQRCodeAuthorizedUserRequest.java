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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteAntChainMiniAppQRCodeAuthorizedUserRequest extends RpcAcsRequest<DeleteAntChainMiniAppQRCodeAuthorizedUserResponse> {
	   

	private String phone;

	private String antChainId;
	public DeleteAntChainMiniAppQRCodeAuthorizedUserRequest() {
		super("Baas", "2018-12-21", "DeleteAntChainMiniAppQRCodeAuthorizedUser", "baas");
		setMethod(MethodType.PUT);
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putBodyParameter("Phone", phone);
		}
	}

	public String getAntChainId() {
		return this.antChainId;
	}

	public void setAntChainId(String antChainId) {
		this.antChainId = antChainId;
		if(antChainId != null){
			putBodyParameter("AntChainId", antChainId);
		}
	}

	@Override
	public Class<DeleteAntChainMiniAppQRCodeAuthorizedUserResponse> getResponseClass() {
		return DeleteAntChainMiniAppQRCodeAuthorizedUserResponse.class;
	}

}
