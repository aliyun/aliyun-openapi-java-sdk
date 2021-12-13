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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.DeleteAggregatorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteAggregatorsResponse extends AcsResponse {

	private String requestId;

	private OperateAggregatorsResult operateAggregatorsResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OperateAggregatorsResult getOperateAggregatorsResult() {
		return this.operateAggregatorsResult;
	}

	public void setOperateAggregatorsResult(OperateAggregatorsResult operateAggregatorsResult) {
		this.operateAggregatorsResult = operateAggregatorsResult;
	}

	public static class OperateAggregatorsResult {

		private List<OperateAggregatorList> operateAggregators;

		public List<OperateAggregatorList> getOperateAggregators() {
			return this.operateAggregators;
		}

		public void setOperateAggregators(List<OperateAggregatorList> operateAggregators) {
			this.operateAggregators = operateAggregators;
		}

		public static class OperateAggregatorList {

			private String errorCode;

			private Boolean success;

			private String aggregatorId;

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

			public String getAggregatorId() {
				return this.aggregatorId;
			}

			public void setAggregatorId(String aggregatorId) {
				this.aggregatorId = aggregatorId;
			}
		}
	}

	@Override
	public DeleteAggregatorsResponse getInstance(UnmarshallerContext context) {
		return	DeleteAggregatorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
