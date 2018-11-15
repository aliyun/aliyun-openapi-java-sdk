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

package com.aliyuncs.chatbot.model.v20171011;

import com.alibaba.fastjson.JSON;
import com.aliyuncs.RpcAcsRequest;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class UpdateEntityRequest extends RpcAcsRequest<UpdateEntityResponse> {
	
	public UpdateEntityRequest() {
		super("Chatbot", "2017-10-11", "UpdateEntity", "beebot");
	}

	private String regex;

	private String entityType;

	private List<Member>  members;

	private String entityName;

	private Long entityId;

	public String getRegex() {
		return this.regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
		if(regex != null){
			putQueryParameter("Regex", regex);
		}
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
		if(entityType != null){
			putQueryParameter("EntityType", entityType);
		}
	}

	public List<Member>  getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
		String membersStr = JSON.toJSONString(members);
		if(members != null){
			putBodyParameter("Members", membersStr);
		}
	}

	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
		if(entityName != null){
			putQueryParameter("EntityName", entityName);
		}
	}

	public Long getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
		if(entityId != null){
			putQueryParameter("EntityId", entityId.toString());
		}
	}

	@Override
	public Class<UpdateEntityResponse> getResponseClass() {
		return UpdateEntityResponse.class;
	}

	public static class Member {

		private List<String> synonyms;

		private String memberName;

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public void setSynonyms(List<String> synonyms) {
			this.synonyms = synonyms;
		}

		public String getMemberName() {
			return memberName;
		}

		public List<String> getSynonyms() {
			return synonyms;
		}
	}
}
