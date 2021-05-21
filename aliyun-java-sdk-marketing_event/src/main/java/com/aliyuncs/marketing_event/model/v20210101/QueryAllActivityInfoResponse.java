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

package com.aliyuncs.marketing_event.model.v20210101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.marketing_event.transform.v20210101.QueryAllActivityInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAllActivityInfoResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private String requestId;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long id;

		private Long activityId;

		private String customerName;

		private String mobile;

		private String companyName;

		private String qRCode;

		private String channelName;

		private String isVipCustomer;

		private String reportFields;

		private String email;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getActivityId() {
			return this.activityId;
		}

		public void setActivityId(Long activityId) {
			this.activityId = activityId;
		}

		public String getCustomerName() {
			return this.customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getCompanyName() {
			return this.companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getQRCode() {
			return this.qRCode;
		}

		public void setQRCode(String qRCode) {
			this.qRCode = qRCode;
		}

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public String getIsVipCustomer() {
			return this.isVipCustomer;
		}

		public void setIsVipCustomer(String isVipCustomer) {
			this.isVipCustomer = isVipCustomer;
		}

		public String getReportFields() {
			return this.reportFields;
		}

		public void setReportFields(String reportFields) {
			this.reportFields = reportFields;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}

	@Override
	public QueryAllActivityInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryAllActivityInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
