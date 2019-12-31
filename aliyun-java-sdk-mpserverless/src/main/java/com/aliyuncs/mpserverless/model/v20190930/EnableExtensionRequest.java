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

package com.aliyuncs.mpserverless.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class EnableExtensionRequest extends RpcAcsRequest<EnableExtensionResponse> {
	   

	private String extensionId;
	public EnableExtensionRequest() {
		super("MPServerless", "2019-09-30", "EnableExtension", "MPServerless");
		setMethod(MethodType.POST);
	}

	public String getExtensionId() {
		return this.extensionId;
	}

	public void setExtensionId(String extensionId) {
		this.extensionId = extensionId;
		if(extensionId != null){
			putBodyParameter("ExtensionId", extensionId);
		}
	}

	@Override
	public Class<EnableExtensionResponse> getResponseClass() {
		return EnableExtensionResponse.class;
	}

}
