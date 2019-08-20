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

package com.aliyuncs.appmallsservice.model.v20180224;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.appmallsservice.transform.v20180224.TaobaoFilmLockSeatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TaobaoFilmLockSeatResponse extends AcsResponse {

	private String errorCode;

	private String msg;

	private String subCode;

	private String subMsg;

	private String logsId;

	private String requestId;

	private SeatLocked seatLocked;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMsg() {
		return this.subMsg;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SeatLocked getSeatLocked() {
		return this.seatLocked;
	}

	public void setSeatLocked(SeatLocked seatLocked) {
		this.seatLocked = seatLocked;
	}

	public static class SeatLocked {

		private String applyKey;

		private Long defaultLockSecond;

		private Long lockTime;

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

		public Long getLockTime() {
			return this.lockTime;
		}

		public void setLockTime(Long lockTime) {
			this.lockTime = lockTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public TaobaoFilmLockSeatResponse getInstance(UnmarshallerContext context) {
		return	TaobaoFilmLockSeatResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
