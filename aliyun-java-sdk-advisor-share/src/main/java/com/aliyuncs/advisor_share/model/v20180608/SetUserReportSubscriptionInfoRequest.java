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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SetUserReportSubscriptionInfoRequest extends RpcAcsRequest<SetUserReportSubscriptionInfoResponse> {
	   

	private String weeklySendTime;

	private String timeZone;

	private String dailySendTime;

	private Boolean reportSubscribe;

	private String language;

	private String reportSendFrequency;

	private String weeklySendFrequency;

	private String emails;

	private Boolean dailySubscribe;

	private Boolean weeklySubscribe;

	private String reportSendTime;
	public SetUserReportSubscriptionInfoRequest() {
		super("Advisor-Share", "2018-06-08", "SetUserReportSubscriptionInfo", "advisor");
		setMethod(MethodType.POST);
	}

	public String getWeeklySendTime() {
		return this.weeklySendTime;
	}

	public void setWeeklySendTime(String weeklySendTime) {
		this.weeklySendTime = weeklySendTime;
		if(weeklySendTime != null){
			putQueryParameter("WeeklySendTime", weeklySendTime);
		}
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		if(timeZone != null){
			putQueryParameter("TimeZone", timeZone);
		}
	}

	public String getDailySendTime() {
		return this.dailySendTime;
	}

	public void setDailySendTime(String dailySendTime) {
		this.dailySendTime = dailySendTime;
		if(dailySendTime != null){
			putQueryParameter("DailySendTime", dailySendTime);
		}
	}

	public Boolean getReportSubscribe() {
		return this.reportSubscribe;
	}

	public void setReportSubscribe(Boolean reportSubscribe) {
		this.reportSubscribe = reportSubscribe;
		if(reportSubscribe != null){
			putQueryParameter("ReportSubscribe", reportSubscribe.toString());
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getReportSendFrequency() {
		return this.reportSendFrequency;
	}

	public void setReportSendFrequency(String reportSendFrequency) {
		this.reportSendFrequency = reportSendFrequency;
		if(reportSendFrequency != null){
			putQueryParameter("ReportSendFrequency", reportSendFrequency);
		}
	}

	public String getWeeklySendFrequency() {
		return this.weeklySendFrequency;
	}

	public void setWeeklySendFrequency(String weeklySendFrequency) {
		this.weeklySendFrequency = weeklySendFrequency;
		if(weeklySendFrequency != null){
			putQueryParameter("WeeklySendFrequency", weeklySendFrequency);
		}
	}

	public String getEmails() {
		return this.emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
		if(emails != null){
			putQueryParameter("Emails", emails);
		}
	}

	public Boolean getDailySubscribe() {
		return this.dailySubscribe;
	}

	public void setDailySubscribe(Boolean dailySubscribe) {
		this.dailySubscribe = dailySubscribe;
		if(dailySubscribe != null){
			putQueryParameter("DailySubscribe", dailySubscribe.toString());
		}
	}

	public Boolean getWeeklySubscribe() {
		return this.weeklySubscribe;
	}

	public void setWeeklySubscribe(Boolean weeklySubscribe) {
		this.weeklySubscribe = weeklySubscribe;
		if(weeklySubscribe != null){
			putQueryParameter("WeeklySubscribe", weeklySubscribe.toString());
		}
	}

	public String getReportSendTime() {
		return this.reportSendTime;
	}

	public void setReportSendTime(String reportSendTime) {
		this.reportSendTime = reportSendTime;
		if(reportSendTime != null){
			putQueryParameter("ReportSendTime", reportSendTime);
		}
	}

	@Override
	public Class<SetUserReportSubscriptionInfoResponse> getResponseClass() {
		return SetUserReportSubscriptionInfoResponse.class;
	}

}
