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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeChangePlanAllBatchesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeChangePlanAllBatchesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String planId;

		private List<Batch> batches;

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public List<Batch> getBatches() {
			return this.batches;
		}

		public void setBatches(List<Batch> batches) {
			this.batches = batches;
		}

		public static class Batch {

			private Integer batchNo;

			private Boolean isLastBatch;

			private Integer resourceCount;

			private String operationStatus;

			public Integer getBatchNo() {
				return this.batchNo;
			}

			public void setBatchNo(Integer batchNo) {
				this.batchNo = batchNo;
			}

			public Boolean getIsLastBatch() {
				return this.isLastBatch;
			}

			public void setIsLastBatch(Boolean isLastBatch) {
				this.isLastBatch = isLastBatch;
			}

			public Integer getResourceCount() {
				return this.resourceCount;
			}

			public void setResourceCount(Integer resourceCount) {
				this.resourceCount = resourceCount;
			}

			public String getOperationStatus() {
				return this.operationStatus;
			}

			public void setOperationStatus(String operationStatus) {
				this.operationStatus = operationStatus;
			}
		}
	}

	@Override
	public OpsDescribeChangePlanAllBatchesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeChangePlanAllBatchesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
