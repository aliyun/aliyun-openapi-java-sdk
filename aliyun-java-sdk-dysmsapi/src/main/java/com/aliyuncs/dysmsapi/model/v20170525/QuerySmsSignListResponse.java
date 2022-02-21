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

package com.aliyuncs.dysmsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dysmsapi.transform.v20170525.QuerySmsSignListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySmsSignListResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<QuerySmsSignDTO> smsSignList;

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

	public List<QuerySmsSignDTO> getSmsSignList() {
		return this.smsSignList;
	}

	public void setSmsSignList(List<QuerySmsSignDTO> smsSignList) {
		this.smsSignList = smsSignList;
	}

	public static class QuerySmsSignDTO {

		private String signName;

		private String auditStatus;

		private String createDate;

		private String businessType;

		private String orderId;

		private Reason reason;

		public String getSignName() {
			return this.signName;
		}

		public void setSignName(String signName) {
			this.signName = signName;
		}

		public String getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(String auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getBusinessType() {
			return this.businessType;
		}

		public void setBusinessType(String businessType) {
			this.businessType = businessType;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public Reason getReason() {
			return this.reason;
		}

		public void setReason(Reason reason) {
			this.reason = reason;
		}

		public static class Reason {

			private String rejectSubInfo;

			private String rejectDate;

			private String rejectInfo;

			public String getRejectSubInfo() {
				return this.rejectSubInfo;
			}

			public void setRejectSubInfo(String rejectSubInfo) {
				this.rejectSubInfo = rejectSubInfo;
			}

			public String getRejectDate() {
				return this.rejectDate;
			}

			public void setRejectDate(String rejectDate) {
				this.rejectDate = rejectDate;
			}

			public String getRejectInfo() {
				return this.rejectInfo;
			}

			public void setRejectInfo(String rejectInfo) {
				this.rejectInfo = rejectInfo;
			}
		}
	}

	@Override
	public QuerySmsSignListResponse getInstance(UnmarshallerContext context) {
		return	QuerySmsSignListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
