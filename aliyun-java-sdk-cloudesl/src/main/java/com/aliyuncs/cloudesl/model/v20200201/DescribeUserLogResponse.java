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

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private String code;

	private String message;

	private String dynamicMessage;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private String dynamicCode;

	private List<UserLogInfo> userLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public List<UserLogInfo> getUserLogs() {
		return this.userLogs;
	}

	public void setUserLogs(List<UserLogInfo> userLogs) {
		this.userLogs = userLogs;
	}

	public static class UserLogInfo {

		private String eslBarCode;

		private String operationSendTime;

		private String actionPrice;

		private String userId;

		private String priceUnit;

		private String resultCode;

		private String itemId;

		private String gmtModified;

		private String operationType;

		private String operationResponseTime;

		private String operationStatus;

		private String storeId;

		private String itemShortTitle;

		private String logId;

		private Boolean bePromotion;

		private String gmtCreate;

		private Integer eslSignal;

		private String spendTime;

		private String itemBarCode;

		private String i18nResultKey;

		public String getEslBarCode() {
			return this.eslBarCode;
		}

		public void setEslBarCode(String eslBarCode) {
			this.eslBarCode = eslBarCode;
		}

		public String getOperationSendTime() {
			return this.operationSendTime;
		}

		public void setOperationSendTime(String operationSendTime) {
			this.operationSendTime = operationSendTime;
		}

		public String getActionPrice() {
			return this.actionPrice;
		}

		public void setActionPrice(String actionPrice) {
			this.actionPrice = actionPrice;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getPriceUnit() {
			return this.priceUnit;
		}

		public void setPriceUnit(String priceUnit) {
			this.priceUnit = priceUnit;
		}

		public String getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
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

		public String getOperationStatus() {
			return this.operationStatus;
		}

		public void setOperationStatus(String operationStatus) {
			this.operationStatus = operationStatus;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getItemShortTitle() {
			return this.itemShortTitle;
		}

		public void setItemShortTitle(String itemShortTitle) {
			this.itemShortTitle = itemShortTitle;
		}

		public String getLogId() {
			return this.logId;
		}

		public void setLogId(String logId) {
			this.logId = logId;
		}

		public Boolean getBePromotion() {
			return this.bePromotion;
		}

		public void setBePromotion(Boolean bePromotion) {
			this.bePromotion = bePromotion;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getEslSignal() {
			return this.eslSignal;
		}

		public void setEslSignal(Integer eslSignal) {
			this.eslSignal = eslSignal;
		}

		public String getSpendTime() {
			return this.spendTime;
		}

		public void setSpendTime(String spendTime) {
			this.spendTime = spendTime;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public String getI18nResultKey() {
			return this.i18nResultKey;
		}

		public void setI18nResultKey(String i18nResultKey) {
			this.i18nResultKey = i18nResultKey;
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
