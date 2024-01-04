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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListVariableGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVariableGroupsResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Long totalCount;

	private String nextToken;

	private List<VariableGroup> variableGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<VariableGroup> getVariableGroups() {
		return this.variableGroups;
	}

	public void setVariableGroups(List<VariableGroup> variableGroups) {
		this.variableGroups = variableGroups;
	}

	public static class VariableGroup {

		private String creatorAccountId;

		private Long updateTime;

		private String modifierAccountId;

		private String description;

		private String name;

		private Long id;

		private Long createTime;

		private List<RelatedPipeline> relatedPipelines;

		private List<Variable> variables;

		public String getCreatorAccountId() {
			return this.creatorAccountId;
		}

		public void setCreatorAccountId(String creatorAccountId) {
			this.creatorAccountId = creatorAccountId;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getModifierAccountId() {
			return this.modifierAccountId;
		}

		public void setModifierAccountId(String modifierAccountId) {
			this.modifierAccountId = modifierAccountId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public List<RelatedPipeline> getRelatedPipelines() {
			return this.relatedPipelines;
		}

		public void setRelatedPipelines(List<RelatedPipeline> relatedPipelines) {
			this.relatedPipelines = relatedPipelines;
		}

		public List<Variable> getVariables() {
			return this.variables;
		}

		public void setVariables(List<Variable> variables) {
			this.variables = variables;
		}

		public static class RelatedPipeline {

			private Long id;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Variable {

			private String value;

			private String name;

			private Boolean isEncrypted;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getIsEncrypted() {
				return this.isEncrypted;
			}

			public void setIsEncrypted(Boolean isEncrypted) {
				this.isEncrypted = isEncrypted;
			}
		}
	}

	@Override
	public ListVariableGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListVariableGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
