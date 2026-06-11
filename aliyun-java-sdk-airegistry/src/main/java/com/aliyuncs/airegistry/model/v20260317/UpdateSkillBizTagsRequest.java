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
public class UpdateSkillBizTagsRequest extends RpcAcsRequest<UpdateSkillBizTagsResponse> {
	   

	private String bizTags;

	private String namespaceId;

	private String skillName;
	public UpdateSkillBizTagsRequest() {
		super("AIRegistry", "2026-03-17", "UpdateSkillBizTags");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getBizTags() {
		return this.bizTags;
	}

	public void setBizTags(String bizTags) {
		this.bizTags = bizTags;
		if(bizTags != null){
			putQueryParameter("BizTags", bizTags);
		}
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
	public Class<UpdateSkillBizTagsResponse> getResponseClass() {
		return UpdateSkillBizTagsResponse.class;
	}

}
