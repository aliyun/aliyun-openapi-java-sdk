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

import java.util.ArrayList;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class UpdateIntentRequest extends RpcAcsRequest<UpdateIntentResponse> {
	
	public UpdateIntentRequest() {
		super("Chatbot", "2017-10-11", "UpdateIntent", "beebot");
	}

	private IntentDefinition intentDefinition;

	private Long intentId;

	public void setIntentDefinition(IntentDefinition intentDefinition) {
		this.intentDefinition = intentDefinition;
		String intentDefinitionStr = JSON.toJSONString(intentDefinition);
		if(intentDefinition != null){
			putBodyParameter("IntentDefinition", intentDefinitionStr);
		}
	}

	public IntentDefinition getIntentDefinition() {
		return intentDefinition;
	}

	public Long getIntentId() {
		return this.intentId;
	}

	public void setIntentId(Long intentId) {
		this.intentId = intentId;
		if(intentId != null){
			putQueryParameter("IntentId", intentId.toString());
		}
	}

	@Override
	public Class<UpdateIntentResponse> getResponseClass() {
		return UpdateIntentResponse.class;
	}

	public static class IntentDefinition {
		private Long dialogId;

		private String name;

		private Long id;

		private String botName;

		private List<UsersayMtopDTO> userSay;

		private List<RuleMtopDTO> ruleCheck;

		private List<SlotrecordMtopDTO> slot;

		public void setDialogId(Long dialogId) {
			this.dialogId = dialogId;
		}

		public void setBotName(String botName) {
			this.botName = botName;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setRuleCheck(List<RuleMtopDTO> ruleCheck) {
			this.ruleCheck = ruleCheck;
		}

		public void setSlot(List<SlotrecordMtopDTO> slot) {
			this.slot = slot;
		}

		public void setUserSay(List<UsersayMtopDTO> userSay) {
			this.userSay = userSay;
		}

		public List<RuleMtopDTO> getRuleCheck() {
			return ruleCheck;
		}

		public List<SlotrecordMtopDTO> getSlot() {
			return slot;
		}

		public List<UsersayMtopDTO> getUserSay() {
			return userSay;
		}

		public Long getDialogId() {
			return dialogId;
		}

		public Long getId() {
			return id;
		}

		public String getBotName() {
			return botName;
		}

		public String getName() {
			return name;
		}

	}

	public static class UsersayMtopDTO{

		private String id;

		private Boolean strict;

		private List<SectionMtopDTO> data;

		public void setId(String id) {
			this.id = id;
		}

		public void setData(List<SectionMtopDTO> data) {
			this.data = data;
		}

		public void setStrict(Boolean strict) {
			this.strict = strict;
		}

		public Boolean getStrict() {
			return strict;
		}

		public List<SectionMtopDTO> getData() {
			return data;
		}

		public String getId() {
			return id;
		}
	}

	public static class SectionMtopDTO {

		public SectionMtopDTO(String slotId,String text){
			this.slotId = slotId;
			this.text = text;
		}

		public SectionMtopDTO(String text){
			this.text = text;
		}

		private String slotId;

		private String text;

		public void setSlotId(String slotId) {
			this.slotId = slotId;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getSlotId() {
			return slotId;
		}

		public String getText() {
			return text;
		}
	}

	public class RuleMtopDTO {

		private Boolean strict;

		private String text;

		private List<String> warning;

		private List<String> error;

		public void setText(String text) {
			this.text = text;
		}

		public void setStrict(Boolean strict) {
			this.strict = strict;
		}

		public void setError(List<String> error) {
			this.error = error;
		}

		public void setWarning(List<String> warning) {
			this.warning = warning;
		}

		public String getText() {
			return text;
		}

		public Boolean getStrict() {
			return strict;
		}

		public List<String> getError() {
			return error;
		}

		public List<String> getWarning() {
			return warning;
		}
	}

	public static class SlotrecordMtopDTO {

		private String id;

		private String name;

		private Boolean isArray;

		private String value;

		private List<TagMtopDTO> tags;

		private List<String> question = new ArrayList<String>();

		private Boolean isNecessary = true;

		private int lifeSpan;

		public void setId(String id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public void setIsArray(Boolean isArray) {
			isArray = isArray;
		}

		public void setLifeSpan(int lifeSpan) {
			this.lifeSpan = lifeSpan;
		}

		public void setIsNecessary(Boolean necessary) {
			isNecessary = necessary;
		}

		public void setQuestion(List<String> question) {
			this.question = question;
		}

		public void setTags(List<TagMtopDTO> tags) {
			this.tags = tags;
		}

		public String getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getValue() {
			return value;
		}

		public Boolean getIsArray() {
			return isArray;
		}

		public Boolean getIsNecessary() {
			return isNecessary;
		}

		public int getLifeSpan() {
			return lifeSpan;
		}

		public List<String> getQuestion() {
			return question;
		}

		public List<TagMtopDTO> getTags() {
			return tags;
		}
	}

	public class TagMtopDTO {

		private String userSayId;

		private String value;

		public void setValue(String value) {
			this.value = value;
		}

		public void setUserSayId(String userSayId) {
			this.userSayId = userSayId;
		}

		public String getValue() {
			return value;
		}

		public String getUserSayId() {
			return userSayId;
		}
	}


}
