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
import com.aliyuncs.qualitycheck.transform.v20190115.ListQualityCheckSchemeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQualityCheckSchemeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String resultCountId;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer count;

	private List<DataItem> data;

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

	public String getResultCountId() {
		return this.resultCountId;
	}

	public void setResultCountId(String resultCountId) {
		this.resultCountId = resultCountId;
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long schemeId;

		private String name;

		private String description;

		private Integer dataType;

		private Integer type;

		private Integer templateType;

		private Integer status;

		private String createUserName;

		private String createTime;

		private String updateUserName;

		private String updateTime;

		private Long version;

		private List<SchemeCheckTypeListItem> schemeCheckTypeList;

		private List<RuleListItem> ruleList;

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

		public List<SchemeCheckTypeListItem> getSchemeCheckTypeList() {
			return this.schemeCheckTypeList;
		}

		public void setSchemeCheckTypeList(List<SchemeCheckTypeListItem> schemeCheckTypeList) {
			this.schemeCheckTypeList = schemeCheckTypeList;
		}

		public List<RuleListItem> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<RuleListItem> ruleList) {
			this.ruleList = ruleList;
		}

		public static class SchemeCheckTypeListItem {

			private Integer checkType;

			private Integer enable;

			private String checkName;

			private Integer targetType;

			private Integer score;

			public Integer getCheckType() {
				return this.checkType;
			}

			public void setCheckType(Integer checkType) {
				this.checkType = checkType;
			}

			public Integer getEnable() {
				return this.enable;
			}

			public void setEnable(Integer enable) {
				this.enable = enable;
			}

			public String getCheckName() {
				return this.checkName;
			}

			public void setCheckName(String checkName) {
				this.checkName = checkName;
			}

			public Integer getTargetType() {
				return this.targetType;
			}

			public void setTargetType(Integer targetType) {
				this.targetType = targetType;
			}

			public Integer getScore() {
				return this.score;
			}

			public void setScore(Integer score) {
				this.score = score;
			}
		}

		public static class RuleListItem {

			private List<RulesItem> rules;

			public List<RulesItem> getRules() {
				return this.rules;
			}

			public void setRules(List<RulesItem> rules) {
				this.rules = rules;
			}

			public static class RulesItem {

				private Long rid;

				private String name;

				private Integer ruleScoreType;

				private Integer scoreNum;

				private Integer scoreType;

				private Integer checkType;

				private Integer targetType;

				private Integer scoreNumType;

				public Long getRid() {
					return this.rid;
				}

				public void setRid(Long rid) {
					this.rid = rid;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Integer getRuleScoreType() {
					return this.ruleScoreType;
				}

				public void setRuleScoreType(Integer ruleScoreType) {
					this.ruleScoreType = ruleScoreType;
				}

				public Integer getScoreNum() {
					return this.scoreNum;
				}

				public void setScoreNum(Integer scoreNum) {
					this.scoreNum = scoreNum;
				}

				public Integer getScoreType() {
					return this.scoreType;
				}

				public void setScoreType(Integer scoreType) {
					this.scoreType = scoreType;
				}

				public Integer getCheckType() {
					return this.checkType;
				}

				public void setCheckType(Integer checkType) {
					this.checkType = checkType;
				}

				public Integer getTargetType() {
					return this.targetType;
				}

				public void setTargetType(Integer targetType) {
					this.targetType = targetType;
				}

				public Integer getScoreNumType() {
					return this.scoreNumType;
				}

				public void setScoreNumType(Integer scoreNumType) {
					this.scoreNumType = scoreNumType;
				}
			}
		}
	}

	@Override
	public ListQualityCheckSchemeResponse getInstance(UnmarshallerContext context) {
		return	ListQualityCheckSchemeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
