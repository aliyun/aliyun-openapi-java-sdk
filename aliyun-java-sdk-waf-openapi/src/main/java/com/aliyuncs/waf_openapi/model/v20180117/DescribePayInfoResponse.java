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

package com.aliyuncs.waf_openapi.model.v20180117;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20180117.DescribePayInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePayInfoResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer inDebt;

		private String instanceId;

		private Integer payType;

		private Long endDate;

		private Integer remainDay;

		private String region;

		private Integer trial;

		private Integer status;

		public Integer getInDebt() {
			return this.inDebt;
		}

		public void setInDebt(Integer inDebt) {
			this.inDebt = inDebt;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getPayType() {
			return this.payType;
		}

		public void setPayType(Integer payType) {
			this.payType = payType;
		}

		public Long getEndDate() {
			return this.endDate;
		}

		public void setEndDate(Long endDate) {
			this.endDate = endDate;
		}

		public Integer getRemainDay() {
			return this.remainDay;
		}

		public void setRemainDay(Integer remainDay) {
			this.remainDay = remainDay;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Integer getTrial() {
			return this.trial;
		}

		public void setTrial(Integer trial) {
			this.trial = trial;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public DescribePayInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribePayInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
