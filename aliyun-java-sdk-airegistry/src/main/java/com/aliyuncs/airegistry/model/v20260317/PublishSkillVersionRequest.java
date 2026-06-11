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
public class PublishSkillVersionRequest extends RpcAcsRequest<PublishSkillVersionResponse> {
	   

	private String namespaceId;

	private Boolean updateLatestLabel;

	private String skillVersion;

	private String skillName;
	public PublishSkillVersionRequest() {
		super("AIRegistry", "2026-03-17", "PublishSkillVersion");
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

	public Boolean getUpdateLatestLabel() {
		return this.updateLatestLabel;
	}

	public void setUpdateLatestLabel(Boolean updateLatestLabel) {
		this.updateLatestLabel = updateLatestLabel;
		if(updateLatestLabel != null){
			putQueryParameter("UpdateLatestLabel", updateLatestLabel.toString());
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
	public Class<PublishSkillVersionResponse> getResponseClass() {
		return PublishSkillVersionResponse.class;
	}

}
