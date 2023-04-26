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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeAutoProvisioningGroupCapacitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoProvisioningGroupCapacitiesResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<Capacity> capacities;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Capacity> getCapacities() {
		return this.capacities;
	}

	public void setCapacities(List<Capacity> capacities) {
		this.capacities = capacities;
	}

	public static class Capacity {

		private String spotCapacity;

		private String totalCapacity;

		private String autoProvisioningGroupId;

		private String payAsYouGoCapacity;

		public String getSpotCapacity() {
			return this.spotCapacity;
		}

		public void setSpotCapacity(String spotCapacity) {
			this.spotCapacity = spotCapacity;
		}

		public String getTotalCapacity() {
			return this.totalCapacity;
		}

		public void setTotalCapacity(String totalCapacity) {
			this.totalCapacity = totalCapacity;
		}

		public String getAutoProvisioningGroupId() {
			return this.autoProvisioningGroupId;
		}

		public void setAutoProvisioningGroupId(String autoProvisioningGroupId) {
			this.autoProvisioningGroupId = autoProvisioningGroupId;
		}

		public String getPayAsYouGoCapacity() {
			return this.payAsYouGoCapacity;
		}

		public void setPayAsYouGoCapacity(String payAsYouGoCapacity) {
			this.payAsYouGoCapacity = payAsYouGoCapacity;
		}
	}

	@Override
	public DescribeAutoProvisioningGroupCapacitiesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoProvisioningGroupCapacitiesResponseUnmarshaller.unmarshall(this, context);
	}
}
