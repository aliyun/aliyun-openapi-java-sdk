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
public class CopyPlaybookRequest extends RpcAcsRequest<CopyPlaybookResponse> {
	   

	private String sourcePlaybookUuid;

	private Long roleFor;

	private String description;

	private String releaseVersion;

	private String displayName;

	private String roleType;

	private String lang;
	public CopyPlaybookRequest() {
		super("sophonsoar", "2022-07-28", "CopyPlaybook");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getSourcePlaybookUuid() {
		return this.sourcePlaybookUuid;
	}

	public void setSourcePlaybookUuid(String sourcePlaybookUuid) {
		this.sourcePlaybookUuid = sourcePlaybookUuid;
		if(sourcePlaybookUuid != null){
			putBodyParameter("SourcePlaybookUuid", sourcePlaybookUuid);
		}
	}

	public Long getRoleFor() {
		return this.roleFor;
	}

	public void setRoleFor(Long roleFor) {
		this.roleFor = roleFor;
		if(roleFor != null){
			putQueryParameter("RoleFor", roleFor.toString());
		}
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

	public String getReleaseVersion() {
		return this.releaseVersion;
	}

	public void setReleaseVersion(String releaseVersion) {
		this.releaseVersion = releaseVersion;
		if(releaseVersion != null){
			putBodyParameter("ReleaseVersion", releaseVersion);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putBodyParameter("DisplayName", displayName);
		}
	}

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putQueryParameter("RoleType", roleType);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<CopyPlaybookResponse> getResponseClass() {
		return CopyPlaybookResponse.class;
	}

}
