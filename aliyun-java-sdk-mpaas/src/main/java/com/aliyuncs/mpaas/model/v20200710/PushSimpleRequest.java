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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushSimpleRequest extends RpcAcsRequest<PushSimpleResponse> {
	   

	private String imageUrls;

	private String taskName;

	private String title;

	private String content;

	private String iconUrls;

	private Long pushAction;

	private Long deliveryType;

	private String notifyType;

	private String targetMsgkey;

	private Integer pushStyle;

	private String extendedParams;

	private Long silent;

	private String strategyContent;

	private String uri;

	private Long expiredSeconds;

	private String appId;

	private Integer strategyType;

	private String workspaceId;
	public PushSimpleRequest() {
		super("mPaaS", "2020-07-10", "PushSimple");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageUrls() {
		return this.imageUrls;
	}

	public void setImageUrls(String imageUrls) {
		this.imageUrls = imageUrls;
		if(imageUrls != null){
			putBodyParameter("ImageUrls", imageUrls);
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getIconUrls() {
		return this.iconUrls;
	}

	public void setIconUrls(String iconUrls) {
		this.iconUrls = iconUrls;
		if(iconUrls != null){
			putBodyParameter("IconUrls", iconUrls);
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

	public String getTargetMsgkey() {
		return this.targetMsgkey;
	}

	public void setTargetMsgkey(String targetMsgkey) {
		this.targetMsgkey = targetMsgkey;
		if(targetMsgkey != null){
			putBodyParameter("TargetMsgkey", targetMsgkey);
		}
	}

	public Integer getPushStyle() {
		return this.pushStyle;
	}

	public void setPushStyle(Integer pushStyle) {
		this.pushStyle = pushStyle;
		if(pushStyle != null){
			putBodyParameter("PushStyle", pushStyle.toString());
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

	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
		if(uri != null){
			putBodyParameter("Uri", uri);
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
	public Class<PushSimpleResponse> getResponseClass() {
		return PushSimpleResponse.class;
	}

}
