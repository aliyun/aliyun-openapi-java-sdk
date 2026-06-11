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
public class UpdateSkillDraftRequest extends RpcAcsRequest<UpdateSkillDraftResponse> {
	   

	private String namespaceId;

	private String skillCard;

	private String skillName;

	private String commitMsg;
	public UpdateSkillDraftRequest() {
		super("AIRegistry", "2026-03-17", "UpdateSkillDraft");
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

	public String getSkillCard() {
		return this.skillCard;
	}

	public void setSkillCard(String skillCard) {
		this.skillCard = skillCard;
		if(skillCard != null){
			putQueryParameter("SkillCard", skillCard);
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

	public String getCommitMsg() {
		return this.commitMsg;
	}

	public void setCommitMsg(String commitMsg) {
		this.commitMsg = commitMsg;
		if(commitMsg != null){
			putQueryParameter("CommitMsg", commitMsg);
		}
	}

	@Override
	public Class<UpdateSkillDraftResponse> getResponseClass() {
		return UpdateSkillDraftResponse.class;
	}

}
