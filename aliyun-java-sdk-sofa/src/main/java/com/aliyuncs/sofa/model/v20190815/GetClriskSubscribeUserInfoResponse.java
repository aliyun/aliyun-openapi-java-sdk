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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetClriskSubscribeUserInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClriskSubscribeUserInfoResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DdMessageNoticeAggregateItem> ddMessageNoticeAggregate;

	private EmailNoticeAggregate emailNoticeAggregate;

	private MessageNoticeAggregate messageNoticeAggregate;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DdMessageNoticeAggregateItem> getDdMessageNoticeAggregate() {
		return this.ddMessageNoticeAggregate;
	}

	public void setDdMessageNoticeAggregate(List<DdMessageNoticeAggregateItem> ddMessageNoticeAggregate) {
		this.ddMessageNoticeAggregate = ddMessageNoticeAggregate;
	}

	public EmailNoticeAggregate getEmailNoticeAggregate() {
		return this.emailNoticeAggregate;
	}

	public void setEmailNoticeAggregate(EmailNoticeAggregate emailNoticeAggregate) {
		this.emailNoticeAggregate = emailNoticeAggregate;
	}

	public MessageNoticeAggregate getMessageNoticeAggregate() {
		return this.messageNoticeAggregate;
	}

	public void setMessageNoticeAggregate(MessageNoticeAggregate messageNoticeAggregate) {
		this.messageNoticeAggregate = messageNoticeAggregate;
	}

	public static class DdMessageNoticeAggregateItem {

		private Boolean isIssueSubscribe;

		private Boolean isModelSubscribe;

		private Boolean isTaskSubscribe;

		private String name;

		private String secret;

		private String webHookAddress;

		public Boolean getIsIssueSubscribe() {
			return this.isIssueSubscribe;
		}

		public void setIsIssueSubscribe(Boolean isIssueSubscribe) {
			this.isIssueSubscribe = isIssueSubscribe;
		}

		public Boolean getIsModelSubscribe() {
			return this.isModelSubscribe;
		}

		public void setIsModelSubscribe(Boolean isModelSubscribe) {
			this.isModelSubscribe = isModelSubscribe;
		}

		public Boolean getIsTaskSubscribe() {
			return this.isTaskSubscribe;
		}

		public void setIsTaskSubscribe(Boolean isTaskSubscribe) {
			this.isTaskSubscribe = isTaskSubscribe;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSecret() {
			return this.secret;
		}

		public void setSecret(String secret) {
			this.secret = secret;
		}

		public String getWebHookAddress() {
			return this.webHookAddress;
		}

		public void setWebHookAddress(String webHookAddress) {
			this.webHookAddress = webHookAddress;
		}
	}

	public static class EmailNoticeAggregate {

		private String emailAddress;

		private Boolean isIssueSubscribe;

		private Boolean isModelSubscribe;

		private Boolean isTaskSubscribe;

		public String getEmailAddress() {
			return this.emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		public Boolean getIsIssueSubscribe() {
			return this.isIssueSubscribe;
		}

		public void setIsIssueSubscribe(Boolean isIssueSubscribe) {
			this.isIssueSubscribe = isIssueSubscribe;
		}

		public Boolean getIsModelSubscribe() {
			return this.isModelSubscribe;
		}

		public void setIsModelSubscribe(Boolean isModelSubscribe) {
			this.isModelSubscribe = isModelSubscribe;
		}

		public Boolean getIsTaskSubscribe() {
			return this.isTaskSubscribe;
		}

		public void setIsTaskSubscribe(Boolean isTaskSubscribe) {
			this.isTaskSubscribe = isTaskSubscribe;
		}
	}

	public static class MessageNoticeAggregate {

		private Boolean isIssueSubscribe;

		private Boolean isModelSubscribe;

		private Boolean isTaskSubscribe;

		private String number;

		public Boolean getIsIssueSubscribe() {
			return this.isIssueSubscribe;
		}

		public void setIsIssueSubscribe(Boolean isIssueSubscribe) {
			this.isIssueSubscribe = isIssueSubscribe;
		}

		public Boolean getIsModelSubscribe() {
			return this.isModelSubscribe;
		}

		public void setIsModelSubscribe(Boolean isModelSubscribe) {
			this.isModelSubscribe = isModelSubscribe;
		}

		public Boolean getIsTaskSubscribe() {
			return this.isTaskSubscribe;
		}

		public void setIsTaskSubscribe(Boolean isTaskSubscribe) {
			this.isTaskSubscribe = isTaskSubscribe;
		}

		public String getNumber() {
			return this.number;
		}

		public void setNumber(String number) {
			this.number = number;
		}
	}

	@Override
	public GetClriskSubscribeUserInfoResponse getInstance(UnmarshallerContext context) {
		return	GetClriskSubscribeUserInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
