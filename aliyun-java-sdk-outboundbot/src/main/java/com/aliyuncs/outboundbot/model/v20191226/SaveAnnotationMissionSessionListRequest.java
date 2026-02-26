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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveAnnotationMissionSessionListRequest extends RpcAcsRequest<SaveAnnotationMissionSessionListResponse> {
	   

	private String agentId;

	private String userNick;

	private String agentKey;

	private Long annotationMissionDataSourceType;

	private Long environment;

	private List<AnnotationMissionSessionList> annotationMissionSessionLists;

	private String annotationMissionSessionListJsonString;
	public SaveAnnotationMissionSessionListRequest() {
		super("OutboundBot", "2019-12-26", "SaveAnnotationMissionSessionList", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putQueryParameter("AgentId", agentId);
		}
	}

	public String getUserNick() {
		return this.userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
		if(userNick != null){
			putQueryParameter("UserNick", userNick);
		}
	}

	public String getAgentKey() {
		return this.agentKey;
	}

	public void setAgentKey(String agentKey) {
		this.agentKey = agentKey;
		if(agentKey != null){
			putQueryParameter("AgentKey", agentKey);
		}
	}

	public Long getAnnotationMissionDataSourceType() {
		return this.annotationMissionDataSourceType;
	}

	public void setAnnotationMissionDataSourceType(Long annotationMissionDataSourceType) {
		this.annotationMissionDataSourceType = annotationMissionDataSourceType;
		if(annotationMissionDataSourceType != null){
			putQueryParameter("AnnotationMissionDataSourceType", annotationMissionDataSourceType.toString());
		}
	}

	public Long getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(Long environment) {
		this.environment = environment;
		if(environment != null){
			putQueryParameter("Environment", environment.toString());
		}
	}

	public List<AnnotationMissionSessionList> getAnnotationMissionSessionLists() {
		return this.annotationMissionSessionLists;
	}

	public void setAnnotationMissionSessionLists(List<AnnotationMissionSessionList> annotationMissionSessionLists) {
		this.annotationMissionSessionLists = annotationMissionSessionLists;	
		if (annotationMissionSessionLists != null) {
			for (int depth1 = 0; depth1 < annotationMissionSessionLists.size(); depth1++) {
				putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionId());
				putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".JobId" , annotationMissionSessionLists.get(depth1).getJobId());
				putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".CreateTime" , annotationMissionSessionLists.get(depth1).getCreateTime());
				putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".ScriptId" , annotationMissionSessionLists.get(depth1).getScriptId());
				putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".ModifiedTime" , annotationMissionSessionLists.get(depth1).getModifiedTime());
				putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".InstanceId" , annotationMissionSessionLists.get(depth1).getInstanceId());
				putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionSessionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionSessionId());
				if (annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists() != null) {
					for (int depth2 = 0; depth2 < annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().size(); depth2++) {
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".CreateTime" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getCreateTime());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".TagAnnotationStatus" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getTagAnnotationStatus());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AsrAnnotationStatus" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAsrAnnotationStatus());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationAsrResult" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationAsrResult());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionSessionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionSessionId());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".SubStatus" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getSubStatus());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatId());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationStatus" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationStatus());
						if (annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists() != null) {
							for (int depth3 = 0; depth3 < annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().size(); depth3++) {
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".CreateTime" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getCreateTime());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".AnnotationMissionSessionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getAnnotationMissionSessionId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".VocabularyId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getVocabularyId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".AnnotationMissionChatId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getAnnotationMissionChatId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".Delete" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getDelete());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".AnnotationMissionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getAnnotationMissionId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".ModifiedTime" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getModifiedTime());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".InstanceId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getInstanceId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".Vocabulary" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getVocabulary());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".VocabularyName" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getVocabularyName());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".Create" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getCreate());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".VocabularyWeight" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getVocabularyWeight());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".AnnotationMissionChatVocabularyInfoId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getAnnotationMissionChatVocabularyInfoId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatVocabularyInfoList." + (depth3 + 1) + ".VocabularyDescription" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatVocabularyInfoLists().get(depth3).getVocabularyDescription());
							}
						}
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".SequenceId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getSequenceId());
						if (annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists() != null) {
							for (int depth3 = 0; depth3 < annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().size(); depth3++) {
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".CreateTime" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getCreateTime());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".AnnotationMissionSessionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getAnnotationMissionSessionId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".AnnotationMissionChatId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getAnnotationMissionChatId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".IntentId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getIntentId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".DialogId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getDialogId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".Delete" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getDelete());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".Content" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getContent());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".AnnotationMissionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getAnnotationMissionId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".ModifiedTime" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getModifiedTime());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".InstanceId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getInstanceId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".AnnotationMissionChatIntentUserSayInfoId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getAnnotationMissionChatIntentUserSayInfoId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".Create" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getCreate());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatIntentUserSayInfoList." + (depth3 + 1) + ".BotId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatIntentUserSayInfoLists().get(depth3).getBotId());
							}
						}
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionId());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".ModifiedTime" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getModifiedTime());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".InstanceId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getInstanceId());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".IntentAnnotationStatus" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getIntentAnnotationStatus());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".OccurTime" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getOccurTime());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".Answer" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnswer());
						if (annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists() != null) {
							for (int depth3 = 0; depth3 < annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().size(); depth3++) {
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".CreateTime" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getCreateTime());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".AnnotationMissionSessionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getAnnotationMissionSessionId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".AnnotationMissionChatId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getAnnotationMissionChatId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".CustomizationDataId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getCustomizationDataId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".Delete" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getDelete());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".Content" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getContent());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".AnnotationMissionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getAnnotationMissionId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".CustomizationDataWeight" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getCustomizationDataWeight());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".ModifiedTime" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getModifiedTime());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".InstanceId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getInstanceId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".Create" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getCreate());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".AnnotationMissionChatCustomizationDataInfoId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getAnnotationMissionChatCustomizationDataInfoId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".CustomizationDataDescription" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getCustomizationDataDescription());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatCustomizationDataInfoList." + (depth3 + 1) + ".CustomizationDataName" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatCustomizationDataInfoLists().get(depth3).getCustomizationDataName());
							}
						}
						if (annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists() != null) {
							for (int depth3 = 0; depth3 < annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().size(); depth3++) {
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatTagInfoList." + (depth3 + 1) + ".AnnotationMissionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().get(depth3).getAnnotationMissionId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatTagInfoList." + (depth3 + 1) + ".AnnotationMissionTagInfoId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().get(depth3).getAnnotationMissionTagInfoId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatTagInfoList." + (depth3 + 1) + ".CreateTime" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().get(depth3).getCreateTime());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatTagInfoList." + (depth3 + 1) + ".AnnotationMissionTagInfoName" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().get(depth3).getAnnotationMissionTagInfoName());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatTagInfoList." + (depth3 + 1) + ".AnnotationMissionChatTagInfoId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().get(depth3).getAnnotationMissionChatTagInfoId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatTagInfoList." + (depth3 + 1) + ".ModifiedTime" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().get(depth3).getModifiedTime());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatTagInfoList." + (depth3 + 1) + ".InstanceId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().get(depth3).getInstanceId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatTagInfoList." + (depth3 + 1) + ".AnnotationMissionSessionId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().get(depth3).getAnnotationMissionSessionId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatTagInfoList." + (depth3 + 1) + ".AnnotationMissionChatId" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().get(depth3).getAnnotationMissionChatId());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatTagInfoList." + (depth3 + 1) + ".Create" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().get(depth3).getCreate());
								putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".AnnotationMissionChatTagInfoList." + (depth3 + 1) + ".Delete" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getAnnotationMissionChatTagInfoLists().get(depth3).getDelete());
							}
						}
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".OriginalAsrResult" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getOriginalAsrResult());
						putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationMissionChatList." + (depth2 + 1) + ".TranslationError" , annotationMissionSessionLists.get(depth1).getAnnotationMissionChatLists().get(depth2).getTranslationError());
					}
				}
				putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".AnnotationStatus" , annotationMissionSessionLists.get(depth1).getAnnotationStatus());
				putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".JobGroupId" , annotationMissionSessionLists.get(depth1).getJobGroupId());
				putQueryParameter("AnnotationMissionSessionList." + (depth1 + 1) + ".SessionId" , annotationMissionSessionLists.get(depth1).getSessionId());
			}
		}	
	}

	public String getAnnotationMissionSessionListJsonString() {
		return this.annotationMissionSessionListJsonString;
	}

	public void setAnnotationMissionSessionListJsonString(String annotationMissionSessionListJsonString) {
		this.annotationMissionSessionListJsonString = annotationMissionSessionListJsonString;
		if(annotationMissionSessionListJsonString != null){
			putQueryParameter("AnnotationMissionSessionListJsonString", annotationMissionSessionListJsonString);
		}
	}

	public static class AnnotationMissionSessionList {

		private String annotationMissionId;

		private String jobId;

		private Long createTime;

		private String scriptId;

		private Long modifiedTime;

		private String instanceId;

		private String annotationMissionSessionId;

		private List<AnnotationMissionChatList> annotationMissionChatLists;

		private Integer annotationStatus;

		private String jobGroupId;

		private String sessionId;

		public String getAnnotationMissionId() {
			return this.annotationMissionId;
		}

		public void setAnnotationMissionId(String annotationMissionId) {
			this.annotationMissionId = annotationMissionId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public Long getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(Long modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAnnotationMissionSessionId() {
			return this.annotationMissionSessionId;
		}

		public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
			this.annotationMissionSessionId = annotationMissionSessionId;
		}

		public List<AnnotationMissionChatList> getAnnotationMissionChatLists() {
			return this.annotationMissionChatLists;
		}

		public void setAnnotationMissionChatLists(List<AnnotationMissionChatList> annotationMissionChatLists) {
			this.annotationMissionChatLists = annotationMissionChatLists;
		}

		public Integer getAnnotationStatus() {
			return this.annotationStatus;
		}

		public void setAnnotationStatus(Integer annotationStatus) {
			this.annotationStatus = annotationStatus;
		}

		public String getJobGroupId() {
			return this.jobGroupId;
		}

		public void setJobGroupId(String jobGroupId) {
			this.jobGroupId = jobGroupId;
		}

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public static class AnnotationMissionChatList {

			private Long createTime;

			private Integer tagAnnotationStatus;

			private Integer asrAnnotationStatus;

			private String annotationAsrResult;

			private String annotationMissionSessionId;

			private Integer subStatus;

			private String annotationMissionChatId;

			private Integer annotationStatus;

			private List<AnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoLists;

			private String sequenceId;

			private List<AnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoLists;

			private String annotationMissionId;

			private Long modifiedTime;

			private String instanceId;

			private Integer intentAnnotationStatus;

			private Long occurTime;

			private String answer;

			private List<AnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoLists;

			private List<AnnotationMissionChatTagInfoList> annotationMissionChatTagInfoLists;

			private String originalAsrResult;

			private Integer translationError;

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Integer getTagAnnotationStatus() {
				return this.tagAnnotationStatus;
			}

			public void setTagAnnotationStatus(Integer tagAnnotationStatus) {
				this.tagAnnotationStatus = tagAnnotationStatus;
			}

			public Integer getAsrAnnotationStatus() {
				return this.asrAnnotationStatus;
			}

			public void setAsrAnnotationStatus(Integer asrAnnotationStatus) {
				this.asrAnnotationStatus = asrAnnotationStatus;
			}

			public String getAnnotationAsrResult() {
				return this.annotationAsrResult;
			}

			public void setAnnotationAsrResult(String annotationAsrResult) {
				this.annotationAsrResult = annotationAsrResult;
			}

			public String getAnnotationMissionSessionId() {
				return this.annotationMissionSessionId;
			}

			public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
				this.annotationMissionSessionId = annotationMissionSessionId;
			}

			public Integer getSubStatus() {
				return this.subStatus;
			}

			public void setSubStatus(Integer subStatus) {
				this.subStatus = subStatus;
			}

			public String getAnnotationMissionChatId() {
				return this.annotationMissionChatId;
			}

			public void setAnnotationMissionChatId(String annotationMissionChatId) {
				this.annotationMissionChatId = annotationMissionChatId;
			}

			public Integer getAnnotationStatus() {
				return this.annotationStatus;
			}

			public void setAnnotationStatus(Integer annotationStatus) {
				this.annotationStatus = annotationStatus;
			}

			public List<AnnotationMissionChatVocabularyInfoList> getAnnotationMissionChatVocabularyInfoLists() {
				return this.annotationMissionChatVocabularyInfoLists;
			}

			public void setAnnotationMissionChatVocabularyInfoLists(List<AnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoLists) {
				this.annotationMissionChatVocabularyInfoLists = annotationMissionChatVocabularyInfoLists;
			}

			public String getSequenceId() {
				return this.sequenceId;
			}

			public void setSequenceId(String sequenceId) {
				this.sequenceId = sequenceId;
			}

			public List<AnnotationMissionChatIntentUserSayInfoList> getAnnotationMissionChatIntentUserSayInfoLists() {
				return this.annotationMissionChatIntentUserSayInfoLists;
			}

			public void setAnnotationMissionChatIntentUserSayInfoLists(List<AnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoLists) {
				this.annotationMissionChatIntentUserSayInfoLists = annotationMissionChatIntentUserSayInfoLists;
			}

			public String getAnnotationMissionId() {
				return this.annotationMissionId;
			}

			public void setAnnotationMissionId(String annotationMissionId) {
				this.annotationMissionId = annotationMissionId;
			}

			public Long getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(Long modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Integer getIntentAnnotationStatus() {
				return this.intentAnnotationStatus;
			}

			public void setIntentAnnotationStatus(Integer intentAnnotationStatus) {
				this.intentAnnotationStatus = intentAnnotationStatus;
			}

			public Long getOccurTime() {
				return this.occurTime;
			}

			public void setOccurTime(Long occurTime) {
				this.occurTime = occurTime;
			}

			public String getAnswer() {
				return this.answer;
			}

			public void setAnswer(String answer) {
				this.answer = answer;
			}

			public List<AnnotationMissionChatCustomizationDataInfoList> getAnnotationMissionChatCustomizationDataInfoLists() {
				return this.annotationMissionChatCustomizationDataInfoLists;
			}

			public void setAnnotationMissionChatCustomizationDataInfoLists(List<AnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoLists) {
				this.annotationMissionChatCustomizationDataInfoLists = annotationMissionChatCustomizationDataInfoLists;
			}

			public List<AnnotationMissionChatTagInfoList> getAnnotationMissionChatTagInfoLists() {
				return this.annotationMissionChatTagInfoLists;
			}

			public void setAnnotationMissionChatTagInfoLists(List<AnnotationMissionChatTagInfoList> annotationMissionChatTagInfoLists) {
				this.annotationMissionChatTagInfoLists = annotationMissionChatTagInfoLists;
			}

			public String getOriginalAsrResult() {
				return this.originalAsrResult;
			}

			public void setOriginalAsrResult(String originalAsrResult) {
				this.originalAsrResult = originalAsrResult;
			}

			public Integer getTranslationError() {
				return this.translationError;
			}

			public void setTranslationError(Integer translationError) {
				this.translationError = translationError;
			}

			public static class AnnotationMissionChatVocabularyInfoList {

				private Long createTime;

				private String annotationMissionSessionId;

				private String vocabularyId;

				private String annotationMissionChatId;

				private Boolean delete;

				private String annotationMissionId;

				private Long modifiedTime;

				private String instanceId;

				private String vocabulary;

				private String vocabularyName;

				private Boolean create;

				private Integer vocabularyWeight;

				private String annotationMissionChatVocabularyInfoId;

				private String vocabularyDescription;

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public String getAnnotationMissionSessionId() {
					return this.annotationMissionSessionId;
				}

				public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
					this.annotationMissionSessionId = annotationMissionSessionId;
				}

				public String getVocabularyId() {
					return this.vocabularyId;
				}

				public void setVocabularyId(String vocabularyId) {
					this.vocabularyId = vocabularyId;
				}

				public String getAnnotationMissionChatId() {
					return this.annotationMissionChatId;
				}

				public void setAnnotationMissionChatId(String annotationMissionChatId) {
					this.annotationMissionChatId = annotationMissionChatId;
				}

				public Boolean getDelete() {
					return this.delete;
				}

				public void setDelete(Boolean delete) {
					this.delete = delete;
				}

				public String getAnnotationMissionId() {
					return this.annotationMissionId;
				}

				public void setAnnotationMissionId(String annotationMissionId) {
					this.annotationMissionId = annotationMissionId;
				}

				public Long getModifiedTime() {
					return this.modifiedTime;
				}

				public void setModifiedTime(Long modifiedTime) {
					this.modifiedTime = modifiedTime;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getVocabulary() {
					return this.vocabulary;
				}

				public void setVocabulary(String vocabulary) {
					this.vocabulary = vocabulary;
				}

				public String getVocabularyName() {
					return this.vocabularyName;
				}

				public void setVocabularyName(String vocabularyName) {
					this.vocabularyName = vocabularyName;
				}

				public Boolean getCreate() {
					return this.create;
				}

				public void setCreate(Boolean create) {
					this.create = create;
				}

				public Integer getVocabularyWeight() {
					return this.vocabularyWeight;
				}

				public void setVocabularyWeight(Integer vocabularyWeight) {
					this.vocabularyWeight = vocabularyWeight;
				}

				public String getAnnotationMissionChatVocabularyInfoId() {
					return this.annotationMissionChatVocabularyInfoId;
				}

				public void setAnnotationMissionChatVocabularyInfoId(String annotationMissionChatVocabularyInfoId) {
					this.annotationMissionChatVocabularyInfoId = annotationMissionChatVocabularyInfoId;
				}

				public String getVocabularyDescription() {
					return this.vocabularyDescription;
				}

				public void setVocabularyDescription(String vocabularyDescription) {
					this.vocabularyDescription = vocabularyDescription;
				}
			}

			public static class AnnotationMissionChatIntentUserSayInfoList {

				private Long createTime;

				private String annotationMissionSessionId;

				private String annotationMissionChatId;

				private Long intentId;

				private Long dialogId;

				private Boolean delete;

				private String content;

				private String annotationMissionId;

				private Long modifiedTime;

				private String instanceId;

				private String annotationMissionChatIntentUserSayInfoId;

				private Boolean create;

				private String botId;

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public String getAnnotationMissionSessionId() {
					return this.annotationMissionSessionId;
				}

				public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
					this.annotationMissionSessionId = annotationMissionSessionId;
				}

				public String getAnnotationMissionChatId() {
					return this.annotationMissionChatId;
				}

				public void setAnnotationMissionChatId(String annotationMissionChatId) {
					this.annotationMissionChatId = annotationMissionChatId;
				}

				public Long getIntentId() {
					return this.intentId;
				}

				public void setIntentId(Long intentId) {
					this.intentId = intentId;
				}

				public Long getDialogId() {
					return this.dialogId;
				}

				public void setDialogId(Long dialogId) {
					this.dialogId = dialogId;
				}

				public Boolean getDelete() {
					return this.delete;
				}

				public void setDelete(Boolean delete) {
					this.delete = delete;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public String getAnnotationMissionId() {
					return this.annotationMissionId;
				}

				public void setAnnotationMissionId(String annotationMissionId) {
					this.annotationMissionId = annotationMissionId;
				}

				public Long getModifiedTime() {
					return this.modifiedTime;
				}

				public void setModifiedTime(Long modifiedTime) {
					this.modifiedTime = modifiedTime;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getAnnotationMissionChatIntentUserSayInfoId() {
					return this.annotationMissionChatIntentUserSayInfoId;
				}

				public void setAnnotationMissionChatIntentUserSayInfoId(String annotationMissionChatIntentUserSayInfoId) {
					this.annotationMissionChatIntentUserSayInfoId = annotationMissionChatIntentUserSayInfoId;
				}

				public Boolean getCreate() {
					return this.create;
				}

				public void setCreate(Boolean create) {
					this.create = create;
				}

				public String getBotId() {
					return this.botId;
				}

				public void setBotId(String botId) {
					this.botId = botId;
				}
			}

			public static class AnnotationMissionChatCustomizationDataInfoList {

				private Long createTime;

				private String annotationMissionSessionId;

				private String annotationMissionChatId;

				private String customizationDataId;

				private Boolean delete;

				private String content;

				private String annotationMissionId;

				private Integer customizationDataWeight;

				private Long modifiedTime;

				private String instanceId;

				private Boolean create;

				private String annotationMissionChatCustomizationDataInfoId;

				private String customizationDataDescription;

				private String customizationDataName;

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public String getAnnotationMissionSessionId() {
					return this.annotationMissionSessionId;
				}

				public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
					this.annotationMissionSessionId = annotationMissionSessionId;
				}

				public String getAnnotationMissionChatId() {
					return this.annotationMissionChatId;
				}

				public void setAnnotationMissionChatId(String annotationMissionChatId) {
					this.annotationMissionChatId = annotationMissionChatId;
				}

				public String getCustomizationDataId() {
					return this.customizationDataId;
				}

				public void setCustomizationDataId(String customizationDataId) {
					this.customizationDataId = customizationDataId;
				}

				public Boolean getDelete() {
					return this.delete;
				}

				public void setDelete(Boolean delete) {
					this.delete = delete;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public String getAnnotationMissionId() {
					return this.annotationMissionId;
				}

				public void setAnnotationMissionId(String annotationMissionId) {
					this.annotationMissionId = annotationMissionId;
				}

				public Integer getCustomizationDataWeight() {
					return this.customizationDataWeight;
				}

				public void setCustomizationDataWeight(Integer customizationDataWeight) {
					this.customizationDataWeight = customizationDataWeight;
				}

				public Long getModifiedTime() {
					return this.modifiedTime;
				}

				public void setModifiedTime(Long modifiedTime) {
					this.modifiedTime = modifiedTime;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public Boolean getCreate() {
					return this.create;
				}

				public void setCreate(Boolean create) {
					this.create = create;
				}

				public String getAnnotationMissionChatCustomizationDataInfoId() {
					return this.annotationMissionChatCustomizationDataInfoId;
				}

				public void setAnnotationMissionChatCustomizationDataInfoId(String annotationMissionChatCustomizationDataInfoId) {
					this.annotationMissionChatCustomizationDataInfoId = annotationMissionChatCustomizationDataInfoId;
				}

				public String getCustomizationDataDescription() {
					return this.customizationDataDescription;
				}

				public void setCustomizationDataDescription(String customizationDataDescription) {
					this.customizationDataDescription = customizationDataDescription;
				}

				public String getCustomizationDataName() {
					return this.customizationDataName;
				}

				public void setCustomizationDataName(String customizationDataName) {
					this.customizationDataName = customizationDataName;
				}
			}

			public static class AnnotationMissionChatTagInfoList {

				private String annotationMissionId;

				private String annotationMissionTagInfoId;

				private Long createTime;

				private String annotationMissionTagInfoName;

				private String annotationMissionChatTagInfoId;

				private Long modifiedTime;

				private String instanceId;

				private String annotationMissionSessionId;

				private String annotationMissionChatId;

				private Boolean create;

				private Boolean delete;

				public String getAnnotationMissionId() {
					return this.annotationMissionId;
				}

				public void setAnnotationMissionId(String annotationMissionId) {
					this.annotationMissionId = annotationMissionId;
				}

				public String getAnnotationMissionTagInfoId() {
					return this.annotationMissionTagInfoId;
				}

				public void setAnnotationMissionTagInfoId(String annotationMissionTagInfoId) {
					this.annotationMissionTagInfoId = annotationMissionTagInfoId;
				}

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public String getAnnotationMissionTagInfoName() {
					return this.annotationMissionTagInfoName;
				}

				public void setAnnotationMissionTagInfoName(String annotationMissionTagInfoName) {
					this.annotationMissionTagInfoName = annotationMissionTagInfoName;
				}

				public String getAnnotationMissionChatTagInfoId() {
					return this.annotationMissionChatTagInfoId;
				}

				public void setAnnotationMissionChatTagInfoId(String annotationMissionChatTagInfoId) {
					this.annotationMissionChatTagInfoId = annotationMissionChatTagInfoId;
				}

				public Long getModifiedTime() {
					return this.modifiedTime;
				}

				public void setModifiedTime(Long modifiedTime) {
					this.modifiedTime = modifiedTime;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getAnnotationMissionSessionId() {
					return this.annotationMissionSessionId;
				}

				public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
					this.annotationMissionSessionId = annotationMissionSessionId;
				}

				public String getAnnotationMissionChatId() {
					return this.annotationMissionChatId;
				}

				public void setAnnotationMissionChatId(String annotationMissionChatId) {
					this.annotationMissionChatId = annotationMissionChatId;
				}

				public Boolean getCreate() {
					return this.create;
				}

				public void setCreate(Boolean create) {
					this.create = create;
				}

				public Boolean getDelete() {
					return this.delete;
				}

				public void setDelete(Boolean delete) {
					this.delete = delete;
				}
			}
		}
	}

	@Override
	public Class<SaveAnnotationMissionSessionListResponse> getResponseClass() {
		return SaveAnnotationMissionSessionListResponse.class;
	}

}
