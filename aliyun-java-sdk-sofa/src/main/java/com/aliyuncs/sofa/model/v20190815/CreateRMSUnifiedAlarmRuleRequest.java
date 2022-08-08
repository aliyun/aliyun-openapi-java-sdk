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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRMSUnifiedAlarmRuleRequest extends RpcAcsRequest<CreateRMSUnifiedAlarmRuleResponse> {
	   

	private List<NotifyTarget> notifyTargets;

	private String emergencyUrl;

	private List<String> channelsRepeatLists;

	private String emergency;

	private String workspaceName;

	private Long notifyFiring;

	private Long notifyNodata;

	private Long silenceTime;

	private Long pendingHit;

	private Long alarmNodata;

	private Long level;

	private Long notifyRecovered;

	private String ruleConfig;

	private String name;

	private Long step;

	private String category;

	private String notifyTimeFilterJsonStr;

	private Long recoveredHit;
	public CreateRMSUnifiedAlarmRuleRequest() {
		super("SOFA", "2019-08-15", "CreateRMSUnifiedAlarmRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<NotifyTarget> getNotifyTargets() {
		return this.notifyTargets;
	}

	public void setNotifyTargets(List<NotifyTarget> notifyTargets) {
		this.notifyTargets = notifyTargets;	
		if (notifyTargets != null) {
			for (int depth1 = 0; depth1 < notifyTargets.size(); depth1++) {
				putBodyParameter("NotifyTarget." + (depth1 + 1) + ".SubscriberName" , notifyTargets.get(depth1).getSubscriberName());
				putBodyParameter("NotifyTarget." + (depth1 + 1) + ".Subscriber" , notifyTargets.get(depth1).getSubscriber());
				putBodyParameter("NotifyTarget." + (depth1 + 1) + ".SubscriberUuid" , notifyTargets.get(depth1).getSubscriberUuid());
				putBodyParameter("NotifyTarget." + (depth1 + 1) + ".SubscriberType" , notifyTargets.get(depth1).getSubscriberType());
				putBodyParameter("NotifyTarget." + (depth1 + 1) + ".SubscriberSource" , notifyTargets.get(depth1).getSubscriberSource());
			}
		}	
	}

	public String getEmergencyUrl() {
		return this.emergencyUrl;
	}

	public void setEmergencyUrl(String emergencyUrl) {
		this.emergencyUrl = emergencyUrl;
		if(emergencyUrl != null){
			putBodyParameter("EmergencyUrl", emergencyUrl);
		}
	}

	public List<String> getChannelsRepeatLists() {
		return this.channelsRepeatLists;
	}

	public void setChannelsRepeatLists(List<String> channelsRepeatLists) {
		this.channelsRepeatLists = channelsRepeatLists;	
		if (channelsRepeatLists != null) {
			for (int i = 0; i < channelsRepeatLists.size(); i++) {
				putBodyParameter("ChannelsRepeatList." + (i + 1) , channelsRepeatLists.get(i));
			}
		}	
	}

	public String getEmergency() {
		return this.emergency;
	}

	public void setEmergency(String emergency) {
		this.emergency = emergency;
		if(emergency != null){
			putBodyParameter("Emergency", emergency);
		}
	}

	public String getWorkspaceName() {
		return this.workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
		if(workspaceName != null){
			putBodyParameter("WorkspaceName", workspaceName);
		}
	}

	public Long getNotifyFiring() {
		return this.notifyFiring;
	}

	public void setNotifyFiring(Long notifyFiring) {
		this.notifyFiring = notifyFiring;
		if(notifyFiring != null){
			putBodyParameter("NotifyFiring", notifyFiring.toString());
		}
	}

	public Long getNotifyNodata() {
		return this.notifyNodata;
	}

	public void setNotifyNodata(Long notifyNodata) {
		this.notifyNodata = notifyNodata;
		if(notifyNodata != null){
			putBodyParameter("NotifyNodata", notifyNodata.toString());
		}
	}

	public Long getSilenceTime() {
		return this.silenceTime;
	}

	public void setSilenceTime(Long silenceTime) {
		this.silenceTime = silenceTime;
		if(silenceTime != null){
			putBodyParameter("SilenceTime", silenceTime.toString());
		}
	}

	public Long getPendingHit() {
		return this.pendingHit;
	}

	public void setPendingHit(Long pendingHit) {
		this.pendingHit = pendingHit;
		if(pendingHit != null){
			putBodyParameter("PendingHit", pendingHit.toString());
		}
	}

	public Long getAlarmNodata() {
		return this.alarmNodata;
	}

	public void setAlarmNodata(Long alarmNodata) {
		this.alarmNodata = alarmNodata;
		if(alarmNodata != null){
			putBodyParameter("AlarmNodata", alarmNodata.toString());
		}
	}

	public Long getLevel() {
		return this.level;
	}

	public void setLevel(Long level) {
		this.level = level;
		if(level != null){
			putBodyParameter("Level", level.toString());
		}
	}

	public Long getNotifyRecovered() {
		return this.notifyRecovered;
	}

	public void setNotifyRecovered(Long notifyRecovered) {
		this.notifyRecovered = notifyRecovered;
		if(notifyRecovered != null){
			putBodyParameter("NotifyRecovered", notifyRecovered.toString());
		}
	}

	public String getRuleConfig() {
		return this.ruleConfig;
	}

	public void setRuleConfig(String ruleConfig) {
		this.ruleConfig = ruleConfig;
		if(ruleConfig != null){
			putBodyParameter("RuleConfig", ruleConfig);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Long getStep() {
		return this.step;
	}

	public void setStep(Long step) {
		this.step = step;
		if(step != null){
			putBodyParameter("Step", step.toString());
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putBodyParameter("Category", category);
		}
	}

	public String getNotifyTimeFilterJsonStr() {
		return this.notifyTimeFilterJsonStr;
	}

	public void setNotifyTimeFilterJsonStr(String notifyTimeFilterJsonStr) {
		this.notifyTimeFilterJsonStr = notifyTimeFilterJsonStr;
		if(notifyTimeFilterJsonStr != null){
			putBodyParameter("NotifyTimeFilterJsonStr", notifyTimeFilterJsonStr);
		}
	}

	public Long getRecoveredHit() {
		return this.recoveredHit;
	}

	public void setRecoveredHit(Long recoveredHit) {
		this.recoveredHit = recoveredHit;
		if(recoveredHit != null){
			putBodyParameter("RecoveredHit", recoveredHit.toString());
		}
	}

	public static class NotifyTarget {

		private String subscriberName;

		private String subscriber;

		private String subscriberUuid;

		private String subscriberType;

		private String subscriberSource;

		public String getSubscriberName() {
			return this.subscriberName;
		}

		public void setSubscriberName(String subscriberName) {
			this.subscriberName = subscriberName;
		}

		public String getSubscriber() {
			return this.subscriber;
		}

		public void setSubscriber(String subscriber) {
			this.subscriber = subscriber;
		}

		public String getSubscriberUuid() {
			return this.subscriberUuid;
		}

		public void setSubscriberUuid(String subscriberUuid) {
			this.subscriberUuid = subscriberUuid;
		}

		public String getSubscriberType() {
			return this.subscriberType;
		}

		public void setSubscriberType(String subscriberType) {
			this.subscriberType = subscriberType;
		}

		public String getSubscriberSource() {
			return this.subscriberSource;
		}

		public void setSubscriberSource(String subscriberSource) {
			this.subscriberSource = subscriberSource;
		}
	}

	@Override
	public Class<CreateRMSUnifiedAlarmRuleResponse> getResponseClass() {
		return CreateRMSUnifiedAlarmRuleResponse.class;
	}

}
