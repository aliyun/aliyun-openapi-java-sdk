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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetQualityRuleTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityRuleTaskResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private RuleTaskInfo ruleTaskInfo;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public RuleTaskInfo getRuleTaskInfo() {
		return this.ruleTaskInfo;
	}

	public void setRuleTaskInfo(RuleTaskInfo ruleTaskInfo) {
		this.ruleTaskInfo = ruleTaskInfo;
	}

	public static class RuleTaskInfo {

		private Long watchId;

		private Long watchTaskId;

		private Long id;

		private Long ruleId;

		private Long templateId;

		private String status;

		private String startTime;

		private String endTime;

		private String validatePartition;

		private String validateObjectType;

		private String validateObjectName;

		private Boolean validateSuccess;

		private String bizDate;

		private String bizDateFormat;

		private String creator;

		private String createTime;

		private String modifyTime;

		private String modifier;

		public Long getWatchId() {
			return this.watchId;
		}

		public void setWatchId(Long watchId) {
			this.watchId = watchId;
		}

		public Long getWatchTaskId() {
			return this.watchTaskId;
		}

		public void setWatchTaskId(Long watchTaskId) {
			this.watchTaskId = watchTaskId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getValidatePartition() {
			return this.validatePartition;
		}

		public void setValidatePartition(String validatePartition) {
			this.validatePartition = validatePartition;
		}

		public String getValidateObjectType() {
			return this.validateObjectType;
		}

		public void setValidateObjectType(String validateObjectType) {
			this.validateObjectType = validateObjectType;
		}

		public String getValidateObjectName() {
			return this.validateObjectName;
		}

		public void setValidateObjectName(String validateObjectName) {
			this.validateObjectName = validateObjectName;
		}

		public Boolean getValidateSuccess() {
			return this.validateSuccess;
		}

		public void setValidateSuccess(Boolean validateSuccess) {
			this.validateSuccess = validateSuccess;
		}

		public String getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(String bizDate) {
			this.bizDate = bizDate;
		}

		public String getBizDateFormat() {
			return this.bizDateFormat;
		}

		public void setBizDateFormat(String bizDateFormat) {
			this.bizDateFormat = bizDateFormat;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}
	}

	@Override
	public GetQualityRuleTaskResponse getInstance(UnmarshallerContext context) {
		return	GetQualityRuleTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
