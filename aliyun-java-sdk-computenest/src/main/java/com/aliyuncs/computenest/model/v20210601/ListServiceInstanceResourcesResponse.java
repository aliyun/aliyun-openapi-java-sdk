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

package com.aliyuncs.computenest.model.v20210601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenest.transform.v20210601.ListServiceInstanceResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServiceInstanceResourcesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<ResourcesItem> resources;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ResourcesItem> getResources() {
		return this.resources;
	}

	public void setResources(List<ResourcesItem> resources) {
		this.resources = resources;
	}

	public static class ResourcesItem {

		private String resourceARN;

		private String payType;

		private String renewStatus;

		private String createTime;

		private String expireTime;

		private Integer renewalPeriod;

		private String renewalPeriodUnit;

		private String productType;

		private String productCode;

		private String status;

		public String getResourceARN() {
			return this.resourceARN;
		}

		public void setResourceARN(String resourceARN) {
			this.resourceARN = resourceARN;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getRenewStatus() {
			return this.renewStatus;
		}

		public void setRenewStatus(String renewStatus) {
			this.renewStatus = renewStatus;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Integer getRenewalPeriod() {
			return this.renewalPeriod;
		}

		public void setRenewalPeriod(Integer renewalPeriod) {
			this.renewalPeriod = renewalPeriod;
		}

		public String getRenewalPeriodUnit() {
			return this.renewalPeriodUnit;
		}

		public void setRenewalPeriodUnit(String renewalPeriodUnit) {
			this.renewalPeriodUnit = renewalPeriodUnit;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListServiceInstanceResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListServiceInstanceResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
