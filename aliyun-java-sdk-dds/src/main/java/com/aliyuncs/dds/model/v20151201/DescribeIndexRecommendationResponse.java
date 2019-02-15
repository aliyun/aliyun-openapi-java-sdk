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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeIndexRecommendationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIndexRecommendationResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<Analyzation> analyzations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<Analyzation> getAnalyzations() {
		return this.analyzations;
	}

	public void setAnalyzations(List<Analyzation> analyzations) {
		this.analyzations = analyzations;
	}

	public static class Analyzation {

		private String database;

		private String namespace;

		private String operation;

		private String query;

		private String sort;

		private Long count;

		private Long totalExecutionTime;

		private Long averageExecutionTime;

		private Long averageReturnRowCount;

		private Long averageDocsExaminedCount;

		private Long averageKeysExaminedCount;

		private String inMemorySort;

		private String lastExecutionTime;

		private String executionPlan;

		private List<Recommendation> indexRecommendations;

		private List<String> indexCombines;

		public String getDatabase() {
			return this.database;
		}

		public void setDatabase(String database) {
			this.database = database;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}

		public String getQuery() {
			return this.query;
		}

		public void setQuery(String query) {
			this.query = query;
		}

		public String getSort() {
			return this.sort;
		}

		public void setSort(String sort) {
			this.sort = sort;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getTotalExecutionTime() {
			return this.totalExecutionTime;
		}

		public void setTotalExecutionTime(Long totalExecutionTime) {
			this.totalExecutionTime = totalExecutionTime;
		}

		public Long getAverageExecutionTime() {
			return this.averageExecutionTime;
		}

		public void setAverageExecutionTime(Long averageExecutionTime) {
			this.averageExecutionTime = averageExecutionTime;
		}

		public Long getAverageReturnRowCount() {
			return this.averageReturnRowCount;
		}

		public void setAverageReturnRowCount(Long averageReturnRowCount) {
			this.averageReturnRowCount = averageReturnRowCount;
		}

		public Long getAverageDocsExaminedCount() {
			return this.averageDocsExaminedCount;
		}

		public void setAverageDocsExaminedCount(Long averageDocsExaminedCount) {
			this.averageDocsExaminedCount = averageDocsExaminedCount;
		}

		public Long getAverageKeysExaminedCount() {
			return this.averageKeysExaminedCount;
		}

		public void setAverageKeysExaminedCount(Long averageKeysExaminedCount) {
			this.averageKeysExaminedCount = averageKeysExaminedCount;
		}

		public String getInMemorySort() {
			return this.inMemorySort;
		}

		public void setInMemorySort(String inMemorySort) {
			this.inMemorySort = inMemorySort;
		}

		public String getLastExecutionTime() {
			return this.lastExecutionTime;
		}

		public void setLastExecutionTime(String lastExecutionTime) {
			this.lastExecutionTime = lastExecutionTime;
		}

		public String getExecutionPlan() {
			return this.executionPlan;
		}

		public void setExecutionPlan(String executionPlan) {
			this.executionPlan = executionPlan;
		}

		public List<Recommendation> getIndexRecommendations() {
			return this.indexRecommendations;
		}

		public void setIndexRecommendations(List<Recommendation> indexRecommendations) {
			this.indexRecommendations = indexRecommendations;
		}

		public List<String> getIndexCombines() {
			return this.indexCombines;
		}

		public void setIndexCombines(List<String> indexCombines) {
			this.indexCombines = indexCombines;
		}

		public static class Recommendation {

			private String recmdType;

			private String content;

			public String getRecmdType() {
				return this.recmdType;
			}

			public void setRecmdType(String recmdType) {
				this.recmdType = recmdType;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public DescribeIndexRecommendationResponse getInstance(UnmarshallerContext context) {
		return	DescribeIndexRecommendationResponseUnmarshaller.unmarshall(this, context);
	}
}
