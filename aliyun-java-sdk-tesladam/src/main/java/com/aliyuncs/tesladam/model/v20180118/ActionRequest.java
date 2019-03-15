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

package com.aliyuncs.tesladam.model.v20180118;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ActionRequest extends RpcAcsRequest<ActionResponse> {
	
	public ActionRequest() {
		super("TeslaDam", "2018-01-18", "Action", "tesladam");
	}

	private Integer orderId;

	private String stepCode;

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
		}
	}

	public String getStepCode() {
		return this.stepCode;
	}

	public void setStepCode(String stepCode) {
		this.stepCode = stepCode;
		if(stepCode != null){
			putQueryParameter("StepCode", stepCode);
		}
	}

	@Override
	public Class<ActionResponse> getResponseClass() {
		return ActionResponse.class;
	}

}
