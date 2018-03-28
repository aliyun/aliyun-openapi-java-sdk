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

package com.aliyuncs.phoenixsp_inner.model.v20160805;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.phoenixsp_inner.transform.v20160805.FindBillingInfoByUserInPeriodResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindBillingInfoByUserInPeriodResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Integer count;

	private List<Data> datas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Data> getDatas() {
		return this.datas;
	}

	public void setDatas(List<Data> datas) {
		this.datas = datas;
	}

	public static class Data {

		private Long aliUID;

		private String resourceType;

		private String resourceStatus;

		private String instanceId;

		private String billingTag;

		private String chargeType;

		private String resourceSource;

		private String commodityCode;

		private String propertyDetail;

		private String operation;

		private Long commandStartTime;

		private Long actualStartTime;

		private Long expectStartTime;

		private Long commandEndTime;

		private Long actualEndTime;

		private Long expectEndTime;

		public Long getAliUID() {
			return this.aliUID;
		}

		public void setAliUID(Long aliUID) {
			this.aliUID = aliUID;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getResourceStatus() {
			return this.resourceStatus;
		}

		public void setResourceStatus(String resourceStatus) {
			this.resourceStatus = resourceStatus;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBillingTag() {
			return this.billingTag;
		}

		public void setBillingTag(String billingTag) {
			this.billingTag = billingTag;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getResourceSource() {
			return this.resourceSource;
		}

		public void setResourceSource(String resourceSource) {
			this.resourceSource = resourceSource;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getPropertyDetail() {
			return this.propertyDetail;
		}

		public void setPropertyDetail(String propertyDetail) {
			this.propertyDetail = propertyDetail;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}

		public Long getCommandStartTime() {
			return this.commandStartTime;
		}

		public void setCommandStartTime(Long commandStartTime) {
			this.commandStartTime = commandStartTime;
		}

		public Long getActualStartTime() {
			return this.actualStartTime;
		}

		public void setActualStartTime(Long actualStartTime) {
			this.actualStartTime = actualStartTime;
		}

		public Long getExpectStartTime() {
			return this.expectStartTime;
		}

		public void setExpectStartTime(Long expectStartTime) {
			this.expectStartTime = expectStartTime;
		}

		public Long getCommandEndTime() {
			return this.commandEndTime;
		}

		public void setCommandEndTime(Long commandEndTime) {
			this.commandEndTime = commandEndTime;
		}

		public Long getActualEndTime() {
			return this.actualEndTime;
		}

		public void setActualEndTime(Long actualEndTime) {
			this.actualEndTime = actualEndTime;
		}

		public Long getExpectEndTime() {
			return this.expectEndTime;
		}

		public void setExpectEndTime(Long expectEndTime) {
			this.expectEndTime = expectEndTime;
		}
	}

	@Override
	public FindBillingInfoByUserInPeriodResponse getInstance(UnmarshallerContext context) {
		return	FindBillingInfoByUserInPeriodResponseUnmarshaller.unmarshall(this, context);
	}
}
