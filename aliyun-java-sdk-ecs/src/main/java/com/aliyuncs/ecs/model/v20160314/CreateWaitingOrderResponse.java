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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.CreateWaitingOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateWaitingOrderResponse extends AcsResponse {

	private String requestId;

	private String dryRunResult;

	private Integer waitTimeValue;

	private String waitTimeCycle;

	private String waitingOrderId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDryRunResult() {
		return this.dryRunResult;
	}

	public void setDryRunResult(String dryRunResult) {
		this.dryRunResult = dryRunResult;
	}

	public Integer getWaitTimeValue() {
		return this.waitTimeValue;
	}

	public void setWaitTimeValue(Integer waitTimeValue) {
		this.waitTimeValue = waitTimeValue;
	}

	public String getWaitTimeCycle() {
		return this.waitTimeCycle;
	}

	public void setWaitTimeCycle(String waitTimeCycle) {
		this.waitTimeCycle = waitTimeCycle;
	}

	public String getWaitingOrderId() {
		return this.waitingOrderId;
	}

	public void setWaitingOrderId(String waitingOrderId) {
		this.waitingOrderId = waitingOrderId;
	}

	@Override
	public CreateWaitingOrderResponse getInstance(UnmarshallerContext context) {
		return	CreateWaitingOrderResponseUnmarshaller.unmarshall(this, context);
	}
}
