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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.UnloadRegionSDGResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UnloadRegionSDGResponse extends AcsResponse {

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

		private String message;

		private Boolean success;

		private Result result;

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public Result getResult() {
			return this.result;
		}

		public void setResult(Result result) {
			this.result = result;
		}

		public static class Result {

			private Long failedCount;

			private Long successCount;

			private List<FailedItemsItem> failedItems;

			public Long getFailedCount() {
				return this.failedCount;
			}

			public void setFailedCount(Long failedCount) {
				this.failedCount = failedCount;
			}

			public Long getSuccessCount() {
				return this.successCount;
			}

			public void setSuccessCount(Long successCount) {
				this.successCount = successCount;
			}

			public List<FailedItemsItem> getFailedItems() {
				return this.failedItems;
			}

			public void setFailedItems(List<FailedItemsItem> failedItems) {
				this.failedItems = failedItems;
			}

			public static class FailedItemsItem {

				private String errorMessage;

				private String destinationRegionId;

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}

				public String getDestinationRegionId() {
					return this.destinationRegionId;
				}

				public void setDestinationRegionId(String destinationRegionId) {
					this.destinationRegionId = destinationRegionId;
				}
			}
		}
	}

	@Override
	public UnloadRegionSDGResponse getInstance(UnmarshallerContext context) {
		return	UnloadRegionSDGResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
