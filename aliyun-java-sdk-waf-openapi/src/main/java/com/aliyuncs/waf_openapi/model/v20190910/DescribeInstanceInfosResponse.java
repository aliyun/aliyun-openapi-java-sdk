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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeInstanceInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceInfosResponse extends AcsResponse {

	private String requestId;

	private List<InstanceInfo> instanceInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceInfo> getInstanceInfos() {
		return this.instanceInfos;
	}

	public void setInstanceInfos(List<InstanceInfo> instanceInfos) {
		this.instanceInfos = instanceInfos;
	}

	public static class InstanceInfo {

		private Integer inDebt;

		private String instanceId;

		private Integer payType;

		private Long endDate;

		private Integer remainDay;

		private String region;

		private Integer trial;

		private Integer status;

		private String subscriptionType;

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

		public String getSubscriptionType() {
			return this.subscriptionType;
		}

		public void setSubscriptionType(String subscriptionType) {
			this.subscriptionType = subscriptionType;
		}
	}

	@Override
	public DescribeInstanceInfosResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceInfosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
