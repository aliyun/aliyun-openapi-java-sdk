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
public class SetUserReportSubscriptionRequest extends RpcAcsRequest<SetUserReportSubscriptionResponse> {
	   

	private String emails;

	private String timeZone;

	private String mobile;

	private String language;

	private String sendEmailFrequency;
	public SetUserReportSubscriptionRequest() {
		super("Advisor-Share", "2018-06-08", "SetUserReportSubscription", "advisor");
		setMethod(MethodType.POST);
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

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		if(timeZone != null){
			putQueryParameter("TimeZone", timeZone);
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putQueryParameter("Mobile", mobile);
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

	public String getSendEmailFrequency() {
		return this.sendEmailFrequency;
	}

	public void setSendEmailFrequency(String sendEmailFrequency) {
		this.sendEmailFrequency = sendEmailFrequency;
		if(sendEmailFrequency != null){
			putQueryParameter("SendEmailFrequency", sendEmailFrequency);
		}
	}

	@Override
	public Class<SetUserReportSubscriptionResponse> getResponseClass() {
		return SetUserReportSubscriptionResponse.class;
	}

}
