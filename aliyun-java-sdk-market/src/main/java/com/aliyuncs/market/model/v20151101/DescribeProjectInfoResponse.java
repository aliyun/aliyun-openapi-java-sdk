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
import com.aliyuncs.market.transform.v20151101.DescribeProjectInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProjectInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String instanceId;

		private Long orderId;

		private Long customerAliUid;

		private Long supplierAliUid;

		private String productCode;

		private String productName;

		private String productSkuCode;

		private String productSkuName;

		private String templateType;

		private Long templateId;

		private Integer currentStepNo;

		private Integer finalStepNo;

		private String projectStatus;

		private Long gmtCreate;

		private Long gmtFinished;

		private Long gmtExpired;

		private String finishType;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public Long getCustomerAliUid() {
			return this.customerAliUid;
		}

		public void setCustomerAliUid(Long customerAliUid) {
			this.customerAliUid = customerAliUid;
		}

		public Long getSupplierAliUid() {
			return this.supplierAliUid;
		}

		public void setSupplierAliUid(Long supplierAliUid) {
			this.supplierAliUid = supplierAliUid;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductSkuCode() {
			return this.productSkuCode;
		}

		public void setProductSkuCode(String productSkuCode) {
			this.productSkuCode = productSkuCode;
		}

		public String getProductSkuName() {
			return this.productSkuName;
		}

		public void setProductSkuName(String productSkuName) {
			this.productSkuName = productSkuName;
		}

		public String getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(String templateType) {
			this.templateType = templateType;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public Integer getCurrentStepNo() {
			return this.currentStepNo;
		}

		public void setCurrentStepNo(Integer currentStepNo) {
			this.currentStepNo = currentStepNo;
		}

		public Integer getFinalStepNo() {
			return this.finalStepNo;
		}

		public void setFinalStepNo(Integer finalStepNo) {
			this.finalStepNo = finalStepNo;
		}

		public String getProjectStatus() {
			return this.projectStatus;
		}

		public void setProjectStatus(String projectStatus) {
			this.projectStatus = projectStatus;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtFinished() {
			return this.gmtFinished;
		}

		public void setGmtFinished(Long gmtFinished) {
			this.gmtFinished = gmtFinished;
		}

		public Long getGmtExpired() {
			return this.gmtExpired;
		}

		public void setGmtExpired(Long gmtExpired) {
			this.gmtExpired = gmtExpired;
		}

		public String getFinishType() {
			return this.finishType;
		}

		public void setFinishType(String finishType) {
			this.finishType = finishType;
		}
	}

	@Override
	public DescribeProjectInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeProjectInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
