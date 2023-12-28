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

package com.aliyuncs.avatar.model.v20220130;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ConfirmAvatar2dTrainRequest extends RpcAcsRequest<ConfirmAvatar2dTrainResponse> {
	   

	private String confirm;

	private String code;

	private Long tenantId;
	public ConfirmAvatar2dTrainRequest() {
		super("avatar", "2022-01-30", "ConfirmAvatar2dTrain");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getConfirm() {
		return this.confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
		if(confirm != null){
			putQueryParameter("Confirm", confirm);
		}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putQueryParameter("Code", code);
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId.toString());
		}
	}

	@Override
	public Class<ConfirmAvatar2dTrainResponse> getResponseClass() {
		return ConfirmAvatar2dTrainResponse.class;
	}

}
