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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeAutoRenewAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoRenewAttributeResponse extends AcsResponse {

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private List<AutoRenewAttribute> items;

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<AutoRenewAttribute> getItems() {
		return this.items;
	}

	public void setItems(List<AutoRenewAttribute> items) {
		this.items = items;
	}

	public static class AutoRenewAttribute {

		private String dBClusterId;

		private String periodUnit;

		private Integer duration;

		private String renewalStatus;

		private Boolean autoRenewEnabled;

		private String regionId;

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getRenewalStatus() {
			return this.renewalStatus;
		}

		public void setRenewalStatus(String renewalStatus) {
			this.renewalStatus = renewalStatus;
		}

		public Boolean getAutoRenewEnabled() {
			return this.autoRenewEnabled;
		}

		public void setAutoRenewEnabled(Boolean autoRenewEnabled) {
			this.autoRenewEnabled = autoRenewEnabled;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeAutoRenewAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoRenewAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
