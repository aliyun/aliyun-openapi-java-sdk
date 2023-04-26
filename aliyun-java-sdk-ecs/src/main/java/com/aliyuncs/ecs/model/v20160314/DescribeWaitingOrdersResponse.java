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
import com.aliyuncs.ecs.transform.v20160314.DescribeWaitingOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWaitingOrdersResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private String nextToken;

	private List<WaitingOrder> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<WaitingOrder> getData() {
		return this.data;
	}

	public void setData(List<WaitingOrder> data) {
		this.data = data;
	}

	public static class WaitingOrder {

		private String waitingOrderId;

		private String expireTime;

		private String createTime;

		private String status;

		private Long instanceAmount;

		private String regionId;

		private String zoneId;

		private String chargeType;

		private String instanceType;

		private Long successAmount;

		private String failedMessage;

		private String lxCreateParam;

		private List<InstanceInfo> instanceInfos;

		public String getWaitingOrderId() {
			return this.waitingOrderId;
		}

		public void setWaitingOrderId(String waitingOrderId) {
			this.waitingOrderId = waitingOrderId;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getInstanceAmount() {
			return this.instanceAmount;
		}

		public void setInstanceAmount(Long instanceAmount) {
			this.instanceAmount = instanceAmount;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Long getSuccessAmount() {
			return this.successAmount;
		}

		public void setSuccessAmount(Long successAmount) {
			this.successAmount = successAmount;
		}

		public String getFailedMessage() {
			return this.failedMessage;
		}

		public void setFailedMessage(String failedMessage) {
			this.failedMessage = failedMessage;
		}

		public String getLxCreateParam() {
			return this.lxCreateParam;
		}

		public void setLxCreateParam(String lxCreateParam) {
			this.lxCreateParam = lxCreateParam;
		}

		public List<InstanceInfo> getInstanceInfos() {
			return this.instanceInfos;
		}

		public void setInstanceInfos(List<InstanceInfo> instanceInfos) {
			this.instanceInfos = instanceInfos;
		}

		public static class InstanceInfo {

			private String instanceId;

			private String resultCode;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getResultCode() {
				return this.resultCode;
			}

			public void setResultCode(String resultCode) {
				this.resultCode = resultCode;
			}
		}
	}

	@Override
	public DescribeWaitingOrdersResponse getInstance(UnmarshallerContext context) {
		return	DescribeWaitingOrdersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
