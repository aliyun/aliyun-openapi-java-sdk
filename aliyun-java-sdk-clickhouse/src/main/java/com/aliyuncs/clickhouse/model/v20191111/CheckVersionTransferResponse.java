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

package com.aliyuncs.clickhouse.model.v20191111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.CheckVersionTransferResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckVersionTransferResponse extends AcsResponse {

	private Integer totalCount;

	private Boolean checkCategory;

	private Boolean checkConnection;

	private Boolean checkStorage;

	private String requestId;

	private String timeDuration;

	private CheckAccess checkAccess;

	private CheckStatus checkStatus;

	private CheckCode checkCode;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Boolean getCheckCategory() {
		return this.checkCategory;
	}

	public void setCheckCategory(Boolean checkCategory) {
		this.checkCategory = checkCategory;
	}

	public Boolean getCheckConnection() {
		return this.checkConnection;
	}

	public void setCheckConnection(Boolean checkConnection) {
		this.checkConnection = checkConnection;
	}

	public Boolean getCheckStorage() {
		return this.checkStorage;
	}

	public void setCheckStorage(Boolean checkStorage) {
		this.checkStorage = checkStorage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTimeDuration() {
		return this.timeDuration;
	}

	public void setTimeDuration(String timeDuration) {
		this.timeDuration = timeDuration;
	}

	public CheckAccess getCheckAccess() {
		return this.checkAccess;
	}

	public void setCheckAccess(CheckAccess checkAccess) {
		this.checkAccess = checkAccess;
	}

	public CheckStatus getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(CheckStatus checkStatus) {
		this.checkStatus = checkStatus;
	}

	public CheckCode getCheckCode() {
		return this.checkCode;
	}

	public void setCheckCode(CheckCode checkCode) {
		this.checkCode = checkCode;
	}

	public static class CheckAccess {

		private Long errCode;

		private String errMessage;

		public Long getErrCode() {
			return this.errCode;
		}

		public void setErrCode(Long errCode) {
			this.errCode = errCode;
		}

		public String getErrMessage() {
			return this.errMessage;
		}

		public void setErrMessage(String errMessage) {
			this.errMessage = errMessage;
		}
	}

	public static class CheckStatus {

		private Long errCode;

		private String errMessage;

		public Long getErrCode() {
			return this.errCode;
		}

		public void setErrCode(Long errCode) {
			this.errCode = errCode;
		}

		public String getErrMessage() {
			return this.errMessage;
		}

		public void setErrMessage(String errMessage) {
			this.errMessage = errMessage;
		}
	}

	public static class CheckCode {

		private Long errCode;

		private String errMessage;

		public Long getErrCode() {
			return this.errCode;
		}

		public void setErrCode(Long errCode) {
			this.errCode = errCode;
		}

		public String getErrMessage() {
			return this.errMessage;
		}

		public void setErrMessage(String errMessage) {
			this.errMessage = errMessage;
		}
	}

	@Override
	public CheckVersionTransferResponse getInstance(UnmarshallerContext context) {
		return	CheckVersionTransferResponseUnmarshaller.unmarshall(this, context);
	}
}
