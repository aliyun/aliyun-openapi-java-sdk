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

package com.aliyuncs.airegistry.model.v20260317;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OfflineSkillRequest extends RpcAcsRequest<OfflineSkillResponse> {
	   

	private String namespaceId;

	private String skillVersion;

	private String scope;

	private String skillName;
	public OfflineSkillRequest() {
		super("AIRegistry", "2026-03-17", "OfflineSkill");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
		}
	}

	public String getSkillVersion() {
		return this.skillVersion;
	}

	public void setSkillVersion(String skillVersion) {
		this.skillVersion = skillVersion;
		if(skillVersion != null){
			putQueryParameter("SkillVersion", skillVersion);
		}
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("Scope", scope);
		}
	}

	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
		if(skillName != null){
			putQueryParameter("SkillName", skillName);
		}
	}

	@Override
	public Class<OfflineSkillResponse> getResponseClass() {
		return OfflineSkillResponse.class;
	}

}
