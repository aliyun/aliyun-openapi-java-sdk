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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAnnotationMissionRequest extends RpcAcsRequest<CreateAnnotationMissionResponse> {
	   

	private String sessionEndReasonFilterListJsonString;

	private Integer samplingType;

	private List<Integer> sessionEndReasonFilterLists;

	private Integer annotationMissionDataSourceType;

	private String scriptId;

	private String annotationMissionDebugDataSourceListJsonString;

	private Long conversationTimeEndFilter;

	private Long conversationTimeStartFilter;

	private String agentId;

	private Boolean excludeOtherSession;

	private Boolean finished;

	private Integer samplingRate;

	private String agentKey;

	private String annotationMissionName;

	private String chatbotId;

	@SerializedName("annotationMissionDebugDataSourceList")
	private List<Integer> annotationMissionDebugDataSourceList;

	private String instanceId;

	private Integer samplingCount;
	public CreateAnnotationMissionRequest() {
		super("OutboundBot", "2019-12-26", "CreateAnnotationMission", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSessionEndReasonFilterListJsonString() {
		return this.sessionEndReasonFilterListJsonString;
	}

	public void setSessionEndReasonFilterListJsonString(String sessionEndReasonFilterListJsonString) {
		this.sessionEndReasonFilterListJsonString = sessionEndReasonFilterListJsonString;
		if(sessionEndReasonFilterListJsonString != null){
			putQueryParameter("SessionEndReasonFilterListJsonString", sessionEndReasonFilterListJsonString);
		}
	}

	public Integer getSamplingType() {
		return this.samplingType;
	}

	public void setSamplingType(Integer samplingType) {
		this.samplingType = samplingType;
		if(samplingType != null){
			putQueryParameter("SamplingType", samplingType.toString());
		}
	}

	public List<Integer> getSessionEndReasonFilterLists() {
		return this.sessionEndReasonFilterLists;
	}

	public void setSessionEndReasonFilterLists(List<Integer> sessionEndReasonFilterLists) {
		this.sessionEndReasonFilterLists = sessionEndReasonFilterLists;	
		if (sessionEndReasonFilterLists != null) {
			for (int i = 0; i < sessionEndReasonFilterLists.size(); i++) {
				putQueryParameter("SessionEndReasonFilterList." + (i + 1) , sessionEndReasonFilterLists.get(i));
			}
		}	
	}

	public Integer getAnnotationMissionDataSourceType() {
		return this.annotationMissionDataSourceType;
	}

	public void setAnnotationMissionDataSourceType(Integer annotationMissionDataSourceType) {
		this.annotationMissionDataSourceType = annotationMissionDataSourceType;
		if(annotationMissionDataSourceType != null){
			putQueryParameter("AnnotationMissionDataSourceType", annotationMissionDataSourceType.toString());
		}
	}

	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
		if(scriptId != null){
			putQueryParameter("ScriptId", scriptId);
		}
	}

	public String getAnnotationMissionDebugDataSourceListJsonString() {
		return this.annotationMissionDebugDataSourceListJsonString;
	}

	public void setAnnotationMissionDebugDataSourceListJsonString(String annotationMissionDebugDataSourceListJsonString) {
		this.annotationMissionDebugDataSourceListJsonString = annotationMissionDebugDataSourceListJsonString;
		if(annotationMissionDebugDataSourceListJsonString != null){
			putQueryParameter("AnnotationMissionDebugDataSourceListJsonString", annotationMissionDebugDataSourceListJsonString);
		}
	}

	public Long getConversationTimeEndFilter() {
		return this.conversationTimeEndFilter;
	}

	public void setConversationTimeEndFilter(Long conversationTimeEndFilter) {
		this.conversationTimeEndFilter = conversationTimeEndFilter;
		if(conversationTimeEndFilter != null){
			putQueryParameter("ConversationTimeEndFilter", conversationTimeEndFilter.toString());
		}
	}

	public Long getConversationTimeStartFilter() {
		return this.conversationTimeStartFilter;
	}

	public void setConversationTimeStartFilter(Long conversationTimeStartFilter) {
		this.conversationTimeStartFilter = conversationTimeStartFilter;
		if(conversationTimeStartFilter != null){
			putQueryParameter("ConversationTimeStartFilter", conversationTimeStartFilter.toString());
		}
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

	public Boolean getExcludeOtherSession() {
		return this.excludeOtherSession;
	}

	public void setExcludeOtherSession(Boolean excludeOtherSession) {
		this.excludeOtherSession = excludeOtherSession;
		if(excludeOtherSession != null){
			putQueryParameter("ExcludeOtherSession", excludeOtherSession.toString());
		}
	}

	public Boolean getFinished() {
		return this.finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
		if(finished != null){
			putQueryParameter("Finished", finished.toString());
		}
	}

	public Integer getSamplingRate() {
		return this.samplingRate;
	}

	public void setSamplingRate(Integer samplingRate) {
		this.samplingRate = samplingRate;
		if(samplingRate != null){
			putQueryParameter("SamplingRate", samplingRate.toString());
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

	public String getAnnotationMissionName() {
		return this.annotationMissionName;
	}

	public void setAnnotationMissionName(String annotationMissionName) {
		this.annotationMissionName = annotationMissionName;
		if(annotationMissionName != null){
			putQueryParameter("AnnotationMissionName", annotationMissionName);
		}
	}

	public String getChatbotId() {
		return this.chatbotId;
	}

	public void setChatbotId(String chatbotId) {
		this.chatbotId = chatbotId;
		if(chatbotId != null){
			putQueryParameter("ChatbotId", chatbotId);
		}
	}

	public List<Integer> getAnnotationMissionDebugDataSourceList() {
		return this.annotationMissionDebugDataSourceList;
	}

	public void setAnnotationMissionDebugDataSourceList(List<Integer> annotationMissionDebugDataSourceList) {
		this.annotationMissionDebugDataSourceList = annotationMissionDebugDataSourceList;	
		if (annotationMissionDebugDataSourceList != null) {
			putQueryParameter("AnnotationMissionDebugDataSourceList" , new Gson().toJson(annotationMissionDebugDataSourceList));
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getSamplingCount() {
		return this.samplingCount;
	}

	public void setSamplingCount(Integer samplingCount) {
		this.samplingCount = samplingCount;
		if(samplingCount != null){
			putQueryParameter("SamplingCount", samplingCount.toString());
		}
	}

	@Override
	public Class<CreateAnnotationMissionResponse> getResponseClass() {
		return CreateAnnotationMissionResponse.class;
	}

}
