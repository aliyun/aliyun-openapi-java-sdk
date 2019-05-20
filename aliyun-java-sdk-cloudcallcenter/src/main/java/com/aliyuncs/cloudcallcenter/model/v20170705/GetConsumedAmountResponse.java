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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetConsumedAmountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConsumedAmountResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Long outcomingAmount;

	private Integer outcomingCount;

	private Long incomingAmount;

	private Integer incomingCount;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Long getOutcomingAmount() {
		return this.outcomingAmount;
	}

	public void setOutcomingAmount(Long outcomingAmount) {
		this.outcomingAmount = outcomingAmount;
	}

	public Integer getOutcomingCount() {
		return this.outcomingCount;
	}

	public void setOutcomingCount(Integer outcomingCount) {
		this.outcomingCount = outcomingCount;
	}

	public Long getIncomingAmount() {
		return this.incomingAmount;
	}

	public void setIncomingAmount(Long incomingAmount) {
		this.incomingAmount = incomingAmount;
	}

	public Integer getIncomingCount() {
		return this.incomingCount;
	}

	public void setIncomingCount(Integer incomingCount) {
		this.incomingCount = incomingCount;
	}

	@Override
	public GetConsumedAmountResponse getInstance(UnmarshallerContext context) {
		return	GetConsumedAmountResponseUnmarshaller.unmarshall(this, context);
	}
}
