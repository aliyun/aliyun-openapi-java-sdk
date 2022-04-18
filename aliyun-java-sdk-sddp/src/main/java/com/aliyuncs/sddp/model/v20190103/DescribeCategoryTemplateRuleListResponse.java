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
import com.aliyuncs.sddp.transform.v20190103.DescribeCategoryTemplateRuleListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCategoryTemplateRuleListResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<DataLimit> items;

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

	public List<DataLimit> getItems() {
		return this.items;
	}

	public void setItems(List<DataLimit> items) {
		this.items = items;
	}

	public static class DataLimit {

		private Integer status;

		private String identificationScope;

		private Long riskLevelId;

		private Long parentCategoryId;

		private String description;

		private Integer customType;

		private String identificationRuleIds;

		private String name;

		private Integer orderNum;

		private Long templateId;

		private Long id;

		private Integer categoryLevel;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getIdentificationScope() {
			return this.identificationScope;
		}

		public void setIdentificationScope(String identificationScope) {
			this.identificationScope = identificationScope;
		}

		public Long getRiskLevelId() {
			return this.riskLevelId;
		}

		public void setRiskLevelId(Long riskLevelId) {
			this.riskLevelId = riskLevelId;
		}

		public Long getParentCategoryId() {
			return this.parentCategoryId;
		}

		public void setParentCategoryId(Long parentCategoryId) {
			this.parentCategoryId = parentCategoryId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getCustomType() {
			return this.customType;
		}

		public void setCustomType(Integer customType) {
			this.customType = customType;
		}

		public String getIdentificationRuleIds() {
			return this.identificationRuleIds;
		}

		public void setIdentificationRuleIds(String identificationRuleIds) {
			this.identificationRuleIds = identificationRuleIds;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getOrderNum() {
			return this.orderNum;
		}

		public void setOrderNum(Integer orderNum) {
			this.orderNum = orderNum;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getCategoryLevel() {
			return this.categoryLevel;
		}

		public void setCategoryLevel(Integer categoryLevel) {
			this.categoryLevel = categoryLevel;
		}
	}

	@Override
	public DescribeCategoryTemplateRuleListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCategoryTemplateRuleListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
