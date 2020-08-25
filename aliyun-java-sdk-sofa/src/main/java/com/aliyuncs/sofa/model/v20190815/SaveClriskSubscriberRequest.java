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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveClriskSubscriberRequest extends RpcAcsRequest<SaveClriskSubscriberResponse> {
	   

	private String emailNoticeAggregateJsonStr;

	private String messageNoticeAggregateJsonStr;

	private List<DdMessageNoticeAggregate> ddMessageNoticeAggregates;

	private List<String> entranceCodesRepeatLists;
	public SaveClriskSubscriberRequest() {
		super("SOFA", "2019-08-15", "SaveClriskSubscriber", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEmailNoticeAggregateJsonStr() {
		return this.emailNoticeAggregateJsonStr;
	}

	public void setEmailNoticeAggregateJsonStr(String emailNoticeAggregateJsonStr) {
		this.emailNoticeAggregateJsonStr = emailNoticeAggregateJsonStr;
		if(emailNoticeAggregateJsonStr != null){
			putBodyParameter("EmailNoticeAggregateJsonStr", emailNoticeAggregateJsonStr);
		}
	}

	public String getMessageNoticeAggregateJsonStr() {
		return this.messageNoticeAggregateJsonStr;
	}

	public void setMessageNoticeAggregateJsonStr(String messageNoticeAggregateJsonStr) {
		this.messageNoticeAggregateJsonStr = messageNoticeAggregateJsonStr;
		if(messageNoticeAggregateJsonStr != null){
			putBodyParameter("MessageNoticeAggregateJsonStr", messageNoticeAggregateJsonStr);
		}
	}

	public List<DdMessageNoticeAggregate> getDdMessageNoticeAggregates() {
		return this.ddMessageNoticeAggregates;
	}

	public void setDdMessageNoticeAggregates(List<DdMessageNoticeAggregate> ddMessageNoticeAggregates) {
		this.ddMessageNoticeAggregates = ddMessageNoticeAggregates;	
		if (ddMessageNoticeAggregates != null) {
			for (int depth1 = 0; depth1 < ddMessageNoticeAggregates.size(); depth1++) {
				putBodyParameter("DdMessageNoticeAggregate." + (depth1 + 1) + ".WebHookAddress" , ddMessageNoticeAggregates.get(depth1).getWebHookAddress());
				putBodyParameter("DdMessageNoticeAggregate." + (depth1 + 1) + ".IsModelSubscribe" , ddMessageNoticeAggregates.get(depth1).getIsModelSubscribe());
				putBodyParameter("DdMessageNoticeAggregate." + (depth1 + 1) + ".IsTaskSubscribe" , ddMessageNoticeAggregates.get(depth1).getIsTaskSubscribe());
				putBodyParameter("DdMessageNoticeAggregate." + (depth1 + 1) + ".Name" , ddMessageNoticeAggregates.get(depth1).getName());
				putBodyParameter("DdMessageNoticeAggregate." + (depth1 + 1) + ".Secret" , ddMessageNoticeAggregates.get(depth1).getSecret());
				putBodyParameter("DdMessageNoticeAggregate." + (depth1 + 1) + ".IsIssueSubscribe" , ddMessageNoticeAggregates.get(depth1).getIsIssueSubscribe());
			}
		}	
	}

	public List<String> getEntranceCodesRepeatLists() {
		return this.entranceCodesRepeatLists;
	}

	public void setEntranceCodesRepeatLists(List<String> entranceCodesRepeatLists) {
		this.entranceCodesRepeatLists = entranceCodesRepeatLists;	
		if (entranceCodesRepeatLists != null) {
			for (int i = 0; i < entranceCodesRepeatLists.size(); i++) {
				putBodyParameter("EntranceCodesRepeatList." + (i + 1) , entranceCodesRepeatLists.get(i));
			}
		}	
	}

	public static class DdMessageNoticeAggregate {

		private String webHookAddress;

		private Boolean isModelSubscribe;

		private Boolean isTaskSubscribe;

		private String name;

		private String secret;

		private Boolean isIssueSubscribe;

		public String getWebHookAddress() {
			return this.webHookAddress;
		}

		public void setWebHookAddress(String webHookAddress) {
			this.webHookAddress = webHookAddress;
		}

		public Boolean getIsModelSubscribe() {
			return this.isModelSubscribe;
		}

		public void setIsModelSubscribe(Boolean isModelSubscribe) {
			this.isModelSubscribe = isModelSubscribe;
		}

		public Boolean getIsTaskSubscribe() {
			return this.isTaskSubscribe;
		}

		public void setIsTaskSubscribe(Boolean isTaskSubscribe) {
			this.isTaskSubscribe = isTaskSubscribe;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSecret() {
			return this.secret;
		}

		public void setSecret(String secret) {
			this.secret = secret;
		}

		public Boolean getIsIssueSubscribe() {
			return this.isIssueSubscribe;
		}

		public void setIsIssueSubscribe(Boolean isIssueSubscribe) {
			this.isIssueSubscribe = isIssueSubscribe;
		}
	}

	@Override
	public Class<SaveClriskSubscriberResponse> getResponseClass() {
		return SaveClriskSubscriberResponse.class;
	}

}
