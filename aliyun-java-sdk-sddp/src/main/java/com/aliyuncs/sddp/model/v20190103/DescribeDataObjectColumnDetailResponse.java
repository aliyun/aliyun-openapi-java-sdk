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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeDataObjectColumnDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataObjectColumnDetailResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Rule> items;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Rule> getItems() {
		return this.items;
	}

	public void setItems(List<Rule> items) {
		this.items = items;
	}

	public static class Rule {

		private String columnName;

		private String dataType;

		private String columnComment;

		private Boolean primaryKey;

		private String id;

		private Long riskLevelId;

		private String riskLevelName;

		private Long ruleId;

		private String ruleName;

		private List<ModelTagsItem> modelTags;

		private List<String> categories;

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getColumnComment() {
			return this.columnComment;
		}

		public void setColumnComment(String columnComment) {
			this.columnComment = columnComment;
		}

		public Boolean getPrimaryKey() {
			return this.primaryKey;
		}

		public void setPrimaryKey(Boolean primaryKey) {
			this.primaryKey = primaryKey;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getRiskLevelId() {
			return this.riskLevelId;
		}

		public void setRiskLevelId(Long riskLevelId) {
			this.riskLevelId = riskLevelId;
		}

		public String getRiskLevelName() {
			return this.riskLevelName;
		}

		public void setRiskLevelName(String riskLevelName) {
			this.riskLevelName = riskLevelName;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public List<ModelTagsItem> getModelTags() {
			return this.modelTags;
		}

		public void setModelTags(List<ModelTagsItem> modelTags) {
			this.modelTags = modelTags;
		}

		public List<String> getCategories() {
			return this.categories;
		}

		public void setCategories(List<String> categories) {
			this.categories = categories;
		}

		public static class ModelTagsItem {

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
	}

	@Override
	public DescribeDataObjectColumnDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataObjectColumnDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
