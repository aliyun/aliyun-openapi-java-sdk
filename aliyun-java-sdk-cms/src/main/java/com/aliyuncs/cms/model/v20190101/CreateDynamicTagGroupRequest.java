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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDynamicTagGroupRequest extends RpcAcsRequest<CreateDynamicTagGroupResponse> {
	   

	private Boolean enableSubscribeEvent;

	private String matchExpressFilterRelation;

	private Boolean enableInstallAgent;

	private List<MatchExpress> matchExpresss;

	private List<String> contactGroupLists;

	private List<String> templateIdLists;

	private String tagKey;
	public CreateDynamicTagGroupRequest() {
		super("Cms", "2019-01-01", "CreateDynamicTagGroup", "cms");
		setMethod(MethodType.POST);
	}

	public Boolean getEnableSubscribeEvent() {
		return this.enableSubscribeEvent;
	}

	public void setEnableSubscribeEvent(Boolean enableSubscribeEvent) {
		this.enableSubscribeEvent = enableSubscribeEvent;
		if(enableSubscribeEvent != null){
			putQueryParameter("EnableSubscribeEvent", enableSubscribeEvent.toString());
		}
	}

	public String getMatchExpressFilterRelation() {
		return this.matchExpressFilterRelation;
	}

	public void setMatchExpressFilterRelation(String matchExpressFilterRelation) {
		this.matchExpressFilterRelation = matchExpressFilterRelation;
		if(matchExpressFilterRelation != null){
			putQueryParameter("MatchExpressFilterRelation", matchExpressFilterRelation);
		}
	}

	public Boolean getEnableInstallAgent() {
		return this.enableInstallAgent;
	}

	public void setEnableInstallAgent(Boolean enableInstallAgent) {
		this.enableInstallAgent = enableInstallAgent;
		if(enableInstallAgent != null){
			putQueryParameter("EnableInstallAgent", enableInstallAgent.toString());
		}
	}

	public List<MatchExpress> getMatchExpresss() {
		return this.matchExpresss;
	}

	public void setMatchExpresss(List<MatchExpress> matchExpresss) {
		this.matchExpresss = matchExpresss;	
		if (matchExpresss != null) {
			for (int depth1 = 0; depth1 < matchExpresss.size(); depth1++) {
				putQueryParameter("MatchExpress." + (depth1 + 1) + ".TagValue" , matchExpresss.get(depth1).getTagValue());
				putQueryParameter("MatchExpress." + (depth1 + 1) + ".TagValueMatchFunction" , matchExpresss.get(depth1).getTagValueMatchFunction());
			}
		}	
	}

	public List<String> getContactGroupLists() {
		return this.contactGroupLists;
	}

	public void setContactGroupLists(List<String> contactGroupLists) {
		this.contactGroupLists = contactGroupLists;	
		if (contactGroupLists != null) {
			for (int i = 0; i < contactGroupLists.size(); i++) {
				putQueryParameter("ContactGroupList." + (i + 1) , contactGroupLists.get(i));
			}
		}	
	}

	public List<String> getTemplateIdLists() {
		return this.templateIdLists;
	}

	public void setTemplateIdLists(List<String> templateIdLists) {
		this.templateIdLists = templateIdLists;	
		if (templateIdLists != null) {
			for (int i = 0; i < templateIdLists.size(); i++) {
				putQueryParameter("TemplateIdList." + (i + 1) , templateIdLists.get(i));
			}
		}	
	}

	public String getTagKey() {
		return this.tagKey;
	}

	public void setTagKey(String tagKey) {
		this.tagKey = tagKey;
		if(tagKey != null){
			putQueryParameter("TagKey", tagKey);
		}
	}

	public static class MatchExpress {

		private String tagValue;

		private String tagValueMatchFunction;

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getTagValueMatchFunction() {
			return this.tagValueMatchFunction;
		}

		public void setTagValueMatchFunction(String tagValueMatchFunction) {
			this.tagValueMatchFunction = tagValueMatchFunction;
		}
	}

	@Override
	public Class<CreateDynamicTagGroupResponse> getResponseClass() {
		return CreateDynamicTagGroupResponse.class;
	}

}
