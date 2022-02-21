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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushBroadcastRequest extends RpcAcsRequest<PushBroadcastResponse> {
	   

	private Integer androidChannel;

	private String taskName;

	private String templateKeyValue;

	private Long pushAction;

	private Long deliveryType;

	private String templateName;

	private String notifyType;

	private String extendedParams;

	private Long silent;

	private String strategyContent;

	private Long pushStatus;

	private Long unBindPeriod;

	private Long expiredSeconds;

	private String appId;

	private String msgkey;

	private Integer strategyType;

	private Integer bindPeriod;

	private String workspaceId;
	public PushBroadcastRequest() {
		super("mPaaS", "2020-10-28", "PushBroadcast");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putBodyParameter("TemplateName", templateName);
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

	public Long getSilent() {
		return this.silent;
	}

	public void setSilent(Long silent) {
		this.silent = silent;
		if(silent != null){
			putBodyParameter("Silent", silent.toString());
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

	public Long getPushStatus() {
		return this.pushStatus;
	}

	public void setPushStatus(Long pushStatus) {
		this.pushStatus = pushStatus;
		if(pushStatus != null){
			putBodyParameter("PushStatus", pushStatus.toString());
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
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

	public Integer getBindPeriod() {
		return this.bindPeriod;
	}

	public void setBindPeriod(Integer bindPeriod) {
		this.bindPeriod = bindPeriod;
		if(bindPeriod != null){
			putBodyParameter("BindPeriod", bindPeriod.toString());
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

	@Override
	public Class<PushBroadcastResponse> getResponseClass() {
		return PushBroadcastResponse.class;
	}

}
