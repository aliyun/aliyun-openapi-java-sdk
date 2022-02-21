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
public class PushTemplateRequest extends RpcAcsRequest<PushTemplateResponse> {
	   

	private Integer smsStrategy;

	private String taskName;

	private String templateKeyValue;

	private Long pushAction;

	private Long deliveryType;

	private String templateName;

	private String smsTemplateParam;

	private String notifyType;

	private String targetMsgkey;

	private String extendedParams;

	private Long silent;

	private String strategyContent;

	private Long expiredSeconds;

	private String smsTemplateCode;

	private String appId;

	private String smsSignName;

	private Integer strategyType;

	private String workspaceId;
	public PushTemplateRequest() {
		super("mPaaS", "2020-10-28", "PushTemplate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getSmsStrategy() {
		return this.smsStrategy;
	}

	public void setSmsStrategy(Integer smsStrategy) {
		this.smsStrategy = smsStrategy;
		if(smsStrategy != null){
			putBodyParameter("SmsStrategy", smsStrategy.toString());
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

	public String getSmsTemplateParam() {
		return this.smsTemplateParam;
	}

	public void setSmsTemplateParam(String smsTemplateParam) {
		this.smsTemplateParam = smsTemplateParam;
		if(smsTemplateParam != null){
			putBodyParameter("SmsTemplateParam", smsTemplateParam);
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

	public String getTargetMsgkey() {
		return this.targetMsgkey;
	}

	public void setTargetMsgkey(String targetMsgkey) {
		this.targetMsgkey = targetMsgkey;
		if(targetMsgkey != null){
			putBodyParameter("TargetMsgkey", targetMsgkey);
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

	public Long getExpiredSeconds() {
		return this.expiredSeconds;
	}

	public void setExpiredSeconds(Long expiredSeconds) {
		this.expiredSeconds = expiredSeconds;
		if(expiredSeconds != null){
			putBodyParameter("ExpiredSeconds", expiredSeconds.toString());
		}
	}

	public String getSmsTemplateCode() {
		return this.smsTemplateCode;
	}

	public void setSmsTemplateCode(String smsTemplateCode) {
		this.smsTemplateCode = smsTemplateCode;
		if(smsTemplateCode != null){
			putBodyParameter("SmsTemplateCode", smsTemplateCode);
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

	public String getSmsSignName() {
		return this.smsSignName;
	}

	public void setSmsSignName(String smsSignName) {
		this.smsSignName = smsSignName;
		if(smsSignName != null){
			putBodyParameter("SmsSignName", smsSignName);
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

	@Override
	public Class<PushTemplateResponse> getResponseClass() {
		return PushTemplateResponse.class;
	}

}
