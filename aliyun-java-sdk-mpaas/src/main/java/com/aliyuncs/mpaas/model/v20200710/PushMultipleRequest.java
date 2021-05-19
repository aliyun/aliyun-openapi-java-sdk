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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushMultipleRequest extends RpcAcsRequest<PushMultipleResponse> {
	   

	private String taskName;

	private Long pushAction;

	private Long deliveryType;

	private String templateName;

	private String notifyType;

	private String extendedParams;

	private Long silent;

	private Long expiredSeconds;

	private List<TargetMsg> targetMsgs;

	private String appId;

	private String workspaceId;
	public PushMultipleRequest() {
		super("mPaaS", "2020-07-10", "PushMultiple");
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
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
