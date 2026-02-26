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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeInstanceForIsvResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceForIsvResponse extends AcsResponse {

	private String status;

	private String productName;

	private Long instanceId;

	private String extendJson;

	private Boolean isTrial;

	private Long beganOn;

	private String componentJson;

	private String productType;

	private String productSkuCode;

	private Long createdOn;

	private Long endOn;

	private Long orderId;

	private String productCode;

	private String supplierName;

	private String requestId;

	private RelationalData relationalData;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(Long instanceId) {
		this.instanceId = instanceId;
	}

	public String getExtendJson() {
		return this.extendJson;
	}

	public void setExtendJson(String extendJson) {
		this.extendJson = extendJson;
	}

	public Boolean getIsTrial() {
		return this.isTrial;
	}

	public void setIsTrial(Boolean isTrial) {
		this.isTrial = isTrial;
	}

	public Long getBeganOn() {
		return this.beganOn;
	}

	public void setBeganOn(Long beganOn) {
		this.beganOn = beganOn;
	}

	public String getComponentJson() {
		return this.componentJson;
	}

	public void setComponentJson(String componentJson) {
		this.componentJson = componentJson;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductSkuCode() {
		return this.productSkuCode;
	}

	public void setProductSkuCode(String productSkuCode) {
		this.productSkuCode = productSkuCode;
	}

	public Long getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Long createdOn) {
		this.createdOn = createdOn;
	}

	public Long getEndOn() {
		return this.endOn;
	}

	public void setEndOn(Long endOn) {
		this.endOn = endOn;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RelationalData getRelationalData() {
		return this.relationalData;
	}

	public void setRelationalData(RelationalData relationalData) {
		this.relationalData = relationalData;
	}

	public static class RelationalData {

		private String serviceStatus;

		public String getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(String serviceStatus) {
			this.serviceStatus = serviceStatus;
		}
	}

	@Override
	public DescribeInstanceForIsvResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceForIsvResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
