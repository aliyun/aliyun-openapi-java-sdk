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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.lto.transform.v20210707.DescribeAdminInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAdminInfoResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String memberId;

		private String uid;

		private String name;

		private Long authorizedCount;

		private Long authorizedDeviceCount;

		private String contactor;

		private String telephony;

		private String remark;

		private String status;

		private String accessStatus;

		private Long accessDate;

		public String getMemberId() {
			return this.memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getAuthorizedCount() {
			return this.authorizedCount;
		}

		public void setAuthorizedCount(Long authorizedCount) {
			this.authorizedCount = authorizedCount;
		}

		public Long getAuthorizedDeviceCount() {
			return this.authorizedDeviceCount;
		}

		public void setAuthorizedDeviceCount(Long authorizedDeviceCount) {
			this.authorizedDeviceCount = authorizedDeviceCount;
		}

		public String getContactor() {
			return this.contactor;
		}

		public void setContactor(String contactor) {
			this.contactor = contactor;
		}

		public String getTelephony() {
			return this.telephony;
		}

		public void setTelephony(String telephony) {
			this.telephony = telephony;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAccessStatus() {
			return this.accessStatus;
		}

		public void setAccessStatus(String accessStatus) {
			this.accessStatus = accessStatus;
		}

		public Long getAccessDate() {
			return this.accessDate;
		}

		public void setAccessDate(Long accessDate) {
			this.accessDate = accessDate;
		}
	}

	@Override
	public DescribeAdminInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeAdminInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
