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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeWorkerDetectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWorkerDetectionResponse extends AcsResponse {

	private String totalCount;

	private String requestId;

	private String dBClusterId;

	private List<BaseDetectionItem> detectionItems;

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<BaseDetectionItem> getDetectionItems() {
		return this.detectionItems;
	}

	public void setDetectionItems(List<BaseDetectionItem> detectionItems) {
		this.detectionItems = detectionItems;
	}

	public static class BaseDetectionItem {

		private String name;

		private String message;

		private String status;

		private Results results;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Results getResults() {
			return this.results;
		}

		public void setResults(Results results) {
			this.results = results;
		}

		public static class Results {

			private List<SkewedTablesList> skewedTables;

			private List<PartitionedTablesList> partitionedTables;

			private List<TopAccessTablesList> topAccessTables;

			private List<BadOperatorDetails> operatorDetails;

			private List<BadOperatorAgg> operatorAgg;

			public List<SkewedTablesList> getSkewedTables() {
				return this.skewedTables;
			}

			public void setSkewedTables(List<SkewedTablesList> skewedTables) {
				this.skewedTables = skewedTables;
			}

			public List<PartitionedTablesList> getPartitionedTables() {
				return this.partitionedTables;
			}

			public void setPartitionedTables(List<PartitionedTablesList> partitionedTables) {
				this.partitionedTables = partitionedTables;
			}

			public List<TopAccessTablesList> getTopAccessTables() {
				return this.topAccessTables;
			}

			public void setTopAccessTables(List<TopAccessTablesList> topAccessTables) {
				this.topAccessTables = topAccessTables;
			}

			public List<BadOperatorDetails> getOperatorDetails() {
				return this.operatorDetails;
			}

			public void setOperatorDetails(List<BadOperatorDetails> operatorDetails) {
				this.operatorDetails = operatorDetails;
			}

			public List<BadOperatorAgg> getOperatorAgg() {
				return this.operatorAgg;
			}

			public void setOperatorAgg(List<BadOperatorAgg> operatorAgg) {
				this.operatorAgg = operatorAgg;
			}

			public static class SkewedTablesList {

				private String schemaName;

				private String tableName;

				private String dDL;

				private Integer partitionCount;

				private Long totalDataSize;

				private Long totalRowCount;

				private Long totalPkSize;

				private Long totalRemoteDataSize;

				private String totalLocalDataSize;

				private String shardSkewedRows;

				public String getSchemaName() {
					return this.schemaName;
				}

				public void setSchemaName(String schemaName) {
					this.schemaName = schemaName;
				}

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public String getDDL() {
					return this.dDL;
				}

				public void setDDL(String dDL) {
					this.dDL = dDL;
				}

				public Integer getPartitionCount() {
					return this.partitionCount;
				}

				public void setPartitionCount(Integer partitionCount) {
					this.partitionCount = partitionCount;
				}

				public Long getTotalDataSize() {
					return this.totalDataSize;
				}

				public void setTotalDataSize(Long totalDataSize) {
					this.totalDataSize = totalDataSize;
				}

				public Long getTotalRowCount() {
					return this.totalRowCount;
				}

				public void setTotalRowCount(Long totalRowCount) {
					this.totalRowCount = totalRowCount;
				}

				public Long getTotalPkSize() {
					return this.totalPkSize;
				}

				public void setTotalPkSize(Long totalPkSize) {
					this.totalPkSize = totalPkSize;
				}

				public Long getTotalRemoteDataSize() {
					return this.totalRemoteDataSize;
				}

				public void setTotalRemoteDataSize(Long totalRemoteDataSize) {
					this.totalRemoteDataSize = totalRemoteDataSize;
				}

				public String getTotalLocalDataSize() {
					return this.totalLocalDataSize;
				}

				public void setTotalLocalDataSize(String totalLocalDataSize) {
					this.totalLocalDataSize = totalLocalDataSize;
				}

				public String getShardSkewedRows() {
					return this.shardSkewedRows;
				}

				public void setShardSkewedRows(String shardSkewedRows) {
					this.shardSkewedRows = shardSkewedRows;
				}
			}

			public static class PartitionedTablesList {

				private String schemaName;

				private String tableName;

				private String dDL;

				private String partitionCount;

				private String partitionIds;

				private Long totalDataSize;

				public String getSchemaName() {
					return this.schemaName;
				}

				public void setSchemaName(String schemaName) {
					this.schemaName = schemaName;
				}

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public String getDDL() {
					return this.dDL;
				}

				public void setDDL(String dDL) {
					this.dDL = dDL;
				}

				public String getPartitionCount() {
					return this.partitionCount;
				}

				public void setPartitionCount(String partitionCount) {
					this.partitionCount = partitionCount;
				}

				public String getPartitionIds() {
					return this.partitionIds;
				}

				public void setPartitionIds(String partitionIds) {
					this.partitionIds = partitionIds;
				}

				public Long getTotalDataSize() {
					return this.totalDataSize;
				}

				public void setTotalDataSize(Long totalDataSize) {
					this.totalDataSize = totalDataSize;
				}
			}

			public static class TopAccessTablesList {

				private String metricName;

				private List<ResultList> searchResults;

				public String getMetricName() {
					return this.metricName;
				}

				public void setMetricName(String metricName) {
					this.metricName = metricName;
				}

				public List<ResultList> getSearchResults() {
					return this.searchResults;
				}

				public void setSearchResults(List<ResultList> searchResults) {
					this.searchResults = searchResults;
				}

				public static class ResultList {

					private String tableName;

					private Long maxScanCost;

					private Double avgScanCost;

					private Long maxScanSize;

					private Double avgScanSize;

					private Long accessCount;

					public String getTableName() {
						return this.tableName;
					}

					public void setTableName(String tableName) {
						this.tableName = tableName;
					}

					public Long getMaxScanCost() {
						return this.maxScanCost;
					}

					public void setMaxScanCost(Long maxScanCost) {
						this.maxScanCost = maxScanCost;
					}

					public Double getAvgScanCost() {
						return this.avgScanCost;
					}

					public void setAvgScanCost(Double avgScanCost) {
						this.avgScanCost = avgScanCost;
					}

					public Long getMaxScanSize() {
						return this.maxScanSize;
					}

					public void setMaxScanSize(Long maxScanSize) {
						this.maxScanSize = maxScanSize;
					}

					public Double getAvgScanSize() {
						return this.avgScanSize;
					}

					public void setAvgScanSize(Double avgScanSize) {
						this.avgScanSize = avgScanSize;
					}

					public Long getAccessCount() {
						return this.accessCount;
					}

					public void setAccessCount(Long accessCount) {
						this.accessCount = accessCount;
					}
				}
			}

			public static class BadOperatorDetails {

				private String metricName;

				private List<ResultList2> searchResults1;

				public String getMetricName() {
					return this.metricName;
				}

				public void setMetricName(String metricName) {
					this.metricName = metricName;
				}

				public List<ResultList2> getSearchResults1() {
					return this.searchResults1;
				}

				public void setSearchResults1(List<ResultList2> searchResults1) {
					this.searchResults1 = searchResults1;
				}

				public static class ResultList2 {

					private String processId;

					private String stageId;

					private String operatorName;

					private Long peakMemory;

					private Long operatorCost;

					private Long inputRows;

					private Long outputRows;

					private Long inputSize;

					private Long outputSize;

					private String operatorInfo;

					public String getProcessId() {
						return this.processId;
					}

					public void setProcessId(String processId) {
						this.processId = processId;
					}

					public String getStageId() {
						return this.stageId;
					}

					public void setStageId(String stageId) {
						this.stageId = stageId;
					}

					public String getOperatorName() {
						return this.operatorName;
					}

					public void setOperatorName(String operatorName) {
						this.operatorName = operatorName;
					}

					public Long getPeakMemory() {
						return this.peakMemory;
					}

					public void setPeakMemory(Long peakMemory) {
						this.peakMemory = peakMemory;
					}

					public Long getOperatorCost() {
						return this.operatorCost;
					}

					public void setOperatorCost(Long operatorCost) {
						this.operatorCost = operatorCost;
					}

					public Long getInputRows() {
						return this.inputRows;
					}

					public void setInputRows(Long inputRows) {
						this.inputRows = inputRows;
					}

					public Long getOutputRows() {
						return this.outputRows;
					}

					public void setOutputRows(Long outputRows) {
						this.outputRows = outputRows;
					}

					public Long getInputSize() {
						return this.inputSize;
					}

					public void setInputSize(Long inputSize) {
						this.inputSize = inputSize;
					}

					public Long getOutputSize() {
						return this.outputSize;
					}

					public void setOutputSize(Long outputSize) {
						this.outputSize = outputSize;
					}

					public String getOperatorInfo() {
						return this.operatorInfo;
					}

					public void setOperatorInfo(String operatorInfo) {
						this.operatorInfo = operatorInfo;
					}
				}
			}

			public static class BadOperatorAgg {

				private String metricName;

				private List<ResultList4> searchResults3;

				public String getMetricName() {
					return this.metricName;
				}

				public void setMetricName(String metricName) {
					this.metricName = metricName;
				}

				public List<ResultList4> getSearchResults3() {
					return this.searchResults3;
				}

				public void setSearchResults3(List<ResultList4> searchResults3) {
					this.searchResults3 = searchResults3;
				}

				public static class ResultList4 {

					private String operatorName;

					private Long maxValue;

					private Long totalValue;

					private Double avgValue;

					private Long operatorCount;

					public String getOperatorName() {
						return this.operatorName;
					}

					public void setOperatorName(String operatorName) {
						this.operatorName = operatorName;
					}

					public Long getMaxValue() {
						return this.maxValue;
					}

					public void setMaxValue(Long maxValue) {
						this.maxValue = maxValue;
					}

					public Long getTotalValue() {
						return this.totalValue;
					}

					public void setTotalValue(Long totalValue) {
						this.totalValue = totalValue;
					}

					public Double getAvgValue() {
						return this.avgValue;
					}

					public void setAvgValue(Double avgValue) {
						this.avgValue = avgValue;
					}

					public Long getOperatorCount() {
						return this.operatorCount;
					}

					public void setOperatorCount(Long operatorCount) {
						this.operatorCount = operatorCount;
					}
				}
			}
		}
	}

	@Override
	public DescribeWorkerDetectionResponse getInstance(UnmarshallerContext context) {
		return	DescribeWorkerDetectionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
