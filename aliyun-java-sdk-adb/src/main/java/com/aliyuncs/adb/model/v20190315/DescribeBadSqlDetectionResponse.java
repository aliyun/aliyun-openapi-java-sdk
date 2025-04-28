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
import com.aliyuncs.adb.transform.v20190315.DescribeBadSqlDetectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBadSqlDetectionResponse extends AcsResponse {

	private String totalCount;

	private String requestId;

	private String dBClusterId;

	private String accessDeniedDetail;

	private List<OpenApiFasDetectionItem> detectionItems;

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

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public List<OpenApiFasDetectionItem> getDetectionItems() {
		return this.detectionItems;
	}

	public void setDetectionItems(List<OpenApiFasDetectionItem> detectionItems) {
		this.detectionItems = detectionItems;
	}

	public static class OpenApiFasDetectionItem {

		private String name;

		private String status;

		private String message;

		private List<BadSqlDiagnosisResult> results;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public List<BadSqlDiagnosisResult> getResults() {
			return this.results;
		}

		public void setResults(List<BadSqlDiagnosisResult> results) {
			this.results = results;
		}

		public static class BadSqlDiagnosisResult {

			private Long cost;

			private Long peakMemory;

			private Long operatorCost;

			private Long scanSize;

			private Long outputDataSize;

			private String processId;

			private Integer totalStages;

			private String sQL;

			private String patternId;

			private String startTime;

			private List<BasicDiagnosisInfo> diagnosisResults;

			public Long getCost() {
				return this.cost;
			}

			public void setCost(Long cost) {
				this.cost = cost;
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

			public Long getScanSize() {
				return this.scanSize;
			}

			public void setScanSize(Long scanSize) {
				this.scanSize = scanSize;
			}

			public Long getOutputDataSize() {
				return this.outputDataSize;
			}

			public void setOutputDataSize(Long outputDataSize) {
				this.outputDataSize = outputDataSize;
			}

			public String getProcessId() {
				return this.processId;
			}

			public void setProcessId(String processId) {
				this.processId = processId;
			}

			public Integer getTotalStages() {
				return this.totalStages;
			}

			public void setTotalStages(Integer totalStages) {
				this.totalStages = totalStages;
			}

			public String getSQL() {
				return this.sQL;
			}

			public void setSQL(String sQL) {
				this.sQL = sQL;
			}

			public String getPatternId() {
				return this.patternId;
			}

			public void setPatternId(String patternId) {
				this.patternId = patternId;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public List<BasicDiagnosisInfo> getDiagnosisResults() {
				return this.diagnosisResults;
			}

			public void setDiagnosisResults(List<BasicDiagnosisInfo> diagnosisResults) {
				this.diagnosisResults = diagnosisResults;
			}

			public static class BasicDiagnosisInfo {

				private String code;

				private String detail;

				private String stageId;

				private String operatorId;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getDetail() {
					return this.detail;
				}

				public void setDetail(String detail) {
					this.detail = detail;
				}

				public String getStageId() {
					return this.stageId;
				}

				public void setStageId(String stageId) {
					this.stageId = stageId;
				}

				public String getOperatorId() {
					return this.operatorId;
				}

				public void setOperatorId(String operatorId) {
					this.operatorId = operatorId;
				}
			}
		}
	}

	@Override
	public DescribeBadSqlDetectionResponse getInstance(UnmarshallerContext context) {
		return	DescribeBadSqlDetectionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
