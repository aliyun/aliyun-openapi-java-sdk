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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeFabricInvitationCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFabricInvitationCodeResponse extends AcsResponse {

	private String dynamicMessage;

	private String requestId;

	private Integer errorCode;

	private Boolean success;

	private String dynamicCode;

	private Result result;

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long senderId;

		private String email;

		private String senderBid;

		private String expireTime;

		private String consortiumId;

		private Integer invitationId;

		private String senderName;

		private String code;

		private String url;

		private Boolean accepted;

		private String sendTime;

		public Long getSenderId() {
			return this.senderId;
		}

		public void setSenderId(Long senderId) {
			this.senderId = senderId;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenderBid() {
			return this.senderBid;
		}

		public void setSenderBid(String senderBid) {
			this.senderBid = senderBid;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getConsortiumId() {
			return this.consortiumId;
		}

		public void setConsortiumId(String consortiumId) {
			this.consortiumId = consortiumId;
		}

		public Integer getInvitationId() {
			return this.invitationId;
		}

		public void setInvitationId(Integer invitationId) {
			this.invitationId = invitationId;
		}

		public String getSenderName() {
			return this.senderName;
		}

		public void setSenderName(String senderName) {
			this.senderName = senderName;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public Boolean getAccepted() {
			return this.accepted;
		}

		public void setAccepted(Boolean accepted) {
			this.accepted = accepted;
		}

		public String getSendTime() {
			return this.sendTime;
		}

		public void setSendTime(String sendTime) {
			this.sendTime = sendTime;
		}
	}

	@Override
	public DescribeFabricInvitationCodeResponse getInstance(UnmarshallerContext context) {
		return	DescribeFabricInvitationCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
