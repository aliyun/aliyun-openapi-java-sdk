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
public class AppendEntityMemberRequest extends RpcAcsRequest<AppendEntityMemberResponse> {
	
	public AppendEntityMemberRequest() {
		super("Chatbot", "2017-10-11", "AppendEntityMember", "beebot");
	}

	private Member member;

	private Long entityId;

	private String applyType;

	public Member getMember() {
		return this.member;
	}


	public void setMember(Member member) {
		String memberStr = JSON.toJSONString(member);
		this.member = member;
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

	public String getApplyType() {
		return this.applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
		if(applyType != null){
			putQueryParameter("ApplyType", applyType);
		}
	}

	@Override
	public Class<AppendEntityMemberResponse> getResponseClass() {
		return AppendEntityMemberResponse.class;
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
