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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListQualityRuleTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQualityRuleTasksResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private PageResult pageResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Long totalCount;

		private List<QualityRuleTask> qualityRuleTaskList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<QualityRuleTask> getQualityRuleTaskList() {
			return this.qualityRuleTaskList;
		}

		public void setQualityRuleTaskList(List<QualityRuleTask> qualityRuleTaskList) {
			this.qualityRuleTaskList = qualityRuleTaskList;
		}

		public static class QualityRuleTask {

			private Long watchTaskId;

			private String status;

			private String modifyTime;

			private String endTime;

			private Long ruleId;

			private String createTime;

			private String startTime;

			private String creator;

			private String bizDateFormat;

			private String validateObjectName;

			private String validatePartition;

			private Long id;

			private String modifier;

			private Long templateId;

			private String validateObjectType;

			private Boolean validateSuccess;

			private String bizDate;

			private Long watchId;

			public Long getWatchTaskId() {
				return this.watchTaskId;
			}

			public void setWatchTaskId(Long watchTaskId) {
				this.watchTaskId = watchTaskId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getBizDateFormat() {
				return this.bizDateFormat;
			}

			public void setBizDateFormat(String bizDateFormat) {
				this.bizDateFormat = bizDateFormat;
			}

			public String getValidateObjectName() {
				return this.validateObjectName;
			}

			public void setValidateObjectName(String validateObjectName) {
				this.validateObjectName = validateObjectName;
			}

			public String getValidatePartition() {
				return this.validatePartition;
			}

			public void setValidatePartition(String validatePartition) {
				this.validatePartition = validatePartition;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public Long getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Long templateId) {
				this.templateId = templateId;
			}

			public String getValidateObjectType() {
				return this.validateObjectType;
			}

			public void setValidateObjectType(String validateObjectType) {
				this.validateObjectType = validateObjectType;
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

			public Long getWatchId() {
				return this.watchId;
			}

			public void setWatchId(Long watchId) {
				this.watchId = watchId;
			}
		}
	}

	@Override
	public ListQualityRuleTasksResponse getInstance(UnmarshallerContext context) {
		return	ListQualityRuleTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
