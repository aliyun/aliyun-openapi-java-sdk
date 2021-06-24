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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryHouyiZoneInventoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryHouyiZoneInventoryResponse extends AcsResponse {

	private String houyiZoneNo;

	private List<ProductResource> productResources;

	public String getHouyiZoneNo() {
		return this.houyiZoneNo;
	}

	public void setHouyiZoneNo(String houyiZoneNo) {
		this.houyiZoneNo = houyiZoneNo;
	}

	public List<ProductResource> getProductResources() {
		return this.productResources;
	}

	public void setProductResources(List<ProductResource> productResources) {
		this.productResources = productResources;
	}

	public static class ProductResource {

		private Long ioOptimized;

		private Integer resourceType;

		private Long vendibleAmount;

		private String payType;

		private Long totalAmount;

		private String networkType;

		private String instanceType;

		private String bizType;

		public Long getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Long ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public Integer getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(Integer resourceType) {
			this.resourceType = resourceType;
		}

		public Long getVendibleAmount() {
			return this.vendibleAmount;
		}

		public void setVendibleAmount(Long vendibleAmount) {
			this.vendibleAmount = vendibleAmount;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public Long getTotalAmount() {
			return this.totalAmount;
		}

		public void setTotalAmount(Long totalAmount) {
			this.totalAmount = totalAmount;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
	}

	@Override
	public OpsQueryHouyiZoneInventoryResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryHouyiZoneInventoryResponseUnmarshaller.unmarshall(this, context);
	}
}
