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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateVpdRequest extends RpcAcsRequest<UpdateVpdResponse> {
	   

	private String clientToken;

	private String vpdName;

	private String vpdId;
	public UpdateVpdRequest() {
		super("eflo", "2022-05-30", "UpdateVpd", "eflo");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getVpdName() {
		return this.vpdName;
	}

	public void setVpdName(String vpdName) {
		this.vpdName = vpdName;
		if(vpdName != null){
			putBodyParameter("VpdName", vpdName);
		}
	}

	public String getVpdId() {
		return this.vpdId;
	}

	public void setVpdId(String vpdId) {
		this.vpdId = vpdId;
		if(vpdId != null){
			putBodyParameter("VpdId", vpdId);
		}
	}

	@Override
	public Class<UpdateVpdResponse> getResponseClass() {
		return UpdateVpdResponse.class;
	}

}
