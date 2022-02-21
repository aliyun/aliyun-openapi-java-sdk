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
import com.aliyuncs.dysmsapi.transform.v20170525.QuerySmsTemplateListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySmsTemplateListResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<SmsStatsResultDTO> smsTemplateList;

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

	public List<SmsStatsResultDTO> getSmsTemplateList() {
		return this.smsTemplateList;
	}

	public void setSmsTemplateList(List<SmsStatsResultDTO> smsTemplateList) {
		this.smsTemplateList = smsTemplateList;
	}

	public static class SmsStatsResultDTO {

		private String templateCode;

		private String templateName;

		private Integer templateType;

		private String auditStatus;

		private String templateContent;

		private String createDate;

		private String orderId;

		private Reason reason;

		public String getTemplateCode() {
			return this.templateCode;
		}

		public void setTemplateCode(String templateCode) {
			this.templateCode = templateCode;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public Integer getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(Integer templateType) {
			this.templateType = templateType;
		}

		public String getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(String auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getTemplateContent() {
			return this.templateContent;
		}

		public void setTemplateContent(String templateContent) {
			this.templateContent = templateContent;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
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

			private String rejectDate;

			private String rejectInfo;

			private String rejectSubInfo;

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

			public String getRejectSubInfo() {
				return this.rejectSubInfo;
			}

			public void setRejectSubInfo(String rejectSubInfo) {
				this.rejectSubInfo = rejectSubInfo;
			}
		}
	}

	@Override
	public QuerySmsTemplateListResponse getInstance(UnmarshallerContext context) {
		return	QuerySmsTemplateListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
