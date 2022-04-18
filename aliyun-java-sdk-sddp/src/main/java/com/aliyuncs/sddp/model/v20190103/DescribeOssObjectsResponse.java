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
import com.aliyuncs.sddp.transform.v20190103.DescribeOssObjectsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssObjectsResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Column> items;

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

	public List<Column> getItems() {
		return this.items;
	}

	public void setItems(List<Column> items) {
		this.items = items;
	}

	public static class Column {

		private Long instanceId;

		private String categoryName;

		private Long riskLevelId;

		private String regionId;

		private String fileId;

		private Long lastScanTime;

		private String regionName;

		private Long size;

		private String bucketName;

		private String riskLevelName;

		private Long category;

		private String name;

		private Integer ruleCount;

		private Integer sensitiveCount;

		private String id;

		private List<Rule> ruleList;

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public Long getRiskLevelId() {
			return this.riskLevelId;
		}

		public void setRiskLevelId(Long riskLevelId) {
			this.riskLevelId = riskLevelId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public Long getLastScanTime() {
			return this.lastScanTime;
		}

		public void setLastScanTime(Long lastScanTime) {
			this.lastScanTime = lastScanTime;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public String getRiskLevelName() {
			return this.riskLevelName;
		}

		public void setRiskLevelName(String riskLevelName) {
			this.riskLevelName = riskLevelName;
		}

		public Long getCategory() {
			return this.category;
		}

		public void setCategory(Long category) {
			this.category = category;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getRuleCount() {
			return this.ruleCount;
		}

		public void setRuleCount(Integer ruleCount) {
			this.ruleCount = ruleCount;
		}

		public Integer getSensitiveCount() {
			return this.sensitiveCount;
		}

		public void setSensitiveCount(Integer sensitiveCount) {
			this.sensitiveCount = sensitiveCount;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<Rule> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<Rule> ruleList) {
			this.ruleList = ruleList;
		}

		public static class Rule {

			private String name;

			private Long riskLevelId;

			private Long count;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getRiskLevelId() {
				return this.riskLevelId;
			}

			public void setRiskLevelId(Long riskLevelId) {
				this.riskLevelId = riskLevelId;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeOssObjectsResponse getInstance(UnmarshallerContext context) {
		return	DescribeOssObjectsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
