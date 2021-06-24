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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsSendAlertNotificationRequest extends RpcAcsRequest<OpsSendAlertNotificationResponse> {
	   

	private String alertName;

	private String customDingGroupContent;

	private String alertKV;

	private String customEmailContent;

	private String alertInfo;

	private String customVoiceCallContent;

	private String customDingTalkContent;

	private String severity;

	private String customSmsContent;

	private String notificationRouteKey;

	private String alertSource;

	private String auditParamStr;
	public OpsSendAlertNotificationRequest() {
		super("Ecsops", "2016-04-01", "OpsSendAlertNotification", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getAlertName() {
		return this.alertName;
	}

	public void setAlertName(String alertName) {
		this.alertName = alertName;
		if(alertName != null){
			putQueryParameter("AlertName", alertName);
		}
	}

	public String getCustomDingGroupContent() {
		return this.customDingGroupContent;
	}

	public void setCustomDingGroupContent(String customDingGroupContent) {
		this.customDingGroupContent = customDingGroupContent;
		if(customDingGroupContent != null){
			putQueryParameter("CustomDingGroupContent", customDingGroupContent);
		}
	}

	public String getAlertKV() {
		return this.alertKV;
	}

	public void setAlertKV(String alertKV) {
		this.alertKV = alertKV;
		if(alertKV != null){
			putQueryParameter("AlertKV", alertKV);
		}
	}

	public String getCustomEmailContent() {
		return this.customEmailContent;
	}

	public void setCustomEmailContent(String customEmailContent) {
		this.customEmailContent = customEmailContent;
		if(customEmailContent != null){
			putQueryParameter("CustomEmailContent", customEmailContent);
		}
	}

	public String getAlertInfo() {
		return this.alertInfo;
	}

	public void setAlertInfo(String alertInfo) {
		this.alertInfo = alertInfo;
		if(alertInfo != null){
			putQueryParameter("AlertInfo", alertInfo);
		}
	}

	public String getCustomVoiceCallContent() {
		return this.customVoiceCallContent;
	}

	public void setCustomVoiceCallContent(String customVoiceCallContent) {
		this.customVoiceCallContent = customVoiceCallContent;
		if(customVoiceCallContent != null){
			putQueryParameter("CustomVoiceCallContent", customVoiceCallContent);
		}
	}

	public String getCustomDingTalkContent() {
		return this.customDingTalkContent;
	}

	public void setCustomDingTalkContent(String customDingTalkContent) {
		this.customDingTalkContent = customDingTalkContent;
		if(customDingTalkContent != null){
			putQueryParameter("CustomDingTalkContent", customDingTalkContent);
		}
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
		if(severity != null){
			putQueryParameter("Severity", severity);
		}
	}

	public String getCustomSmsContent() {
		return this.customSmsContent;
	}

	public void setCustomSmsContent(String customSmsContent) {
		this.customSmsContent = customSmsContent;
		if(customSmsContent != null){
			putQueryParameter("CustomSmsContent", customSmsContent);
		}
	}

	public String getNotificationRouteKey() {
		return this.notificationRouteKey;
	}

	public void setNotificationRouteKey(String notificationRouteKey) {
		this.notificationRouteKey = notificationRouteKey;
		if(notificationRouteKey != null){
			putQueryParameter("NotificationRouteKey", notificationRouteKey);
		}
	}

	public String getAlertSource() {
		return this.alertSource;
	}

	public void setAlertSource(String alertSource) {
		this.alertSource = alertSource;
		if(alertSource != null){
			putQueryParameter("AlertSource", alertSource);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsSendAlertNotificationResponse> getResponseClass() {
		return OpsSendAlertNotificationResponse.class;
	}

}
