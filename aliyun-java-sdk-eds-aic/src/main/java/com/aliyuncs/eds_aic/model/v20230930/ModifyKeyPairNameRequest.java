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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyKeyPairNameRequest extends RpcAcsRequest<ModifyKeyPairNameResponse> {
	   

	private String newKeyPairName;

	private String keyPairId;
	public ModifyKeyPairNameRequest() {
		super("eds-aic", "2023-09-30", "ModifyKeyPairName");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getNewKeyPairName() {
		return this.newKeyPairName;
	}

	public void setNewKeyPairName(String newKeyPairName) {
		this.newKeyPairName = newKeyPairName;
		if(newKeyPairName != null){
			putQueryParameter("NewKeyPairName", newKeyPairName);
		}
	}

	public String getKeyPairId() {
		return this.keyPairId;
	}

	public void setKeyPairId(String keyPairId) {
		this.keyPairId = keyPairId;
		if(keyPairId != null){
			putQueryParameter("KeyPairId", keyPairId);
		}
	}

	@Override
	public Class<ModifyKeyPairNameResponse> getResponseClass() {
		return ModifyKeyPairNameResponse.class;
	}

}
