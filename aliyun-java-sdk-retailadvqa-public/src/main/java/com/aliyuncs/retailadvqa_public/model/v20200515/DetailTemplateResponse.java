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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa_public.transform.v20200515.DetailTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetailTemplateResponse extends AcsResponse {

	private String errorCode;

	private String errorDesc;

	private Boolean success;

	private String traceId;

	private String exStack;

	private String requestId;

	private Data data;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getExStack() {
		return this.exStack;
	}

	public void setExStack(String exStack) {
		this.exStack = exStack;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String id;

		private Long templateStatus;

		private Long templateType;

		private String reason;

		private String smsTemplateCode;

		private String templateName;

		private String templateContent;

		private String smsContentSuffix;

		private String remark;

		private Long isVariable;

		private String platformId;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getTemplateStatus() {
			return this.templateStatus;
		}

		public void setTemplateStatus(Long templateStatus) {
			this.templateStatus = templateStatus;
		}

		public Long getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(Long templateType) {
			this.templateType = templateType;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getSmsTemplateCode() {
			return this.smsTemplateCode;
		}

		public void setSmsTemplateCode(String smsTemplateCode) {
			this.smsTemplateCode = smsTemplateCode;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getTemplateContent() {
			return this.templateContent;
		}

		public void setTemplateContent(String templateContent) {
			this.templateContent = templateContent;
		}

		public String getSmsContentSuffix() {
			return this.smsContentSuffix;
		}

		public void setSmsContentSuffix(String smsContentSuffix) {
			this.smsContentSuffix = smsContentSuffix;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Long getIsVariable() {
			return this.isVariable;
		}

		public void setIsVariable(Long isVariable) {
			this.isVariable = isVariable;
		}

		public String getPlatformId() {
			return this.platformId;
		}

		public void setPlatformId(String platformId) {
			this.platformId = platformId;
		}
	}

	@Override
	public DetailTemplateResponse getInstance(UnmarshallerContext context) {
		return	DetailTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
