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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.GetQualityCheckSchemeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityCheckSchemeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<String> messages;

	private Data data;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<String> getMessages() {
		return this.messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long schemeId;

		private String name;

		private String description;

		private Long schemeTemplateId;

		private Integer dataType;

		private Integer type;

		private Integer templateType;

		private Integer status;

		private String createUserName;

		private String createTime;

		private String updateUserName;

		private String updateTime;

		private Long version;

		private String publishContent;

		private List<SchemeCheckTypeListItem> schemeCheckTypeList;

		private List<String> ruleIds;

		private List<String> ruleList;

		public Long getSchemeId() {
			return this.schemeId;
		}

		public void setSchemeId(Long schemeId) {
			this.schemeId = schemeId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getSchemeTemplateId() {
			return this.schemeTemplateId;
		}

		public void setSchemeTemplateId(Long schemeTemplateId) {
			this.schemeTemplateId = schemeTemplateId;
		}

		public Integer getDataType() {
			return this.dataType;
		}

		public void setDataType(Integer dataType) {
			this.dataType = dataType;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(Integer templateType) {
			this.templateType = templateType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getCreateUserName() {
			return this.createUserName;
		}

		public void setCreateUserName(String createUserName) {
			this.createUserName = createUserName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateUserName() {
			return this.updateUserName;
		}

		public void setUpdateUserName(String updateUserName) {
			this.updateUserName = updateUserName;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public String getPublishContent() {
			return this.publishContent;
		}

		public void setPublishContent(String publishContent) {
			this.publishContent = publishContent;
		}

		public List<SchemeCheckTypeListItem> getSchemeCheckTypeList() {
			return this.schemeCheckTypeList;
		}

		public void setSchemeCheckTypeList(List<SchemeCheckTypeListItem> schemeCheckTypeList) {
			this.schemeCheckTypeList = schemeCheckTypeList;
		}

		public List<String> getRuleIds() {
			return this.ruleIds;
		}

		public void setRuleIds(List<String> ruleIds) {
			this.ruleIds = ruleIds;
		}

		public List<String> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<String> ruleList) {
			this.ruleList = ruleList;
		}

		public static class SchemeCheckTypeListItem {

			private Long checkType;

			private String checkName;

			private Integer sourceScore;

			private Integer score;

			private Integer enable;

			private Long schemeId;

			public Long getCheckType() {
				return this.checkType;
			}

			public void setCheckType(Long checkType) {
				this.checkType = checkType;
			}

			public String getCheckName() {
				return this.checkName;
			}

			public void setCheckName(String checkName) {
				this.checkName = checkName;
			}

			public Integer getSourceScore() {
				return this.sourceScore;
			}

			public void setSourceScore(Integer sourceScore) {
				this.sourceScore = sourceScore;
			}

			public Integer getScore() {
				return this.score;
			}

			public void setScore(Integer score) {
				this.score = score;
			}

			public Integer getEnable() {
				return this.enable;
			}

			public void setEnable(Integer enable) {
				this.enable = enable;
			}

			public Long getSchemeId() {
				return this.schemeId;
			}

			public void setSchemeId(Long schemeId) {
				this.schemeId = schemeId;
			}
		}
	}

	@Override
	public GetQualityCheckSchemeResponse getInstance(UnmarshallerContext context) {
		return	GetQualityCheckSchemeResponseUnmarshaller.unmarshall(this, context);
	}
}
