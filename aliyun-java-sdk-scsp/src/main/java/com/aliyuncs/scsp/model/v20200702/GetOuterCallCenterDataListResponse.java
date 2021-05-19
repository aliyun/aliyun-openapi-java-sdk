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

package com.aliyuncs.scsp.model.v20200702;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scsp.transform.v20200702.GetOuterCallCenterDataListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOuterCallCenterDataListResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Long httpStatusCode;

	private List<DataItem> data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Long httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String endReason;

		private String callType;

		private String acid;

		private String toPhoneNum;

		private String userInfo;

		private String interveneTime;

		private String bizId;

		private String sessionId;

		private String fromPhoneNum;

		private String extInfo;

		private String bizType;

		public String getEndReason() {
			return this.endReason;
		}

		public void setEndReason(String endReason) {
			this.endReason = endReason;
		}

		public String getCallType() {
			return this.callType;
		}

		public void setCallType(String callType) {
			this.callType = callType;
		}

		public String getAcid() {
			return this.acid;
		}

		public void setAcid(String acid) {
			this.acid = acid;
		}

		public String getToPhoneNum() {
			return this.toPhoneNum;
		}

		public void setToPhoneNum(String toPhoneNum) {
			this.toPhoneNum = toPhoneNum;
		}

		public String getUserInfo() {
			return this.userInfo;
		}

		public void setUserInfo(String userInfo) {
			this.userInfo = userInfo;
		}

		public String getInterveneTime() {
			return this.interveneTime;
		}

		public void setInterveneTime(String interveneTime) {
			this.interveneTime = interveneTime;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public String getFromPhoneNum() {
			return this.fromPhoneNum;
		}

		public void setFromPhoneNum(String fromPhoneNum) {
			this.fromPhoneNum = fromPhoneNum;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
	}

	@Override
	public GetOuterCallCenterDataListResponse getInstance(UnmarshallerContext context) {
		return	GetOuterCallCenterDataListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
