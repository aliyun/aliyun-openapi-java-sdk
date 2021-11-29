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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListSipCallRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSipCallRecordsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<SipCallRecords> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SipCallRecords> getData() {
		return this.data;
	}

	public void setData(List<SipCallRecords> data) {
		this.data = data;
	}

	public static class SipCallRecords {

		private String instanceId;

		private String callId;

		private String contactId;

		private String caller;

		private String callee;

		private String callerClusterId;

		private String calleeClusterId;

		private Integer lastResponseCode;

		private String lastResponseText;

		private Long inviteTime;

		private Long ringTime;

		private Long establishedTime;

		private Long releasedTime;

		private Integer releaseReasonCode;

		private String earlyMediaUrl;

		private String earlyMediaText;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getCallId() {
			return this.callId;
		}

		public void setCallId(String callId) {
			this.callId = callId;
		}

		public String getContactId() {
			return this.contactId;
		}

		public void setContactId(String contactId) {
			this.contactId = contactId;
		}

		public String getCaller() {
			return this.caller;
		}

		public void setCaller(String caller) {
			this.caller = caller;
		}

		public String getCallee() {
			return this.callee;
		}

		public void setCallee(String callee) {
			this.callee = callee;
		}

		public String getCallerClusterId() {
			return this.callerClusterId;
		}

		public void setCallerClusterId(String callerClusterId) {
			this.callerClusterId = callerClusterId;
		}

		public String getCalleeClusterId() {
			return this.calleeClusterId;
		}

		public void setCalleeClusterId(String calleeClusterId) {
			this.calleeClusterId = calleeClusterId;
		}

		public Integer getLastResponseCode() {
			return this.lastResponseCode;
		}

		public void setLastResponseCode(Integer lastResponseCode) {
			this.lastResponseCode = lastResponseCode;
		}

		public String getLastResponseText() {
			return this.lastResponseText;
		}

		public void setLastResponseText(String lastResponseText) {
			this.lastResponseText = lastResponseText;
		}

		public Long getInviteTime() {
			return this.inviteTime;
		}

		public void setInviteTime(Long inviteTime) {
			this.inviteTime = inviteTime;
		}

		public Long getRingTime() {
			return this.ringTime;
		}

		public void setRingTime(Long ringTime) {
			this.ringTime = ringTime;
		}

		public Long getEstablishedTime() {
			return this.establishedTime;
		}

		public void setEstablishedTime(Long establishedTime) {
			this.establishedTime = establishedTime;
		}

		public Long getReleasedTime() {
			return this.releasedTime;
		}

		public void setReleasedTime(Long releasedTime) {
			this.releasedTime = releasedTime;
		}

		public Integer getReleaseReasonCode() {
			return this.releaseReasonCode;
		}

		public void setReleaseReasonCode(Integer releaseReasonCode) {
			this.releaseReasonCode = releaseReasonCode;
		}

		public String getEarlyMediaUrl() {
			return this.earlyMediaUrl;
		}

		public void setEarlyMediaUrl(String earlyMediaUrl) {
			this.earlyMediaUrl = earlyMediaUrl;
		}

		public String getEarlyMediaText() {
			return this.earlyMediaText;
		}

		public void setEarlyMediaText(String earlyMediaText) {
			this.earlyMediaText = earlyMediaText;
		}
	}

	@Override
	public ListSipCallRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListSipCallRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
