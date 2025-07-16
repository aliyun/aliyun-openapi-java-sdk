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

package com.aliyuncs.lingmou.model.v20250527;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateChatSessionRequest extends RoaAcsRequest<CreateChatSessionResponse> {
	   

	private String license;

	private String instanceId;

	private String id;

	private String platform;
	public CreateChatSessionRequest() {
		super("LingMou", "2025-05-27", "CreateChatSession");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/openapi/chat/init/[id]");
		setMethod(MethodType.POST);
	}

	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
		if(license != null){
			putQueryParameter("license", license);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("instanceId", instanceId);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putPathParameter("id", id);
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("platform", platform);
		}
	}

	@Override
	public Class<CreateChatSessionResponse> getResponseClass() {
		return CreateChatSessionResponse.class;
	}

}
