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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.ListCostProblemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCostProblemResponse extends AcsResponse {

	private Boolean success;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNumber;

		private Long pageSize;

		private Long total;

		private ResultData resultData;

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public ResultData getResultData() {
			return this.resultData;
		}

		public void setResultData(ResultData resultData) {
			this.resultData = resultData;
		}

		public static class ResultData {

			private Double totalCostSavings;

			private Long totalOptimizeNum;

			private String inspectDate;

			private Long taskId;

			private List<DataListItem> dataList;

			public Double getTotalCostSavings() {
				return this.totalCostSavings;
			}

			public void setTotalCostSavings(Double totalCostSavings) {
				this.totalCostSavings = totalCostSavings;
			}

			public Long getTotalOptimizeNum() {
				return this.totalOptimizeNum;
			}

			public void setTotalOptimizeNum(Long totalOptimizeNum) {
				this.totalOptimizeNum = totalOptimizeNum;
			}

			public String getInspectDate() {
				return this.inspectDate;
			}

			public void setInspectDate(String inspectDate) {
				this.inspectDate = inspectDate;
			}

			public Long getTaskId() {
				return this.taskId;
			}

			public void setTaskId(Long taskId) {
				this.taskId = taskId;
			}

			public List<DataListItem> getDataList() {
				return this.dataList;
			}

			public void setDataList(List<DataListItem> dataList) {
				this.dataList = dataList;
			}

			public static class DataListItem {

				private Long appNum;

				private Double costSavings;

				private Long instanceNum;

				private Long optimizeNum;

				private Long productNum;

				private String queryGroupId;

				private String queryGroupName;

				public Long getAppNum() {
					return this.appNum;
				}

				public void setAppNum(Long appNum) {
					this.appNum = appNum;
				}

				public Double getCostSavings() {
					return this.costSavings;
				}

				public void setCostSavings(Double costSavings) {
					this.costSavings = costSavings;
				}

				public Long getInstanceNum() {
					return this.instanceNum;
				}

				public void setInstanceNum(Long instanceNum) {
					this.instanceNum = instanceNum;
				}

				public Long getOptimizeNum() {
					return this.optimizeNum;
				}

				public void setOptimizeNum(Long optimizeNum) {
					this.optimizeNum = optimizeNum;
				}

				public Long getProductNum() {
					return this.productNum;
				}

				public void setProductNum(Long productNum) {
					this.productNum = productNum;
				}

				public String getQueryGroupId() {
					return this.queryGroupId;
				}

				public void setQueryGroupId(String queryGroupId) {
					this.queryGroupId = queryGroupId;
				}

				public String getQueryGroupName() {
					return this.queryGroupName;
				}

				public void setQueryGroupName(String queryGroupName) {
					this.queryGroupName = queryGroupName;
				}
			}
		}
	}

	@Override
	public ListCostProblemResponse getInstance(UnmarshallerContext context) {
		return	ListCostProblemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
