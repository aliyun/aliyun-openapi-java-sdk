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
public class DeletePlaybookRequest extends RpcAcsRequest<DeletePlaybookResponse> {
	   

	private String playbookUuid;

	private String lang;
	public DeletePlaybookRequest() {
		super("sophonsoar", "2022-07-28", "DeletePlaybook");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putBodyParameter("Lang", lang);
		}
	}

	@Override
	public Class<DeletePlaybookResponse> getResponseClass() {
		return DeletePlaybookResponse.class;
	}

}
