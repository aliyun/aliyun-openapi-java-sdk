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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListIntentionsRequest extends RpcAcsRequest<ListIntentionsResponse> {
	   

	private String userNick;

	private Long intentId;

	private Long annotationMissionDataSourceType;

	private Long environment;

	private String scriptId;

	private String instanceId;

	private Integer pageSize;

	private Integer pageIndex;

	private String botId;
	public ListIntentionsRequest() {
		super("OutboundBot", "2019-12-26", "ListIntentions", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getIntentId() {
		return this.intentId;
	}

	public void setIntentId(Long intentId) {
		this.intentId = intentId;
		if(intentId != null){
			putQueryParameter("IntentId", intentId.toString());
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

	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
		if(scriptId != null){
			putQueryParameter("ScriptId", scriptId);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getBotId() {
		return this.botId;
	}

	public void setBotId(String botId) {
		this.botId = botId;
		if(botId != null){
			putQueryParameter("BotId", botId);
		}
	}

	@Override
	public Class<ListIntentionsResponse> getResponseClass() {
		return ListIntentionsResponse.class;
	}

}
