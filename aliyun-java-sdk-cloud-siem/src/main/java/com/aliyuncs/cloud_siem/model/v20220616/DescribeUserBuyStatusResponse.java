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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeUserBuyStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserBuyStatusResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long masterUserId;

		private String masterUserName;

		private Long mainUserId;

		private String mainUserName;

		private Long subUserId;

		private String subUserName;

		private Integer capacity;

		private String sasInstanceId;

		private Boolean canBuy;

		private Long endTime;

		private Long durationDays;

		private Integer rdOrder;

		public Long getMasterUserId() {
			return this.masterUserId;
		}

		public void setMasterUserId(Long masterUserId) {
			this.masterUserId = masterUserId;
		}

		public String getMasterUserName() {
			return this.masterUserName;
		}

		public void setMasterUserName(String masterUserName) {
			this.masterUserName = masterUserName;
		}

		public Long getMainUserId() {
			return this.mainUserId;
		}

		public void setMainUserId(Long mainUserId) {
			this.mainUserId = mainUserId;
		}

		public String getMainUserName() {
			return this.mainUserName;
		}

		public void setMainUserName(String mainUserName) {
			this.mainUserName = mainUserName;
		}

		public Long getSubUserId() {
			return this.subUserId;
		}

		public void setSubUserId(Long subUserId) {
			this.subUserId = subUserId;
		}

		public String getSubUserName() {
			return this.subUserName;
		}

		public void setSubUserName(String subUserName) {
			this.subUserName = subUserName;
		}

		public Integer getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Integer capacity) {
			this.capacity = capacity;
		}

		public String getSasInstanceId() {
			return this.sasInstanceId;
		}

		public void setSasInstanceId(String sasInstanceId) {
			this.sasInstanceId = sasInstanceId;
		}

		public Boolean getCanBuy() {
			return this.canBuy;
		}

		public void setCanBuy(Boolean canBuy) {
			this.canBuy = canBuy;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getDurationDays() {
			return this.durationDays;
		}

		public void setDurationDays(Long durationDays) {
			this.durationDays = durationDays;
		}

		public Integer getRdOrder() {
			return this.rdOrder;
		}

		public void setRdOrder(Integer rdOrder) {
			this.rdOrder = rdOrder;
		}
	}

	@Override
	public DescribeUserBuyStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserBuyStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
