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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alidns.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDnsGtmInstanceGlobalConfigRequest extends RpcAcsRequest<UpdateDnsGtmInstanceGlobalConfigResponse> {
	   

	private String alertGroup;

	private String cnameType;

	private String lang;

	private List<AlertConfig> alertConfigs;

	private String publicCnameMode;

	private String publicUserDomainName;

	private Integer ttl;

	private Boolean forceUpdate;

	private String instanceId;

	private String instanceName;

	private String publicRr;

	private String publicZoneName;
	public UpdateDnsGtmInstanceGlobalConfigRequest() {
		super("Alidns", "2015-01-09", "UpdateDnsGtmInstanceGlobalConfig", "alidns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlertGroup() {
		return this.alertGroup;
	}

	public void setAlertGroup(String alertGroup) {
		this.alertGroup = alertGroup;
		if(alertGroup != null){
			putQueryParameter("AlertGroup", alertGroup);
		}
	}

	public String getCnameType() {
		return this.cnameType;
	}

	public void setCnameType(String cnameType) {
		this.cnameType = cnameType;
		if(cnameType != null){
			putQueryParameter("CnameType", cnameType);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public List<AlertConfig> getAlertConfigs() {
		return this.alertConfigs;
	}

	public void setAlertConfigs(List<AlertConfig> alertConfigs) {
		this.alertConfigs = alertConfigs;	
		if (alertConfigs != null) {
			for (int depth1 = 0; depth1 < alertConfigs.size(); depth1++) {
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".DingtalkNotice" , alertConfigs.get(depth1).getDingtalkNotice());
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".SmsNotice" , alertConfigs.get(depth1).getSmsNotice());
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".NoticeType" , alertConfigs.get(depth1).getNoticeType());
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".EmailNotice" , alertConfigs.get(depth1).getEmailNotice());
			}
		}	
	}

	public String getPublicCnameMode() {
		return this.publicCnameMode;
	}

	public void setPublicCnameMode(String publicCnameMode) {
		this.publicCnameMode = publicCnameMode;
		if(publicCnameMode != null){
			putQueryParameter("PublicCnameMode", publicCnameMode);
		}
	}

	public String getPublicUserDomainName() {
		return this.publicUserDomainName;
	}

	public void setPublicUserDomainName(String publicUserDomainName) {
		this.publicUserDomainName = publicUserDomainName;
		if(publicUserDomainName != null){
			putQueryParameter("PublicUserDomainName", publicUserDomainName);
		}
	}

	public Integer getTtl() {
		return this.ttl;
	}

	public void setTtl(Integer ttl) {
		this.ttl = ttl;
		if(ttl != null){
			putQueryParameter("Ttl", ttl.toString());
		}
	}

	public Boolean getForceUpdate() {
		return this.forceUpdate;
	}

	public void setForceUpdate(Boolean forceUpdate) {
		this.forceUpdate = forceUpdate;
		if(forceUpdate != null){
			putQueryParameter("ForceUpdate", forceUpdate.toString());
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

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public String getPublicRr() {
		return this.publicRr;
	}

	public void setPublicRr(String publicRr) {
		this.publicRr = publicRr;
		if(publicRr != null){
			putQueryParameter("PublicRr", publicRr);
		}
	}

	public String getPublicZoneName() {
		return this.publicZoneName;
	}

	public void setPublicZoneName(String publicZoneName) {
		this.publicZoneName = publicZoneName;
		if(publicZoneName != null){
			putQueryParameter("PublicZoneName", publicZoneName);
		}
	}

	public static class AlertConfig {

		private Boolean dingtalkNotice;

		private Boolean smsNotice;

		private String noticeType;

		private Boolean emailNotice;

		public Boolean getDingtalkNotice() {
			return this.dingtalkNotice;
		}

		public void setDingtalkNotice(Boolean dingtalkNotice) {
			this.dingtalkNotice = dingtalkNotice;
		}

		public Boolean getSmsNotice() {
			return this.smsNotice;
		}

		public void setSmsNotice(Boolean smsNotice) {
			this.smsNotice = smsNotice;
		}

		public String getNoticeType() {
			return this.noticeType;
		}

		public void setNoticeType(String noticeType) {
			this.noticeType = noticeType;
		}

		public Boolean getEmailNotice() {
			return this.emailNotice;
		}

		public void setEmailNotice(Boolean emailNotice) {
			this.emailNotice = emailNotice;
		}
	}

	@Override
	public Class<UpdateDnsGtmInstanceGlobalConfigResponse> getResponseClass() {
		return UpdateDnsGtmInstanceGlobalConfigResponse.class;
	}

}
