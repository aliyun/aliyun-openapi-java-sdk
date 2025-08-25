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

package com.aliyuncs.mpaas.model.v20200710;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushMultipleRequest extends RpcAcsRequest<PushMultipleResponse> {
	   

	private String taskName;

	@SerializedName("notifyLevel")
	private Map<String,String> notifyLevel;

	private Object transparentMessagePayload;

	private Object activityContentState;

	private Long pushAction;

	private Long deliveryType;

	private String notifyType;

	private String extendedParams;

	private String strategyContent;

	@SerializedName("thirdChannelCategory")
	private Map<String,String> thirdChannelCategory;

	private String classification;

	private Long expiredSeconds;

	private List<TargetMsg> targetMsgs;

	private Long dismissalDate;

	private Integer strategyType;

	private String workspaceId;

	private String transparentMessageUrgency;

	private String tenantId;

	private String templateName;

	private String miChannelId;

	private Long silent;

	private String appId;

	private String activityEvent;

	private String channelId;
	public PushMultipleRequest() {
		super("mPaaS", "2020-07-10", "PushMultiple", "mpaas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Map<String,String> getNotifyLevel() {
		return this.notifyLevel;
	}

	public void setNotifyLevel(Map<String,String> notifyLevel) {
		this.notifyLevel = notifyLevel;	
		if (notifyLevel != null) {
			putBodyParameter("NotifyLevel" , new Gson().toJson(notifyLevel));
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

	public Object getActivityContentState() {
		return this.activityContentState;
	}

	public void setActivityContentState(Object activityContentState) {
		this.activityContentState = activityContentState;
		if(activityContentState != null){
			putBodyParameter("ActivityContentState", activityContentState.toString());
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

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
		if(classification != null){
			putBodyParameter("Classification", classification);
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

	public List<TargetMsg> getTargetMsgs() {
		return this.targetMsgs;
	}

	public void setTargetMsgs(List<TargetMsg> targetMsgs) {
		this.targetMsgs = targetMsgs;	
		if (targetMsgs != null) {
			for (int depth1 = 0; depth1 < targetMsgs.size(); depth1++) {
				putBodyParameter("TargetMsg." + (depth1 + 1) + ".ExtendedParams" , targetMsgs.get(depth1).getExtendedParams());
				putBodyParameter("TargetMsg." + (depth1 + 1) + ".TemplateKeyValue" , targetMsgs.get(depth1).getTemplateKeyValue());
				putBodyParameter("TargetMsg." + (depth1 + 1) + ".MsgKey" , targetMsgs.get(depth1).getMsgKey());
				putBodyParameter("TargetMsg." + (depth1 + 1) + ".Target" , targetMsgs.get(depth1).getTarget());
			}
		}	
	}

	public Long getDismissalDate() {
		return this.dismissalDate;
	}

	public void setDismissalDate(Long dismissalDate) {
		this.dismissalDate = dismissalDate;
		if(dismissalDate != null){
			putBodyParameter("DismissalDate", dismissalDate.toString());
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getActivityEvent() {
		return this.activityEvent;
	}

	public void setActivityEvent(String activityEvent) {
		this.activityEvent = activityEvent;
		if(activityEvent != null){
			putBodyParameter("ActivityEvent", activityEvent);
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

	public static class TargetMsg {

		private String extendedParams;

		private String templateKeyValue;

		private String msgKey;

		private String target;

		public String getExtendedParams() {
			return this.extendedParams;
		}

		public void setExtendedParams(String extendedParams) {
			this.extendedParams = extendedParams;
		}

		public String getTemplateKeyValue() {
			return this.templateKeyValue;
		}

		public void setTemplateKeyValue(String templateKeyValue) {
			this.templateKeyValue = templateKeyValue;
		}

		public String getMsgKey() {
			return this.msgKey;
		}

		public void setMsgKey(String msgKey) {
			this.msgKey = msgKey;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}
	}

	@Override
	public Class<PushMultipleResponse> getResponseClass() {
		return PushMultipleResponse.class;
	}

}
