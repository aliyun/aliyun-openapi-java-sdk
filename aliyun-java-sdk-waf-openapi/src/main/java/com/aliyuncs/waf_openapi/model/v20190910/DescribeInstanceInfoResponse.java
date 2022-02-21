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

package com.aliyuncs.waf_openapi.model.v20190910;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeInstanceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceInfoResponse extends AcsResponse {

	private String requestId;

	private InstanceInfo instanceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InstanceInfo getInstanceInfo() {
		return this.instanceInfo;
	}

	public void setInstanceInfo(InstanceInfo instanceInfo) {
		this.instanceInfo = instanceInfo;
	}

	public static class InstanceInfo {

		private Integer status;

		private Long endDate;

		private String version;

		private Integer remainDay;

		private String region;

		private Integer payType;

		private Integer inDebt;

		private String instanceId;

		private String subscriptionType;

		private Integer trial;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getEndDate() {
			return this.endDate;
		}

		public void setEndDate(Long endDate) {
			this.endDate = endDate;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
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

		public Integer getPayType() {
			return this.payType;
		}

		public void setPayType(Integer payType) {
			this.payType = payType;
		}

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

		public String getSubscriptionType() {
			return this.subscriptionType;
		}

		public void setSubscriptionType(String subscriptionType) {
			this.subscriptionType = subscriptionType;
		}

		public Integer getTrial() {
			return this.trial;
		}

		public void setTrial(Integer trial) {
			this.trial = trial;
		}
	}

	@Override
	public DescribeInstanceInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
