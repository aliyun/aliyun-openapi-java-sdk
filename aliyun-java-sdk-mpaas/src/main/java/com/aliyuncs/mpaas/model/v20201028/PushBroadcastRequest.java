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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushBroadcastRequest extends RpcAcsRequest<PushBroadcastResponse> {
	   

	private Long bindEndTime;

	private String taskName;

	private String templateKeyValue;

	@SerializedName("notifyLevel")
	private Map<String,String> notifyLevel;

	private Long bindStartTime;

	private Object transparentMessagePayload;

	private Long unBindEndTime;

	private Long pushAction;

	private Long deliveryType;

	private String notifyType;

	private String extendedParams;

	private String strategyContent;

	@SerializedName("thirdChannelCategory")
	private Map<String,String> thirdChannelCategory;

	private Long unBindStartTime;

	private String classification;

	private Long unBindPeriod;

	private Long expiredSeconds;

	private String msgkey;

	private Integer strategyType;

	private String workspaceId;

	private String transparentMessageUrgency;

	private Integer androidChannel;

	private Integer timeMode;

	private String tenantId;

	private String templateName;

	private String miChannelId;

	private Long silent;

	private Long pushStatus;

	private String appId;

	private Integer bindPeriod;

	private String channelId;
	public PushBroadcastRequest() {
		super("mPaaS", "2020-10-28", "PushBroadcast", "mpaas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBindEndTime() {
		return this.bindEndTime;
	}

	public void setBindEndTime(Long bindEndTime) {
		this.bindEndTime = bindEndTime;
		if(bindEndTime != null){
			putBodyParameter("BindEndTime", bindEndTime.toString());
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putBodyParameter("TaskName", taskName);
		}
	}

	public String getTemplateKeyValue() {
		return this.templateKeyValue;
	}

	public void setTemplateKeyValue(String templateKeyValue) {
		this.templateKeyValue = templateKeyValue;
		if(templateKeyValue != null){
			putBodyParameter("TemplateKeyValue", templateKeyValue);
		}
	}

	public Map<String,String> getNotifyLevel() {
		return this.notifyLevel;
	}

	public void setNotifyLevel(Map<String,String> notifyLevel) {
		this.notifyLevel = notifyLevel;	
		if (notifyLevel != null) {
			putBodyParameter("NotifyLevel" , new Gson().toJson(notifyLevel));
		}	
	}

	public Long getBindStartTime() {
		return this.bindStartTime;
	}

	public void setBindStartTime(Long bindStartTime) {
		this.bindStartTime = bindStartTime;
		if(bindStartTime != null){
			putBodyParameter("BindStartTime", bindStartTime.toString());
		}
	}

	public Object getTransparentMessagePayload() {
		return this.transparentMessagePayload;
	}

	public void setTransparentMessagePayload(Object transparentMessagePayload) {
		this.transparentMessagePayload = transparentMessagePayload;
		if(transparentMessagePayload != null){
			putBodyParameter("TransparentMessagePayload", transparentMessagePayload.toString());
		}
	}

	public Long getUnBindEndTime() {
		return this.unBindEndTime;
	}

	public void setUnBindEndTime(Long unBindEndTime) {
		this.unBindEndTime = unBindEndTime;
		if(unBindEndTime != null){
			putBodyParameter("UnBindEndTime", unBindEndTime.toString());
		}
	}

	public Long getPushAction() {
		return this.pushAction;
	}

	public void setPushAction(Long pushAction) {
		this.pushAction = pushAction;
		if(pushAction != null){
			putBodyParameter("PushAction", pushAction.toString());
		}
	}

	public Long getDeliveryType() {
		return this.deliveryType;
	}

	public void setDeliveryType(Long deliveryType) {
		this.deliveryType = deliveryType;
		if(deliveryType != null){
			putBodyParameter("DeliveryType", deliveryType.toString());
		}
	}

	public String getNotifyType() {
		return this.notifyType;
	}

	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
		if(notifyType != null){
			putBodyParameter("NotifyType", notifyType);
		}
	}

	public String getExtendedParams() {
		return this.extendedParams;
	}

	public void setExtendedParams(String extendedParams) {
		this.extendedParams = extendedParams;
		if(extendedParams != null){
			putBodyParameter("ExtendedParams", extendedParams);
		}
	}

	public String getStrategyContent() {
		return this.strategyContent;
	}

	public void setStrategyContent(String strategyContent) {
		this.strategyContent = strategyContent;
		if(strategyContent != null){
			putBodyParameter("StrategyContent", strategyContent);
		}
	}

	public Map<String,String> getThirdChannelCategory() {
		return this.thirdChannelCategory;
	}

	public void setThirdChannelCategory(Map<String,String> thirdChannelCategory) {
		this.thirdChannelCategory = thirdChannelCategory;	
		if (thirdChannelCategory != null) {
			putBodyParameter("ThirdChannelCategory" , new Gson().toJson(thirdChannelCategory));
		}	
	}

	public Long getUnBindStartTime() {
		return this.unBindStartTime;
	}

	public void setUnBindStartTime(Long unBindStartTime) {
		this.unBindStartTime = unBindStartTime;
		if(unBindStartTime != null){
			putBodyParameter("UnBindStartTime", unBindStartTime.toString());
		}
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
		if(classification != null){
			putBodyParameter("Classification", classification);
		}
	}

	public Long getUnBindPeriod() {
		return this.unBindPeriod;
	}

	public void setUnBindPeriod(Long unBindPeriod) {
		this.unBindPeriod = unBindPeriod;
		if(unBindPeriod != null){
			putBodyParameter("UnBindPeriod", unBindPeriod.toString());
		}
	}

	public Long getExpiredSeconds() {
		return this.expiredSeconds;
	}

	public void setExpiredSeconds(Long expiredSeconds) {
		this.expiredSeconds = expiredSeconds;
		if(expiredSeconds != null){
			putBodyParameter("ExpiredSeconds", expiredSeconds.toString());
		}
	}

	public String getMsgkey() {
		return this.msgkey;
	}

	public void setMsgkey(String msgkey) {
		this.msgkey = msgkey;
		if(msgkey != null){
			putBodyParameter("Msgkey", msgkey);
		}
	}

	public Integer getStrategyType() {
		return this.strategyType;
	}

	public void setStrategyType(Integer strategyType) {
		this.strategyType = strategyType;
		if(strategyType != null){
			putBodyParameter("StrategyType", strategyType.toString());
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	public String getTransparentMessageUrgency() {
		return this.transparentMessageUrgency;
	}

	public void setTransparentMessageUrgency(String transparentMessageUrgency) {
		this.transparentMessageUrgency = transparentMessageUrgency;
		if(transparentMessageUrgency != null){
			putBodyParameter("TransparentMessageUrgency", transparentMessageUrgency);
		}
	}

	public Integer getAndroidChannel() {
		return this.androidChannel;
	}

	public void setAndroidChannel(Integer androidChannel) {
		this.androidChannel = androidChannel;
		if(androidChannel != null){
			putBodyParameter("AndroidChannel", androidChannel.toString());
		}
	}

	public Integer getTimeMode() {
		return this.timeMode;
	}

	public void setTimeMode(Integer timeMode) {
		this.timeMode = timeMode;
		if(timeMode != null){
			putBodyParameter("TimeMode", timeMode.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putBodyParameter("TemplateName", templateName);
		}
	}

	public String getMiChannelId() {
		return this.miChannelId;
	}

	public void setMiChannelId(String miChannelId) {
		this.miChannelId = miChannelId;
		if(miChannelId != null){
			putBodyParameter("MiChannelId", miChannelId);
		}
	}

	public Long getSilent() {
		return this.silent;
	}

	public void setSilent(Long silent) {
		this.silent = silent;
		if(silent != null){
			putBodyParameter("Silent", silent.toString());
		}
	}

	public Long getPushStatus() {
		return this.pushStatus;
	}

	public void setPushStatus(Long pushStatus) {
		this.pushStatus = pushStatus;
		if(pushStatus != null){
			putBodyParameter("PushStatus", pushStatus.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public Integer getBindPeriod() {
		return this.bindPeriod;
	}

	public void setBindPeriod(Integer bindPeriod) {
		this.bindPeriod = bindPeriod;
		if(bindPeriod != null){
			putBodyParameter("BindPeriod", bindPeriod.toString());
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putBodyParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<PushBroadcastResponse> getResponseClass() {
		return PushBroadcastResponse.class;
	}

}
