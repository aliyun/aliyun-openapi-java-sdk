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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.GetUserReportSubscriptionInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserReportSubscriptionInfoResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean reportSubscribe;

		private String timeZone;

		private String dailySendTime;

		private Boolean weeklySubscribe;

		private String weeklySendTime;

		private String reportSendTime;

		private Boolean dailySubscribe;

		private String weeklySendFrequency;

		private String reportSendFrequency;

		private String language;

		private List<EmailsItem> emails;

		public Boolean getReportSubscribe() {
			return this.reportSubscribe;
		}

		public void setReportSubscribe(Boolean reportSubscribe) {
			this.reportSubscribe = reportSubscribe;
		}

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public String getDailySendTime() {
			return this.dailySendTime;
		}

		public void setDailySendTime(String dailySendTime) {
			this.dailySendTime = dailySendTime;
		}

		public Boolean getWeeklySubscribe() {
			return this.weeklySubscribe;
		}

		public void setWeeklySubscribe(Boolean weeklySubscribe) {
			this.weeklySubscribe = weeklySubscribe;
		}

		public String getWeeklySendTime() {
			return this.weeklySendTime;
		}

		public void setWeeklySendTime(String weeklySendTime) {
			this.weeklySendTime = weeklySendTime;
		}

		public String getReportSendTime() {
			return this.reportSendTime;
		}

		public void setReportSendTime(String reportSendTime) {
			this.reportSendTime = reportSendTime;
		}

		public Boolean getDailySubscribe() {
			return this.dailySubscribe;
		}

		public void setDailySubscribe(Boolean dailySubscribe) {
			this.dailySubscribe = dailySubscribe;
		}

		public String getWeeklySendFrequency() {
			return this.weeklySendFrequency;
		}

		public void setWeeklySendFrequency(String weeklySendFrequency) {
			this.weeklySendFrequency = weeklySendFrequency;
		}

		public String getReportSendFrequency() {
			return this.reportSendFrequency;
		}

		public void setReportSendFrequency(String reportSendFrequency) {
			this.reportSendFrequency = reportSendFrequency;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public List<EmailsItem> getEmails() {
			return this.emails;
		}

		public void setEmails(List<EmailsItem> emails) {
			this.emails = emails;
		}

		public static class EmailsItem {

			private Boolean _default;

			private String email;

			private Boolean subscribe;

			public Boolean get_Default() {
				return this._default;
			}

			public void set_Default(Boolean _default) {
				this._default = _default;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public Boolean getSubscribe() {
				return this.subscribe;
			}

			public void setSubscribe(Boolean subscribe) {
				this.subscribe = subscribe;
			}
		}
	}

	@Override
	public GetUserReportSubscriptionInfoResponse getInstance(UnmarshallerContext context) {
		return	GetUserReportSubscriptionInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
