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
public class RemoveEntityMemberRequest extends RpcAcsRequest<RemoveEntityMemberResponse> {
	
	public RemoveEntityMemberRequest() {
		super("Chatbot", "2017-10-11", "RemoveEntityMember", "beebot");
	}

	private String removeType;

	private Member member;

	private Long entityId;

	public String getRemoveType() {
		return this.removeType;
	}

	public void setRemoveType(String removeType) {
		this.removeType = removeType;
		if(removeType != null){
			putQueryParameter("RemoveType", removeType);
		}
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
		String memberStr = JSON.toJSONString(member);
		if(member != null){
			putBodyParameter("Member", memberStr);
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
	public Class<RemoveEntityMemberResponse> getResponseClass() {
		return RemoveEntityMemberResponse.class;
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
