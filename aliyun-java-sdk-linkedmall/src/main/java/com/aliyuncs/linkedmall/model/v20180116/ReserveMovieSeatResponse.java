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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.ReserveMovieSeatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ReserveMovieSeatResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String subCode;

	private String subMessage;

	private String logsId;

	private Boolean success;

	private ReservedSeat reservedSeat;

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

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMessage() {
		return this.subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ReservedSeat getReservedSeat() {
		return this.reservedSeat;
	}

	public void setReservedSeat(ReservedSeat reservedSeat) {
		this.reservedSeat = reservedSeat;
	}

	public static class ReservedSeat {

		private String applyKey;

		private Long defaultLockSecond;

		private Long reservedTime;

		private String status;

		public String getApplyKey() {
			return this.applyKey;
		}

		public void setApplyKey(String applyKey) {
			this.applyKey = applyKey;
		}

		public Long getDefaultLockSecond() {
			return this.defaultLockSecond;
		}

		public void setDefaultLockSecond(Long defaultLockSecond) {
			this.defaultLockSecond = defaultLockSecond;
		}

		public Long getReservedTime() {
			return this.reservedTime;
		}

		public void setReservedTime(Long reservedTime) {
			this.reservedTime = reservedTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ReserveMovieSeatResponse getInstance(UnmarshallerContext context) {
		return	ReserveMovieSeatResponseUnmarshaller.unmarshall(this, context);
	}
}
