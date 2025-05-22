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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.ModifyRCInstanceChargeTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyRCInstanceChargeTypeResponse extends AcsResponse {

	private String requestId;

	private String chargeType;

	private String orderId;

	private List<FeeOfInstance> feeOfInstances;

	private List<String> instanceIds;

	private List<String> expiredTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<FeeOfInstance> getFeeOfInstances() {
		return this.feeOfInstances;
	}

	public void setFeeOfInstances(List<FeeOfInstance> feeOfInstances) {
		this.feeOfInstances = feeOfInstances;
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;
	}

	public List<String> getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(List<String> expiredTime) {
		this.expiredTime = expiredTime;
	}

	public static class FeeOfInstance {

		private String currency;

		private String fee;

		private String instanceId;

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getFee() {
			return this.fee;
		}

		public void setFee(String fee) {
			this.fee = fee;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public ModifyRCInstanceChargeTypeResponse getInstance(UnmarshallerContext context) {
		return	ModifyRCInstanceChargeTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
