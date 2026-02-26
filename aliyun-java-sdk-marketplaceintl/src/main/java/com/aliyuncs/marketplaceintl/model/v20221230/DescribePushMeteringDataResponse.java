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

package com.aliyuncs.marketplaceintl.model.v20221230;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.marketplaceintl.transform.v20221230.DescribePushMeteringDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePushMeteringDataResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Boolean forceFatal;

	private String dynamicMessage;

	private String code;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getForceFatal() {
		return this.forceFatal;
	}

	public void setForceFatal(Boolean forceFatal) {
		this.forceFatal = forceFatal;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long endTime;

		private String instanceId;

		private Boolean isPushBilling;

		private String meteringAssist;

		private String meteringEntity;

		private String pushOrderBizId;

		private Long startTime;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getIsPushBilling() {
			return this.isPushBilling;
		}

		public void setIsPushBilling(Boolean isPushBilling) {
			this.isPushBilling = isPushBilling;
		}

		public String getMeteringAssist() {
			return this.meteringAssist;
		}

		public void setMeteringAssist(String meteringAssist) {
			this.meteringAssist = meteringAssist;
		}

		public String getMeteringEntity() {
			return this.meteringEntity;
		}

		public void setMeteringEntity(String meteringEntity) {
			this.meteringEntity = meteringEntity;
		}

		public String getPushOrderBizId() {
			return this.pushOrderBizId;
		}

		public void setPushOrderBizId(String pushOrderBizId) {
			this.pushOrderBizId = pushOrderBizId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
	}

	@Override
	public DescribePushMeteringDataResponse getInstance(UnmarshallerContext context) {
		return	DescribePushMeteringDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
