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
import com.aliyuncs.sddp.transform.v20190103.DescribeCategoryTemplateListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCategoryTemplateListResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Template> items;

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

	public List<Template> getItems() {
		return this.items;
	}

	public void setItems(List<Template> items) {
		this.items = items;
	}

	public static class Template {

		private Integer currentRiskLevel;

		private Integer status;

		private Integer type;

		private Integer supportEdit;

		private Integer maxCategoryLevel;

		private String name;

		private Integer maxRiskLevel;

		private Long id;

		private String description;

		private Long gmtCreate;

		private Long gmtModified;

		public Integer getCurrentRiskLevel() {
			return this.currentRiskLevel;
		}

		public void setCurrentRiskLevel(Integer currentRiskLevel) {
			this.currentRiskLevel = currentRiskLevel;
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

		public Integer getSupportEdit() {
			return this.supportEdit;
		}

		public void setSupportEdit(Integer supportEdit) {
			this.supportEdit = supportEdit;
		}

		public Integer getMaxCategoryLevel() {
			return this.maxCategoryLevel;
		}

		public void setMaxCategoryLevel(Integer maxCategoryLevel) {
			this.maxCategoryLevel = maxCategoryLevel;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getMaxRiskLevel() {
			return this.maxRiskLevel;
		}

		public void setMaxRiskLevel(Integer maxRiskLevel) {
			this.maxRiskLevel = maxRiskLevel;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public DescribeCategoryTemplateListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCategoryTemplateListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
