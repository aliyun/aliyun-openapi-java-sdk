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
import com.aliyuncs.qualitycheck.transform.v20190115.ListSkillGroupConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSkillGroupConfigResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<SkillGroupConfig> data;

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

	public List<SkillGroupConfig> getData() {
		return this.data;
	}

	public void setData(List<SkillGroupConfig> data) {
		this.data = data;
	}

	public static class SkillGroupConfig {

		private Integer type;

		private Integer status;

		private String updateTime;

		private Integer allContentQualityCheck;

		private String createTime;

		private String skillGroupId;

		private Boolean screenSwitch;

		private String instanceId;

		private Long vocabId;

		private Integer skillGroupFrom;

		private String rid;

		private String skillGroupName;

		private String modelName;

		private String allRids;

		private String name;

		private Long modelId;

		private Long id;

		private Integer qualityCheckType;

		private String vocabName;

		private List<RuleNameInfo> ruleList;

		private List<RuleNameInfo> allRuleList;

		private List<SkillGroupScreen> skillGroupScreens;

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getAllContentQualityCheck() {
			return this.allContentQualityCheck;
		}

		public void setAllContentQualityCheck(Integer allContentQualityCheck) {
			this.allContentQualityCheck = allContentQualityCheck;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getSkillGroupId() {
			return this.skillGroupId;
		}

		public void setSkillGroupId(String skillGroupId) {
			this.skillGroupId = skillGroupId;
		}

		public Boolean getScreenSwitch() {
			return this.screenSwitch;
		}

		public void setScreenSwitch(Boolean screenSwitch) {
			this.screenSwitch = screenSwitch;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getVocabId() {
			return this.vocabId;
		}

		public void setVocabId(Long vocabId) {
			this.vocabId = vocabId;
		}

		public Integer getSkillGroupFrom() {
			return this.skillGroupFrom;
		}

		public void setSkillGroupFrom(Integer skillGroupFrom) {
			this.skillGroupFrom = skillGroupFrom;
		}

		public String getRid() {
			return this.rid;
		}

		public void setRid(String rid) {
			this.rid = rid;
		}

		public String getSkillGroupName() {
			return this.skillGroupName;
		}

		public void setSkillGroupName(String skillGroupName) {
			this.skillGroupName = skillGroupName;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getAllRids() {
			return this.allRids;
		}

		public void setAllRids(String allRids) {
			this.allRids = allRids;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getModelId() {
			return this.modelId;
		}

		public void setModelId(Long modelId) {
			this.modelId = modelId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getQualityCheckType() {
			return this.qualityCheckType;
		}

		public void setQualityCheckType(Integer qualityCheckType) {
			this.qualityCheckType = qualityCheckType;
		}

		public String getVocabName() {
			return this.vocabName;
		}

		public void setVocabName(String vocabName) {
			this.vocabName = vocabName;
		}

		public List<RuleNameInfo> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<RuleNameInfo> ruleList) {
			this.ruleList = ruleList;
		}

		public List<RuleNameInfo> getAllRuleList() {
			return this.allRuleList;
		}

		public void setAllRuleList(List<RuleNameInfo> allRuleList) {
			this.allRuleList = allRuleList;
		}

		public List<SkillGroupScreen> getSkillGroupScreens() {
			return this.skillGroupScreens;
		}

		public void setSkillGroupScreens(List<SkillGroupScreen> skillGroupScreens) {
			this.skillGroupScreens = skillGroupScreens;
		}

		public static class RuleNameInfo {

			private String ruleName;

			private Long rid;

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public Long getRid() {
				return this.rid;
			}

			public void setRid(Long rid) {
				this.rid = rid;
			}
		}

		public static class SkillGroupScreen {

			private String value;

			private Integer dataType;

			private Integer symbol;

			private String name;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public Integer getDataType() {
				return this.dataType;
			}

			public void setDataType(Integer dataType) {
				this.dataType = dataType;
			}

			public Integer getSymbol() {
				return this.symbol;
			}

			public void setSymbol(Integer symbol) {
				this.symbol = symbol;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public ListSkillGroupConfigResponse getInstance(UnmarshallerContext context) {
		return	ListSkillGroupConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
