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

package com.aliyuncs.market_inner.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market_inner.transform.v20160801.InnerReviewHistoryImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerReviewHistoryImageResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Boolean isSuccess;

	private List<Image> imageList;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public List<Image> getImageList() {
		return this.imageList;
	}

	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}

	public static class Image {

		private String regionNo;

		private String productCode;

		private String imageNo;

		private String imageVersion;

		private Long supplierId;

		private String productName;

		private String instanceId;

		private String instanceAddress;

		private String osType;

		private String userName;

		private String supplierName;

		private String password;

		private String osKind;

		private Integer osBit;

		private String instanceStatus;

		private String imageCreateTime;

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getImageNo() {
			return this.imageNo;
		}

		public void setImageNo(String imageNo) {
			this.imageNo = imageNo;
		}

		public String getImageVersion() {
			return this.imageVersion;
		}

		public void setImageVersion(String imageVersion) {
			this.imageVersion = imageVersion;
		}

		public Long getSupplierId() {
			return this.supplierId;
		}

		public void setSupplierId(Long supplierId) {
			this.supplierId = supplierId;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceAddress() {
			return this.instanceAddress;
		}

		public void setInstanceAddress(String instanceAddress) {
			this.instanceAddress = instanceAddress;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getOsKind() {
			return this.osKind;
		}

		public void setOsKind(String osKind) {
			this.osKind = osKind;
		}

		public Integer getOsBit() {
			return this.osBit;
		}

		public void setOsBit(Integer osBit) {
			this.osBit = osBit;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getImageCreateTime() {
			return this.imageCreateTime;
		}

		public void setImageCreateTime(String imageCreateTime) {
			this.imageCreateTime = imageCreateTime;
		}
	}

	@Override
	public InnerReviewHistoryImageResponse getInstance(UnmarshallerContext context) {
		return	InnerReviewHistoryImageResponseUnmarshaller.unmarshall(this, context);
	}
}
