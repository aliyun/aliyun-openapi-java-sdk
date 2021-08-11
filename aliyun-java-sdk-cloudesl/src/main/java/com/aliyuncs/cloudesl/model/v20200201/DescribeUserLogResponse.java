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

package com.aliyuncs.cloudesl.model.v20200201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.DescribeUserLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserLogResponse extends AcsResponse {

	private String errorMessage;

	private String errorCode;

	private Integer pageNumber;

	private String message;

	private String dynamicCode;

	private String code;

	private Integer pageSize;

	private String dynamicMessage;

	private String requestId;

	private Boolean success;

	private Integer totalCount;

	private List<UserLogInfo> userLogs;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<UserLogInfo> getUserLogs() {
		return this.userLogs;
	}

	public void setUserLogs(List<UserLogInfo> userLogs) {
		this.userLogs = userLogs;
	}

	public static class UserLogInfo {

		private String resultCode;

		private String operationSendTime;

		private String gmtCreate;

		private String storeId;

		private String gmtModified;

		private String actionPrice;

		private String operationStatus;

		private String priceUnit;

		private String logId;

		private String itemShortTitle;

		private String operationType;

		private String operationResponseTime;

		private String spendTime;

		private String eslBarCode;

		private String itemId;

		private String itemBarCode;

		private Boolean bePromotion;

		private String userId;

		private Integer eslSignal;

		public String getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public String getOperationSendTime() {
			return this.operationSendTime;
		}

		public void setOperationSendTime(String operationSendTime) {
			this.operationSendTime = operationSendTime;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getActionPrice() {
			return this.actionPrice;
		}

		public void setActionPrice(String actionPrice) {
			this.actionPrice = actionPrice;
		}

		public String getOperationStatus() {
			return this.operationStatus;
		}

		public void setOperationStatus(String operationStatus) {
			this.operationStatus = operationStatus;
		}

		public String getPriceUnit() {
			return this.priceUnit;
		}

		public void setPriceUnit(String priceUnit) {
			this.priceUnit = priceUnit;
		}

		public String getLogId() {
			return this.logId;
		}

		public void setLogId(String logId) {
			this.logId = logId;
		}

		public String getItemShortTitle() {
			return this.itemShortTitle;
		}

		public void setItemShortTitle(String itemShortTitle) {
			this.itemShortTitle = itemShortTitle;
		}

		public String getOperationType() {
			return this.operationType;
		}

		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}

		public String getOperationResponseTime() {
			return this.operationResponseTime;
		}

		public void setOperationResponseTime(String operationResponseTime) {
			this.operationResponseTime = operationResponseTime;
		}

		public String getSpendTime() {
			return this.spendTime;
		}

		public void setSpendTime(String spendTime) {
			this.spendTime = spendTime;
		}

		public String getEslBarCode() {
			return this.eslBarCode;
		}

		public void setEslBarCode(String eslBarCode) {
			this.eslBarCode = eslBarCode;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public Boolean getBePromotion() {
			return this.bePromotion;
		}

		public void setBePromotion(Boolean bePromotion) {
			this.bePromotion = bePromotion;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Integer getEslSignal() {
			return this.eslSignal;
		}

		public void setEslSignal(Integer eslSignal) {
			this.eslSignal = eslSignal;
		}
	}

	@Override
	public DescribeUserLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
