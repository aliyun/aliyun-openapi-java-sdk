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

package com.aliyuncs.market.model.v20151101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<InstanceItem> instanceItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<InstanceItem> getInstanceItems() {
		return this.instanceItems;
	}

	public void setInstanceItems(List<InstanceItem> instanceItems) {
		this.instanceItems = instanceItems;
	}

	public static class InstanceItem {

		private Long instanceId;

		private Long orderId;

		private String supplierName;

		private String productCode;

		private String productSkuCode;

		private String productName;

		private String productType;

		private String status;

		private Long beganOn;

		private Long endOn;

		private Long createdOn;

		private String extendJson;

		private String hostJson;

		private String appJson;

		private String apiJson;

		private String imageJson;

		private String idaasJson;

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getProductSkuCode() {
			return this.productSkuCode;
		}

		public void setProductSkuCode(String productSkuCode) {
			this.productSkuCode = productSkuCode;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getBeganOn() {
			return this.beganOn;
		}

		public void setBeganOn(Long beganOn) {
			this.beganOn = beganOn;
		}

		public Long getEndOn() {
			return this.endOn;
		}

		public void setEndOn(Long endOn) {
			this.endOn = endOn;
		}

		public Long getCreatedOn() {
			return this.createdOn;
		}

		public void setCreatedOn(Long createdOn) {
			this.createdOn = createdOn;
		}

		public String getExtendJson() {
			return this.extendJson;
		}

		public void setExtendJson(String extendJson) {
			this.extendJson = extendJson;
		}

		public String getHostJson() {
			return this.hostJson;
		}

		public void setHostJson(String hostJson) {
			this.hostJson = hostJson;
		}

		public String getAppJson() {
			return this.appJson;
		}

		public void setAppJson(String appJson) {
			this.appJson = appJson;
		}

		public String getApiJson() {
			return this.apiJson;
		}

		public void setApiJson(String apiJson) {
			this.apiJson = apiJson;
		}

		public String getImageJson() {
			return this.imageJson;
		}

		public void setImageJson(String imageJson) {
			this.imageJson = imageJson;
		}

		public String getIdaasJson() {
			return this.idaasJson;
		}

		public void setIdaasJson(String idaasJson) {
			this.idaasJson = idaasJson;
		}
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
