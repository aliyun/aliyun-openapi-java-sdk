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
import com.aliyuncs.advisor_share.transform.v20180608.GetUserReportSubscriptionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserReportSubscriptionResponse extends AcsResponse {

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

		private String timeZone;

		private String mobile;

		private String sendEmailFrequency;

		private String language;

		private Boolean subscribe;

		private List<EmailsItem> emails;

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getSendEmailFrequency() {
			return this.sendEmailFrequency;
		}

		public void setSendEmailFrequency(String sendEmailFrequency) {
			this.sendEmailFrequency = sendEmailFrequency;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public Boolean getSubscribe() {
			return this.subscribe;
		}

		public void setSubscribe(Boolean subscribe) {
			this.subscribe = subscribe;
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
	public GetUserReportSubscriptionResponse getInstance(UnmarshallerContext context) {
		return	GetUserReportSubscriptionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
