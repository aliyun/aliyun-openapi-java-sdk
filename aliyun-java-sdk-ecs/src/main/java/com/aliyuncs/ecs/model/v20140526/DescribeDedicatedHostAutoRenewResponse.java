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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeDedicatedHostAutoRenewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedHostAutoRenewResponse extends AcsResponse {

	private String requestId;

	private List<DedicatedHostRenewAttribute> dedicatedHostRenewAttributes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DedicatedHostRenewAttribute> getDedicatedHostRenewAttributes() {
		return this.dedicatedHostRenewAttributes;
	}

	public void setDedicatedHostRenewAttributes(List<DedicatedHostRenewAttribute> dedicatedHostRenewAttributes) {
		this.dedicatedHostRenewAttributes = dedicatedHostRenewAttributes;
	}

	public static class DedicatedHostRenewAttribute {

		private String dedicatedHostId;

		private Boolean autoRenewEnabled;

		private Integer duration;

		private String periodUnit;

		private String renewalStatus;

		public String getDedicatedHostId() {
			return this.dedicatedHostId;
		}

		public void setDedicatedHostId(String dedicatedHostId) {
			this.dedicatedHostId = dedicatedHostId;
		}

		public Boolean getAutoRenewEnabled() {
			return this.autoRenewEnabled;
		}

		public void setAutoRenewEnabled(Boolean autoRenewEnabled) {
			this.autoRenewEnabled = autoRenewEnabled;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public String getRenewalStatus() {
			return this.renewalStatus;
		}

		public void setRenewalStatus(String renewalStatus) {
			this.renewalStatus = renewalStatus;
		}
	}

	@Override
	public DescribeDedicatedHostAutoRenewResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedHostAutoRenewResponseUnmarshaller.unmarshall(this, context);
	}
}
