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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetOpLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOpLogResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<OpLogDetail> opLogDetails;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<OpLogDetail> getOpLogDetails() {
		return this.opLogDetails;
	}

	public void setOpLogDetails(List<OpLogDetail> opLogDetails) {
		this.opLogDetails = opLogDetails;
	}

	public static class OpLogDetail {

		private Long userId;

		private String database;

		private String opContent;

		private String userNick;

		private Long orderId;

		private String module;

		private String opTime;

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getDatabase() {
			return this.database;
		}

		public void setDatabase(String database) {
			this.database = database;
		}

		public String getOpContent() {
			return this.opContent;
		}

		public void setOpContent(String opContent) {
			this.opContent = opContent;
		}

		public String getUserNick() {
			return this.userNick;
		}

		public void setUserNick(String userNick) {
			this.userNick = userNick;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getModule() {
			return this.module;
		}

		public void setModule(String module) {
			this.module = module;
		}

		public String getOpTime() {
			return this.opTime;
		}

		public void setOpTime(String opTime) {
			this.opTime = opTime;
		}
	}

	@Override
	public GetOpLogResponse getInstance(UnmarshallerContext context) {
		return	GetOpLogResponseUnmarshaller.unmarshall(this, context);
	}
}
