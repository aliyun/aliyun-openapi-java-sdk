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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.GetInstTransInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstTransInfoResponse extends AcsResponse {

	private String instanceId;

	private Boolean isAutoRenew;

	private Integer renewCycle;

	private String chargeType;

	private Long endTime;

	private Long startTime;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Boolean getIsAutoRenew() {
		return this.isAutoRenew;
	}

	public void setIsAutoRenew(Boolean isAutoRenew) {
		this.isAutoRenew = isAutoRenew;
	}

	public Integer getRenewCycle() {
		return this.renewCycle;
	}

	public void setRenewCycle(Integer renewCycle) {
		this.renewCycle = renewCycle;
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	@Override
	public GetInstTransInfoResponse getInstance(UnmarshallerContext context) {
		return	GetInstTransInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
