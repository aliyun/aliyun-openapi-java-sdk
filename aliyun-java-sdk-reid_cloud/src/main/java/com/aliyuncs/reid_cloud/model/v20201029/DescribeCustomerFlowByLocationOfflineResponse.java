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

package com.aliyuncs.reid_cloud.model.v20201029;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid_cloud.transform.v20201029.DescribeCustomerFlowByLocationOfflineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomerFlowByLocationOfflineResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String dynamicMessage;

	private String code;

	private Boolean success;

	private Long storeId;

	private String summaryDay;

	private String dynamicCode;

	private String errorCode;

	private String errorMessage;

	private List<CustomerSummaryItem> customerSummary;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getSummaryDay() {
		return this.summaryDay;
	}

	public void setSummaryDay(String summaryDay) {
		this.summaryDay = summaryDay;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<CustomerSummaryItem> getCustomerSummary() {
		return this.customerSummary;
	}

	public void setCustomerSummary(List<CustomerSummaryItem> customerSummary) {
		this.customerSummary = customerSummary;
	}

	public static class CustomerSummaryItem {

		private Long summaryStartTime;

		private Long summaryEndTime;

		private List<CustomerFlow> customerFlows;

		public Long getSummaryStartTime() {
			return this.summaryStartTime;
		}

		public void setSummaryStartTime(Long summaryStartTime) {
			this.summaryStartTime = summaryStartTime;
		}

		public Long getSummaryEndTime() {
			return this.summaryEndTime;
		}

		public void setSummaryEndTime(Long summaryEndTime) {
			this.summaryEndTime = summaryEndTime;
		}

		public List<CustomerFlow> getCustomerFlows() {
			return this.customerFlows;
		}

		public void setCustomerFlows(List<CustomerFlow> customerFlows) {
			this.customerFlows = customerFlows;
		}

		public static class CustomerFlow {

			private Long currentLocationId;

			private Long count;

			private List<CustomerFlowItem> customerFlowItems;

			public Long getCurrentLocationId() {
				return this.currentLocationId;
			}

			public void setCurrentLocationId(Long currentLocationId) {
				this.currentLocationId = currentLocationId;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}

			public List<CustomerFlowItem> getCustomerFlowItems() {
				return this.customerFlowItems;
			}

			public void setCustomerFlowItems(List<CustomerFlowItem> customerFlowItems) {
				this.customerFlowItems = customerFlowItems;
			}

			public static class CustomerFlowItem {

				private Long locationId;

				private List<Long> ukId;

				public Long getLocationId() {
					return this.locationId;
				}

				public void setLocationId(Long locationId) {
					this.locationId = locationId;
				}

				public List<Long> getUkId() {
					return this.ukId;
				}

				public void setUkId(List<Long> ukId) {
					this.ukId = ukId;
				}
			}
		}
	}

	@Override
	public DescribeCustomerFlowByLocationOfflineResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomerFlowByLocationOfflineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
