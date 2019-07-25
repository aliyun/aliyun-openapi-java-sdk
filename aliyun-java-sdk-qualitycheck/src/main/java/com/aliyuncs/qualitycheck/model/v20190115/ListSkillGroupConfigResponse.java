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

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<SkillGroupConfig> data;

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

	public List<SkillGroupConfig> getData() {
		return this.data;
	}

	public void setData(List<SkillGroupConfig> data) {
		this.data = data;
	}

	public static class SkillGroupConfig {

		private Long id;

		private String instanceId;

		private Long modelId;

		private String modelName;

		private String name;

		private String rid;

		private String skillGroupId;

		private String skillGroupName;

		private Integer status;

		private Integer type;

		private Long vocabId;

		private String vocabName;

		private String createTime;

		private String updateTime;

		private List<RuleNameInfo> ruleList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getModelId() {
			return this.modelId;
		}

		public void setModelId(Long modelId) {
			this.modelId = modelId;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRid() {
			return this.rid;
		}

		public void setRid(String rid) {
			this.rid = rid;
		}

		public String getSkillGroupId() {
			return this.skillGroupId;
		}

		public void setSkillGroupId(String skillGroupId) {
			this.skillGroupId = skillGroupId;
		}

		public String getSkillGroupName() {
			return this.skillGroupName;
		}

		public void setSkillGroupName(String skillGroupName) {
			this.skillGroupName = skillGroupName;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Long getVocabId() {
			return this.vocabId;
		}

		public void setVocabId(Long vocabId) {
			this.vocabId = vocabId;
		}

		public String getVocabName() {
			return this.vocabName;
		}

		public void setVocabName(String vocabName) {
			this.vocabName = vocabName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<RuleNameInfo> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<RuleNameInfo> ruleList) {
			this.ruleList = ruleList;
		}

		public static class RuleNameInfo {

			private Long rid;

			private String ruleName;

			public Long getRid() {
				return this.rid;
			}

			public void setRid(Long rid) {
				this.rid = rid;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}
		}
	}

	@Override
	public ListSkillGroupConfigResponse getInstance(UnmarshallerContext context) {
		return	ListSkillGroupConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
