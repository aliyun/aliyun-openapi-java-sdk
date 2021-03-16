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
import com.aliyuncs.reid_cloud.transform.v20201029.DescribeCustomerFlowByLocationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomerFlowByLocationResponse extends AcsResponse {

	private Long count;

	private Long storeId;

	private Float percent;

	private String locationName;

	private String requestId;

	private Boolean success;

	private String dynamicMessage;

	private String errorCode;

	private String errorMessage;

	private String message;

	private String code;

	private String dynamicCode;

	private Long locationId;

	private String parentLocationIds;

	private List<CustomerFlowItem> customerFlowItems;

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Float getPercent() {
		return this.percent;
	}

	public void setPercent(Float percent) {
		this.percent = percent;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getParentLocationIds() {
		return this.parentLocationIds;
	}

	public void setParentLocationIds(String parentLocationIds) {
		this.parentLocationIds = parentLocationIds;
	}

	public List<CustomerFlowItem> getCustomerFlowItems() {
		return this.customerFlowItems;
	}

	public void setCustomerFlowItems(List<CustomerFlowItem> customerFlowItems) {
		this.customerFlowItems = customerFlowItems;
	}

	public static class CustomerFlowItem {

		private Long count;

		private Float percent;

		private Long storeId;

		private String locationName;

		private String parentLocationIds;

		private Long locationId;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Float getPercent() {
			return this.percent;
		}

		public void setPercent(Float percent) {
			this.percent = percent;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public String getLocationName() {
			return this.locationName;
		}

		public void setLocationName(String locationName) {
			this.locationName = locationName;
		}

		public String getParentLocationIds() {
			return this.parentLocationIds;
		}

		public void setParentLocationIds(String parentLocationIds) {
			this.parentLocationIds = parentLocationIds;
		}

		public Long getLocationId() {
			return this.locationId;
		}

		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}
	}

	@Override
	public DescribeCustomerFlowByLocationResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomerFlowByLocationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
