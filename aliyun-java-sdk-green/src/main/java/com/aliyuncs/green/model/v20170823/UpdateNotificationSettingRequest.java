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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateNotificationSettingRequest extends RpcAcsRequest<UpdateNotificationSettingResponse> {
	
	public UpdateNotificationSettingRequest() {
		super("Green", "2017-08-23", "UpdateNotificationSetting", "green");
	}

	private String realtimeMessageList;

	private String sourceIp;

	private String reminderModeList;

	private Integer scheduleMessageTime;

	private String lang;

	private Integer scheduleMessageTimeZone;

	public String getRealtimeMessageList() {
		return this.realtimeMessageList;
	}

	public void setRealtimeMessageList(String realtimeMessageList) {
		this.realtimeMessageList = realtimeMessageList;
		if(realtimeMessageList != null){
			putQueryParameter("RealtimeMessageList", realtimeMessageList);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getReminderModeList() {
		return this.reminderModeList;
	}

	public void setReminderModeList(String reminderModeList) {
		this.reminderModeList = reminderModeList;
		if(reminderModeList != null){
			putQueryParameter("ReminderModeList", reminderModeList);
		}
	}

	public Integer getScheduleMessageTime() {
		return this.scheduleMessageTime;
	}

	public void setScheduleMessageTime(Integer scheduleMessageTime) {
		this.scheduleMessageTime = scheduleMessageTime;
		if(scheduleMessageTime != null){
			putQueryParameter("ScheduleMessageTime", scheduleMessageTime.toString());
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

	public Integer getScheduleMessageTimeZone() {
		return this.scheduleMessageTimeZone;
	}

	public void setScheduleMessageTimeZone(Integer scheduleMessageTimeZone) {
		this.scheduleMessageTimeZone = scheduleMessageTimeZone;
		if(scheduleMessageTimeZone != null){
			putQueryParameter("ScheduleMessageTimeZone", scheduleMessageTimeZone.toString());
		}
	}

	@Override
	public Class<UpdateNotificationSettingResponse> getResponseClass() {
		return UpdateNotificationSettingResponse.class;
	}

}
