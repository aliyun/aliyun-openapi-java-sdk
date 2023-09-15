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

package com.aliyuncs.cams.model.v20200606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.ChatappSyncPhoneNumberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ChatappSyncPhoneNumberResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String accessDeniedDetail;

	private List<PhoneNumbersItem> phoneNumbers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public List<PhoneNumbersItem> getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumbersItem> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public static class PhoneNumbersItem {

		private String upQueue;

		private String phoneNumber;

		private String statusQueue;

		private String verifiedName;

		private String statusCallbackUrl;

		private String upCallbackUrl;

		private String qualityRating;

		private String status;

		private String codeVerificationStatus;

		private String nameStatus;

		private String messagingLimitTier;

		private String newNameStatus;

		public String getUpQueue() {
			return this.upQueue;
		}

		public void setUpQueue(String upQueue) {
			this.upQueue = upQueue;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getStatusQueue() {
			return this.statusQueue;
		}

		public void setStatusQueue(String statusQueue) {
			this.statusQueue = statusQueue;
		}

		public String getVerifiedName() {
			return this.verifiedName;
		}

		public void setVerifiedName(String verifiedName) {
			this.verifiedName = verifiedName;
		}

		public String getStatusCallbackUrl() {
			return this.statusCallbackUrl;
		}

		public void setStatusCallbackUrl(String statusCallbackUrl) {
			this.statusCallbackUrl = statusCallbackUrl;
		}

		public String getUpCallbackUrl() {
			return this.upCallbackUrl;
		}

		public void setUpCallbackUrl(String upCallbackUrl) {
			this.upCallbackUrl = upCallbackUrl;
		}

		public String getQualityRating() {
			return this.qualityRating;
		}

		public void setQualityRating(String qualityRating) {
			this.qualityRating = qualityRating;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCodeVerificationStatus() {
			return this.codeVerificationStatus;
		}

		public void setCodeVerificationStatus(String codeVerificationStatus) {
			this.codeVerificationStatus = codeVerificationStatus;
		}

		public String getNameStatus() {
			return this.nameStatus;
		}

		public void setNameStatus(String nameStatus) {
			this.nameStatus = nameStatus;
		}

		public String getMessagingLimitTier() {
			return this.messagingLimitTier;
		}

		public void setMessagingLimitTier(String messagingLimitTier) {
			this.messagingLimitTier = messagingLimitTier;
		}

		public String getNewNameStatus() {
			return this.newNameStatus;
		}

		public void setNewNameStatus(String newNameStatus) {
			this.newNameStatus = newNameStatus;
		}
	}

	@Override
	public ChatappSyncPhoneNumberResponse getInstance(UnmarshallerContext context) {
		return	ChatappSyncPhoneNumberResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
