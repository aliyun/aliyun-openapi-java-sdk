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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PublishPlaybookRequest extends RpcAcsRequest<PublishPlaybookResponse> {
	   

	private String description;

	private String playbookUuid;
	public PublishPlaybookRequest() {
		super("sophonsoar", "2022-07-28", "PublishPlaybook");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getPlaybookUuid() {
		return this.playbookUuid;
	}

	public void setPlaybookUuid(String playbookUuid) {
		this.playbookUuid = playbookUuid;
		if(playbookUuid != null){
			putBodyParameter("PlaybookUuid", playbookUuid);
		}
	}

	@Override
	public Class<PublishPlaybookResponse> getResponseClass() {
		return PublishPlaybookResponse.class;
	}

}
