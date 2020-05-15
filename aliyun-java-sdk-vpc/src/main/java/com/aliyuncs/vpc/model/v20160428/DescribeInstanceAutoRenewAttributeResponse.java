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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeInstanceAutoRenewAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceAutoRenewAttributeResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private String pageSize;

	private String pageNumber;

	private List<InstanceRenewAttribute> instanceRenewAttributes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<InstanceRenewAttribute> getInstanceRenewAttributes() {
		return this.instanceRenewAttributes;
	}

	public void setInstanceRenewAttributes(List<InstanceRenewAttribute> instanceRenewAttributes) {
		this.instanceRenewAttributes = instanceRenewAttributes;
	}

	public static class InstanceRenewAttribute {

		private String instanceId;

		private String renewalStatus;

		private Integer duration;

		private String pricingCycle;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRenewalStatus() {
			return this.renewalStatus;
		}

		public void setRenewalStatus(String renewalStatus) {
			this.renewalStatus = renewalStatus;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getPricingCycle() {
			return this.pricingCycle;
		}

		public void setPricingCycle(String pricingCycle) {
			this.pricingCycle = pricingCycle;
		}
	}

	@Override
	public DescribeInstanceAutoRenewAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceAutoRenewAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
